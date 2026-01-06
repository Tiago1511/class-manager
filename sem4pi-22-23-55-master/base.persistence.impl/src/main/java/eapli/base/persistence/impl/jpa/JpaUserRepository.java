package eapli.base.persistence.impl.jpa;

import eapli.base.teacherManagement.domain.TaxNumber;
import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.usermanagement.domain.RegisteredUser;

public class JpaUserRepository extends BasepaRepositoryBase<RegisteredUser, TaxNumber, MecanographicNumber>{
    public JpaUserRepository() {
        super("taxNumber");
    }
}
