package eapli.base.meetingsManagement.domain;

import org.junit.Assert;
import org.junit.Test;
public class InviteStatusTest {

    @Test
    public void status(){
        InviteStatus inviteStatus = InviteStatus.ACCEPT;
        Assert.assertEquals(InviteStatus.ACCEPT, inviteStatus.status());
    }

    @Test
    public void failStatus(){
        InviteStatus inviteStatus = InviteStatus.ACCEPT;
        Assert.assertNotEquals(InviteStatus.PENDING, inviteStatus.status());
    }

    @Test
    public void pending(){
        InviteStatus inviteStatus = InviteStatus.PENDING;
        Assert.assertEquals(InviteStatus.PENDING, inviteStatus.pending());
    }

    @Test
    public void FailPending(){
        InviteStatus inviteStatus = InviteStatus.PENDING;
        Assert.assertNotEquals(InviteStatus.REJECT, inviteStatus.pending());
    }

    @Test
    public void isPending(){
        InviteStatus inviteStatus = InviteStatus.PENDING;
        Assert.assertTrue(inviteStatus.isPending());
    }

    @Test
    public void FailIsPending(){
        InviteStatus inviteStatus = InviteStatus.ACCEPT;
        Assert.assertFalse(inviteStatus.isPending());
    }

    @Test
    public void accepted(){
        InviteStatus inviteStatus = InviteStatus.ACCEPT;
        Assert.assertTrue(inviteStatus.accepted());
    }

    @Test
    public void FailAccepted(){
        InviteStatus inviteStatus = InviteStatus.PENDING;
        Assert.assertFalse(inviteStatus.accepted());
    }

    @Test
    public void rejected(){
        InviteStatus inviteStatus = InviteStatus.REJECT;
        Assert.assertTrue(inviteStatus.rejected());
    }

    @Test
    public void FailRejected(){
        InviteStatus inviteStatus = InviteStatus.PENDING;
        Assert.assertFalse(inviteStatus.rejected());
    }

    @Test
    public void testToString(){
        InviteStatus inviteStatus = InviteStatus.ACCEPT;
        Assert.assertEquals("ACCEPT", inviteStatus.toString());
    }
}
