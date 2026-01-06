package eapli.base.managerManagement.domain;
import eapli.base.managerManagement.dto.ManagerDTO;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;


import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

@Entity
public class Manager implements AggregateRoot<String> {
    @Version
    private Long version;

@Id
private String email;

@Temporal(TemporalType.DATE)
private Date birthDay;

@OneToOne()
private SystemUser systemUser;

protected Manager(){}
    public Manager(SystemUser systemUser, Date birthDate) {
        this.email = systemUser.email().toString();
        this.birthDay= birthDate;
        this.systemUser = systemUser;
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

    @Override
    public String identity() {
        return this.email;
    }

    public ManagerDTO toDTO(){
    return new ManagerDTO(email,birthDay.toString());
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SystemUser getSystemUser() {
        return systemUser;
    }
}
