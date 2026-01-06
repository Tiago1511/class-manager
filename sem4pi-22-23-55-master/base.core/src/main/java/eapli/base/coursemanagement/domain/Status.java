package eapli.base.coursemanagement.domain;


import eapli.framework.domain.model.ValueObject;
public enum Status implements ValueObject{
    CLOSE, OPEN, ENROLL, PROGRESS, CLOSED;

    Status() {

    }
    public Status status() {
        return this;
    }

    public Status open() {
        return OPEN;
    }

    public boolean isClose() {
        return this == CLOSE;
    }

    public boolean isProgress() {
        return this == PROGRESS;
    }

    public boolean openCourses() {
        return this == OPEN;
    }

    public boolean enrollCourses() {
        return this == ENROLL;
    }

    @Override
    public String toString(){
        return this.name();
    }
}
