package eapli.base.meetingsManagement.domain;

import eapli.framework.domain.model.ValueObject;

/**
 * The enum Invite status.
 */
public enum InviteStatus implements ValueObject {
    ACCEPT, PENDING, REJECT;

    InviteStatus() {

    }

    /**
     * Status invite status.
     *
     * @return the invite status
     */
    public InviteStatus status() {
        return this;
    }

    /**
     * Pending invite status.
     *
     * @return the invite status
     */
    public InviteStatus pending() {
        return PENDING;
    }

    /**
     * Pending boolean.
     *
     * @return true if the invitation status is pending, otherwise false
     */
    public boolean isPending() {
        return this == PENDING;
    }

    /**
     * Accepted boolean.
     *
     * @return true if the invitation status is accepted, otherwise false
     */
    public boolean accepted() {
        return this == ACCEPT;
    }

    /**
     * Rejected boolean.
     *
     * @return true if the invitation status is rejected, otherwise false
     */
    public boolean rejected() {
        return this == REJECT;
    }

    @Override
    public String toString(){
        return this.name();
    }
}