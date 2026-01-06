// Generated from C:/Users/phenr/github-classroom/Departamento-de-Engenharia-Informatica/sem4pi-22-23-55/base.core/src/main/java/eapli/base/examManagement/eapli/base/examManagement/exam\createExam.g4 by ANTLR 4.12.0
package eapli.base.examManagement.eapli.base.examManagement.exam;

    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link createExamParser}.
 */
public interface createExamListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link createExamParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(createExamParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link createExamParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(createExamParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link createExamParser#exam}.
	 * @param ctx the parse tree
	 */
	void enterExam(createExamParser.ExamContext ctx);
	/**
	 * Exit a parse tree produced by {@link createExamParser#exam}.
	 * @param ctx the parse tree
	 */
	void exitExam(createExamParser.ExamContext ctx);
	/**
	 * Enter a parse tree produced by {@link createExamParser#exam_name}.
	 * @param ctx the parse tree
	 */
	void enterExam_name(createExamParser.Exam_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link createExamParser#exam_name}.
	 * @param ctx the parse tree
	 */
	void exitExam_name(createExamParser.Exam_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link createExamParser#code_name}.
	 * @param ctx the parse tree
	 */
	void enterCode_name(createExamParser.Code_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link createExamParser#code_name}.
	 * @param ctx the parse tree
	 */
	void exitCode_name(createExamParser.Code_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link createExamParser#total_marks}.
	 * @param ctx the parse tree
	 */
	void enterTotal_marks(createExamParser.Total_marksContext ctx);
	/**
	 * Exit a parse tree produced by {@link createExamParser#total_marks}.
	 * @param ctx the parse tree
	 */
	void exitTotal_marks(createExamParser.Total_marksContext ctx);
	/**
	 * Enter a parse tree produced by {@link createExamParser#passing_marks}.
	 * @param ctx the parse tree
	 */
	void enterPassing_marks(createExamParser.Passing_marksContext ctx);
	/**
	 * Exit a parse tree produced by {@link createExamParser#passing_marks}.
	 * @param ctx the parse tree
	 */
	void exitPassing_marks(createExamParser.Passing_marksContext ctx);
	/**
	 * Enter a parse tree produced by {@link createExamParser#duration_}.
	 * @param ctx the parse tree
	 */
	void enterDuration_(createExamParser.Duration_Context ctx);
	/**
	 * Exit a parse tree produced by {@link createExamParser#duration_}.
	 * @param ctx the parse tree
	 */
	void exitDuration_(createExamParser.Duration_Context ctx);
	/**
	 * Enter a parse tree produced by {@link createExamParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(createExamParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link createExamParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(createExamParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link createExamParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(createExamParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link createExamParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(createExamParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link createExamParser#section_name}.
	 * @param ctx the parse tree
	 */
	void enterSection_name(createExamParser.Section_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link createExamParser#section_name}.
	 * @param ctx the parse tree
	 */
	void exitSection_name(createExamParser.Section_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link createExamParser#section_marks}.
	 * @param ctx the parse tree
	 */
	void enterSection_marks(createExamParser.Section_marksContext ctx);
	/**
	 * Exit a parse tree produced by {@link createExamParser#section_marks}.
	 * @param ctx the parse tree
	 */
	void exitSection_marks(createExamParser.Section_marksContext ctx);
	/**
	 * Enter a parse tree produced by {@link createExamParser#question_block}.
	 * @param ctx the parse tree
	 */
	void enterQuestion_block(createExamParser.Question_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link createExamParser#question_block}.
	 * @param ctx the parse tree
	 */
	void exitQuestion_block(createExamParser.Question_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link createExamParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(createExamParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link createExamParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(createExamParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link createExamParser#answer_block}.
	 * @param ctx the parse tree
	 */
	void enterAnswer_block(createExamParser.Answer_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link createExamParser#answer_block}.
	 * @param ctx the parse tree
	 */
	void exitAnswer_block(createExamParser.Answer_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link createExamParser#answer}.
	 * @param ctx the parse tree
	 */
	void enterAnswer(createExamParser.AnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link createExamParser#answer}.
	 * @param ctx the parse tree
	 */
	void exitAnswer(createExamParser.AnswerContext ctx);
}