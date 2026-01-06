package eapli.base.examManagement.exam;


import eapli.base.examManagement.exam.antlr.*;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;



public class createExam {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\phenr\\github-classroom\\Departamento-de-Engenharia-Informatica\\sem4pi-22-23-55\\base.core\\src\\main\\java\\eapli\\base\\examManagement\\exam\\scienceExam2.txt"));
        createExamLexer lexer = new createExamLexer(new ANTLRInputStream(fis));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        createExamParser parser = new createExamParser(tokens);
        ParseTree tree = parser.start(); // parse
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}
