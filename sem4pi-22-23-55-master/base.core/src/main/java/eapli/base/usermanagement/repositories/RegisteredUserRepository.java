package eapli.base.usermanagement.repositories;

import eapli.base.teacherManagement.domain.TaxNumber;
import eapli.base.usermanagement.domain.RegisteredUser;
import eapli.framework.domain.repositories.DomainRepository;

import java.util.Optional;

public interface RegisteredUserRepository extends DomainRepository<TaxNumber, RegisteredUser> {

    Optional<RegisteredUser> findByCode(String code);

    Optional <RegisteredUser> findByEmail(String email);

    Optional<RegisteredUser> ofIdentity(String id);

    /*default Optional<RegisteredUser> findByMecanographicNumber(final MecanographicNumber number) {
        return ofIdentity(number);
    }
     */
}
