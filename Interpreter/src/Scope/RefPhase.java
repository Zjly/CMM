package Scope;

import CMM.CMMBaseListener;
import CMM.CMMParser;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * 第二遍遍历语法树
 */
public class RefPhase extends CMMBaseListener {
	private ParseTreeProperty<Scope> scopes;
	private GlobalScope globals;
	private Scope currentScope;    // 解析在此范围内开始的符号

	/**
	 * 构造函数，设置前一次遍历的结果
	 */
	public RefPhase(GlobalScope globals, ParseTreeProperty<Scope> scopes) {
		this.scopes = scopes;
		this.globals = globals;
	}

	@Override
	public void enterFile(CMMParser.FileContext ctx) {
		currentScope = globals;
	}

	@Override
	public void enterFunction(CMMParser.FunctionContext ctx) {
		// 设置对应作用域
		currentScope = scopes.get(ctx);
	}

	@Override
	public void exitFunction(CMMParser.FunctionContext ctx) {
		// 出栈对应作用域
		currentScope = currentScope.getEnclosingScope();
	}

	@Override
	public void enterBlock(CMMParser.BlockContext ctx) {
		// 设置对应作用域
		currentScope = scopes.get(ctx);
	}

	@Override
	public void exitBlock(CMMParser.BlockContext ctx) {
		// 出栈对应作用域
		currentScope = currentScope.getEnclosingScope();
	}

	@Override
	public void exitExpression_ID(CMMParser.Expression_IDContext ctx) {
		// 使用变量名时查找是否定义
		String name = ctx.ID().getSymbol().getText();
		Symbol var = currentScope.resolve(name);

		// 未找到变量
		if(var == null) {
			Types.error(ctx.ID().getSymbol(), "no such variable: " + name);
		}

		// 变量名是函数名
		if(var instanceof FunctionSymbol) {
			Types.error(ctx.ID().getSymbol(), name + " is not a variable");
		}
	}

	@Override
	public void exitExpression_Call(CMMParser.Expression_CallContext ctx) {
		// 处理函数调用
		String funcName = ctx.ID().getText();
		Symbol function = currentScope.resolve(funcName);

		// 未找到函数定义
		if(function == null) {
			Types.error(ctx.ID().getSymbol(), "no such function: " + funcName);
		}

		// 函数名是变量名
		if(function instanceof VariableSymbol) {
			Types.error(ctx.ID().getSymbol(), funcName + " is not a function");
		}
	}
}
