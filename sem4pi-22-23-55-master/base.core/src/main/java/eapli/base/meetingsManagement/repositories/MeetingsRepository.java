package eapli.base.meetingsManagement.repositories;

import eapli.base.meetingsManagement.domain.Meetings;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.domain.repositories.LockableDomainRepository;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.time.LocalTime;
import java.util.Calendar;

public interface MeetingsRepository extends DomainRepository<Long, Meetings>, LockableDomainRepository<Long, Meetings> {

    Iterable<Meetings> cancelled();

    Iterable<Meetings> findByMyMeetingsCreatedAndOpened(SystemUser systemUser);


    Iterable<Meetings> findByMyMeetingsAndOpened(SystemUser systemUser);

    Iterable<Meetings> findByMyMeetingsPending(SystemUser systemUser);

    Iterable<Meetings> findByMyMeetingsPendingHours(SystemUser systemUser, Calendar date, LocalTime startTime, LocalTime endTime);

    Iterable<Meetings> findByMyMeetings(SystemUser systemUser);
}
