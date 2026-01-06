package eapli.base.persistence.impl.inmemory;

import eapli.base.boardManagement.domain.Rows;
import eapli.base.boardManagement.repositories.RowRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryRowRepository extends InMemoryDomainRepository<Rows,Long> implements RowRepository {
    static {
        InMemoryInitializer.init();
    }
}