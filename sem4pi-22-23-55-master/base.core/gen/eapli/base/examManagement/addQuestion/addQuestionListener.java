// Generated from C:/Users/phenr/github-classroom/Departamento-de-Engenharia-Informatica/sem4pi-22-23-55/base.core/src/main/java/eapli/base/examManagement/addQuestion\addQuestion.g4 by ANTLR 4.12.0
package eapli.base.examManagement.addQuestion;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link addQuestionParser}.
 */
public interface addQuestionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link addQuestionParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(addQuestionParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link addQuestionParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(addQuestionParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link addQuestionParser#addQuestion}.
	 * @param ctx the parse tree
	 */
	void enterAddQuestion(addQuestionParser.AddQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link addQuestionParser#addQuestion}.
	 * @param ctx the parse tree
	 */
	void exitAddQuestion(addQuestionParser.AddQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link addQuestionParser#questionContent}.
	 * @param ctx the parse tree
	 */
	void enterQuestionContent(addQuestionParser.QuestionContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link addQuestionParser#questionContent}.
	 * @param ctx the parse tree
	 */
	void exitQuestionContent(addQuestionParser.QuestionContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link addQuestionParser#correspondencia}.
	 * @param ctx the parse tree
	 */
	void enterCorrespondencia(addQuestionParser.CorrespondenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link addQuestionParser#correspondencia}.
	 * @param ctx the parse tree
	 */
	void exitCorrespondencia(addQuestionParser.CorrespondenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link addQuestionParser#correspondenciaOptions}.
	 * @param ctx the parse tree
	 */
	void enterCorrespondenciaOptions(addQuestionParser.CorrespondenciaOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link addQuestionParser#correspondenciaOptions}.
	 * @param ctx the parse tree
	 */
	void exitCorrespondenciaOptions(addQuestionParser.CorrespondenciaOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link addQuestionParser#correspondenciaOption}.
	 * @param ctx the parse tree
	 */
	void enterCorrespondenciaOption(addQuestionParser.CorrespondenciaOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link addQuestionParser#correspondenciaOption}.
	 * @param ctx the parse tree
	 */
	void exitCorrespondenciaOption(addQuestionParser.CorrespondenciaOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link addQuestionParser#respostaCurta}.
	 * @param ctx the parse tree
	 */
	void enterRespostaCurta(addQuestionParser.RespostaCurtaContext ctx);
	/**
	 * Exit a parse tree produced by {@link addQuestionParser#respostaCurta}.
	 * @param ctx the parse tree
	 */
	void exitRespostaCurta(addQuestionParser.RespostaCurtaContext ctx);
	/**
	 * Enter a parse tree produced by {@link addQuestionParser#verdadeiroOuFalso}.
	 * @param ctx the parse tree
	 */
	void enterVerdadeiroOuFalso(addQuestionParser.VerdadeiroOuFalsoContext ctx);
	/**
	 * Exit a parse tree produced by {@link addQuestionParser#verdadeiroOuFalso}.
	 * @param ctx the parse tree
	 */
	void exitVerdadeiroOuFalso(addQuestionParser.VerdadeiroOuFalsoContext ctx);
	/**
	 * Enter a parse tree produced by {@link addQuestionParser#escolhaMultipla}.
	 * @param ctx the parse tree
	 */
	void enterEscolhaMultipla(addQuestionParser.EscolhaMultiplaContext ctx);
	/**
	 * Exit a parse tree produced by {@link addQuestionParser#escolhaMultipla}.
	 * @param ctx the parse tree
	 */
	void exitEscolhaMultipla(addQuestionParser.EscolhaMultiplaContext ctx);
	/**
	 * Enter a parse tree produced by {@link addQuestionParser#optionsMultplas}.
	 * @param ctx the parse tree
	 */
	void enterOptionsMultplas(addQuestionParser.OptionsMultplasContext ctx);
	/**
	 * Exit a parse tree produced by {@link addQuestionParser#optionsMultplas}.
	 * @param ctx the parse tree
	 */
	void exitOptionsMultplas(addQuestionParser.OptionsMultplasContext ctx);
	/**
	 * Enter a parse tree produced by {@link addQuestionParser#optionsMultpla}.
	 * @param ctx the parse tree
	 */
	void enterOptionsMultpla(addQuestionParser.OptionsMultplaContext ctx);
	/**
	 * Exit a parse tree produced by {@link addQuestionParser#optionsMultpla}.
	 * @param ctx the parse tree
	 */
	void exitOptionsMultpla(addQuestionParser.OptionsMultplaContext ctx);
	/**
	 * Enter a parse tree produced by {@link addQuestionParser#palavrasEmFalta}.
	 * @param ctx the parse tree
	 */
	void enterPalavrasEmFalta(addQuestionParser.PalavrasEmFaltaContext ctx);
	/**
	 * Exit a parse tree produced by {@link addQuestionParser#palavrasEmFalta}.
	 * @param ctx the parse tree
	 */
	void exitPalavrasEmFalta(addQuestionParser.PalavrasEmFaltaContext ctx);
	/**
	 * Enter a parse tree produced by {@link addQuestionParser#palavrasEmFaltaOptions}.
	 * @param ctx the parse tree
	 */
	void enterPalavrasEmFaltaOptions(addQuestionParser.PalavrasEmFaltaOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link addQuestionParser#palavrasEmFaltaOptions}.
	 * @param ctx the parse tree
	 */
	void exitPalavrasEmFaltaOptions(addQuestionParser.PalavrasEmFaltaOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link addQuestionParser#palavrasEmFaltaOption}.
	 * @param ctx the parse tree
	 */
	void enterPalavrasEmFaltaOption(addQuestionParser.PalavrasEmFaltaOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link addQuestionParser#palavrasEmFaltaOption}.
	 * @param ctx the parse tree
	 */
	void exitPalavrasEmFaltaOption(addQuestionParser.PalavrasEmFaltaOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link addQuestionParser#numerica}.
	 * @param ctx the parse tree
	 */
	void enterNumerica(addQuestionParser.NumericaContext ctx);
	/**
	 * Exit a parse tree produced by {@link addQuestionParser#numerica}.
	 * @param ctx the parse tree
	 */
	void exitNumerica(addQuestionParser.NumericaContext ctx);
	/**
	 * Enter a parse tree produced by {@link addQuestionParser#solution}.
	 * @param ctx the parse tree
	 */
	void enterSolution(addQuestionParser.SolutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link addQuestionParser#solution}.
	 * @param ctx the parse tree
	 */
	void exitSolution(addQuestionParser.SolutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link addQuestionParser#solutionVerdadeiroFalso}.
	 * @param ctx the parse tree
	 */
	void enterSolutionVerdadeiroFalso(addQuestionParser.SolutionVerdadeiroFalsoContext ctx);
	/**
	 * Exit a parse tree produced by {@link addQuestionParser#solutionVerdadeiroFalso}.
	 * @param ctx the parse tree
	 */
	void exitSolutionVerdadeiroFalso(addQuestionParser.SolutionVerdadeiroFalsoContext ctx);
	/**
	 * Enter a parse tree produced by {@link addQuestionParser#solotionMultipla}.
	 * @param ctx the parse tree
	 */
	void enterSolotionMultipla(addQuestionParser.SolotionMultiplaContext ctx);
	/**
	 * Exit a parse tree produced by {@link addQuestionParser#solotionMultipla}.
	 * @param ctx the parse tree
	 */
	void exitSolotionMultipla(addQuestionParser.SolotionMultiplaContext ctx);
}