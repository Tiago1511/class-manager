package eapli.base.app.other.console.presentation.exam;

import eapli.base.coursemanagement.application.AvailableCoursesController;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.examManagement.application.ExamRealizationController;
import eapli.base.examManagement.domain.NormalExamDomain.Exam;
import eapli.base.gradeManagement.domain.Grade;
import eapli.framework.presentation.console.AbstractUI;


public class ExamRealizationUI extends AbstractUI {

    private static ExamRealizationController examRealizationController = new ExamRealizationController();
    private AvailableCoursesController coursesController = new AvailableCoursesController();


    @Override
    protected boolean doShow() {
        Course course = examRealizationController.selectCourse(coursesController.courseList());
        //String path = Console.readLine("Write file absolute path:");

        Exam exam = examRealizationController.selectExam();

        examRealizationController.examRealizationVisitor(exam.getExamContent());

        System.out.printf("\nExam Grade: "+examRealizationController.getScore().toString()+"\n");

        if (examRealizationController.saveExamGrade(new Grade(exam,examRealizationController.getScore(), examRealizationController.getStudent()))){
            System.out.println("Exam Finalization");
        }else System.out.println("");

        return false;
    }

    @Override
    public String headline() {
        return "Exam Realization >";
    }
}
