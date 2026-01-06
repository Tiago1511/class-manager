package eapli.base.studentManagement.domain;

import eapli.base.examManagement.exam.antlr.*;

import eapli.framework.io.util.Console;
import org.antlr.v4.runtime.tree.TerminalNode;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;


import javax.print.DocFlavor;
import java.awt.desktop.ScreenSleepEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class StudentEvalVisitor extends createExamBaseVisitor<Integer>{

    private static Integer finalScore = 0;

    private Boolean answerScore = false;



    @Override public Integer visitExam(createExamParser.ExamContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitExam_name(createExamParser.Exam_nameContext ctx) {
        System.out.printf("\nExam: "+ctx.STRING().toString());
        try {
            TimeUnit.MILLISECONDS.sleep(250);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitCode_name(createExamParser.Code_nameContext ctx) {
        System.out.printf("\nCode: "+ctx.STRING().toString());
        try {
            TimeUnit.MILLISECONDS.sleep(250);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitTotal_marks(createExamParser.Total_marksContext ctx) {
        System.out.printf("\nTotal Marks: "+ctx.getText());
        try {
            TimeUnit.MILLISECONDS.sleep(250);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitPassing_marks(createExamParser.Passing_marksContext ctx) {
        System.out.printf("\nPassing Marks: "+ctx.NUMBER().getText());
        try {
            TimeUnit.MILLISECONDS.sleep(250);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitDuration_(createExamParser.Duration_Context ctx) {
        System.out.printf("\nDuration: "+ctx.NUMBER().getText().toString()+" "+ctx.STRING());
        try {
            TimeUnit.MILLISECONDS.sleep(250);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitSection(createExamParser.SectionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitQuestion_section(createExamParser.Question_sectionContext ctx) {

        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitSection_name(createExamParser.Section_nameContext ctx) {
        System.out.printf("\n\nSection: "+ctx.text().getText().toString());
        try {
            TimeUnit.MILLISECONDS.sleep(250);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitSection_marks(createExamParser.Section_marksContext ctx) {

        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitMc_question_block(createExamParser.Mc_question_blockContext ctx) {
        System.out.println("\n\n"+ctx.mc_question(0).text(0).STRING().toString());

        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("\n\n"+ctx.mc_question(0).mc_answer_block().getText().toString());

        String response = Console.readLine("");

        try {
            TimeUnit.MILLISECONDS.sleep(250);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        String correctAnswer = ctx.mc_question(0).text(1).getText();


        if (response.equals(correctAnswer)){
            Integer score = Integer.parseInt(ctx.NUMBER().getText());
            finalScore= finalScore+score;
        }


        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitTf_question_block(createExamParser.Tf_question_blockContext ctx) {

        System.out.println("\n\n"+ctx.tf_question(0).text(0).STRING().toString());

        String response = Console.readLine("");

        String correctAnswer = ctx.tf_question(0).text(1).getText();


        if (response.equals(correctAnswer)){
            Integer score = Integer.parseInt(ctx.NUMBER().getText());
            finalScore= finalScore+score;
        }


        try {
            TimeUnit.MILLISECONDS.sleep(250);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitTa_question_block(createExamParser.Ta_question_blockContext ctx) {

        System.out.println("\n\n"+ctx.ta_question(0).text(0).getText());

        String response = Console.readLine("");

        String correctAnswer = ctx.ta_question(0).text(1).getText();


        if (response.equals(correctAnswer)){
            Integer score = Integer.parseInt(ctx.NUMBER().getText());
            finalScore= finalScore+score;
        }


        try {
            TimeUnit.MILLISECONDS.sleep(250);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitMc_question(createExamParser.Mc_questionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitMc_answer_block(createExamParser.Mc_answer_blockContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitMc_answer(createExamParser.Mc_answerContext ctx) {
        return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitTf_question(createExamParser.Tf_questionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Integer visitTa_question(createExamParser.Ta_questionContext ctx) {

        return visitChildren(ctx);

    }

    public Integer getFinalScore() {
        return finalScore;
    }


}
