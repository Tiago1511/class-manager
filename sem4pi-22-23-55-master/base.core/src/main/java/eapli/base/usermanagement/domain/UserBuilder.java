package eapli.base.usermanagement.domain;

import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.teacherManagement.domain.Acronym;
import eapli.base.teacherManagement.domain.TaxNumber;
import eapli.framework.domain.model.DomainFactory;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

public class UserBuilder implements DomainFactory<RegisteredUser> {

    private RegisteredUser theUser;
    private SystemUser systemUser;
    private TaxNumber taxNumber;
    private Acronym acronym;

    private MecanographicNumber mecanographicNumber;


    public UserBuilder systemUser(SystemUser systemUser) {
        this.systemUser = systemUser;
        return this;
    }

    public UserBuilder taxNumber(TaxNumber taxNumber) {
        this.taxNumber = taxNumber;
        return this;
    }

    public UserBuilder taxNumber(String taxNumber) {
        this.taxNumber = new TaxNumber( taxNumber);
        return this;
    }

    public UserBuilder acronym(Acronym acronym) {
        this.acronym = acronym;
        return this;
    }

    public UserBuilder acronym(String acronym) {
        this.acronym = new Acronym(acronym);
        return this;
    }

    public UserBuilder mecanographicNumber(final MecanographicNumber mecanographicNumber) {
        this.mecanographicNumber = mecanographicNumber;
        return this;
    }

    public UserBuilder mecanographicNumber(final String mecanographicNumber) {
        this.mecanographicNumber = new MecanographicNumber(mecanographicNumber);
        return this;
    }



    public RegisteredUser buildOrThrow(){
        if (theUser != null) {
            return theUser;
        }

        if (systemUser != null && acronym != null && taxNumber != null  ) {
            theUser = new RegisteredUser(taxNumber,acronym,systemUser);
            return theUser;
        }
        else {
            if (systemUser != null && mecanographicNumber != null && taxNumber != null  ) {
                theUser = new RegisteredUser(taxNumber,mecanographicNumber,systemUser);
                return theUser;
            }
            else {
                throw new IllegalStateException();
            }
        }
    }

    @Override
    public RegisteredUser build() {
        // since the factory knows that all the parts are needed it could throw
        // an exception. however, we will leave that to the constructor

        RegisteredUser registeredUser = buildOrThrow();
        theUser = null;

        return registeredUser;
    }
}
