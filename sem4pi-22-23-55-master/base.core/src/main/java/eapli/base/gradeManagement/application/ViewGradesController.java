package eapli.base.gradeManagement.application;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.examManagement.domain.NormalExamDomain.Exam;
import eapli.base.examManagement.repositories.ExamRepository;
import eapli.base.gradeManagement.domain.Grade;
import eapli.base.gradeManagement.repositories.GradeRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.studentCourseManagment.repositories.StudentRepository;
import eapli.base.studentManagement.domain.Student;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ViewGradesController {
    private static GradeRepository gradeRepository = PersistenceContext.repositories().grades();
    private static CourseRepository courseRepository = PersistenceContext.repositories().courses();
    private static ExamRepository examRepository = PersistenceContext.repositories().exams();

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final SystemUser systemUser = (authz.session().get().authenticatedUser());


    public List<Grade> grades(Exam exam) {
        return (List<Grade>) gradeRepository.examGrades(exam);
    }


    public Course courseDisplay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select a course");
        Iterable<Course> courses = courseRepository.findAll();
        int option = 1;
        for (Course c : courses) {
            System.out.println(option +"." + c.title());
            option++;
        }
        int selectedOption = sc.nextInt();

        Course selectedCourse = null;
        option = 1;
        for (Course c : courses) {
            if (option == selectedOption) {
                selectedCourse = c;
                break;
            }
            option++;
        }
        return selectedCourse;
    }

    public Exam examDisplay(Course course) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select an exam");
        Iterable<Exam> exams = examRepository.courseExams(course);
        int option = 1;
        for (Exam e : exams) {
            System.out.println(option + e.getTitle());
            option++;
        }
        int selectedOption = sc.nextInt();

        Exam selectedExam = null;
        option = 1;
        for (Exam e : exams) {
            if (option == selectedOption) {
                selectedExam = e;
                break;
            }
            option++;
        }
        return selectedExam;
    }
}
