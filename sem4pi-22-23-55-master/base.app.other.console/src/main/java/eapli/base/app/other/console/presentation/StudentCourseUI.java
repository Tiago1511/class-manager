package eapli.base.app.other.console.presentation;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.requestManagement.application.EnrollmentRequestController;
import eapli.framework.presentation.console.AbstractUI;

import java.util.Scanner;

public class StudentCourseUI extends AbstractUI {

    private final EnrollmentRequestController enrollmentRequestController= new EnrollmentRequestController();
    @Override
    protected boolean doShow() {
        System.out.println("Insert Mecanographic Number:");
        Scanner scanner = new Scanner(System.in);
        String mecanographicNumber = scanner.nextLine();
        // Retrieve the open courses from the repository
        CourseRepository courseRepository = PersistenceContext.repositories().courses();
        Iterable<Course> openCourses = courseRepository.enrollCourses();

        // Display the open courses to the student
        System.out.println("Open Courses:");
        int option = 1;
        for (Course course : openCourses) {
            System.out.println(option + ". " + course.title());
            option++;
        }
        return false;
    }

    @Override
    public String headline() {
        return "Student Course List >";
    }
}
