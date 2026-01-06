package eapli.base.app.other.console.presentation.exam;

import eapli.base.examManagement.application.FutureExamsController;
import eapli.framework.presentation.console.AbstractUI;

public class FutureExamsUI extends AbstractUI {

    FutureExamsController controller= new FutureExamsController();
    @Override
    protected boolean doShow() {
        controller.futureGrades();
        return false;
    }

    @Override
    public String headline() {
        return "Future Exams >";
    }
}
