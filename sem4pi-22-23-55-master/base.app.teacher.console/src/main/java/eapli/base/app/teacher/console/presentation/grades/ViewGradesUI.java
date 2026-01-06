package eapli.base.app.teacher.console.presentation.grades;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.examManagement.domain.NormalExamDomain.Exam;
import eapli.base.gradeManagement.application.ViewGradesController;
import eapli.framework.actions.Action;

public class ViewGradesUI implements Action {

    ViewGradesController viewGradesController = new ViewGradesController();


    @Override
    public boolean execute() {
        Course selectedCourse = viewGradesController.courseDisplay();
        Exam selectedExam = viewGradesController.examDisplay(selectedCourse);

        if (viewGradesController.grades(selectedExam).isEmpty()) System.out.println("No exam performed.");

        else {
            System.out.println(viewGradesController.grades(selectedExam));
        }
        return false;
    }
}
