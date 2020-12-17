// Generated from D:/Project/Clion Project/Mx_star_compiler/Parser\Mx_star.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Mx_starParser}.
 */
public interface Mx_starListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Mx_starParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Mx_starParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx_starParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Mx_starParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx_starParser#varList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(Mx_starParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx_starParser#varList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(Mx_starParser.VarListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx_starParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(Mx_starParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx_starParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(Mx_starParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx_starParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(Mx_starParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx_starParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(Mx_starParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx_starParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(Mx_starParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx_starParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(Mx_starParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx_starParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Mx_starParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx_starParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Mx_starParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx_starParser#def}.
	 * @param ctx the parse tree
	 */
	void enterDef(Mx_starParser.DefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx_starParser#def}.
	 * @param ctx the parse tree
	 */
	void exitDef(Mx_starParser.DefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx_starParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(Mx_starParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx_starParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(Mx_starParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx_starParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(Mx_starParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx_starParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(Mx_starParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx_starParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(Mx_starParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx_starParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(Mx_starParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx_starParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(Mx_starParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx_starParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(Mx_starParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vardefStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVardefStmt(Mx_starParser.VardefStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vardefStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVardefStmt(Mx_starParser.VardefStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(Mx_starParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(Mx_starParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(Mx_starParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(Mx_starParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(Mx_starParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(Mx_starParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(Mx_starParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(Mx_starParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(Mx_starParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(Mx_starParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continueStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(Mx_starParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(Mx_starParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(Mx_starParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(Mx_starParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code suiteStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSuiteStmt(Mx_starParser.SuiteStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code suiteStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSuiteStmt(Mx_starParser.SuiteStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmt(Mx_starParser.EmptyStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmt(Mx_starParser.EmptyStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewExpr(Mx_starParser.NewExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewExpr(Mx_starParser.NewExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisExpr(Mx_starParser.ThisExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code thisExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisExpr(Mx_starParser.ThisExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prefixExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpr(Mx_starParser.PrefixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prefixExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpr(Mx_starParser.PrefixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(Mx_starParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(Mx_starParser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(Mx_starParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(Mx_starParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code memberExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberExpr(Mx_starParser.MemberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code memberExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberExpr(Mx_starParser.MemberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(Mx_starParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(Mx_starParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpr(Mx_starParser.PostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpr(Mx_starParser.PostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(Mx_starParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(Mx_starParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(Mx_starParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(Mx_starParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConstExpr(Mx_starParser.ConstExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConstExpr(Mx_starParser.ConstExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code errorCreator}
	 * labeled alternative in {@link Mx_starParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterErrorCreator(Mx_starParser.ErrorCreatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code errorCreator}
	 * labeled alternative in {@link Mx_starParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitErrorCreator(Mx_starParser.ErrorCreatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayCreator}
	 * labeled alternative in {@link Mx_starParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreator(Mx_starParser.ArrayCreatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayCreator}
	 * labeled alternative in {@link Mx_starParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreator(Mx_starParser.ArrayCreatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonArrayCreator}
	 * labeled alternative in {@link Mx_starParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterNonArrayCreator(Mx_starParser.NonArrayCreatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonArrayCreator}
	 * labeled alternative in {@link Mx_starParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitNonArrayCreator(Mx_starParser.NonArrayCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx_starParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(Mx_starParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx_starParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(Mx_starParser.ConstantContext ctx);
}