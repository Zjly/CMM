// Generated from E:/Coding/GitHub/CMM/Interpreter/src/CMM\CMM.g4 by ANTLR 4.7.2
package CMM;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CMMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CMMVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CMMParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(CMMParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#includeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeDeclaration(CMMParser.IncludeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompilationUnit_FunctionDeclaration}
	 * labeled alternative in {@link CMMParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit_FunctionDeclaration(CMMParser.CompilationUnit_FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompilationUnit_Function}
	 * labeled alternative in {@link CMMParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit_Function(CMMParser.CompilationUnit_FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompilationUnit_variableDeclarationStatement}
	 * labeled alternative in {@link CMMParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit_variableDeclarationStatement(CMMParser.CompilationUnit_variableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(CMMParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CMMParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(CMMParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CMMParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStatement_VariableDeclaration}
	 * labeled alternative in {@link CMMParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement_VariableDeclaration(CMMParser.BlockStatement_VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStatement_Function}
	 * labeled alternative in {@link CMMParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement_Function(CMMParser.BlockStatement_FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStatement_Statement}
	 * labeled alternative in {@link CMMParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement_Statement(CMMParser.BlockStatement_StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#variableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationStatement(CMMParser.VariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(CMMParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarator_Variable}
	 * labeled alternative in {@link CMMParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator_Variable(CMMParser.VariableDeclarator_VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarator_Array}
	 * labeled alternative in {@link CMMParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator_Array(CMMParser.VariableDeclarator_ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statement_Block}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_Block(CMMParser.Statement_BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statement_If}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_If(CMMParser.Statement_IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statement_For}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_For(CMMParser.Statement_ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statement_While}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_While(CMMParser.Statement_WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statement_Return}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_Return(CMMParser.Statement_ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statement_Break}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_Break(CMMParser.Statement_BreakContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statement_Continue}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_Continue(CMMParser.Statement_ContinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statement_Semicolon}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_Semicolon(CMMParser.Statement_SemicolonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Statement_Expression}
	 * labeled alternative in {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_Expression(CMMParser.Statement_ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(CMMParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(CMMParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(CMMParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Pointer}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Pointer(CMMParser.Expression_PointerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_AssignMin}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_AssignMin(CMMParser.Expression_AssignMinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Or}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Or(CMMParser.Expression_OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_And}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_And(CMMParser.Expression_AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Shift}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Shift(CMMParser.Expression_ShiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Xor}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Xor(CMMParser.Expression_XorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_AssignDiv}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_AssignDiv(CMMParser.Expression_AssignDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Mul_Div}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Mul_Div(CMMParser.Expression_Mul_DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Brackets}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Brackets(CMMParser.Expression_BracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Plus_Minus}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Plus_Minus(CMMParser.Expression_Plus_MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Array}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Array(CMMParser.Expression_ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_AssignMul}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_AssignMul(CMMParser.Expression_AssignMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_AssignOr}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_AssignOr(CMMParser.Expression_AssignOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Equal}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Equal(CMMParser.Expression_EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Call}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Call(CMMParser.Expression_CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Literal}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Literal(CMMParser.Expression_LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Not}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Not(CMMParser.Expression_NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_LogicAnd}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_LogicAnd(CMMParser.Expression_LogicAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Greater_Less}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Greater_Less(CMMParser.Expression_Greater_LessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_TypeChange}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_TypeChange(CMMParser.Expression_TypeChangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_LogicOr}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_LogicOr(CMMParser.Expression_LogicOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_PlusPlus_MinerMiner}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_PlusPlus_MinerMiner(CMMParser.Expression_PlusPlus_MinerMinerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_ID}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_ID(CMMParser.Expression_IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Add_Min}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Add_Min(CMMParser.Expression_Add_MinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_DotID}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_DotID(CMMParser.Expression_DotIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_AssignAdd}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_AssignAdd(CMMParser.Expression_AssignAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_Assignment}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_Assignment(CMMParser.Expression_AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_ConditionalOperator}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_ConditionalOperator(CMMParser.Expression_ConditionalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression_AssignAnd}
	 * labeled alternative in {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_AssignAnd(CMMParser.Expression_AssignAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number_Int}
	 * labeled alternative in {@link CMMParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_Int(CMMParser.Number_IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number_Float}
	 * labeled alternative in {@link CMMParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_Float(CMMParser.Number_FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Literal_Character}
	 * labeled alternative in {@link CMMParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_Character(CMMParser.Literal_CharacterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Literal_String}
	 * labeled alternative in {@link CMMParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_String(CMMParser.Literal_StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Literal_Boolean}
	 * labeled alternative in {@link CMMParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_Boolean(CMMParser.Literal_BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Literal_Null}
	 * labeled alternative in {@link CMMParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_Null(CMMParser.Literal_NullContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CMMParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMMParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(CMMParser.PrimitiveTypeContext ctx);
}