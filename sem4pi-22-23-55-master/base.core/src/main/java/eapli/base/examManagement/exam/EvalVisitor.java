package eapli.base.examManagement.exam;

import eapli.base.examManagement.exam.antlr.*;

public class EvalVisitor extends createExamBaseVisitor<String> {

    private static String examName;
    private static Integer SectionMarks=200;
    protected static Integer QuestionMarks=200;

    @Override
    public String visitExam(createExamParser.ExamContext ctx) {

        visit(ctx.code_name());


        System.out.println(ctx.getText());
        examName=ctx.exam_name().STRING().toString();
        return examName;
    }






    public String getExamName() {
        return examName;
    }
}
