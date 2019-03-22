// Generated from D:/OneDrive/CODE/_GIT/antlr/src/main/java/antlr4\course_work.g4 by ANTLR 4.7.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link course_workParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface course_workVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link course_workParser#programm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramm(course_workParser.ProgrammContext ctx);
	/**
	 * Visit a parse tree produced by {@link course_workParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(course_workParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link course_workParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(course_workParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link course_workParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(course_workParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link course_workParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(course_workParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link course_workParser#switch_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_stat(course_workParser.Switch_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link course_workParser#repeat_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_stat(course_workParser.Repeat_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link course_workParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(course_workParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link course_workParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(course_workParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link course_workParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExpr(course_workParser.MultiplicationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link course_workParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(course_workParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link course_workParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(course_workParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link course_workParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(course_workParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link course_workParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(course_workParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExprLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExprLogic(course_workParser.ParExprLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExprLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExprLogic(course_workParser.OrExprLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdLogic(course_workParser.IdLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExprLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExprLogic(course_workParser.EqualityExprLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExprLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExprLogic(course_workParser.AndExprLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExprLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExprLogic(course_workParser.RelationalExprLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExprLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExprLogic(course_workParser.AtomExprLogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link course_workParser#logic_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_atom(course_workParser.Logic_atomContext ctx);
}