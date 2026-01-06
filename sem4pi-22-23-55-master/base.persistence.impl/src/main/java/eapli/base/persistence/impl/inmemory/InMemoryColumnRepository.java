package eapli.base.persistence.impl.inmemory;

import eapli.base.boardManagement.domain.Column;
import eapli.base.boardManagement.repositories.ColumnRepository;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Collection;

public class InMemoryColumnRepository extends InMemoryDomainRepository<Column,Long> implements ColumnRepository {
    static {
        InMemoryInitializer.init();
    }
}
