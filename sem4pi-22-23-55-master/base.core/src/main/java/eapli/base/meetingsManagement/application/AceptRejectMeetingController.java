package eapli.base.meetingsManagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.meetingsManagement.domain.InviteStatus;
import eapli.base.meetingsManagement.domain.Meetings;
import eapli.base.meetingsManagement.repositories.MeetingsRepository;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

@UseCaseController
public class AceptRejectMeetingController {

    private final ListMeetingsService listMeetingsService = new ListMeetingsService();

    private final MeetingsRepository meetingsRepository = PersistenceContext.repositories().meetingss();

    public Meetings aceptRejectMeeting(Meetings meetings, InviteStatus inviteStatus, SystemUser systemUser) {

        meetings.aceptRejectMeeting(inviteStatus, systemUser);
        if (inviteStatus == InviteStatus.ACCEPT) {
            listMeetingsService.overlap(meetings, systemUser);
        }

        return meetingsRepository.save(meetings);
    }

    public Iterable<Meetings> meeting(SystemUser systemUser) {
        return listMeetingsService.myMeetingsPending(systemUser);
    }
}
