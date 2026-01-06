package eapli.base.requestManagement.domain;


import eapli.framework.domain.model.ValueObject;

public enum ERStatus implements ValueObject{
    PENDING, ACCEPTED, REJECTED;

    ERStatus() {

    }


    public ERStatus status() {
        return this;
    }

    public boolean isPending() {
        return this==PENDING;
    }

    public boolean isAccepted() {
        return this == ACCEPTED;
    }

    public boolean isRejected() {
        return this == REJECTED;
    }


    @Override
    public String toString(){
        return this.name();
    }
}
