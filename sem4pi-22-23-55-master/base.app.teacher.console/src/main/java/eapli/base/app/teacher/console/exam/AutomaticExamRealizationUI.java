package eapli.base.app.teacher.console.exam;

import eapli.base.examManagement.application.AutomaticExamCreationController;
import eapli.framework.presentation.console.AbstractUI;

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
