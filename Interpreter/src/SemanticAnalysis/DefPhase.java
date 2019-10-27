package SemanticAnalysis;

import CMM.*;
import SemanticAnalysis.Scope.*;
import SemanticAnalysis.Scope.Mutable;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import static SemanticAnalysis.Scope.Errors.error;

/** 作用域入栈 变量入栈 */
public class DefPhase extends CMMBaseListener {
	public ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
	public GlobalScope globals;
	public ParseTreeProperty<Mutable> mutables = new ParseTreeProperty<Mutable>();
	private Scope currentScope;    // 在此范围内定义符号


	/** 设置作用域 */
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

	/** file -> includeDeclaration* compilationUnit* EOF */
	@Override
	public void exitFile(CMMParser.FileContext ctx) {
		// System.out.println(globals);
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
		// System.out.println(currentScope);
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
		// System.out.println(currentScope);
		currentScope = currentScope.getEnclosingScope(); // 出栈作用域
	}

	/** formalParameter -> type ID */
	@Override
	public void exitFormalParameter(CMMParser.FormalParameterContext ctx) {
		String name = ctx.ID().getSymbol().getText();

		// 对变量进行作用域添加和定义
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

		// 对变量进行作用域添加和定义
		if(currentScope.resolve(name) instanceof VariableSymbol) {
			error(ctx.ID().getSymbol(), name + " has been defined");
		} else {
			CMMParser.VariableDeclarationStatementContext grandParentCtx = (CMMParser.VariableDeclarationStatementContext)ctx.parent.parent;
			// 获取变量的值
			Symbol.Type type = Types.getType(grandParentCtx.type().start.getType());
			if(type == Symbol.Type.tINT) {
				int value = (int)Double.parseDouble(getMutable(ctx.expression()).value.toString());
				Mutable<Integer> mutable = new Mutable<>(value);
				defineVar(grandParentCtx.type(), ctx.ID().getSymbol(), mutable);
			}
			else if(type == Symbol.Type.tDOUBLE) {
				double value = Double.parseDouble(getMutable(ctx.expression()).value.toString());
				Mutable<Double> mutable = new Mutable<>(value);
				defineVar(grandParentCtx.type(), ctx.ID().getSymbol(), mutable);
			}
			else {
				Mutable mutable = getMutable(ctx.expression());
				defineVar(grandParentCtx.type(), ctx.ID().getSymbol(), mutable);
			}
		}
	}

	/** 定义符号变量 */
	private void defineVar(CMMParser.TypeContext typeCtx, Token nameToken) {
		int typeTokenType = typeCtx.start.getType();
		Symbol.Type type = Types.getType(typeTokenType);
		VariableSymbol var = new VariableSymbol(nameToken.getText(), type);
		currentScope.define(var); // 在当前作用域中定义符号
	}

	/** 定义符号变量 含变量值 */
	private void defineVar(CMMParser.TypeContext typeCtx, Token nameToken, Mutable mutable) {
		int typeTokenType = typeCtx.start.getType();
		Symbol.Type type = Types.getType(typeTokenType);
		VariableSymbol var = new VariableSymbol(nameToken.getText(), type, mutable);
		currentScope.define(var); // 在当前作用域中定义符号
	}

	/** 设置变量值 */
	private void setMutable(ParseTree node, Mutable value) {
		mutables.put(node, value);
	}

	/** 得到变量值 */
	private Mutable getMutable(ParseTree node) {
		return mutables.get(node);
	}

	/** expression -> expression op=('+'|'-') expression */
	@Override
	public void exitExpression_Add_Min(CMMParser.Expression_Add_MinContext ctx) {
		Mutable left = getMutable(ctx.expression(0));
		Mutable right = getMutable(ctx.expression(1));

		// 两数都是int
		if(left.value instanceof Integer && right.value instanceof Integer) {
			if(ctx.op.getText().equals("+")) {
				setMutable(ctx, new Mutable<>((int)left.value + (int)right.value));
			} else if(ctx.op.getText().equals("-")) {
				setMutable(ctx, new Mutable<>((int)left.value - (int)right.value));
			}
		}

		// 其中有一数为double
		if(left.value instanceof Double || right.value instanceof Double) {
			if(ctx.op.getText().equals("+")) {
				setMutable(ctx, new Mutable<>(Double.parseDouble(left.value.toString()) + Double.parseDouble(right.value.toString())));
			} else if(ctx.op.getText().equals("-")) {
				setMutable(ctx, new Mutable<>(Double.parseDouble(left.value.toString()) - Double.parseDouble(right.value.toString())));
			}
		}
	}

	/** expression -> expression op=('*'|'/'|'%') expression */
	@Override
	public void exitExpression_Mul_Div(CMMParser.Expression_Mul_DivContext ctx) {
		Mutable left = getMutable(ctx.expression(0));
		Mutable right = getMutable(ctx.expression(1));

		// 两数都是int
		if(left.value instanceof Integer && right.value instanceof Integer) {
			if(ctx.op.getText().equals("*")) {
				setMutable(ctx, new Mutable<>((int)left.value * (int)right.value));
			} else if(ctx.op.getText().equals("/")) {
				setMutable(ctx, new Mutable<>((int)left.value / (int)right.value));
			}
		}

		// 其中有一数为double
		if(left.value instanceof Double || right.value instanceof Double) {
			if(ctx.op.getText().equals("*")) {
				setMutable(ctx, new Mutable<>(Double.parseDouble(left.value.toString()) * Double.parseDouble(right.value.toString())));
			} else if(ctx.op.getText().equals("/")) {
				setMutable(ctx, new Mutable<>(Double.parseDouble(left.value.toString()) / Double.parseDouble(right.value.toString())));
			}
		}
	}

	/** expressionList -> expression (',' expression)* */
	@Override
	public void exitExpressionList(CMMParser.ExpressionListContext ctx) {
		setMutable(ctx, getMutable(ctx.expression(0)));
	}

	/** expression -> ID */
	@Override
	public void exitExpression_ID(CMMParser.Expression_IDContext ctx) {
		String name = ctx.ID().getSymbol().getText();

		// 在当前作用域中是否有此ID
		if(currentScope.resolve(name) instanceof VariableSymbol) {
			Symbol variableSymbol = currentScope.resolve(name);
			setMutable(ctx, variableSymbol.getValue());
		}
	}

	/** expression -> literal */
	@Override
	public void exitExpression_Literal(CMMParser.Expression_LiteralContext ctx) {
		setMutable(ctx, getMutable(ctx.literal()));
	}

	/** expression -> expression '=' expression */
	@Override
	public void exitExpression_Assignment(CMMParser.Expression_AssignmentContext ctx) {
		// 变量赋值
		String name = ctx.expression(0).getText();
		Symbol var = currentScope.resolve(name);
		var.setValue(getMutable(ctx.expression(1)));

		setMutable(ctx, getMutable(ctx.expression(1)));
	}

	@Override
	public void exitExpression_Brackets(CMMParser.Expression_BracketsContext ctx) {
		setMutable(ctx, getMutable(ctx.expression()));
	}

	/** literal -> INT_NUMBER */
	@Override
	public void exitNumber_Int(CMMParser.Number_IntContext ctx) {
		String text = ctx.INT_NUMBER().getText();
		int value = Integer.parseInt(text);
		Mutable<Integer> mutable = new Mutable<>(value);
		setMutable(ctx, mutable);
	}

	/** literal -> FLOAT_NUMBER */
	@Override
	public void exitNumber_Float(CMMParser.Number_FloatContext ctx) {
		String text = ctx.FLOAT_NUMBER().getText();
		double value = Double.parseDouble(text);
		Mutable<Double> mutable = new Mutable<>(value);
		setMutable(ctx, mutable);
	}

	/** ifStatement -> 'if' '(' expression ')' statement ('else' statement)? */
	@Override
	public void enterIfStatement(CMMParser.IfStatementContext ctx) {
		
	}
}
