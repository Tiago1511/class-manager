package eapli.base.usermanagement.domain;

import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.teacherManagement.domain.Acronym;
import eapli.base.teacherManagement.domain.TaxNumber;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class RegisteredUser implements AggregateRoot<TaxNumber> {

    @Id
    private TaxNumber taxNumber;

    @Column(nullable = false)
    private Acronym acronym;

    @Column(nullable = false)
    private MecanographicNumber mecanographicNumber;


    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    @OneToOne()
    private SystemUser systemUser;

    public RegisteredUser(TaxNumber taxNumber, Acronym acronym, SystemUser systemUser) {
        if (acronym == null || systemUser == null || taxNumber == null) {
            throw new IllegalArgumentException();
        }
        this.taxNumber = taxNumber;
        this.acronym = acronym;
        this.systemUser = systemUser;
    }

    public RegisteredUser(TaxNumber taxNumber, MecanographicNumber mecanographicNumber, SystemUser systemUser) {
        if (mecanographicNumber == null || systemUser == null || taxNumber == null) {
            throw new IllegalArgumentException();
        }
        this.taxNumber = taxNumber;
        this.mecanographicNumber = mecanographicNumber;
        this.systemUser = systemUser;
    }


    @Override
    public boolean sameAs(Object other) {
        return false;
    }

    @Override
    public int compareTo(TaxNumber other) {
        return AggregateRoot.super.compareTo(other);
    }

    @Override
    public TaxNumber identity() {
        return null;
    }

    @Override
    public boolean hasIdentity(TaxNumber id) {
        return AggregateRoot.super.hasIdentity(id);
    }
}
