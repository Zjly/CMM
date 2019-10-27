package SemanticAnalysis;

import CMM.*;
import SemanticAnalysis.Scope.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import sun.misc.Queue;

import static SemanticAnalysis.Scope.Errors.error;

/**
 * 第二遍遍历语法树
 */
public class RefPhase extends CMMBaseListener {
	private ParseTreeProperty<Scope> scopes;
	private GlobalScope globals;
	private ParseTreeProperty<Mutable> mutables;
	private Scope currentScope;    // 解析在此范围内开始的符号

	/**
	 * 构造函数，设置前一次遍历的结果
	 */
	public RefPhase(GlobalScope globals, ParseTreeProperty<Scope> scopes, ParseTreeProperty<Mutable> mutables) {
		this.scopes = scopes;
		this.globals = globals;
		this.mutables = mutables;
	}

	/** 得到变量值 */
	private Mutable getMutable(ParseTree node) {
		return mutables.get(node);
	}

	/** file -> includeDeclaration* compilationUnit* EOF */
	@Override
	public void enterFile(CMMParser.FileContext ctx) {
		currentScope = globals;
	}

	/** function -> type ID '(' formalParameters ')' block */
	@Override
	public void enterFunction(CMMParser.FunctionContext ctx) {
		// 设置对应作用域
		currentScope = scopes.get(ctx);
	}

	/** function -> type ID '(' formalParameters ')' block */
	@Override
	public void exitFunction(CMMParser.FunctionContext ctx) {
		// 出栈对应作用域
		currentScope = currentScope.getEnclosingScope();
	}

	/** block -> '{' blockStatement* '}' */
	@Override
	public void enterBlock(CMMParser.BlockContext ctx) {
		// 设置对应作用域
		currentScope = scopes.get(ctx);
	}

	/** block -> '{' blockStatement* '}' */
	@Override
	public void exitBlock(CMMParser.BlockContext ctx) {
		// 出栈对应作用域
		currentScope = currentScope.getEnclosingScope();
	}

	/** expression -> ID */
	@Override
	public void exitExpression_ID(CMMParser.Expression_IDContext ctx) {
		// 使用变量名时查找是否定义
		String name = ctx.ID().getSymbol().getText();
		Symbol var = currentScope.resolve(name);

		// 未找到变量
		if(var == null) {
			error(ctx.ID().getSymbol(), "no such variable: " + name);
		}

		// 变量名是函数名
		if(var instanceof FunctionSymbol) {
			error(ctx.ID().getSymbol(), name + " is not a variable");
		}
	}

	/** expression -> ID '(' expressionList? ')' */
	@Override
	public void exitExpression_Call(CMMParser.Expression_CallContext ctx) {
		// 处理函数调用
		String funcName = ctx.ID().getText();
		Symbol function = currentScope.resolve(funcName);

		if(funcName.equals("print")) {
			System.out.println(getMutable(ctx.expressionList()).value);
			return;
		}

		// 未找到函数定义
		if(function == null) {
			error(ctx.ID().getSymbol(), "no such function: " + funcName);
		}

		// 函数名是变量名
		if(function instanceof VariableSymbol) {
			error(ctx.ID().getSymbol(), funcName + " is not a function");
		}
	}
}
