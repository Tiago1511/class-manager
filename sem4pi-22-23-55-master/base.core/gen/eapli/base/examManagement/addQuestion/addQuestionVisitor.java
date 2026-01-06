// Generated from C:/Users/phenr/github-classroom/Departamento-de-Engenharia-Informatica/sem4pi-22-23-55/base.core/src/main/java/eapli/base/examManagement/addQuestion\addQuestion.g4 by ANTLR 4.12.0
package eapli.base.examManagement.addQuestion;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link addQuestionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface addQuestionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link addQuestionParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(addQuestionParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link addQuestionParser#addQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddQuestion(addQuestionParser.AddQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link addQuestionParser#questionContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionContent(addQuestionParser.QuestionContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link addQuestionParser#correspondencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorrespondencia(addQuestionParser.CorrespondenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link addQuestionParser#correspondenciaOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorrespondenciaOptions(addQuestionParser.CorrespondenciaOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link addQuestionParser#correspondenciaOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorrespondenciaOption(addQuestionParser.CorrespondenciaOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link addQuestionParser#respostaCurta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRespostaCurta(addQuestionParser.RespostaCurtaContext ctx);
	/**
	 * Visit a parse tree produced by {@link addQuestionParser#verdadeiroOuFalso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerdadeiroOuFalso(addQuestionParser.VerdadeiroOuFalsoContext ctx);
	/**
	 * Visit a parse tree produced by {@link addQuestionParser#escolhaMultipla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscolhaMultipla(addQuestionParser.EscolhaMultiplaContext ctx);
	/**
	 * Visit a parse tree produced by {@link addQuestionParser#optionsMultplas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionsMultplas(addQuestionParser.OptionsMultplasContext ctx);
	/**
	 * Visit a parse tree produced by {@link addQuestionParser#optionsMultpla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionsMultpla(addQuestionParser.OptionsMultplaContext ctx);
	/**
	 * Visit a parse tree produced by {@link addQuestionParser#palavrasEmFalta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalavrasEmFalta(addQuestionParser.PalavrasEmFaltaContext ctx);
	/**
	 * Visit a parse tree produced by {@link addQuestionParser#palavrasEmFaltaOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalavrasEmFaltaOptions(addQuestionParser.PalavrasEmFaltaOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link addQuestionParser#palavrasEmFaltaOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPalavrasEmFaltaOption(addQuestionParser.PalavrasEmFaltaOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link addQuestionParser#numerica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumerica(addQuestionParser.NumericaContext ctx);
	/**
	 * Visit a parse tree produced by {@link addQuestionParser#solution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSolution(addQuestionParser.SolutionContext ctx);
	/**
	 * Visit a parse tree produced by {@link addQuestionParser#solutionVerdadeiroFalso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSolutionVerdadeiroFalso(addQuestionParser.SolutionVerdadeiroFalsoContext ctx);
	/**
	 * Visit a parse tree produced by {@link addQuestionParser#solotionMultipla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSolotionMultipla(addQuestionParser.SolotionMultiplaContext ctx);
}