package eapli.base.app.other.console.presentation;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.requestManagement.application.EnrollmentRequestController;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.presentation.console.AbstractUI;

import java.util.Scanner;

public class EnrollmentRequestUI extends AbstractUI {
    private final EnrollmentRequestController enrollmentRequestController;
    private final CourseRepository courseRepository;

    private final TransactionalContext txCtx = PersistenceContext.repositories().newTransactionalContext();

    public EnrollmentRequestUI() {
        this.enrollmentRequestController = new EnrollmentRequestController();
        this.courseRepository = PersistenceContext.repositories().courses();
    }

    @Override
    protected boolean doShow() {
        return false;
    }

    @Override
    public String headline() {
        return null;
    }

    public void displayEnrollmentRequestUI() {

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

        // Prompt the student to choose an option

        System.out.print("Choose an option: ");
        int selectedOption = scanner.nextInt();

        // Validate the selected option
        if (selectedOption < 1 || selectedOption > option - 1) {
            System.out.println("Invalid option. Exiting.");
            return;
        }

        // Retrieve the selected course
        Course selectedCourse = null;
        int currentOption = 1;
        for (Course course : openCourses) {
            if (currentOption == selectedOption) {
                selectedCourse = course;
                break;
            }
            currentOption++;
        }

        // Create the enrollment request
        enrollmentRequestController.registerNewRequest(mecanographicNumber,selectedCourse);

        System.out.println("Enrollment request created successfully.");
    }
}


