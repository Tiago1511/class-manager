package eapli.base.app.teacher.console.presentation.meetings;

import eapli.base.meetingsManagement.domain.Meetings;
import eapli.framework.visitor.Visitor;

public class MeetingsPrinter implements Visitor<Meetings> {
    @Override
    public void visit(Meetings visitee) {
        System.out.printf("%-10s%-30s%-30s%-30s%-10s", visitee.identity(), visitee.cancelled(), visitee.date(), visitee.startTime(), visitee.endTime());
    }
}
