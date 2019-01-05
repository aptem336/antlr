// Generated from C:/Users/Artem/OneDrive/CODE/_GIT/antlr/src/main/java/antlr4\course_work.g4 by ANTLR 4.7.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link course_workParser}.
 */
public interface course_workListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link course_workParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(course_workParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link course_workParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(course_workParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link course_workParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(course_workParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link course_workParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(course_workParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link course_workParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(course_workParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link course_workParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(course_workParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link course_workParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(course_workParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link course_workParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(course_workParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link course_workParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(course_workParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link course_workParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(course_workParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link course_workParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(course_workParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link course_workParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(course_workParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link course_workParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(course_workParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link course_workParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(course_workParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link course_workParser#switch_stat}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_stat(course_workParser.Switch_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link course_workParser#switch_stat}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_stat(course_workParser.Switch_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link course_workParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(course_workParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link course_workParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(course_workParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link course_workParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(course_workParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link course_workParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(course_workParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link course_workParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(course_workParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link course_workParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(course_workParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link course_workParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(course_workParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link course_workParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(course_workParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link course_workParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExpr(course_workParser.MultiplicationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExpr}
	 * labeled alternative in {@link course_workParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExpr(course_workParser.MultiplicationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link course_workParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(course_workParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link course_workParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(course_workParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link course_workParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(course_workParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link course_workParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(course_workParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link course_workParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(course_workParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link course_workParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(course_workParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link course_workParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(course_workParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link course_workParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(course_workParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExprLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterParExprLogic(course_workParser.ParExprLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExprLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitParExprLogic(course_workParser.ParExprLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExprLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExprLogic(course_workParser.OrExprLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExprLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExprLogic(course_workParser.OrExprLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterIdLogic(course_workParser.IdLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitIdLogic(course_workParser.IdLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExprLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExprLogic(course_workParser.EqualityExprLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExprLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExprLogic(course_workParser.EqualityExprLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExprLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExprLogic(course_workParser.AndExprLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExprLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExprLogic(course_workParser.AndExprLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExprLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExprLogic(course_workParser.NotExprLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExprLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExprLogic(course_workParser.NotExprLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExprLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExprLogic(course_workParser.RelationalExprLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExprLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExprLogic(course_workParser.RelationalExprLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExprLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExprLogic(course_workParser.AtomExprLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExprLogic}
	 * labeled alternative in {@link course_workParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExprLogic(course_workParser.AtomExprLogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link course_workParser#logic_atom}.
	 * @param ctx the parse tree
	 */
	void enterLogic_atom(course_workParser.Logic_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link course_workParser#logic_atom}.
	 * @param ctx the parse tree
	 */
	void exitLogic_atom(course_workParser.Logic_atomContext ctx);
}