package eapli.base.persistence.impl.inmemory;

import eapli.base.meetingsManagement.domain.Meetings;
import eapli.base.meetingsManagement.repositories.MeetingsRepository;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.time.LocalTime;
import java.util.Calendar;

public class InMemoryMeetingsRepository extends InMemoryDomainRepository<Meetings, Long> implements MeetingsRepository {
    static {
        InMemoryInitializer.init();
    }


    @Override
    public Iterable<Meetings> cancelled() {
        return match(e -> e.cancelled().booleanValue());
    }

    @Override
    public Iterable<Meetings> findByMyMeetingsCreatedAndOpened(SystemUser systemUser) {
        return null;
    }

    @Override
    public Iterable<Meetings> findByMyMeetingsAndOpened(SystemUser systemUser) {
        return null;
    }

    @Override
    public Iterable<Meetings> findByMyMeetingsPending(SystemUser systemUser) {
        return null;
    }
    @Override
    public Iterable<Meetings> findByMyMeetingsPendingHours(SystemUser systemUser, Calendar date, LocalTime startTime, LocalTime endTime) {
        return null;
    }

    @Override
    public Iterable<Meetings> findByMyMeetings(SystemUser systemUser) {
        return null;
    }
}
