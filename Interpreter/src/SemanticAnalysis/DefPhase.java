package SemanticAnalysis;

import CMM.*;
import SemanticAnalysis.Scope.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/**
 * 第一遍遍历语法树
 */
public class DefPhase extends CMMBaseListener {
	public ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
	public GlobalScope globals;
	private Scope currentScope;    // 在此范围内定义符号

	/**
	 * 保存作用域
	 * @param ctx 文法ctx
	 * @param s 作用域
	 */
	private void saveScope(ParserRuleContext ctx, Scope s) {
		scopes.put(ctx, s);
	}

	@Override
	public void enterFile(CMMParser.FileContext ctx) {
		// 建立全局作用域
		globals = new GlobalScope(null);
		currentScope = globals;
	}

	@Override
	public void exitFile(CMMParser.FileContext ctx) {
		System.out.println(globals);
	}

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

	@Override
	public void exitFunction(CMMParser.FunctionContext ctx) {
		System.out.println(currentScope);
		currentScope = currentScope.getEnclosingScope(); // 出栈作用域
	}

	@Override
	public void enterBlock(CMMParser.BlockContext ctx) {
		// 入栈新的局部作用域
		currentScope = new LocalScope(currentScope);
		saveScope(ctx, currentScope);
	}

	@Override
	public void exitBlock(CMMParser.BlockContext ctx) {
		System.out.println(currentScope);
		currentScope = currentScope.getEnclosingScope(); // 出栈作用域
	}

	@Override
	public void exitFormalParameter(CMMParser.FormalParameterContext ctx) {
		defineVar(ctx.type(), ctx.ID().getSymbol());
	}

	@Override
	public void exitVariableDeclarator_Variable(CMMParser.VariableDeclarator_VariableContext ctx) {
		CMMParser.VariableDeclarationStatementContext grandParentCtx = (CMMParser.VariableDeclarationStatementContext)ctx.parent.parent;
		defineVar(grandParentCtx.type(), ctx.ID().getSymbol());
	}

	/**
	 * 定义符号变量
	 * @param typeCtx 类型的ctx
	 * @param nameToken 变量的token
	 */
	private void defineVar(CMMParser.TypeContext typeCtx, Token nameToken) {
		int typeTokenType = typeCtx.start.getType();
		Symbol.Type type = Types.getType(typeTokenType);
		VariableSymbol var = new VariableSymbol(nameToken.getText(), type);
		currentScope.define(var); // 在当前作用域中定义符号
	}
}
