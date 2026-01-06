package eapli.base.ClassManagement.domain;

import eapli.base.ClassManagement.application.repositories.ClassRepository;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.framework.domain.model.DomainFactory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalTime;
import java.util.Calendar;

public class ClassExtraBuilder implements DomainFactory<Class> {
    private Course course;
    private ClassExtra theClass;
    private int code;
    private Teacher teacherLecturing;
    private int duration;
    private Calendar startingDate;
    private String description;
    private LocalTime time;
    private LocalTime endingTime;
    private int dayOfWeek;
    private Calendar todaysDate = Calendar.getInstance();
    private final ClassRepository classRepository = PersistenceContext.repositories().classes();



    private ClassExtra buildOrThrow() {
        if (theClass != null) {
            return theClass;
        }
        if ((course != null) && (description != null) /* && teacherLecturing*/ /*&& duration != null */ && (startingDate != null) && (time != null) && (endingTime != null) && startingDate.after(todaysDate) && !CheckClass(course, code, description, teacherLecturing, startingDate, duration, /*finishingDate,*/ time, endingTime)){
            theClass = new ClassExtra(course, description, teacherLecturing, startingDate, /*finishingDate,*/ time, endingTime);
            return theClass;
        }
         else {
             if (!CheckClass(course, code, description, teacherLecturing, startingDate, duration, /*finishingDate,*/ time, endingTime)){
                 System.out.printf("ERROR:  THERE IS A CLASS HAPPENING AT THAT TIME, PLEASE GIVE ANOTHER DATE AND/OR TIME");
             }
            //throw new IllegalStateException();
            return null;
        }

    }

    @Override
    public ClassExtra build() {
        final ClassExtra classs = buildOrThrow();
        theClass = null;
        return classs;
    }

    public ClassExtraBuilder course(final Course course) {
        this.course = course;
        return this;
    }

    public ClassExtraBuilder code(int code) {
        this.code = code;
        return this;
    }

    public ClassExtraBuilder description(String description) {
        this.description = description;
        return this;
    }

    public ClassExtraBuilder teacher(Teacher teacher) {
        this.teacherLecturing = teacher;
        return this;
    }

    public ClassExtraBuilder duration(int duration){
        this.duration = duration;
        return this;
    }

    public ClassExtraBuilder stratingDate(Calendar startingDate){
        this.startingDate = startingDate;
        return this;
    }

    public ClassExtraBuilder startingTime(LocalTime startingTime) {
        this.time = startingTime;
        return this;
    }

    public ClassExtraBuilder dayOfTheWeek(int dayOfTheWeek) {
        this.dayOfWeek = dayOfTheWeek;
        return this;
    }

    public ClassExtraBuilder endingTime(LocalTime endingTime) {
        this.endingTime = endingTime;
        return this;
    }

    public boolean CheckClass(Course course, int code, String description, Teacher teacherLecturing,Calendar startingDate, int duration, /*finishingDate,*/LocalTime time,LocalTime endingTime){
        return  classRepository.checkClass(new ClassExtra(course, description, teacherLecturing, startingDate, /*finishingDate,*/ time, endingTime)).iterator().hasNext();
    }
}
