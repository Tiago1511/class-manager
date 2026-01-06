package eapli.base.studentManagement.domain;

import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.studentManagement.dto.StudentDTO;
import eapli.base.teacherManagement.domain.TaxNumber;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

@Entity
public class Student implements AggregateRoot<MecanographicNumber> {
    @Version
    private Long version;

    @Id
    private MecanographicNumber mecanographicNumber;


    private TaxNumber taxNumber;

    @Temporal(TemporalType.DATE)
    private Date birthDay;

    @OneToOne()
    private SystemUser systemUser;

    protected Student() {

    }


    public Student(SystemUser systemUser, MecanographicNumber mecanographicNumber, TaxNumber taxNumber,Date birthDay) {
        this.mecanographicNumber = mecanographicNumber;
        this.taxNumber = taxNumber;
        this.systemUser = systemUser;
        this.birthDay= birthDay;
    }


    public MecanographicNumber mecanographicNumber() {
        return mecanographicNumber;
    }

    public TaxNumber taxNumber() {
        return taxNumber;
    }

    public SystemUser systemUser() {
        return systemUser;
    }



    @Override
    public boolean sameAs(Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public int compareTo(MecanographicNumber other) {
        return AggregateRoot.super.compareTo(other);
    }

    @Override
    public MecanographicNumber identity() {
        return this.mecanographicNumber;
    }

    @Override
    public boolean hasIdentity(MecanographicNumber id) {
        return AggregateRoot.super.hasIdentity(id);
    }


    @Override
    public boolean equals(final Object o) {
        return DomainEntities.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return DomainEntities.hashCode(this);
    }

    public StudentDTO toDTO(){
        return new StudentDTO(mecanographicNumber.toString(),taxNumber.taxNumber(),birthDay.toString());
    }

    public SystemUser getSystemUser() {
        return systemUser;
    }
}
