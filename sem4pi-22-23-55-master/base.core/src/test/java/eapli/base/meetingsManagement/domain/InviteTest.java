package eapli.base.meetingsManagement.domain;


import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.domain.model.*;
import org.junit.Assert;
import org.junit.Test;

public class InviteTest {

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

    @Test
    public void compareState(){
        Invite i = new Invite(getNewDummyUser(),InviteStatus.PENDING);
        Assert.assertEquals(i.inviteStatus(),InviteStatus.PENDING);
    }

    @Test
    public void failCompareState(){
        Invite i = new Invite(getNewDummyUser(),InviteStatus.PENDING);
        Assert.assertNotEquals(i.inviteStatus(),InviteStatus.REJECT);
    }

    @Test
    public void returnUser(){
        Invite i = new Invite(getNewDummyUser(),InviteStatus.PENDING);
        Assert.assertEquals(i.systemUser(),getNewDummyUser());
    }

    @Test
    public void failreturnUser(){
        Invite i = new Invite(getNewDummyUser(),InviteStatus.PENDING);
        Assert.assertNotEquals(i.systemUser(),getNewDummyUserTwo());
    }

    @Test
    public void returnInviteAsString(){
        Invite i = new Invite(getNewDummyUser(),InviteStatus.PENDING);
        Assert.assertEquals("PENDING",i.inviteStatusString());
    }

    @Test
    public void failReturnInviteAsString(){
        Invite i = new Invite(getNewDummyUser(),InviteStatus.PENDING);
        Assert.assertNotEquals("ACCEPT",i.inviteStatusString());
    }
}
