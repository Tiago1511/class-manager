package eapli.base.app.other.console.presentation.exam;

import eapli.base.examManagement.application.AutomaticExamCreationController;
import eapli.base.examManagement.application.ExamCreationController;
import eapli.base.examManagement.domain.automaticExamDomain.Question;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import java.io.File;

public class AutomaticExamRealizationUI extends AbstractUI {
    private static AutomaticExamCreationController controller= new AutomaticExamCreationController();

    @Override
    protected boolean doShow() {

        String exam = controller.questionSelection();
        controller.setQuestionList();
        return false;
    }

    @Override
    public String headline() {
        return "Automatic Exam >";
    }
}
