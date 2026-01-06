package eapli.base.app.backoffice.console.presentation.enrollStudents;

import eapli.framework.actions.Action;

public class EnrollStudentsAction implements Action {
    @Override
    public boolean execute() {
        return new EnrollStudentsUI().show();
    }
}
