// Generated from ./cdd.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link cddParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface cddVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link cddParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(cddParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link cddParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(cddParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link cddParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(cddParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link cddParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(cddParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link cddParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(cddParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link cddParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(cddParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link cddParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(cddParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link cddParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(cddParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(cddParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(cddParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(cddParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(cddParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(cddParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(cddParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(cddParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(cddParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate(cddParser.NegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link cddParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
//	T visitInt(cddParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by {@link cddParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(cddParser.ExprListContext ctx);
}