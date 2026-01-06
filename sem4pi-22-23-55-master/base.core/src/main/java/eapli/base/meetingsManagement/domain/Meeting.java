package eapli.base.meetingsManagement.domain;
import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
public class Meeting implements AggregateRoot<Long> {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @ManyToMany(
            cascade = {CascadeType.ALL},
            fetch = FetchType.EAGER)
    private List<SystemUser> participants;

    private String duration;

    @Temporal(TemporalType.DATE)
    private Calendar date;

    public Meeting(List<SystemUser> participants, String duration, Calendar date) {
        this.participants = participants;
        this.duration = duration;
        this.date = date;
    }

    protected Meeting(){
        // for ORM only
    }

    @Version
    private Long version;

    @Override
    public boolean sameAs(Object other) {
        return DomainEntities.areEqual(this,other);
    }

    @Override
    public Long identity() {
        return this.id;
    }
}
