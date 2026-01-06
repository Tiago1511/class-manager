package eapli.base.meetingsManagement.domain;

import eapli.framework.domain.model.AggregateRoot;
import eapli.framework.domain.model.DomainEntities;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity
public class Meetings implements AggregateRoot<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar date;

    @Column(nullable = false)
    private LocalTime startTime;

    @Column(nullable = false)
    private LocalTime endTime;

    /**
     *  ao usar @Column(unique = true) não permite que sejam inseridos dois convites iguais
     */
    @ElementCollection(fetch = FetchType.EAGER)
    @Column(unique = true)
    private Set<Invite> invite;

    @Column(nullable = false)
    private Boolean cancelled;

    /**
     * responsible for the meeting
     */
    @OneToOne
    private SystemUser systemUser;
    protected Meetings() {

    }

    public Meetings(Calendar date, LocalTime startTime, LocalTime endTime, Set<Invite> invite, Boolean cancelled, SystemUser systemUser) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.invite = invite;
        this.cancelled = cancelled;
        this.systemUser = systemUser;
    }

    @Override
    public boolean sameAs(Object other) {
        return DomainEntities.areEqual(this,other);
    }

    @Override
    public Long identity() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meetings meetings = (Meetings) o;
        return Objects.equals(id, meetings.id) && Objects.equals(date, meetings.date) && Objects.equals(startTime, meetings.startTime) && Objects.equals(endTime, meetings.endTime) && Objects.equals(invite, meetings.invite) && Objects.equals(cancelled, meetings.cancelled) && Objects.equals(systemUser, meetings.systemUser);
    }

    @Override
    public boolean hasIdentity(Long id) {
        return AggregateRoot.super.hasIdentity(id);
    }

    /**
     * Method to check if a meeting is cancelled
     * @return true if cancelled or false if not
     */
    public Boolean cancelled(){
        return this.cancelled;
    }

    /**
     * Method to cancel a meeting
     * @return true
     */
    public Boolean cancelMeeting(){
        return this.cancelled = true;
    }

    public String date() {
        return this.date.getTime().toString();
    }

    public Calendar Calendardate() {
        return this.date;
    }

    public LocalTime startLocalTime() {
        return this.startTime;
    }

    public LocalTime endLocalTime() {
        return this.endTime;
    }

    public String startTime() {
        return this.startTime.toString();
    }

    public String endTime() {
        return this.endTime.toString();
    }

    @Override
    public String toString() {
        return "Meeting: " +
                id+
                ", date=" + date.getTime() +
                ", startTime=" + startTime.toString() +
                ", endTime=" + endTime.toString() +
                ", cancelled=" + cancelled +
                ", systemUser=" + systemUser.identity().toString();
    }

    /**
     * Method to accept or reject a meeting
     * @param inviteStatus status of the invite
     * @param systemUser system user
     */
    public void aceptRejectMeeting(InviteStatus inviteStatus, SystemUser systemUser) {
        for (Invite invite : this.invite) {
            if (invite.systemUser().equals(systemUser)) {
                invite.aceptRejectMeeting(inviteStatus);
            }
        }
    }

    /**
     * Method to list all the guests of a meeting
     */
    public void listGuest() {
        System.out.println("Responsible for the meeting: " );
        System.out.println(this.systemUser.identity().toString());
        System.out.println("Guests: ");
        for (Invite invite : this.invite) {
            System.out.printf("%-10s %s%n", invite.systemUser().identity().toString(), invite.inviteStatusString());
        }
    }
}
