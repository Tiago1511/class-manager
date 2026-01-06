package eapli.base.studentCourseManagment.application;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.studentCourseManagment.domain.EnrollStudents;
import eapli.framework.domain.repositories.TransactionalContext;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class EnrollStudentsController {

    private final TransactionalContext txCtx = PersistenceContext.repositories().newTransactionalContext();

    private CourseRepository courseRepository = PersistenceContext.repositories().courses(txCtx);

    private final EnrollStudents enrollStudents = new EnrollStudents();
    public void addStudentList(File file, Course course) throws IOException, ParseException {
        enrollStudents.addListToDatabase(file, course);
    }

    public List<Course> courseList(){
        return(List<Course>) courseRepository.enrollCourses();
    }

    public void selectCourse(){
        List<Course> courseList = courseList();
        System.out.printf("Title  \n");
        for (int i = 0; i < courseList.size(); i++) {
            System.out.printf("\n%d. %s  \n",i+1,courseList.get(i).toDTO().title);
        }
    }
}
