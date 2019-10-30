// Generated from E:/Coding/GitHub/CMM/Interpreter/src/CMM\CMM.g4 by ANTLR 4.7.2
package CMM;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CMMParser}.
 */
public interface CMMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CMMParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CMMParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CMMParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#includeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterIncludeDeclaration(CMMParser.IncludeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#includeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitIncludeDeclaration(CMMParser.IncludeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompilationUnit_FunctionDeclaration}
	 * labeled alternative in {@link CMMParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit_FunctionDeclaration(CMMParser.CompilationUnit_FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompilationUnit_FunctionDeclaration}
	 * labeled alternative in {@link CMMParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit_FunctionDeclaration(CMMParser.CompilationUnit_FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompilationUnit_Function}
	 * labeled alternative in {@link CMMParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit_Function(CMMParser.CompilationUnit_FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompilationUnit_Function}
	 * labeled alternative in {@link CMMParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit_Function(CMMParser.CompilationUnit_FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompilationUnit_variableDeclarationStatement}
	 * labeled alternative in {@link CMMParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit_variableDeclarationStatement(CMMParser.CompilationUnit_variableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompilationUnit_variableDeclarationStatement}
	 * labeled alternative in {@link CMMParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit_variableDeclarationStatement(CMMParser.CompilationUnit_variableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(CMMParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(CMMParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CMMParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CMMParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(CMMParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(CMMParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CMMParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CMMParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStatement_VariableDeclaration}
	 * labeled alternative in {@link CMMParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement_VariableDeclaration(CMMParser.BlockStatement_VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStatement_VariableDeclaration}
	 * labeled alternative in {@link CMMParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement_VariableDeclaration(CMMParser.BlockStatement_VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStatement_Function}
	 * labeled alternative in {@link CMMParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement_Function(CMMParser.BlockStatement_FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStatement_Function}
	 * labeled alternative in {@link CMMParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement_Function(CMMParser.BlockStatement_FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStatement_Statement}
	 * labeled alternative in {@link CMMParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement_Statement(CMMParser.BlockStatement_StatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStatement_Statement}
	 * labeled alternative in {@link CMMParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement_Statement(CMMParser.BlockStatement_StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationStatement(CMMParser.VariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationStatement(CMMParser.VariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(CMMParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(CMMParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarator_Variable}
	 * labeled alternative in {@link CMMParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator_Variable(CMMParser.VariableDeclarator_VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarator_Variable}
	 * labeled alternative in {@link CMMParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator_Variable(CMMParser.VariableDeclarator_VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarator_Array}
	 * labeled alternative in {@link CMMParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator_Array(CMMParser.VariableDeclarator_ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarator_Array}
	 * labeled alternative in {@link CMMParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator_Array(CMMParser.VariableDeclarator_ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement_Block}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_Block(CMMParser.Statement_BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement_Block}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_Block(CMMParser.Statement_BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement_If}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_If(CMMParser.Statement_IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement_If}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_If(CMMParser.Statement_IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement_For}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_For(CMMParser.Statement_ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement_For}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_For(CMMParser.Statement_ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement_While}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_While(CMMParser.Statement_WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement_While}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_While(CMMParser.Statement_WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement_Return}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_Return(CMMParser.Statement_ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement_Return}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_Return(CMMParser.Statement_ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement_Break}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_Break(CMMParser.Statement_BreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement_Break}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_Break(CMMParser.Statement_BreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement_Continue}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_Continue(CMMParser.Statement_ContinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement_Continue}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_Continue(CMMParser.Statement_ContinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement_Semicolon}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_Semicolon(CMMParser.Statement_SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement_Semicolon}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_Semicolon(CMMParser.Statement_SemicolonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Statement_Expression}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement_Expression(CMMParser.Statement_ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Statement_Expression}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement_Expression(CMMParser.Statement_ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CMMParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CMMParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(CMMParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(CMMParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CMMParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CMMParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Pointer}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Pointer(CMMParser.Expression_PointerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Pointer}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Pointer(CMMParser.Expression_PointerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_AssignMin}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_AssignMin(CMMParser.Expression_AssignMinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_AssignMin}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_AssignMin(CMMParser.Expression_AssignMinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Or}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Or(CMMParser.Expression_OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Or}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Or(CMMParser.Expression_OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_And}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_And(CMMParser.Expression_AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_And}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_And(CMMParser.Expression_AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Shift}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Shift(CMMParser.Expression_ShiftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Shift}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Shift(CMMParser.Expression_ShiftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Xor}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Xor(CMMParser.Expression_XorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Xor}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Xor(CMMParser.Expression_XorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_AssignDiv}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_AssignDiv(CMMParser.Expression_AssignDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_AssignDiv}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_AssignDiv(CMMParser.Expression_AssignDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Mul_Div}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Mul_Div(CMMParser.Expression_Mul_DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Mul_Div}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Mul_Div(CMMParser.Expression_Mul_DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Brackets}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Brackets(CMMParser.Expression_BracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Brackets}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Brackets(CMMParser.Expression_BracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Plus_Minus}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Plus_Minus(CMMParser.Expression_Plus_MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Plus_Minus}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Plus_Minus(CMMParser.Expression_Plus_MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Array}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Array(CMMParser.Expression_ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Array}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Array(CMMParser.Expression_ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_AssignMul}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_AssignMul(CMMParser.Expression_AssignMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_AssignMul}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_AssignMul(CMMParser.Expression_AssignMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_AssignOr}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_AssignOr(CMMParser.Expression_AssignOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_AssignOr}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_AssignOr(CMMParser.Expression_AssignOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Equal}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Equal(CMMParser.Expression_EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Equal}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Equal(CMMParser.Expression_EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Call}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Call(CMMParser.Expression_CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Call}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Call(CMMParser.Expression_CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Literal}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Literal(CMMParser.Expression_LiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Literal}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Literal(CMMParser.Expression_LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Not}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Not(CMMParser.Expression_NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Not}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Not(CMMParser.Expression_NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_LogicAnd}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_LogicAnd(CMMParser.Expression_LogicAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_LogicAnd}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_LogicAnd(CMMParser.Expression_LogicAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Greater_Less}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Greater_Less(CMMParser.Expression_Greater_LessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Greater_Less}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Greater_Less(CMMParser.Expression_Greater_LessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_TypeChange}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_TypeChange(CMMParser.Expression_TypeChangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_TypeChange}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_TypeChange(CMMParser.Expression_TypeChangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_LogicOr}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_LogicOr(CMMParser.Expression_LogicOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_LogicOr}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_LogicOr(CMMParser.Expression_LogicOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_PlusPlus_MinerMiner}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_PlusPlus_MinerMiner(CMMParser.Expression_PlusPlus_MinerMinerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_PlusPlus_MinerMiner}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_PlusPlus_MinerMiner(CMMParser.Expression_PlusPlus_MinerMinerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_ID}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_ID(CMMParser.Expression_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_ID}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_ID(CMMParser.Expression_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Add_Min}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Add_Min(CMMParser.Expression_Add_MinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Add_Min}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Add_Min(CMMParser.Expression_Add_MinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_DotID}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_DotID(CMMParser.Expression_DotIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_DotID}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_DotID(CMMParser.Expression_DotIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_AssignAdd}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_AssignAdd(CMMParser.Expression_AssignAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_AssignAdd}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_AssignAdd(CMMParser.Expression_AssignAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_Assignment}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_Assignment(CMMParser.Expression_AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_Assignment}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_Assignment(CMMParser.Expression_AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_ConditionalOperator}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_ConditionalOperator(CMMParser.Expression_ConditionalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_ConditionalOperator}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_ConditionalOperator(CMMParser.Expression_ConditionalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression_AssignAnd}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression_AssignAnd(CMMParser.Expression_AssignAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression_AssignAnd}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression_AssignAnd(CMMParser.Expression_AssignAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number_Int}
	 * labeled alternative in {@link CMMParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNumber_Int(CMMParser.Number_IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number_Int}
	 * labeled alternative in {@link CMMParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNumber_Int(CMMParser.Number_IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number_Float}
	 * labeled alternative in {@link CMMParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNumber_Float(CMMParser.Number_FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number_Float}
	 * labeled alternative in {@link CMMParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNumber_Float(CMMParser.Number_FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Literal_Character}
	 * labeled alternative in {@link CMMParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_Character(CMMParser.Literal_CharacterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Literal_Character}
	 * labeled alternative in {@link CMMParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_Character(CMMParser.Literal_CharacterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Literal_String}
	 * labeled alternative in {@link CMMParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_String(CMMParser.Literal_StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Literal_String}
	 * labeled alternative in {@link CMMParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_String(CMMParser.Literal_StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Literal_Boolean}
	 * labeled alternative in {@link CMMParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_Boolean(CMMParser.Literal_BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Literal_Boolean}
	 * labeled alternative in {@link CMMParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_Boolean(CMMParser.Literal_BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Literal_Null}
	 * labeled alternative in {@link CMMParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_Null(CMMParser.Literal_NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Literal_Null}
	 * labeled alternative in {@link CMMParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_Null(CMMParser.Literal_NullContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CMMParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CMMParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(CMMParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(CMMParser.PrimitiveTypeContext ctx);
}