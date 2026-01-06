package eapli.base.persistence.impl.inmemory;

import eapli.base.managerManagement.domain.Manager;
import eapli.base.managerManagement.repositories.ManagerRepository;



import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;
import org.springframework.jmx.export.metadata.ManagedNotification;


import java.util.Optional;

public class InMemoryManagerRepository extends InMemoryDomainRepository<Manager, String> implements ManagerRepository {


    @Override
    public Optional<Manager> findByEmail(String email) {
       return matchOne(e->e.toDTO().getEmail().equals(email));
    }
}
