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
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Mx_starParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Mx_starParser.BlockContext ctx);
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
	 * Enter a parse tree produced by the {@code pureExprStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPureExprStmt(Mx_starParser.PureExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pureExprStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPureExprStmt(Mx_starParser.PureExprStmtContext ctx);
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
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(Mx_starParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(Mx_starParser.AtomExprContext ctx);
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
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(Mx_starParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(Mx_starParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx_starParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(Mx_starParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx_starParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(Mx_starParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link Mx_starParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(Mx_starParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Mx_starParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(Mx_starParser.LiteralContext ctx);
}