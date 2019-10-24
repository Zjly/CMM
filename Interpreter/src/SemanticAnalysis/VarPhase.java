package SemanticAnalysis;

import CMM.CMMBaseListener;
import CMM.CMMParser;
import SemanticAnalysis.Scope.GlobalScope;
import SemanticAnalysis.Scope.Scope;
import SemanticAnalysis.VariableTable.Mutable;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/** 处理变量遍历语法树 */
public class VarPhase extends CMMBaseListener {
	private ParseTreeProperty<Scope> scopes;
	private GlobalScope globals;
	private Scope currentScope;    // 解析在此范围内开始的符号
	ParseTreeProperty<Mutable> values = new ParseTreeProperty<Mutable>();

	/** 构造函数，设置前一次遍历的结果 */
	public VarPhase(GlobalScope globals, ParseTreeProperty<Scope> scopes) {
		this.scopes = scopes;
		this.globals = globals;
	}

	/** 设置value */
	private void setValue(ParseTree node, Mutable value) {
		values.put(node, value);
	}

	/** 得到value */
	private Mutable getValue(ParseTree node) {
		return values.get(node);
	}

	/** expression -> ID '(' expressionList? ')' */
	@Override
	public void exitExpression_Call(CMMParser.Expression_CallContext ctx) {

	}

	/** variableDeclarator -> ID ('=' expression)? */
	@Override
	public void exitVariableDeclarator_Variable(CMMParser.VariableDeclarator_VariableContext ctx) {

	}

	/** expression -> expression op=('+'|'-') expression */
	@Override
	public void exitExpression_Add_Min(CMMParser.Expression_Add_MinContext ctx) {
		Mutable left = getValue(ctx.expression(0));
		Mutable right = getValue(ctx.expression(1));
		Mutable<Integer> result = null;

		// 两数都是int
		if(left.value instanceof Integer && right.value instanceof Integer) {
			if(ctx.op.getText().equals("+")) {
				setValue(ctx, new Mutable<>((int)left.value + (int)right.value));
			} else if(ctx.op.getText().equals("-")) {
				setValue(ctx, new Mutable<>((int)left.value - (int)right.value));
			}
		}
	}

	/** expression -> literal */
	@Override
	public void exitExpression_Literal(CMMParser.Expression_LiteralContext ctx) {
		setValue(ctx, getValue(ctx.literal()));
	}

	/** literal -> INT_NUMBER */
	@Override
	public void exitNumber_Int(CMMParser.Number_IntContext ctx) {
		String intText = ctx.INT_NUMBER().getText();
		int intValue = Integer.parseInt(intText);
		Mutable<Integer> integerMutable = new Mutable<>(intValue);
		setValue(ctx, integerMutable);
	}
}
