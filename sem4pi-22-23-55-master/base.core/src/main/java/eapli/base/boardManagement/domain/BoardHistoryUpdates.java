package eapli.base.boardManagement.domain;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.time.util.CurrentTimeCalendars;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Objects;

@Entity
public class BoardHistoryUpdates implements AggregateRoot<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String historyUpdate;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar updatedOn;

    @OneToOne
    private SystemUser systemUser;

    protected BoardHistoryUpdates(){
    }

    public BoardHistoryUpdates(String historyUpdate) {
        this.historyUpdate = historyUpdate;
        this.updatedOn = CurrentTimeCalendars.now();
        this.systemUser = AuthzRegistry.authorizationService().session().get().authenticatedUser();
    }

    public BoardHistoryUpdates(String historyUpdate, SystemUser user) {
        this.historyUpdate = historyUpdate;
        this.updatedOn = CurrentTimeCalendars.now();
        this.systemUser = user;
    }


    public String getHistoryUpdate() {
        return historyUpdate;
    }

    public Calendar getUpdatedOn() {
        return updatedOn;
    }

    public SystemUser getSystemUser() {
        return systemUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardHistoryUpdates that = (BoardHistoryUpdates) o;
        return Objects.equals(id, that.id) && Objects.equals(historyUpdate, that.historyUpdate) && Objects.equals(updatedOn, that.updatedOn) && Objects.equals(systemUser, that.systemUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, historyUpdate, updatedOn, systemUser);
    }

    @Override
    public boolean sameAs(Object other) {
        return DomainEntities.areEqual(this, other);
    }

    @Override
    public Long identity() {
        return this.id;
    }
}
