package eapli.base.app.backoffice.console.presentation.exam;

import eapli.base.examManagement.application.AddQuestionController;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import org.antlr.v4.runtime.ANTLRInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class AddQuestionUI extends AbstractUI {
    private AddQuestionController addQuestionController = new AddQuestionController();
    @Override
    protected boolean doShow() {
        String path = Console.readLine("Write absolute file path:");
        File file = new File(path);

        evalVisitor(file);
        String questionContent= "Vazio";
        try {
            questionContent= String.valueOf(new ANTLRInputStream(new FileInputStream(file)));
            questionContent=questionContent.trim();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        addQuestionController.addQuestion(addQuestionController.getType(),questionContent,addQuestionController.getSolucion());

        return false;
    }

    private void evalVisitor(File file){
        addQuestionController.evalVisitor(file);
    }


    @Override
    public String headline() {
        return "add question";
    }
}
