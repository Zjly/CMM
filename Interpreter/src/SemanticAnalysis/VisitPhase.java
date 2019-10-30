package SemanticAnalysis;

import CMM.CMMBaseVisitor;
import CMM.CMMParser;
import SemanticAnalysis.Scope.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.ArrayList;
import java.util.Hashtable;

/** 使用visitor模式进行解释执行 */
public class VisitPhase extends CMMBaseVisitor {
	/** 作用域栈 */
	private ParseTreeProperty<Scope> scopes = new ParseTreeProperty<Scope>();

	/** ctx值栈 */
	private ParseTreeProperty<Mutable> mutables = new ParseTreeProperty<Mutable>();

	/** 当前作用域 */
	private Scope currentScope;

	/** 返回值哈希表 通过[函数名，返回值]的形式进行映射存储 */
	private Hashtable<String, Mutable> returnHashtable = new Hashtable<>();

	/** 函数id 在每次调用函数后自增，用于对多次调用同一函数的函数名进行区别，为他们分配不同的作用域 */
	private static int funID = 1;

	/** 设置作用域 */
	private void setScope(ParserRuleContext ctx, Scope s) {
		scopes.put(ctx, s);
	}

	/** 定义符号变量 */
	private void defineVar(CMMParser.TypeContext typeCtx, Token nameToken) {
		// 新建符号
		int typeTokenType = typeCtx.start.getType();
		Symbol.Type type = Types.getType(typeTokenType);
		VariableSymbol var = new VariableSymbol(nameToken.getText(), type);

		// 在当前作用域中定义符号
		currentScope.define(var);
	}

	/** 定义符号变量 含变量值 */
	private void defineVar(CMMParser.TypeContext typeCtx, Token nameToken, Mutable mutable) {
		// 新建符号(含变量值)
		int typeTokenType = typeCtx.start.getType();
		Symbol.Type type = Types.getType(typeTokenType);
		VariableSymbol var = new VariableSymbol(nameToken.getText(), type, mutable);

		// 在当前作用域中定义符号
		currentScope.define(var);
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
		// 建立全局作用域并设为当前作用域
		currentScope = new GlobalScope(null);

		super.visitFile(ctx);

		return null;
	}

	/** function -> type ID '(' (formalParameter (',' formalParameter)*)? ')' block */
	@Override
	public Object visitFunction(CMMParser.FunctionContext ctx) {
		// 得到函数名和函数返回值类型
		String name = ctx.ID().getText();
		int typeTokenType = ctx.type().start.getType();
		Symbol.Type type = Types.getType(typeTokenType);

		// 新建一个指向外围作用域的作用域
		FunctionSymbol function = new FunctionSymbol(name, type, currentScope, ctx);
		// 定义当前范围内的函数
		currentScope.define(function);
		// 入栈：将函数的父作用域设置为当前作用域
		setScope(ctx, function);
		// 当前作用域设置为函数作用域
		currentScope = function;

		// 如若是main函数则访问其函数体，其余函数则等待调用
		if(name.equals("main")) {
			super.visitFunction(ctx);
		}

		// 出栈作用域
		currentScope = currentScope.getEnclosingScope();

		return null;
	}

	/** formalParameter -> type ID */
	@Override
	public Object visitFormalParameter(CMMParser.FormalParameterContext ctx) {
		super.visitFormalParameter(ctx);

		// 对变量进行作用域添加和定义
		defineVar(ctx.type(), ctx.ID().getSymbol());

		return null;
	}

	/** variableDeclarator -> ID ('=' expression)? */
	@Override
	public Object visitVariableDeclarator_Variable(CMMParser.VariableDeclarator_VariableContext ctx) {
		super.visitVariableDeclarator_Variable(ctx);

		// 得到变量的类型的ctx
		CMMParser.VariableDeclarationStatementContext grandParentCtx = (CMMParser.VariableDeclarationStatementContext)ctx.parent.parent;
		// 变量有初始值
		if(ctx.expression() != null) {
			// 获取变量的值
			Symbol.Type type = Types.getType(grandParentCtx.type().start.getType());
			// 根据变量类型进行不同的处理
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
		} else {
			defineVar(grandParentCtx.type(), ctx.ID().getSymbol());
		}

		return null;
	}

	/** expression -> expression op=('+'|'-') expression */
	@Override
	public Object visitExpression_Add_Min(CMMParser.Expression_Add_MinContext ctx) {
		/*
		若采用：
			super.visitExpression_Add_Min(ctx);
			Mutable left = getMutable(ctx.expression(0));
			Mutable right = getMutable(ctx.expression(1));
		会导致left内的value受到right中计算的影响而变化，从而产生n + sum(n - 1)中n总是为2的BUG
		所以要在赋值前计算expression的值
		 */
		visit(ctx.expression(0));
		Mutable left = getMutable(ctx.expression(0));
		visit(ctx.expression(1));
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

		// 其中有一为string
		if(left.value instanceof String || right.value instanceof String) {
			if(ctx.op.getText().equals("+")) {
				setMutable(ctx, new Mutable<>(left.value.toString() + right.value.toString()));
			}
		}

		return null;
	}

	/** expression -> expression op=('*'|'/'|'%') expression */
	@Override
	public Object visitExpression_Mul_Div(CMMParser.Expression_Mul_DivContext ctx) {
		visit(ctx.expression(0));
		Mutable left = getMutable(ctx.expression(0));
		visit(ctx.expression(1));
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

	/** expression -> ID */
	@Override
	public Object visitExpression_ID(CMMParser.Expression_IDContext ctx) {
		super.visitExpression_ID(ctx);

		// 得到变量
		String name = ctx.ID().getSymbol().getText();
		Symbol var = currentScope.resolve(name);

		// 在当前作用域中是否有此ID
		if(var instanceof VariableSymbol) {
			Symbol variableSymbol = currentScope.resolve(name);
			setMutable(ctx, variableSymbol.getValue());
		}

		return null;
	}

	/** expression -> ID '(' (expression (',' expression)*)? ')' */
	@Override
	public Object visitExpression_Call(CMMParser.Expression_CallContext ctx) {
		super.visitExpression_Call(ctx);

		// 得到函数名与函数
		String funcName = ctx.ID().getText();
		Symbol function = currentScope.resolve(funcName);

		// 得到调用参数并置入arraylist
		ArrayList<Mutable> arrayList = new ArrayList<>();
		for(CMMParser.ExpressionContext children : ctx.expression()) {
			if(getMutable(children) != null) {
				arrayList.add(getMutable(children));
			} else {
				Symbol var = currentScope.resolve(children.getText());
				arrayList.add(var.getValue());
			}
		}

		// 进行函数调用处理
		if(!funcName.equals("print")) {
			// 得到函数名和返回值类型
			String name = function.ctx.ID().getText();
			int typeTokenType = function.ctx.type().start.getType();
			Symbol.Type type = Types.getType(typeTokenType);

			// 新建一个指向外围作用域的作用域，并将函数名进行调用重命名
			FunctionSymbol functionSymbol = new FunctionSymbol(name + "_" + funID, type, currentScope);
			funID++;
			currentScope.define(functionSymbol); // 定义当前范围内的函数
			setScope(function.ctx, functionSymbol);      // 入栈：将函数的父作用域设置为当前作用域
			currentScope = functionSymbol;       // 当前作用域设置为函数作用域

			// 对应参数赋值并添加到函数作用域中
			for(int i = 0; i < ctx.expression().size(); i++) {
				// 调用参数
				Mutable parameter = arrayList.get(i);
				// 函数参数
				CMMParser.FormalParameterContext formalParameter = function.ctx.formalParameter(i);

				// 参数对应赋值，将调用者的参数一一对应到被调用者的参数上
				Symbol.Type typeFormalParameter = Types.getType(formalParameter.type().start.getType());
				if(typeFormalParameter == Symbol.Type.tINT) {
					int value = (int)Double.parseDouble(parameter.value.toString());
					Mutable<Integer> mutable = new Mutable<>(value);
					defineVar(formalParameter.type(), formalParameter.ID().getSymbol(), mutable);
				} else if(typeFormalParameter == Symbol.Type.tDOUBLE) {
					double value = Double.parseDouble(parameter.value.toString());
					Mutable<Double> mutable = new Mutable<>(value);
					defineVar(formalParameter.type(), formalParameter.ID().getSymbol(), mutable);
				} else {
					defineVar(formalParameter.type(), formalParameter.ID().getSymbol(), parameter);
				}
			}

			// 访问函数体
			visitBlock(function.ctx.block());

			// 设置返回值
			setMutable(ctx, returnHashtable.get(currentScope.getScopeName()));

			// 出栈作用域
			currentScope = currentScope.getEnclosingScope();
		}

		// 内置print函数
		if(funcName.equals("print")) {
			for(CMMParser.ExpressionContext children : ctx.expression()) {
				System.out.print(getMutable(children).value);
			}
			System.out.println();
		}

		return null;
	}

	/** expression -> literal */
	@Override
	public Object visitExpression_Literal(CMMParser.Expression_LiteralContext ctx) {
		super.visitExpression_Literal(ctx);

		// 变量值向上传递
		setMutable(ctx, getMutable(ctx.literal()));

		return null;
	}

	/** expression -> op=expression ('++' | '--') */
	@Override
	public Object visitExpression_PlusPlus_MinerMiner(CMMParser.Expression_PlusPlus_MinerMinerContext ctx) {
		super.visitExpression_PlusPlus_MinerMiner(ctx);

		// 变量赋值
		String name = ctx.expression().getText();
		Symbol var = currentScope.resolve(name);

		// 对整数才能进行自增自减操作
		if(getMutable(ctx.expression()).value instanceof Integer) {
			Mutable<Integer> mutable;
			int value = Integer.parseInt(getMutable(ctx.expression()).value.toString());
			String symbol = ctx.op.getText();

			// 进行对应计算
			if(symbol.equals("++")) {
				mutable = new Mutable<>(value + 1);
			} else {
				mutable = new Mutable<>(value - 1);
			}
			var.setValue(mutable);

			setMutable(ctx, mutable);
		}

		return null;
	}

	/** expression -> expression '=' expression */
	@Override
	public Object visitExpression_Assignment(CMMParser.Expression_AssignmentContext ctx) {
		super.visitExpression_Assignment(ctx);

		// 变量赋值
		String name = ctx.expression(0).getText();
		Symbol var = currentScope.resolve(name);
		// 更新变量值
		var.setValue(getMutable(ctx.expression(1)));

		setMutable(ctx, getMutable(ctx.expression(1)));

		return null;
	}

	/** expression -> '(' expression ')' */
	@Override
	public Object visitExpression_Brackets(CMMParser.Expression_BracketsContext ctx) {
		super.visitExpression_Brackets(ctx);

		// 变量值向上传递
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

	/** literal -> STRING */
	@Override
	public Object visitLiteral_String(CMMParser.Literal_StringContext ctx) {
		super.visitLiteral_String(ctx);

		// 将值入栈
		String value = ctx.STRING().getText();
		value = value.replace("\"", "");
		Mutable<String> mutable = new Mutable<>(value);
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
		visit(ctx.expression(0));
		double leftValue = Double.parseDouble(getMutable(ctx.expression(0)).value.toString());
		visit(ctx.expression(1));
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

	/** whileStatement -> 'while' '(' expression ')' statement */
	@Override
	public Object visitWhileStatement(CMMParser.WhileStatementContext ctx) {
		visit(ctx.expression());

		// 计算条件是否成立
		boolean result = getMutable(ctx.expression()).value.toString().equals("true");

		// 进行while循环
		while(result) {
			visit(ctx.statement());
			visit(ctx.expression());
			result = getMutable(ctx.expression()).value.toString().equals("true");
		}

		return null;
	}

	/** statement -> 'return' expression? ';' */
	@Override
	public Object visitStatement_Return(CMMParser.Statement_ReturnContext ctx) {
		super.visitStatement_Return(ctx);

		// 建立调用者-返回值的哈希索引
		returnHashtable.put(currentScope.getScopeName(), getMutable(ctx.expression()));

		return null;
	}

	/** forStatement -> 'for' '(' variableDeclarationStatement? ';' expression? ';' (expression (',' expression)*)? ')' statement; */
	@Override
	public Object visitForStatement(CMMParser.ForStatementContext ctx) {
		// for初始化和for条件
		visit(ctx.variableDeclarationStatement());
		visit(ctx.expression(0));
		boolean result = getMutable(ctx.expression(0)).value.toString().equals("true");

		// 循环直至不满足条件为止
		while(result) {
			// 访问语句
		    visit(ctx.statement());

		    // 条件更新与计算
		    visit(ctx.expression(1));
			visit(ctx.expression(0));
			result = getMutable(ctx.expression(0)).value.toString().equals("true");
		}

		return null;
	}

	/** expression -> expression '&&' expression */
	@Override
	public Object visitExpression_LogicAnd(CMMParser.Expression_LogicAndContext ctx) {
		// 计算左部布尔值
		visit(ctx.expression(0));
		boolean leftValue = getMutable(ctx.expression(0)).value.toString().equals("true");
		// 加入短路运算
		if(!leftValue) {
			setMutable(ctx, new Mutable<>(false));
			return null;
		}

		// 计算右部布尔值
		visit(ctx.expression(1));
		boolean rightValue = getMutable(ctx.expression(1)).value.toString().equals("true");
		if(!rightValue) {
			setMutable(ctx, new Mutable<>(false));
			return null;
		}

		setMutable(ctx, new Mutable<>(true));
		return null;
	}

	/** expression -> expression '||' expression */
	@Override
	public Object visitExpression_LogicOr(CMMParser.Expression_LogicOrContext ctx) {
		// 计算左部布尔值
		visit(ctx.expression(0));
		boolean leftValue = getMutable(ctx.expression(0)).value.toString().equals("true");
		// 加入短路运算
		if(leftValue) {
			setMutable(ctx, new Mutable<>(true));
			return null;
		}

		// 计算右部布尔值
		visit(ctx.expression(1));
		boolean rightValue = getMutable(ctx.expression(1)).value.toString().equals("true");
		if(rightValue) {
			setMutable(ctx, new Mutable<>(true));
			return null;
		}

		setMutable(ctx, new Mutable<>(false));
		return null;
	}
}
