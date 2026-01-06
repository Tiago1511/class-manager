package eapli.base.examManagement.addQuestion;
import eapli.base.examManagement.exam.EvalVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class addQuestion {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("src/main/java/eapli/base/examManagement/addQuestion/correspondenciaQuestion.txt"));
        addQuestionLexer lexer = new addQuestionLexer(new ANTLRInputStream(fis));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        addQuestionParser parser = new addQuestionParser(tokens);
        ParseTree tree = parser.start(); // parse
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);


    }
    }

