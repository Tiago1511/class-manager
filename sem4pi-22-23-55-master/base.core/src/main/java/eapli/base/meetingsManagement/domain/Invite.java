package eapli.base.meetingsManagement.domain;

import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import javax.persistence.*;
import java.io.Serializable;

/**Converter para @Entety
 * ver o slaide Embeddable
 * consiste em criar mais uma classe @Embeddable com o id da reunião e o id do utilizador
 * nesta classe ficaria como @EmbeddableId o topico de cima
 * pode ser preciso implementar o Serializable
 */

@Embeddable
public class Invite{

    /**
     * status of the invite
     */
    @Enumerated(EnumType.STRING)
    private InviteStatus inviteStatus;

    /**
     * meeting guest
     */
    @ManyToOne
    private SystemUser systemUser;


    protected Invite() {}

    /**
     * constructor
     * @param systemUser meeting guest
     * @param inviteStatus status of the invite
     */
    public Invite(SystemUser systemUser, InviteStatus inviteStatus) {
        this.systemUser = systemUser;
        this.inviteStatus = inviteStatus;
    }

    public InviteStatus inviteStaus( InviteStatus inviteStatus){
        return this.inviteStatus = inviteStatus;
    }

    public SystemUser systemUser(){
        return this.systemUser;
    }

    public InviteStatus inviteStatus(){
        return this.inviteStatus;
    }

    public String inviteStatusString(){
        return this.inviteStatus.toString();
    }

    public void aceptRejectMeeting(InviteStatus inviteStatus) {
        this.inviteStatus = inviteStatus;
    }
}
