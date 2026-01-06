package eapli.base.app.backoffice.console.presentation.enrollStudents;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.studentCourseManagment.application.EnrollStudentsController;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.List;

public class EnrollStudentsUI extends AbstractUI {

    EnrollStudentsController controller = new EnrollStudentsController();
    @Override
    protected boolean doShow() {

        int index= Console.readInteger("\nSelect Course: ")-1;

        //controller.selectCourse();

        Course course = controller.courseList().get(index);

        String path = Console.readLine("Write file path ");
        try {
            controller.addStudentList(new File(path), course);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public String headline() {
        return "Title";
    }


}
