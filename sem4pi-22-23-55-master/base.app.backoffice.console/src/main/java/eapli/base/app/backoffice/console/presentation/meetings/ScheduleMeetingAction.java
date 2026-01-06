package eapli.base.app.backoffice.console.presentation.meetings;


import eapli.framework.actions.Action;

public class ScheduleMeetingAction implements Action {

    @Override
    public boolean execute(){
        return new ScheduleMeetingUI().show();
    }
}
