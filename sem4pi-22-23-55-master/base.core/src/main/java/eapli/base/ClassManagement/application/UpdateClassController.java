package eapli.base.ClassManagement.application;

import eapli.base.ClassManagement.application.repositories.ClassRepository;
import eapli.base.ClassManagement.domain.Class;
import eapli.base.ClassManagement.domain.ClassExtra;
import eapli.base.ClassManagement.domain.ClassExtraBuilder;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teacherManagement.domain.Teacher;

import java.time.LocalTime;
import java.util.Calendar;

public class UpdateClassController {
    private final ClassRepository classRepository = PersistenceContext.repositories().classes();


    public Iterable<Class> classes() {
        return classRepository.findAll();
    }

    public void updateClass(Class aClass, LocalTime startingTime, LocalTime endingTime, Calendar startingDate, Teacher teacher) {
        if (!CheckClass(aClass.getCourse(),0,aClass.getDescription(),teacher,startingDate,0,startingTime,endingTime)){
            aClass.setStartingDate(startingDate);
            aClass.setStartingTime(startingTime);
            aClass.setEndingTime(endingTime);
            aClass.setTeacherLecturing(teacher);
            classRepository.save(aClass);
        } else {
            throw new IllegalArgumentException("Class already exists in that time.\n\n");
        }
    }

    private boolean CheckClass(Course course, int code, String description, Teacher teacherLecturing, Calendar startingDate, int duration, /*finishingDate,*/LocalTime time, LocalTime endingTime){
        return  classRepository.checkClass(new ClassExtra(course, description, teacherLecturing, startingDate, /*finishingDate,*/ time, endingTime)).iterator().hasNext();
    }
}
