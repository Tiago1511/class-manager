// Generated from C:/Users/phenr/github-classroom/Departamento-de-Engenharia-Informatica/sem4pi-22-23-55/base.core/src/main/java/eapli/base/examManagement/eapli/base/examManagement/exam\createExam.g4 by ANTLR 4.12.0
package eapli.base.examManagement.eapli.base.examManagement.exam;

    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link createExamParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface createExamVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link createExamParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(createExamParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link createExamParser#exam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExam(createExamParser.ExamContext ctx);
	/**
	 * Visit a parse tree produced by {@link createExamParser#exam_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExam_name(createExamParser.Exam_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link createExamParser#code_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_name(createExamParser.Code_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link createExamParser#total_marks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTotal_marks(createExamParser.Total_marksContext ctx);
	/**
	 * Visit a parse tree produced by {@link createExamParser#passing_marks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassing_marks(createExamParser.Passing_marksContext ctx);
	/**
	 * Visit a parse tree produced by {@link createExamParser#duration_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuration_(createExamParser.Duration_Context ctx);
	/**
	 * Visit a parse tree produced by {@link createExamParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(createExamParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link createExamParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(createExamParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link createExamParser#section_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection_name(createExamParser.Section_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link createExamParser#section_marks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection_marks(createExamParser.Section_marksContext ctx);
	/**
	 * Visit a parse tree produced by {@link createExamParser#question_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_block(createExamParser.Question_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link createExamParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(createExamParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link createExamParser#answer_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer_block(createExamParser.Answer_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link createExamParser#answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer(createExamParser.AnswerContext ctx);
}