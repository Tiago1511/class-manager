package eapli.base.ClassManagement.domain;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.studentManagement.domain.Student;
import eapli.base.teacherManagement.domain.Teacher;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

@Entity
@DiscriminatorValue("CLASSEXTRA")
public class ClassExtra extends Class{

    @OneToMany
    private Set<Student> student = new HashSet<>();

    protected ClassExtra(){}
    public ClassExtra(Course course, String description, Teacher teacherLecturing, Calendar startingDate, LocalTime time, LocalTime endingTime) {
        super(course, description, teacherLecturing, startingDate, time, endingTime);
    }

    public ClassExtra(Course course, String description, Teacher teacherLecturing, Calendar startingDate, LocalTime time,LocalTime endingTime, Set<Student> student) {
        super(course, description, teacherLecturing, startingDate, time, endingTime);
        this.student= student;
    }
}
