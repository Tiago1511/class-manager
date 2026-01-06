package eapli.base.meetingsManagement.domain;

import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.domain.model.*;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class MeetingsTest {

    private final String aMecanographicNumber = "abc";
    private final String anotherMecanographicNumber = "xyz";

    public static SystemUser dummyUser(final String username, final Role... roles) {
        // should we load from spring context?
        final SystemUserBuilder userBuilder = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder());
        return userBuilder.with(username, "duMMy1", "dummy", "dummy", "a@b.ro").withRoles(roles).build();
    }

    private SystemUser getNewDummyUser() {
        return dummyUser("dummy", BaseRoles.ADMIN);
    }

    private SystemUser getNewDummyUserTwo() {
        return dummyUser("dummy-two", BaseRoles.ADMIN);
    }

    private SystemUser getNewDummyUserThree() {
        return dummyUser("dummy-three", BaseRoles.ADMIN);
    }

    private SystemUser getNewDummyUserFour() {
        return dummyUser("dummy-four", BaseRoles.ADMIN);
    }

    @Test
    public void compareMeetings(){
        Calendar c = Calendar.getInstance();
        LocalTime lt = LocalTime.now();
        LocalTime lt2 = lt.plusHours(1);

        Invite i = new Invite(getNewDummyUserTwo(),InviteStatus.PENDING);
        Invite i2 = new Invite(getNewDummyUserThree(),InviteStatus.PENDING);

        Set<Invite> set = new HashSet<>();
        set.add(i);
        set.add(i2);

        Meetings m = new Meetings(c,lt,lt2,set,false,getNewDummyUser());
        Meetings m2 = new Meetings(c,lt,lt2,set,false,getNewDummyUser());
        Assert.assertEquals(m, m2);
    }

    @Test
    public void failCompareMeetings(){
        Calendar c = Calendar.getInstance();
        LocalTime lt = LocalTime.now();
        LocalTime lt2 = lt.plusHours(1);

        Invite i = new Invite(getNewDummyUserTwo(),InviteStatus.PENDING);
        Invite i2 = new Invite(getNewDummyUserThree(),InviteStatus.PENDING);

        Set<Invite> set = new HashSet<>();
        set.add(i);
        set.add(i2);

        Meetings m = new Meetings(c,lt,lt2,set,false,getNewDummyUser());
        Meetings m2 = new Meetings(c,lt,lt2,set,false,getNewDummyUserFour());
        Assert.assertNotEquals(m, m2);
    }

    @Test
    public void sameASMeetings(){
        Calendar c = Calendar.getInstance();
        LocalTime lt = LocalTime.now();
        LocalTime lt2 = lt.plusHours(1);

        Invite i = new Invite(getNewDummyUserTwo(),InviteStatus.PENDING);
        Invite i2 = new Invite(getNewDummyUserThree(),InviteStatus.PENDING);

        Set<Invite> set = new HashSet<>();
        set.add(i);
        set.add(i2);

        Meetings m = new Meetings(c,lt,lt2,set,false,getNewDummyUser());
        Meetings m2 = new Meetings(c,lt,lt2,set,false,getNewDummyUser());
        Assert.assertTrue(m.sameAs(m2));
    }

    @Test
    public void identity(){
        Calendar c = Calendar.getInstance();
        LocalTime lt = LocalTime.now();
        LocalTime lt2 = lt.plusHours(1);

        Invite i = new Invite(getNewDummyUserTwo(),InviteStatus.PENDING);
        Invite i2 = new Invite(getNewDummyUserThree(),InviteStatus.PENDING);

        Set<Invite> set = new HashSet<>();
        set.add(i);
        set.add(i2);

        Meetings m = new Meetings(c,lt,lt2,set,false,getNewDummyUser());
        Assert.assertEquals(m.identity(), m.identity());
    }

    @Test
    public void NotCancellad(){
        Calendar c = Calendar.getInstance();
        LocalTime lt = LocalTime.now();
        LocalTime lt2 = lt.plusHours(1);

        Invite i = new Invite(getNewDummyUserTwo(),InviteStatus.PENDING);
        Invite i2 = new Invite(getNewDummyUserThree(),InviteStatus.PENDING);

        Set<Invite> set = new HashSet<>();
        set.add(i);
        set.add(i2);

        Meetings m = new Meetings(c,lt,lt2,set,false,getNewDummyUser());
        Assert.assertFalse(m.cancelled());
    }

    @Test
    public void Cancellad(){
        Calendar c = Calendar.getInstance();
        LocalTime lt = LocalTime.now();
        LocalTime lt2 = lt.plusHours(1);

        Invite i = new Invite(getNewDummyUserTwo(),InviteStatus.PENDING);
        Invite i2 = new Invite(getNewDummyUserThree(),InviteStatus.PENDING);

        Set<Invite> set = new HashSet<>();
        set.add(i);
        set.add(i2);

        Meetings m = new Meetings(c,lt,lt2,set,true,getNewDummyUser());
        Assert.assertTrue(m.cancelled());
    }

    @Test
    public void IsCancelled(){
        Calendar c = Calendar.getInstance();
        LocalTime lt = LocalTime.now();
        LocalTime lt2 = lt.plusHours(1);

        Invite i = new Invite(getNewDummyUserTwo(),InviteStatus.PENDING);
        Invite i2 = new Invite(getNewDummyUserThree(),InviteStatus.PENDING);

        Set<Invite> set = new HashSet<>();
        set.add(i);
        set.add(i2);

        Meetings m = new Meetings(c,lt,lt2,set,true,getNewDummyUser());
        Assert.assertTrue(m.cancelMeeting());
    }

    @Test
    public void IsNotCancelled(){
        Calendar c = Calendar.getInstance();
        LocalTime lt = LocalTime.now();
        LocalTime lt2 = lt.plusHours(1);

        Invite i = new Invite(getNewDummyUserTwo(),InviteStatus.PENDING);
        Invite i2 = new Invite(getNewDummyUserThree(),InviteStatus.PENDING);

        Set<Invite> set = new HashSet<>();
        set.add(i);
        set.add(i2);

        Meetings m = new Meetings(c,lt,lt2,set,true,getNewDummyUser());
        Assert.assertTrue(m.cancelMeeting());
    }

    @Test
    public void CalendarDate(){
        Calendar c = Calendar.getInstance();
        LocalTime lt = LocalTime.now();
        LocalTime lt2 = lt.plusHours(1);

        Invite i = new Invite(getNewDummyUserTwo(),InviteStatus.PENDING);
        Invite i2 = new Invite(getNewDummyUserThree(),InviteStatus.PENDING);

        Set<Invite> set = new HashSet<>();
        set.add(i);
        set.add(i2);

        Meetings m = new Meetings(c,lt,lt2,set,true,getNewDummyUser());
        Assert.assertEquals(c, m.Calendardate());
    }

    @Test
    public void startLocalTime(){
        Calendar c = Calendar.getInstance();
        LocalTime lt = LocalTime.now();
        LocalTime lt2 = lt.plusHours(1);

        Invite i = new Invite(getNewDummyUserTwo(),InviteStatus.PENDING);
        Invite i2 = new Invite(getNewDummyUserThree(),InviteStatus.PENDING);

        Set<Invite> set = new HashSet<>();
        set.add(i);
        set.add(i2);

        Meetings m = new Meetings(c,lt,lt2,set,true,getNewDummyUser());
        Assert.assertEquals(lt, m.startLocalTime());
    }

    @Test
    public void endLocalTime(){
        Calendar c = Calendar.getInstance();
        LocalTime lt = LocalTime.now();
        LocalTime lt2 = lt.plusHours(1);

        Invite i = new Invite(getNewDummyUserTwo(),InviteStatus.PENDING);
        Invite i2 = new Invite(getNewDummyUserThree(),InviteStatus.PENDING);

        Set<Invite> set = new HashSet<>();
        set.add(i);
        set.add(i2);

        Meetings m = new Meetings(c,lt,lt2,set,true,getNewDummyUser());
        Assert.assertEquals(lt2, m.endLocalTime());
    }

    @Test
    public void aceptRejectInvitees(){
        Calendar c = Calendar.getInstance();
        LocalTime lt = LocalTime.now();
        LocalTime lt2 = lt.plusHours(1);

        Invite i = new Invite(getNewDummyUserTwo(),InviteStatus.PENDING);
        Invite i2 = new Invite(getNewDummyUserThree(),InviteStatus.PENDING);

        Set<Invite> set = new HashSet<>();
        set.add(i);
        set.add(i2);

        Set<Invite> set1 = new HashSet<>();
        set1.add(i);
        set1.add(i2);

        Meetings m = new Meetings(c,lt,lt2,set,false,getNewDummyUser());
        Meetings m2 = new Meetings(c,lt,lt2,set1,false,getNewDummyUserTwo());
        m2.aceptRejectMeeting(InviteStatus.ACCEPT,getNewDummyUserTwo());
        Assert.assertNotEquals(m,m2);
    }

}
