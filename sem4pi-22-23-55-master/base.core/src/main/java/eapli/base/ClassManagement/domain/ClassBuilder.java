package eapli.base.ClassManagement.domain;

import eapli.base.clientusermanagement.application.AcceptRefuseSignupFactory;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.framework.domain.model.DomainFactory;

import java.time.LocalTime;
import java.util.Calendar;

public class ClassBuilder implements DomainFactory<Class> {
    private Course course;
    private ClassRec theClass;
    private int code;
    private String description;
    private Teacher teacherLecturing;
    //private int duration;
    private Calendar startingDate;
    private Calendar finishingDate;
    private LocalTime startingTime;
    private LocalTime endingTime;
    private Calendar todaysDate = Calendar.getInstance();

    private ClassRec buildOrThrow() {
        if (theClass != null) {
            return theClass;
        }
        if ((course != null) && (description != null) /* && teacherLecturing*/ /*&& duration != null */ && (startingDate != null) && (finishingDate != null) && (startingTime != null) && (endingTime != null) && (finishingDate.after(startingDate) && startingDate.after(todaysDate))){
            theClass = new ClassRec(course, description, teacherLecturing, startingDate, finishingDate, startingTime/*, dayOfWeek*/, endingTime);
            return theClass;
        }
        else {
            throw new IllegalStateException();
        }
    }

    @Override
    public ClassRec build() {
        final ClassRec classs = buildOrThrow();
        theClass = null;
        return classs;
    }

    public ClassBuilder course(final Course course) {
        this.course = course;
        return this;
    }

    public ClassBuilder code(int code) {
        this.code = code;
        return this;
    }

    public ClassBuilder description(String description) {
        this.description = description;
        return this;
    }

    public ClassBuilder teacher(Teacher teacher) {
        this.teacherLecturing = teacher;
        return this;
    }


    public ClassBuilder finishingDate(Calendar finishingDate){
        this.finishingDate= finishingDate;
        return this;
    }

    public ClassBuilder stratingDate(Calendar startingDate){
        this.startingDate = startingDate;
        return this;
    }

    public ClassBuilder startingTime(LocalTime startingTime) {
        this.startingTime = startingTime;
        return this;
    }

    public ClassBuilder endingTime(LocalTime endingTime) {
        this.endingTime = endingTime;
        return this;
    }
}
