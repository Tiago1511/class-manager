package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.meetingsManagement.domain.Meeting;
import eapli.base.meetingsManagement.repositories.MeetingRepository;
import eapli.base.persistence.impl.inmemory.InMemoryMeetingRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

public class JpaMeetingRepository extends JpaAutoTxRepository<Meeting, Long, Long> implements MeetingRepository {

    public JpaMeetingRepository(final TransactionalContext autoTx) {

    super(autoTx, "id");
    }

    public JpaMeetingRepository(final String sname) {

        super(sname, Application.settings().getExtendedPersistenceProperties(), "id");
    }

}
