package eapli.base.meetingsManagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.meetingsManagement.domain.Meetings;
import eapli.base.meetingsManagement.repositories.MeetingsRepository;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.validations.Preconditions;

@UseCaseController
public class CancelMeetingController {

    private final ListMeetingsService listMeetingsService = new ListMeetingsService();

    private final MeetingsRepository meetingsRepository = PersistenceContext.repositories().meetingss();

    public Meetings cancelMeeting(Meetings meetings) {
        Preconditions.nonNull(meetings);
        meetings.cancelMeeting();

        return meetingsRepository.save(meetings);
    }

    public Iterable<Meetings> meeting(SystemUser systemUser) {
        return listMeetingsService.myMeetingsCreatedAndOpened(systemUser);
    }
}
