package eapli.base.meetingsManagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.meetingsManagement.domain.InviteStatus;
import eapli.base.meetingsManagement.domain.Meetings;
import eapli.base.meetingsManagement.repositories.MeetingsRepository;
import eapli.framework.application.ApplicationService;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

@ApplicationService
public class ListMeetingsService {
    private final MeetingsRepository meetingsRepository = PersistenceContext.repositories().meetingss();

    public Iterable<Meetings> myMeetingsCreatedAndOpened(SystemUser systemUser) {
        Iterable<Meetings> meetings;
        meetings = meetingsRepository.findByMyMeetingsCreatedAndOpened(systemUser);
        return meetings;
    }

    public Iterable<Meetings> myMeetingsAndOpened(SystemUser systemUser) {
        Iterable<Meetings> meetings;
        meetings = meetingsRepository.findByMyMeetingsAndOpened(systemUser);
        return meetings;
    }

    public Iterable<Meetings> myMeetingsPending(SystemUser systemUser) {
        Iterable<Meetings> meetings;
        meetings = meetingsRepository.findByMyMeetingsPending(systemUser);
        return meetings;
    }

    public Iterable<Meetings> myMeetings(SystemUser systemUser) {
        Iterable<Meetings> meetings;
        meetings = meetingsRepository.findByMyMeetings(systemUser);
        return meetings;
    }

    public void overlap(Meetings meeting, SystemUser systemUser) {
        Iterable<Meetings> meetings;
        meetings = meetingsRepository.findByMyMeetingsPendingHours(systemUser, meeting.Calendardate(), meeting.startLocalTime(), meeting.endLocalTime());



        for (Meetings m : meetings) {
            if (!m.equals(meeting)) {
                m.aceptRejectMeeting(InviteStatus.REJECT, systemUser);
                //System.out.printf("sim:");
                //System.out.println(m.toString());
                try {
                    meetingsRepository.save(m);
                }catch (Exception e) {
                    System.out.println("Error saving");
                }
            }
            else {
                System.out.println("\n");
                //System.out.println("Success" + m.toString());
            }
        }

    }
}
