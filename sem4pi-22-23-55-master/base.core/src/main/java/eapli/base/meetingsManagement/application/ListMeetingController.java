package eapli.base.meetingsManagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.meetingsManagement.domain.Meetings;
import eapli.base.meetingsManagement.repositories.MeetingsRepository;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;


@UseCaseController
public class ListMeetingController {
    private final MeetingsRepository meetingsRepository = PersistenceContext.repositories().meetingss();
    private final ListMeetingsService listMeetingsService = new ListMeetingsService();

    public void listMeetings(Meetings meetings) {
        meetings.listGuest();
    }

    public Iterable meeting(SystemUser systemUser) {

        Iterable<Meetings> list = listMeetingsService.myMeetingsCreatedAndOpened(systemUser);
        return list;
    }

    public Iterable meetings(SystemUser systemUser) {
        Iterable<Meetings> list = listMeetingsService.myMeetingsAndOpened(systemUser);
        return list;
    }
}
