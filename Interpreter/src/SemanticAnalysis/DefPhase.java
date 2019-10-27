package SemanticAnalysis;

import CMM.*;
import SemanticAnalysis.Scope.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import static SemanticAnalysis.Scope.Errors.error;

/**
 * 第一遍遍历语法树
 */
public class DefPhase extends CMMBaseListener {
	public ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
	public GlobalScope globals;
	private Scope currentScope;    // 在此范围内定义符号

	/**
	 * 保存作用域
	 *
	 * @param ctx 文法ctx
	 * @param s   作用域
	 */
	private void saveScope(ParserRuleContext ctx, Scope s) {
		scopes.put(ctx, s);
	}

	/** file -> includeDeclaration* compilationUnit* EOF */
	@Override
	public void enterFile(CMMParser.FileContext ctx) {
		// 建立全局作用域
		globals = new GlobalScope(null);
		currentScope = globals;
	}

	/** function -> type ID '(' formalParameters ')' block */
	@Override
	public void enterFunction(CMMParser.FunctionContext ctx) {
		// 得到函数名和返回值类型
		String name = ctx.ID().getText();
		int typeTokenType = ctx.type().start.getType();
		Symbol.Type type = Types.getType(typeTokenType);

		// 新建一个指向外围作用域的作用域
		FunctionSymbol function = new FunctionSymbol(name, type, currentScope);
		currentScope.define(function); // 定义当前范围内的函数
		saveScope(ctx, function);      // 入栈：将函数的父作用域设置为当前作用域
		currentScope = function;       // 当前作用域设置为函数作用域
	}

	/** function -> type ID '(' formalParameters ')' block */
	@Override
	public void exitFunction(CMMParser.FunctionContext ctx) {
		currentScope = currentScope.getEnclosingScope(); // 出栈作用域
	}

	/** block -> '{' blockStatement* '}' */
	@Override
	public void enterBlock(CMMParser.BlockContext ctx) {
		// 入栈新的局部作用域
		currentScope = new LocalScope(currentScope);
		saveScope(ctx, currentScope);
	}

	/** block -> '{' blockStatement* '}' */
	@Override
	public void exitBlock(CMMParser.BlockContext ctx) {
		currentScope = currentScope.getEnclosingScope(); // 出栈作用域
	}

	/** formalParameter -> type ID */
	@Override
	public void exitFormalParameter(CMMParser.FormalParameterContext ctx) {
		String name = ctx.ID().getSymbol().getText();
		if(currentScope.resolve(name) instanceof VariableSymbol) {
			error(ctx.ID().getSymbol(), name + " has been defined");
		} else {
			defineVar(ctx.type(), ctx.ID().getSymbol());
		}
	}

	/** variableDeclarator -> ID ('=' expression)? */
	@Override
	public void exitVariableDeclarator_Variable(CMMParser.VariableDeclarator_VariableContext ctx) {
		String name = ctx.ID().getSymbol().getText();
		if(currentScope.resolve(name) instanceof VariableSymbol) {
			error(ctx.ID().getSymbol(), name + " has been defined");
		} else {
			CMMParser.VariableDeclarationStatementContext grandParentCtx = (CMMParser.VariableDeclarationStatementContext)ctx.parent.parent;
			defineVar(grandParentCtx.type(), ctx.ID().getSymbol());
		}
	}

	/**
	 * 定义符号变量
	 *
	 * @param typeCtx   类型的ctx
	 * @param nameToken 变量的token
	 */
	private void defineVar(CMMParser.TypeContext typeCtx, Token nameToken) {
		int typeTokenType = typeCtx.start.getType();
		Symbol.Type type = Types.getType(typeTokenType);
		VariableSymbol var = new VariableSymbol(nameToken.getText(), type);
		currentScope.define(var); // 在当前作用域中定义符号
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

		// 未找到函数定义
		if(function == null && !funcName.equals("print")) {
			error(ctx.ID().getSymbol(), "no such function: " + funcName);
		}

		// 函数名是变量名
		if(function instanceof VariableSymbol) {
			error(ctx.ID().getSymbol(), funcName + " is not a function");
		}
	}
}