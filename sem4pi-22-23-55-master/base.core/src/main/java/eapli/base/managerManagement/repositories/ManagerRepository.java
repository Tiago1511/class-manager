package eapli.base.managerManagement.repositories;
import eapli.base.managerManagement.domain.Manager;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

public interface ManagerRepository extends DomainRepository <String,Manager>{
    Optional<Manager> findByEmail(String email);
}
