package eapli.base.meetingsManagement.application;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.meetingsManagement.domain.Meeting;
import eapli.base.meetingsManagement.repositories.MeetingRepository;
import eapli.framework.application.UseCaseController;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@UseCaseController
public class ScheduleMeetingController {

    private final TransactionalContext txCtx = PersistenceContext.repositories().newTransactionalContext();

    private final MeetingRepository meetingRepository = PersistenceContext.repositories().meetings(txCtx);
    public Meeting scheduleMeeting(List<SystemUser> participants, final Calendar date, final String duration){
        Meeting meeting = new Meeting(participants, duration, date);

        txCtx.beginTransaction();
        meeting = meetingRepository.save(meeting);
        txCtx.commit();
        return meeting;
    }
}

