package SemanticAnalysis;

import CMM.CMMBaseVisitor;
import CMM.CMMParser;
import SemanticAnalysis.Scope.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class VDefPhase extends CMMBaseVisitor {
	public ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
	public GlobalScope globals;
	public ParseTreeProperty<Mutable> mutables = new ParseTreeProperty<Mutable>();
	private Scope currentScope;    // 在此范围内定义符号

	/** 设置作用域 */
	private void saveScope(ParserRuleContext ctx, Scope s) {
		scopes.put(ctx, s);
	}

	@Override
	public Object visitFile(CMMParser.FileContext ctx) {
		// 建立全局作用域
		globals = new GlobalScope(null);
		currentScope = globals;
		return super.visitFile(ctx);
	}

	@Override
	public Object visitFunction(CMMParser.FunctionContext ctx) {
		// 得到函数名和返回值类型
		String name = ctx.ID().getText();
		int typeTokenType = ctx.type().start.getType();
		Symbol.Type type = Types.getType(typeTokenType);

		// 新建一个指向外围作用域的作用域
		FunctionSymbol function = new FunctionSymbol(name, type, currentScope);
		currentScope.define(function); // 定义当前范围内的函数
		saveScope(ctx, function);      // 入栈：将函数的父作用域设置为当前作用域
		currentScope = function;       // 当前作用域设置为函数作用域

		super.visitFunction(ctx);

		currentScope = currentScope.getEnclosingScope();

		return null;
	}
}
