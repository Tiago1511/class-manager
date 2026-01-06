package eapli.base.meetingsManagement.domain;


import eapli.framework.domain.model.DomainFactory;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Set;

public class MeetingsBuilder implements DomainFactory<Meetings> {

    private Meetings theMeeting;

    private Calendar date;

    private LocalTime startTime;

    private  LocalTime endTime;

    private Set<Invite> invite;

    private Boolean cancelled;

    private SystemUser systemUser;

    private Meetings buildOrThrow() {
        if (this.theMeeting != null) {
           return theMeeting;
        }
        if (date != null && startTime != null && endTime != null && invite != null && cancelled != null && systemUser != null) {
            this.theMeeting = new Meetings(date, startTime, endTime, invite, cancelled, systemUser);
            return theMeeting;
        }
        else {
            throw new IllegalStateException();
        }
    }

    public MeetingsBuilder withDate(Calendar date) {
        this.date = date;
        return this;
    }

    public MeetingsBuilder withStartTime(LocalTime startTime) {
        this.startTime = startTime;
        return this;
    }

    public MeetingsBuilder withEndTime(LocalTime endTime) {
        this.endTime = endTime;
        return this;
    }

    public MeetingsBuilder withInvite(Set<Invite> invite) {
        this.invite = invite;
        return this;
    }

    public MeetingsBuilder withCancelled(Boolean cancelled) {
        this.cancelled = cancelled;
        return this;
    }

    public MeetingsBuilder withSystemUser(SystemUser systemUser) {
        this.systemUser = systemUser;
        return this;
    }

    @Override
    public Meetings build() {
        final Meetings meetings = buildOrThrow();
         theMeeting = null;
        return meetings;
    }


}
