package eapli.base.boardManagement.repositories;

import eapli.base.boardManagement.domain.Column;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.domain.repositories.LockableDomainRepository;

public interface ColumnRepository extends DomainRepository<Long, Column>, LockableDomainRepository<Long,Column> {
}
