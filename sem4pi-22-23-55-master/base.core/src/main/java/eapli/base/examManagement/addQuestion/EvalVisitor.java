package eapli.base.examManagement.addQuestion;

import javax.persistence.criteria.CriteriaBuilder;

public class EvalVisitor extends addQuestionBaseVisitor<Integer>{
    public static String type;
    public static String solucion;

    public Integer visitAddQuestion(addQuestionParser.AddQuestionContext ctx) {

        System.out.printf("Valid Questions Format\n\n");
        System.out.println(ctx.getText());
        visit(ctx.questionContent());
        return 0;
    }

    @Override public Integer visitRespostaCurta(addQuestionParser.RespostaCurtaContext ctx) {
        type=ctx.RESPOSTA_CURTA().getText();
        solucion=ctx.solution().getText();

        System.out.println(type);
        System.out.println(solucion);
        return visitChildren(ctx);
    }

    @Override public Integer visitVerdadeiroOuFalso(addQuestionParser.VerdadeiroOuFalsoContext ctx) {
        type=ctx.VERDADEIRO_OU_FALSO().getText();
        solucion= ctx.solutionVerdadeiroFalso().getText();
        System.out.println(type);
        System.out.println(solucion);
        return visitChildren(ctx);
    }

    @Override public Integer visitEscolhaMultipla(addQuestionParser.EscolhaMultiplaContext ctx) {
        type=ctx.ESCOLHA_MULTIPLA().getText();
        solucion=ctx.solotionMultipla().getText();
        System.out.println(type);
        System.out.println(solucion);
        return visitChildren(ctx);
    }

    public  String getType() {
        return type;
    }

    public  String getSolution() {
        return solucion;
    }
}
