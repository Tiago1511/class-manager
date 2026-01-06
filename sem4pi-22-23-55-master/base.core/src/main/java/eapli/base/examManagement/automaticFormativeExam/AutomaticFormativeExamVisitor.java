// Generated from C:/Users/phenr/github-classroom/Departamento-de-Engenharia-Informatica/sem4pi-22-23-55/base.core/src/main/java/eapli/base/examManagement/automaticFormativeExam\AutomaticFormativeExam.g4 by ANTLR 4.12.0
package eapli.base.examManagement.automaticFormativeExam;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AutomaticFormativeExamParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AutomaticFormativeExamVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AutomaticFormativeExamParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(AutomaticFormativeExamParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomaticFormativeExamParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(AutomaticFormativeExamParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomaticFormativeExamParser#section_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection_name(AutomaticFormativeExamParser.Section_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomaticFormativeExamParser#section_marks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection_marks(AutomaticFormativeExamParser.Section_marksContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomaticFormativeExamParser#question_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion_block(AutomaticFormativeExamParser.Question_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomaticFormativeExamParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(AutomaticFormativeExamParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomaticFormativeExamParser#answer_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer_block(AutomaticFormativeExamParser.Answer_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomaticFormativeExamParser#answer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer(AutomaticFormativeExamParser.AnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutomaticFormativeExamParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(AutomaticFormativeExamParser.TextContext ctx);
}