package eapli.base.boardManagement.repositories;

import eapli.base.boardManagement.domain.Rows;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.domain.repositories.LockableDomainRepository;

public interface RowRepository extends DomainRepository<Long, Rows>, LockableDomainRepository<Long, Rows> {
}
