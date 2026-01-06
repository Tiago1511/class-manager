package eapli.base.examManagement.automaticFormativeExam;


public class EvalVisitor extends AutomaticFormativeExamBaseVisitor<Integer> {

    @Override public Integer visitSection(AutomaticFormativeExamParser.SectionContext ctx) {

        System.out.printf("Valid Questions Format\n\n");
        System.out.printf(ctx.getText());
        return visitChildren(ctx);
    }



}
