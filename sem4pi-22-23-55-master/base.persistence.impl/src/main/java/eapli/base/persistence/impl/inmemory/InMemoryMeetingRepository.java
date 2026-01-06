package eapli.base.persistence.impl.inmemory;

import eapli.base.meetingsManagement.domain.Meeting;
import eapli.base.meetingsManagement.repositories.MeetingRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryMeetingRepository extends InMemoryDomainRepository<Meeting, Long> implements MeetingRepository {

        static {
            InMemoryInitializer.init();
        }
}

