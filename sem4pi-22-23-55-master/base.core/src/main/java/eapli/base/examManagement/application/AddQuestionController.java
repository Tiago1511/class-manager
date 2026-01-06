package eapli.base.examManagement.application;

import eapli.base.examManagement.addQuestion.EvalVisitor;
import eapli.base.examManagement.addQuestion.addQuestionLexer;
import eapli.base.examManagement.addQuestion.addQuestionParser;
import eapli.base.examManagement.domain.automaticExamDomain.Question;
import eapli.base.examManagement.repositories.QuestionRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AddQuestionController {

    public static String type;
    public static String solucion;

    private final QuestionRepository questionRepository = PersistenceContext.repositories().question();
    public Question addQuestion(String type,String questionContext,String solucion){
        Question question = new Question(type,questionContext,solucion);

        questionRepository.save(question);
        System.out.println("questao adicionada com sucesso!");
        return question;
    }

    public void evalVisitor(File file) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("Path not accepted");
        }
        addQuestionLexer lexer = null;
        try {
            lexer = new addQuestionLexer(new ANTLRInputStream(fis));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        addQuestionParser parser = new addQuestionParser(tokens);
        ParseTree tree = parser.start(); // parse
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
        type= eval.getType();
        solucion= eval.getSolution();
    }

    public String getType() {
        return type;
    }

    public String getSolucion() {
        return solucion;
    }
}
