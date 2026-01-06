package eapli.base.meetingsManagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.meetingsManagement.domain.Invite;
import eapli.base.meetingsManagement.domain.Meetings;
import eapli.base.meetingsManagement.domain.MeetingsBuilder;
import eapli.base.meetingsManagement.repositories.MeetingsRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.List;
import java.util.Set;

@UseCaseController
public class RegisterMeetingController {

    private final MeetingsRepository meetingsRepository = PersistenceContext.repositories().meetingss();

    public Meetings registerMeeting(Calendar date, LocalTime startTime, LocalTime endTime, Set<Invite> invite, Boolean cancelled, SystemUser systemUser) {

        final var newMeeting = new MeetingsBuilder().withCancelled(cancelled).withDate(date).withStartTime(startTime).withEndTime(endTime).withInvite(invite).withSystemUser(systemUser).build();

        return meetingsRepository.save(newMeeting);
    }
}
