// Generated from E:/Coding/GitHub/CMM/Interpreter/src\CMM.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by {@link CMMParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(CMMParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(CMMParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(CMMParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(CMMParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(CMMParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(CMMParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(CMMParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(CMMParser.FormalParametersContext ctx);
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
	 * Enter a parse tree produced by {@link CMMParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(CMMParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(CMMParser.BlockStatementContext ctx);
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
	 * Enter a parse tree produced by {@link CMMParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(CMMParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(CMMParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(CMMParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(CMMParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(CMMParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(CMMParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CMMParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CMMParser.StatementContext ctx);
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
	 * Enter a parse tree produced by {@link CMMParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(CMMParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(CMMParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(CMMParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(CMMParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(CMMParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(CMMParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CMMParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CMMParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CMMParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CMMParser.LiteralContext ctx);
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
}