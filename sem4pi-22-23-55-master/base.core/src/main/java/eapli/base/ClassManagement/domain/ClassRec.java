package eapli.base.ClassManagement.domain;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.teacherManagement.domain.Teacher;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Calendar;

@Entity
@DiscriminatorValue("CLASSREC")
public class ClassRec extends Class{
    @Column
    @Temporal(TemporalType.DATE)
    private Calendar finishingDate;

    public ClassRec(){}

    public ClassRec(Course course, String description, Teacher teacherLecturing, Calendar startingDate, Calendar finishingDate, LocalTime startingTime, LocalTime endingTime) {
        super(course, description, teacherLecturing, startingDate, startingTime, endingTime);
        this.finishingDate = finishingDate;
    }

    public ClassRec(Course course, int code, String description, Teacher teacherLecturing, int duration, Calendar startingDate, Calendar finishingDate, LocalTime startingTime, LocalTime endingTime) {
        super(course, description, teacherLecturing, startingDate, startingTime, endingTime);
        this.finishingDate = finishingDate;
    }

    public Calendar finishingDate() {
        return finishingDate;
    }
}
