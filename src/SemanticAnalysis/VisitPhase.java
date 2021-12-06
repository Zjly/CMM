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
import java.util.Stack;

import static SemanticAnalysis.Scope.Output.*;

/** 使用visitor模式进行解释执行 */
public class VisitPhase extends CMMBaseVisitor {
	/** 作用域栈 */
	private final ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();

	/** ctx值栈 */
	private final ParseTreeProperty<Mutable> mutables = new ParseTreeProperty<>();

	/** 当前作用域 */
	private Scope currentScope;

	/** 当前函数作用域 */
	private Scope functionScope;

	/** 函数作用域栈 */
	private final Stack<Scope> functionScopeStack = new Stack<>();

	/** 返回值哈希表 通过[函数名，返回值]的形式进行映射存储 */
	private final Hashtable<String, Mutable> returnHashtable = new Hashtable<>();

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
		if(typeCtx.pointer() != null) {
			if(type == Symbol.Type.tINT) {
				type = Symbol.Type.tpINT;
			}
		}
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
			functionScope = currentScope;
			functionScopeStack.push(currentScope);

			super.visitFunction(ctx);

			functionScope = functionScopeStack.pop();
		}

		// 出栈作用域
		currentScope = currentScope.getEnclosingScope();

		return null;
	}

	/** block -> '{' blockStatement* '}' */
	@Override
	public Object visitBlock(CMMParser.BlockContext ctx) {
		// 入栈新的局部作用域
		currentScope = new LocalScope(currentScope);
		setScope(ctx, currentScope);

		super.visitBlock(ctx);

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
			if(grandParentCtx.type().pointer() != null) {
				Mutable mutable = getMutable(ctx.expression());
				defineVar(grandParentCtx.type(), ctx.ID().getSymbol(), mutable);
			} else {
				// 根据变量类型进行不同的处理
				if(type == Symbol.Type.tINT) {
					try {
						int value = (int)Double.parseDouble(getMutable(ctx.expression()).value.toString());
						Mutable mutable = new Mutable<>(value);
						defineVar(grandParentCtx.type(), ctx.ID().getSymbol(), mutable);
					} catch(NumberFormatException n) {
						error(ctx.ID().getSymbol(), "assignment type error");
					}
				} else if(type == Symbol.Type.tDOUBLE) {
					try {
						double value = Double.parseDouble(getMutable(ctx.expression()).value.toString());
						Mutable mutable = new Mutable<>(value);
						defineVar(grandParentCtx.type(), ctx.ID().getSymbol(), mutable);
					} catch(NumberFormatException n) {
						error(ctx.ID().getSymbol(), "assignment type error");
					}
				} else {
					Mutable mutable = getMutable(ctx.expression());
					defineVar(grandParentCtx.type(), ctx.ID().getSymbol(), mutable);
				}
			}
		} else {
			// 赋默认初始值
			Symbol.Type type = Types.getType(grandParentCtx.type().start.getType());
			if(grandParentCtx.type().pointer() != null) {
				defineVar(grandParentCtx.type(), ctx.ID().getSymbol());
			} else {
				// 根据变量类型进行不同的处理
				if(type == Symbol.Type.tINT) {
					int value = 0;
					Mutable mutable = new Mutable<>(value);
					defineVar(grandParentCtx.type(), ctx.ID().getSymbol(), mutable);
				} else if(type == Symbol.Type.tDOUBLE) {
					double value = 0;
					Mutable mutable = new Mutable<>(value);
					defineVar(grandParentCtx.type(), ctx.ID().getSymbol(), mutable);
				} else if(type == Symbol.Type.tSTRING) {
					String value = "";
					Mutable mutable = new Mutable<>(value);
					defineVar(grandParentCtx.type(), ctx.ID().getSymbol(), mutable);
				} else {
					defineVar(grandParentCtx.type(), ctx.ID().getSymbol());
				}
			}
		}

		return null;
	}

	/** statement -> controlStatement */
	@Override
	public Object visitStatement_Control(CMMParser.Statement_ControlContext ctx) {
		currentScope = new LocalScope(currentScope);
		setScope(ctx, currentScope);

		super.visitStatement_Control(ctx);

		currentScope = currentScope.getEnclosingScope(); // 出栈作用域

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

		Mutable result = mutableOperator(left, right, ctx.op.getText());
		setMutable(ctx, result);

		return null;
	}

	/** expression -> expression op=('*'|'/'|'%') expression */
	@Override
	public Object visitExpression_Mul_Div(CMMParser.Expression_Mul_DivContext ctx) {
		visit(ctx.expression(0));
		Mutable left = getMutable(ctx.expression(0));
		visit(ctx.expression(1));
		Mutable right = getMutable(ctx.expression(1));

		Mutable result = mutableOperator(left, right, ctx.op.getText());
		setMutable(ctx, result);

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

		// 内置println函数
		if(funcName.equals("println")) {
			printOut(ctx);
			output("\n");
			return null;
		}

		if(funcName.equals("print")) {
			printOut(ctx);
			return null;
		}

		// 内置输入函数
		if(funcName.equals("input")) {
			String s = input();
			setMutable(ctx, new Mutable<>(s));
			return null;
		}

		// 进行函数调用处理
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

		// 更改当前函数作用域
		functionScope = functionSymbol;
		functionScopeStack.push(currentScope);

		// 对应参数赋值并添加到函数作用域中
		for(int i = 0; i < ctx.expression().size(); i++) {
			// 调用参数
			Mutable parameter = arrayList.get(i);
			// 函数参数
			CMMParser.FormalParameterContext formalParameter = function.ctx.formalParameter(i);

			// 参数对应赋值，将调用者的参数一一对应到被调用者的参数上
			Symbol.Type typeFormalParameter = Types.getType(formalParameter.type().start.getType());
			if(formalParameter.type().pointer() != null) {
				defineVar(formalParameter.type(), formalParameter.ID().getSymbol(), parameter);
			} else if(typeFormalParameter == Symbol.Type.tINT) {
				int value = (int)Double.parseDouble(parameter.value.toString());
				Mutable mutable = new Mutable<>(value);
				defineVar(formalParameter.type(), formalParameter.ID().getSymbol(), mutable);
			} else if(typeFormalParameter == Symbol.Type.tDOUBLE) {
				double value = Double.parseDouble(parameter.value.toString());
				Mutable mutable = new Mutable<>(value);
				defineVar(formalParameter.type(), formalParameter.ID().getSymbol(), mutable);
			} else {
				defineVar(formalParameter.type(), formalParameter.ID().getSymbol(), parameter);
			}
		}

		// 访问函数体
		visitBlock(function.ctx.block());

		// 设置返回值
		setMutable(ctx, returnHashtable.get(functionScope.getScopeName()));

		// 出栈作用域
		currentScope = currentScope.getEnclosingScope();

		// 出栈函数作用域
		functionScope = functionScopeStack.pop();

		return null;
	}

	/** 对ctx的内容进行输出 */
	private void printOut(CMMParser.Expression_CallContext ctx) {
		for(CMMParser.ExpressionContext children : ctx.expression()) {
			if(children.getChild(0).getText().startsWith("*")) {
				output(((Symbol)getMutable(children).value).getValue().value.toString());
			} else {
				String out = getMutable(children).value.toString();
				out = out.replace("\\t", "\t").replace("\\n", "\n");
				output(out);
			}
		}
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
			Mutable mutable;
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

		// 处理数组
		if(ctx.getChild(0).getText().contains("[")) {
			String name = ctx.expression(0).getChild(0).getText();
			Symbol var = currentScope.resolve(name);

			int index = Integer.parseInt(getMutable(ctx.expression(0).getChild(2)).value.toString());
			((int[])(var.getValue().value))[index] = Integer.parseInt(getMutable(ctx.expression(1)).value.toString());
		}
		// 处理指针
		else if(ctx.getChild(0).getText().contains("*")) {
			if(ctx.getChild(2).getText().contains("*")) {
				Symbol var1 = (Symbol)getMutable(ctx.expression(0)).value;
				Symbol var2 = (Symbol)getMutable(ctx.expression(1)).value;
				var1.setValue(var2.value);
			} else {
				Symbol var = (Symbol)getMutable(ctx.expression(0)).value;
				var.setValue(getMutable(ctx.expression(1)));
			}
		} else if(ctx.getChild(2).getText().contains("*")) {
			// 变量赋值
			String name = ctx.expression(0).getText();
			Symbol var1 = currentScope.resolve(name);

			Symbol var2 = (Symbol)getMutable(ctx.expression(1)).value;
			var1.setValue(var2.value);
		}
		// 处理变量
		else {
			// 变量赋值
			String name = ctx.expression(0).getText();
			Symbol var = currentScope.resolve(name);
			// 更新变量值
			var.setValue(getMutable(ctx.expression(1)));

			setMutable(ctx, getMutable(ctx.expression(1)));
		}

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
		Mutable mutable = new Mutable<>(value);
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
		Mutable mutable = new Mutable<>(value);
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
		Mutable mutable = new Mutable<>(value);
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
		Mutable mutable = new Mutable<>(value);
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
		returnHashtable.put(functionScope.getScopeName(), getMutable(ctx.expression()));

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

	/** variableDeclarator -> ID '[' expression ']' ('=' arrayInitializer)? */
	@Override
	public Object visitVariableDeclarator_Array(CMMParser.VariableDeclarator_ArrayContext ctx) {
		super.visitVariableDeclarator_Array(ctx);

		// 得到数组的类型的ctx
		CMMParser.VariableDeclarationStatementContext grandParentCtx = (CMMParser.VariableDeclarationStatementContext)ctx.parent.parent;
		// 数组长度已知
		if(ctx.expression() != null) {
			// 数组类型
			Symbol.Type type = Types.getType(grandParentCtx.type().start.getType());
			// 数组长度
			int length = (int)Double.parseDouble(getMutable(ctx.expression()).value.toString());

			// 根据数组类型进行不同的处理
			if(type == Symbol.Type.tINT) {
				int[] value = new int[length];

				// 加载初始值
				int index = 0;
				if(ctx.arrayInitializer() != null) {
					for(CMMParser.ExpressionContext children : ctx.arrayInitializer().expression()) {
						value[index++] = (int)getMutable(children).value;
					}
				}

				Mutable mutable = new Mutable<>(value);
				defineVar(grandParentCtx.type(), ctx.ID().getSymbol(), mutable);
			} else if(type == Symbol.Type.tDOUBLE) {
				double[] value = new double[length];

				// 加载初始值
				int index = 0;
				for(CMMParser.ExpressionContext children : ctx.arrayInitializer().expression()) {
					value[index++] = (double)getMutable(children).value;
				}

				Mutable mutable = new Mutable<>(value);
				defineVar(grandParentCtx.type(), ctx.ID().getSymbol(), mutable);
			} else if(type == Symbol.Type.tSTRING) {
				String[] value = new String[length];

				// 加载初始值
				int index = 0;
				for(CMMParser.ExpressionContext children : ctx.arrayInitializer().expression()) {
					value[index++] = (String)getMutable(children).value;
				}

				Mutable mutable = new Mutable<>(value);
				defineVar(grandParentCtx.type(), ctx.ID().getSymbol(), mutable);
			}
		}

		return null;
	}

	/** expression -> ID '[' expression ']' */
	@Override
	public Object visitExpression_Array(CMMParser.Expression_ArrayContext ctx) {
		super.visitExpression_Array(ctx);

		// 得到变量
		String name = ctx.ID().getSymbol().getText();
		Symbol var = currentScope.resolve(name);

		// 在当前作用域中是否有此ID
		if(var instanceof VariableSymbol) {
			Symbol variableSymbol = currentScope.resolve(name);
			int value = ((int[])variableSymbol.getValue().value)[(int)getMutable(ctx.expression()).value];
			setMutable(ctx, new Mutable<>(value));
		}

		return null;
	}

	/** expression -> expression '?' expression ':' expression */
	@Override
	public Object visitExpression_ConditionalOperator(CMMParser.Expression_ConditionalOperatorContext ctx) {
		visit(ctx.expression(0));

		// 根据条件选择分支
		if(getMutable(ctx.expression(0)).value.toString().equals("true")) {
			visit(ctx.expression(1));
		} else {
			visit(ctx.expression(2));
		}

		return null;
	}

	/** expression -> expression '+=' expression */
	@Override
	public Object visitExpression_AssignAdd(CMMParser.Expression_AssignAddContext ctx) {
		visit(ctx.expression(0));
		visit(ctx.expression(1));

		// 变量赋值
		String name = ctx.expression(0).getText();
		Symbol var = currentScope.resolve(name);

		// 更新变量值
		Mutable mutable = mutableOperator(getMutable(ctx.expression(0)), getMutable(ctx.expression(1)), "+");

		var.setValue(mutable);
		setMutable(ctx, mutable);

		return null;
	}

	/** expression -> expression '-=' expression */
	@Override
	public Object visitExpression_AssignMin(CMMParser.Expression_AssignMinContext ctx) {
		visit(ctx.expression(0));
		visit(ctx.expression(1));

		// 变量赋值
		String name = ctx.expression(0).getText();
		Symbol var = currentScope.resolve(name);

		// 更新变量值
		Mutable mutable = mutableOperator(getMutable(ctx.expression(0)), getMutable(ctx.expression(1)), "-");

		var.setValue(mutable);
		setMutable(ctx, mutable);

		return null;
	}

	/** expression -> expression '*=' expression */
	@Override
	public Object visitExpression_AssignMul(CMMParser.Expression_AssignMulContext ctx) {
		visit(ctx.expression(0));
		visit(ctx.expression(1));

		// 变量赋值
		String name = ctx.expression(0).getText();
		Symbol var = currentScope.resolve(name);

		// 更新变量值
		Mutable mutable = mutableOperator(getMutable(ctx.expression(0)), getMutable(ctx.expression(1)), "*");

		var.setValue(mutable);
		setMutable(ctx, mutable);

		return null;
	}

	/** expression -> expression '/=' expression */
	@Override
	public Object visitExpression_AssignDiv(CMMParser.Expression_AssignDivContext ctx) {
		visit(ctx.expression(0));
		visit(ctx.expression(1));

		// 变量赋值
		String name = ctx.expression(0).getText();
		Symbol var = currentScope.resolve(name);

		// 更新变量值
		Mutable mutable = mutableOperator(getMutable(ctx.expression(0)), getMutable(ctx.expression(1)), "/");

		var.setValue(mutable);
		setMutable(ctx, mutable);

		return null;
	}

	/**
	 * 泛型变量运算
	 *
	 * @param mutable1 变量1
	 * @param mutable2 变量2
	 * @param operator 操作符号
	 * @return 结果变量
	 */
	private Mutable mutableOperator(Mutable mutable1, Mutable mutable2, String operator) {
		// 指针操作
		if(mutable1.value instanceof Symbol || mutable2.value instanceof Symbol) {
			// 字符串拼合
			if(mutable1.value instanceof String || mutable2.value instanceof String) {
				String value1;
				String value2;

				if(mutable1.value instanceof Symbol) {
					value1 = ((Symbol)mutable1.value).value.value.toString();
					value2 = mutable2.value.toString();
				} else {
					value1 = mutable1.value.toString();
					value2 = ((Symbol)mutable2.value).value.value.toString();
				}

				if(operator.equals("+")) {
					return new Mutable<>(value1 + value2);
				}
			}
			// 指针四则运算
			else {
				double value1;
				double value2;
				if(mutable1.value instanceof Symbol && mutable2.value instanceof Symbol) {
					value1 = Double.parseDouble(((Symbol)mutable1.value).value.value.toString());
					value2 = Double.parseDouble(((Symbol)mutable2.value).value.value.toString());
				} else if(mutable1.value instanceof Symbol) {
					value1 = Double.parseDouble(((Symbol)mutable1.value).value.value.toString());
					value2 = Double.parseDouble(mutable2.value.toString());
				} else {
					value1 = Double.parseDouble(mutable1.value.toString());
					value2 = Double.parseDouble(((Symbol)mutable2.value).value.value.toString());
				}

				switch(operator) {
					case "+":
						return new Mutable<>(value1 + value2);
					case "-":
						return new Mutable<>(value1 - value2);
					case "*":
						return new Mutable<>(value1 * value2);
					case "/":
						return new Mutable<>(value1 / value2);
				}
			}
		}

		// 字符串拼合
		if(mutable1.value instanceof String || mutable2.value instanceof String) {
			if(operator.equals("+")) {
				return new Mutable<>(mutable1.value.toString() + mutable2.value.toString());
			}
		}

		// 其中有一数为double
		if(mutable1.value instanceof Double || mutable2.value instanceof Double) {
			double value1 = Double.parseDouble(mutable1.value.toString());
			double value2 = Double.parseDouble(mutable2.value.toString());
			switch(operator) {
				case "+":
					return new Mutable<>(value1 + value2);
				case "-":
					return new Mutable<>(value1 - value2);
				case "*":
					return new Mutable<>(value1 * value2);
				case "/":
					return new Mutable<>(value1 / value2);
			}
		}

		// 其中有一数为Float
		if(mutable1.value instanceof Float || mutable2.value instanceof Float) {
			float value1 = Float.parseFloat(mutable1.value.toString());
			float value2 = Float.parseFloat(mutable2.value.toString());
			switch(operator) {
				case "+":
					return new Mutable<>(value1 + value2);
				case "-":
					return new Mutable<>(value1 - value2);
				case "*":
					return new Mutable<>(value1 * value2);
				case "/":
					return new Mutable<>(value1 / value2);
			}
		}

		// 两数都是int
		if(mutable1.value instanceof Integer && mutable2.value instanceof Integer) {
			int value1 = Integer.parseInt(mutable1.value.toString());
			int value2 = Integer.parseInt(mutable2.value.toString());
			switch(operator) {
				case "+":
					return new Mutable<>(value1 + value2);
				case "-":
					return new Mutable<>(value1 - value2);
				case "*":
					return new Mutable<>(value1 * value2);
				case "/":
					return new Mutable<>(value1 / value2);
				case "%":
					return new Mutable<>(value1 % value2);
			}
		}

		return null;
	}

	/** expression -> '(' type ')' expression */
	@Override
	public Object visitExpression_TypeChange(CMMParser.Expression_TypeChangeContext ctx) {
		super.visitExpression_TypeChange(ctx);

		// 获取变量的值
		Symbol.Type type = Types.getType(ctx.type().start.getType());

		// 根据变量类型进行不同的处理
		if(type == Symbol.Type.tINT) {
			int value = (int)Double.parseDouble(getMutable(ctx.expression()).value.toString());
			Mutable mutable = new Mutable<>(value);
			setMutable(ctx, mutable);
		} else if(type == Symbol.Type.tDOUBLE) {
			double value = Double.parseDouble(getMutable(ctx.expression()).value.toString());
			Mutable mutable = new Mutable<>(value);
			setMutable(ctx, mutable);
		} else if(type == Symbol.Type.tSTRING) {
			String value = getMutable(ctx.expression()).value.toString();
			Mutable mutable = new Mutable<>(value);
			setMutable(ctx, mutable);
		}

		return null;
	}

	/** expression -> address expression */
	@Override
	public Object visitExpression_Address(CMMParser.Expression_AddressContext ctx) {
		super.visitExpression_Address(ctx);

		String name = ctx.expression().getText();
		Symbol var = currentScope.resolve(name);

		setMutable(ctx, new Mutable<>(var));

		return null;
	}

	/** expression -> pointer expression */
	@Override
	public Object visitExpression_Pointer(CMMParser.Expression_PointerContext ctx) {
		super.visitExpression_Pointer(ctx);

		setMutable(ctx, getMutable(ctx.expression()));

		return null;
	}
}
