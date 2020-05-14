// Generated from .\cdd.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cddParser}.
 */
public interface cddListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cddParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(cddParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link cddParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(cddParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link cddParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(cddParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link cddParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(cddParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link cddParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(cddParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link cddParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(cddParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link cddParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(cddParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link cddParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(cddParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link cddParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(cddParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link cddParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(cddParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link cddParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(cddParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link cddParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(cddParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link cddParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(cddParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link cddParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(cddParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link cddParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(cddParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link cddParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(cddParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Call}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCall(cddParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCall(cddParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(cddParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(cddParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(cddParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(cddParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(cddParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(cddParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Index}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIndex(cddParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIndex(cddParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(cddParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(cddParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(cddParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(cddParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Float}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloat(cddParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloat(cddParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(cddParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(cddParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Relation}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelation(cddParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Relation}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelation(cddParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult(cddParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult(cddParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqual(cddParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqual(cddParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Char}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterChar(cddParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Char}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitChar(cddParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegate(cddParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegate(cddParser.NegateContext ctx);
	/**
	 * Enter a parse tree produced by {@link cddParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(cddParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link cddParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(cddParser.ExprListContext ctx);
}