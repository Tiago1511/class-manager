package eapli.base.persistence.impl.inmemory;

import eapli.base.teacherManagement.domain.TaxNumber;
import eapli.base.usermanagement.domain.RegisteredUser;
import eapli.base.usermanagement.repositories.RegisteredUserRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

public class InMemoryUserRepository extends InMemoryDomainRepository<RegisteredUser, TaxNumber> implements RegisteredUserRepository {
    @Override
    public Optional<RegisteredUser> findByCode(String code) {
        return Optional.empty();
    }

    @Override
    public Optional<RegisteredUser> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public Optional<RegisteredUser> ofIdentity(String id) {
        return Optional.empty();
    }




}
