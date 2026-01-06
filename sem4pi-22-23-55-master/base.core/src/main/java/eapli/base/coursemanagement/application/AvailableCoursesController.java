package eapli.base.coursemanagement.application;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;

import javax.sound.midi.Soundbank;
import java.util.List;

public class AvailableCoursesController {
    CourseRepository courseRepository= PersistenceContext.repositories().courses();


    public void selectCourse(){
        List<Course> courseList = courseList();
        System.out.printf("Title  \n");
        for (int i = 0; i < courseList.size(); i++) {
            System.out.printf("\n%d. %s  \n",i+1,courseList.get(i).toDTO().title);
        }
        if (courseList.isEmpty())
            System.out.printf("No Courses Available");
    }

    public List<Course> courseList(){
        //return(List<Course>) courseRepository.enrollCourses();
        System.out.println("Lembrar de mudar para enroll students");
        return (List<Course>) courseRepository.findAll();

    }

    public Iterable<Course> findAll(){
        return courseRepository.findAll();
    }
}
