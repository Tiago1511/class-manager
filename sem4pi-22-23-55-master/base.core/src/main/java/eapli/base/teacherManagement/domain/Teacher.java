package eapli.base.teacherManagement.domain;


import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.base.teacherManagement.dto.TeacherDTO;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Teacher implements AggregateRoot<Acronym> {
    @Version
    private Long version;
    @Id
    private Acronym acronym;

    @Column(nullable = false)
    private TaxNumber taxNumber;

    @Temporal(TemporalType.DATE)
    private Date birthDay;

    /**
     * cascade = CascadeType.NONE as the systemUser is part of another aggregate
     */
    @OneToOne()
    private SystemUser systemUser;



    protected  Teacher() {}
    public Teacher(SystemUser user, Acronym acronym,TaxNumber taxNumber,Date birthDay){
        if (acronym == null || user == null) {
            throw new IllegalArgumentException();
        }
        this.systemUser = user;
        this.acronym = acronym;
        this.taxNumber = taxNumber;
        this.birthDay = birthDay;
    }


    public SystemUser systemUser() {
        return this.systemUser;
    }

    @Override
    public boolean equals(final Object o) {
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }

    @Override
    public boolean sameAs(final Object other) {
        return DomainEntities.areEqual(this, other);
    }

    public Acronym acronym() {
        return identity();
    }

    @Override
    public Acronym identity() {
        return this.acronym;
    }

    public TeacherDTO toDTO() {
        return new TeacherDTO(acronym.acronym(), taxNumber.taxNumber(), birthDay.toString());
    }

    public TaxNumber taxNumber(){
        return taxNumber;
    }

    public SystemUser getSystemUser() {
        return systemUser;
    }
}
