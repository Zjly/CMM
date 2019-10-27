package SemanticAnalysis;

import CMM.CMMBaseVisitor;
import CMM.CMMParser;
import SemanticAnalysis.Scope.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class VisitPhase extends CMMBaseVisitor {
	public ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();
	public GlobalScope globals;
	public ParseTreeProperty<Mutable> mutables = new ParseTreeProperty<Mutable>();
	private Scope currentScope;    // 在此范围内定义符号

	/** 设置作用域 */
	private void saveScope(ParserRuleContext ctx, Scope s) {
		scopes.put(ctx, s);
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

	/** file -> includeDeclaration* compilationUnit* EOF */
	@Override
	public Object visitFile(CMMParser.FileContext ctx) {
		// 建立全局作用域
		globals = new GlobalScope(null);
		currentScope = globals;

		super.visitFile(ctx);

		return null;
	}

	/** function -> type ID '(' formalParameters ')' block */
	@Override
	public Object visitFunction(CMMParser.FunctionContext ctx) {
		// 得到函数名和返回值类型
		String name = ctx.ID().getText();
		int typeTokenType = ctx.type().start.getType();
		Symbol.Type type = Types.getType(typeTokenType);

		// 新建一个指向外围作用域的作用域
		FunctionSymbol function = new FunctionSymbol(name, type, currentScope);
		// 定义当前范围内的函数
		currentScope.define(function);
		// 入栈：将函数的父作用域设置为当前作用域
		saveScope(ctx, function);
		// 当前作用域设置为函数作用域
		currentScope = function;

		super.visitFunction(ctx);

		// 出栈作用域
		currentScope = currentScope.getEnclosingScope();

		return null;
	}

	/** block -> '{' blockStatement* '}' */
	@Override
	public Object visitBlock(CMMParser.BlockContext ctx) {
		// 入栈新的局部作用域
		currentScope = new LocalScope(currentScope);
		saveScope(ctx, currentScope);

		super.visitBlock(ctx);

		// 出栈作用域
		currentScope = currentScope.getEnclosingScope();

		return null;
	}

	/** formalParameter -> type ID */
	@Override
	public Object visitFormalParameter(CMMParser.FormalParameterContext ctx) {
		super.visitFormalParameter(ctx);

		String name = ctx.ID().getSymbol().getText();

		// 对变量进行作用域添加和定义
		if(currentScope.resolve(name) instanceof VariableSymbol) {
			System.exit(0);
		} else {
			defineVar(ctx.type(), ctx.ID().getSymbol());
		}

		return null;
	}

	/** variableDeclarator -> ID ('=' expression)? */
	@Override
	public Object visitVariableDeclarator_Variable(CMMParser.VariableDeclarator_VariableContext ctx) {
		super.visitVariableDeclarator_Variable(ctx);

		String name = ctx.ID().getSymbol().getText();

		// 对变量进行作用域添加和定义
		if(currentScope.resolve(name) instanceof VariableSymbol) {
			System.exit(0);
		} else {
			CMMParser.VariableDeclarationStatementContext grandParentCtx = (CMMParser.VariableDeclarationStatementContext)ctx.parent.parent;
			// 获取变量的值
			Symbol.Type type = Types.getType(grandParentCtx.type().start.getType());
			if(type == Symbol.Type.tINT) {
				int value = (int)Double.parseDouble(getMutable(ctx.expression()).value.toString());
				Mutable<Integer> mutable = new Mutable<>(value);
				defineVar(grandParentCtx.type(), ctx.ID().getSymbol(), mutable);
			} else if(type == Symbol.Type.tDOUBLE) {
				double value = Double.parseDouble(getMutable(ctx.expression()).value.toString());
				Mutable<Double> mutable = new Mutable<>(value);
				defineVar(grandParentCtx.type(), ctx.ID().getSymbol(), mutable);
			} else {
				Mutable mutable = getMutable(ctx.expression());
				defineVar(grandParentCtx.type(), ctx.ID().getSymbol(), mutable);
			}
		}

		return null;
	}

	/** expression -> expression op=('+'|'-') expression */
	@Override
	public Object visitExpression_Add_Min(CMMParser.Expression_Add_MinContext ctx) {
		super.visitExpression_Add_Min(ctx);

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

		return null;
	}

	/** expression -> expression op=('*'|'/'|'%') expression */
	@Override
	public Object visitExpression_Mul_Div(CMMParser.Expression_Mul_DivContext ctx) {
		super.visitExpression_Mul_Div(ctx);

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

		return null;
	}

	/** expressionList -> expression (',' expression)* */
	@Override
	public Object visitExpressionList(CMMParser.ExpressionListContext ctx) {
		super.visitExpressionList(ctx);

		setMutable(ctx, getMutable(ctx.expression(0)));

		return null;
	}

	/** expression -> ID */
	@Override
	public Object visitExpression_ID(CMMParser.Expression_IDContext ctx) {
		String name = ctx.ID().getSymbol().getText();
		Symbol var = currentScope.resolve(name);

		// 未找到变量
		if(var == null) {
			System.exit(0);
		}

		// 变量名是函数名
		if(var instanceof FunctionSymbol) {
			System.exit(0);
		}

		super.visitExpression_ID(ctx);

		// 在当前作用域中是否有此ID
		if(var instanceof VariableSymbol) {
			Symbol variableSymbol = currentScope.resolve(name);
			setMutable(ctx, variableSymbol.getValue());
		}

		return null;
	}

	/** expression -> ID '(' expressionList? ')' */
	@Override
	public Object visitExpression_Call(CMMParser.Expression_CallContext ctx) {
		// 处理函数调用
		String funcName = ctx.ID().getText();
		Symbol function = currentScope.resolve(funcName);

		// 未找到函数定义
		if(function == null && !funcName.equals("print")) {
			System.exit(0);
		}

		// 函数名是变量名
		if(function instanceof VariableSymbol) {
			System.exit(0);
		}

		super.visitExpression_Call(ctx);

		if(funcName.equals("print")) {
			System.out.println(getMutable(ctx.expressionList()).value);
			return null;
		}

		return null;
	}

	/** expression -> literal */
	@Override
	public Object visitExpression_Literal(CMMParser.Expression_LiteralContext ctx) {
		super.visitExpression_Literal(ctx);

		setMutable(ctx, getMutable(ctx.literal()));

		return null;
	}

	/** expression -> expression '=' expression */
	@Override
	public Object visitExpression_Assignment(CMMParser.Expression_AssignmentContext ctx) {
		super.visitExpression_Assignment(ctx);

		// 变量赋值
		String name = ctx.expression(0).getText();
		Symbol var = currentScope.resolve(name);
		var.setValue(getMutable(ctx.expression(1)));

		setMutable(ctx, getMutable(ctx.expression(1)));

		return null;
	}

	/** expression -> '(' expression ')' */
	@Override
	public Object visitExpression_Brackets(CMMParser.Expression_BracketsContext ctx) {
		super.visitExpression_Brackets(ctx);

		setMutable(ctx, getMutable(ctx.expression()));

		return null;
	}

	/** literal -> INT_NUMBER */
	@Override
	public Object visitNumber_Int(CMMParser.Number_IntContext ctx) {
		super.visitNumber_Int(ctx);

		// 将值入栈
		String text = ctx.INT_NUMBER().getText();
		int value = Integer.parseInt(text);
		Mutable<Integer> mutable = new Mutable<>(value);
		setMutable(ctx, mutable);

		return null;
	}

	/** literal -> FLOAT_NUMBER */
	@Override
	public Object visitNumber_Float(CMMParser.Number_FloatContext ctx) {
		super.visitNumber_Float(ctx);

		// 将值入栈
		String text = ctx.FLOAT_NUMBER().getText();
		double value = Double.parseDouble(text);
		Mutable<Double> mutable = new Mutable<>(value);
		setMutable(ctx, mutable);

		return null;
	}

	/** literal -> BOOLEAN */
	@Override
	public Object visitLiteral_Boolean(CMMParser.Literal_BooleanContext ctx) {
		super.visitLiteral_Boolean(ctx);

		// 将值入栈
		String text = ctx.BOOLEAN().getText();
		boolean value = text.equals("true");
		Mutable<Boolean> mutable = new Mutable<>(value);
		setMutable(ctx, mutable);

		return null;
	}

	/** expression -> expression ('<=' | '>=' | '>' | '<') expression */
	@Override
	public Object visitExpression_Greater_Less(CMMParser.Expression_Greater_LessContext ctx) {
		super.visitExpression_Greater_Less(ctx);

		double leftValue = Double.parseDouble(getMutable(ctx.expression(0)).value.toString());
		double rightValue = Double.parseDouble(getMutable(ctx.expression(1)).value.toString());

		// 通过不同符号设置不同的值
		if(ctx.op.getText().equals("<=")) {
			if(leftValue <= rightValue) {
				setMutable(ctx, new Mutable<>(true));
			} else {
				setMutable(ctx, new Mutable<>(false));
			}
		}

		if(ctx.op.getText().equals(">=")) {
			if(leftValue >= rightValue) {
				setMutable(ctx, new Mutable<>(true));
			} else {
				setMutable(ctx, new Mutable<>(false));
			}
		}

		if(ctx.op.getText().equals("<")) {
			if(leftValue < rightValue) {
				setMutable(ctx, new Mutable<>(true));
			} else {
				setMutable(ctx, new Mutable<>(false));
			}
		}

		if(ctx.op.getText().equals(">")) {
			if(leftValue > rightValue) {
				setMutable(ctx, new Mutable<>(true));
			} else {
				setMutable(ctx, new Mutable<>(false));
			}
		}

		return null;
	}

	/** expression -> expression ('==' | '!=') expression */
	@Override
	public Object visitExpression_Equal(CMMParser.Expression_EqualContext ctx) {
		super.visitExpression_Equal(ctx);

		double leftValue = Double.parseDouble(getMutable(ctx.expression(0)).value.toString());
		double rightValue = Double.parseDouble(getMutable(ctx.expression(1)).value.toString());

		// 通过不同符号设置不同的值
		if(ctx.op.getText().equals("==")) {
			if(leftValue == rightValue) {
				setMutable(ctx, new Mutable<>(true));
			} else {
				setMutable(ctx, new Mutable<>(false));
			}
		}

		if(ctx.op.getText().equals("!=")) {
			if(leftValue != rightValue) {
				setMutable(ctx, new Mutable<>(true));
			} else {
				setMutable(ctx, new Mutable<>(false));
			}
		}

		return null;
	}

	/** ifStatement -> 'if' '(' expression ')' statement ('else' statement)? */
	@Override
	public Object visitIfStatement(CMMParser.IfStatementContext ctx) {
		visit(ctx.expression());

		// 计算条件是否成立
		boolean result = getMutable(ctx.expression()).value.toString().equals("true");
		if(result) {
			visit(ctx.statement(0));
		} else {
			if(ctx.statement(1) != null) {
				visit(ctx.statement(1));
			}
		}

		return null;
	}
}
