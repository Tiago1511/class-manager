package eapli.base.app.other.console.presentation;

import eapli.base.studentManagement.domain.Student;
import eapli.framework.actions.Action;

public class EnrollmentRequestAction implements Action {

    @Override
    public boolean execute() {
        EnrollmentRequestUI enrollmentRequestUI = new EnrollmentRequestUI();
        enrollmentRequestUI.displayEnrollmentRequestUI();
        return true;
    }
}