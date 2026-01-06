package eapli.base.app.other.console.presentation.grades;

import eapli.base.examManagement.application.StudentGradesController;
import eapli.framework.presentation.console.AbstractUI;

public class StudentGradesUI extends AbstractUI {

    private static final StudentGradesController gradesController= new StudentGradesController();

    @Override
    protected boolean doShow() {

        if (gradesController.grades().isEmpty()) System.out.println("No exam performed.");

        System.out.println(gradesController.grades());
        return false;
    }


    @Override
    public String headline() {
        return "Students Grades >";
    }

}
