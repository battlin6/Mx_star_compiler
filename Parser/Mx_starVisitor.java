// Generated from D:/Project/Clion Project/Mx_star_compiler/Parser\Mx_star.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Mx_starParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Mx_starVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Mx_starParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Mx_starParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Mx_starParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(Mx_starParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link Mx_starParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(Mx_starParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Mx_starParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vardefStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardefStmt(Mx_starParser.VardefStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(Mx_starParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(Mx_starParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pureExprStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPureExprStmt(Mx_starParser.PureExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyStmt}
	 * labeled alternative in {@link Mx_starParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStmt(Mx_starParser.EmptyStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(Mx_starParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(Mx_starParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link Mx_starParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(Mx_starParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Mx_starParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(Mx_starParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link Mx_starParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(Mx_starParser.LiteralContext ctx);
}