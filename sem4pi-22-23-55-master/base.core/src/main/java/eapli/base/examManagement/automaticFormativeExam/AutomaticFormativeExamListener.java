// Generated from C:/Users/phenr/github-classroom/Departamento-de-Engenharia-Informatica/sem4pi-22-23-55/base.core/src/main/java/eapli/base/examManagement/automaticFormativeExam\AutomaticFormativeExam.g4 by ANTLR 4.12.0
package eapli.base.examManagement.automaticFormativeExam;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AutomaticFormativeExamParser}.
 */
public interface AutomaticFormativeExamListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AutomaticFormativeExamParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(AutomaticFormativeExamParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomaticFormativeExamParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(AutomaticFormativeExamParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomaticFormativeExamParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(AutomaticFormativeExamParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomaticFormativeExamParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(AutomaticFormativeExamParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomaticFormativeExamParser#section_name}.
	 * @param ctx the parse tree
	 */
	void enterSection_name(AutomaticFormativeExamParser.Section_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomaticFormativeExamParser#section_name}.
	 * @param ctx the parse tree
	 */
	void exitSection_name(AutomaticFormativeExamParser.Section_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomaticFormativeExamParser#section_marks}.
	 * @param ctx the parse tree
	 */
	void enterSection_marks(AutomaticFormativeExamParser.Section_marksContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomaticFormativeExamParser#section_marks}.
	 * @param ctx the parse tree
	 */
	void exitSection_marks(AutomaticFormativeExamParser.Section_marksContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomaticFormativeExamParser#question_block}.
	 * @param ctx the parse tree
	 */
	void enterQuestion_block(AutomaticFormativeExamParser.Question_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomaticFormativeExamParser#question_block}.
	 * @param ctx the parse tree
	 */
	void exitQuestion_block(AutomaticFormativeExamParser.Question_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomaticFormativeExamParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(AutomaticFormativeExamParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomaticFormativeExamParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(AutomaticFormativeExamParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomaticFormativeExamParser#answer_block}.
	 * @param ctx the parse tree
	 */
	void enterAnswer_block(AutomaticFormativeExamParser.Answer_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomaticFormativeExamParser#answer_block}.
	 * @param ctx the parse tree
	 */
	void exitAnswer_block(AutomaticFormativeExamParser.Answer_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomaticFormativeExamParser#answer}.
	 * @param ctx the parse tree
	 */
	void enterAnswer(AutomaticFormativeExamParser.AnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomaticFormativeExamParser#answer}.
	 * @param ctx the parse tree
	 */
	void exitAnswer(AutomaticFormativeExamParser.AnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutomaticFormativeExamParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(AutomaticFormativeExamParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutomaticFormativeExamParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(AutomaticFormativeExamParser.TextContext ctx);
}