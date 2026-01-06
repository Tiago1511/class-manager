package eapli.base.app.backoffice.console.presentation.course;

import eapli.base.coursemanagement.application.AddTeacherController;
import eapli.base.coursemanagement.dto.CourseDTO;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("java:S106")
public class AddTeacherUI extends AbstractUI {

    private static final Logger LOGGER = LogManager.getLogger(OpenCourseUI.class);
    private final AddTeacherController theController = new AddTeacherController();
    @Override
    protected boolean doShow() {
        final Iterable<CourseDTO> course = this.theController.course();

        Teacher teacher;

        final SelectWidget<CourseDTO> selector = new SelectWidget<>("Courses:", course, new CourseDTOPrinter());

        final Set<Teacher> teachers = new HashSet<>();

        selector.show();

        if (selector.selectedOption() == 0) {
            System.out.println("No course selected");
            return false;
        }

        final CourseDTO theCourse = selector.selectedElement();

        if (theCourse == null) {
            return false;
        }

        do {
            teacher = selectTeacher();
            if (teacher != null) {
                teachers.add(teacher);
            }
        } while (teacher != null);

        if (teachers.size() == 0) {
            System.out.println("No teachers selected");
            return false;
        }

        try{
            /*for (TeacherDTO teacherDTO : teachers) {
                this.theController.addTeacherCourse(theCourse, teacherDTO);
            }*/
            this.theController.addTeacherCourse(theCourse, teachers);
        }catch (@SuppressWarnings("unused") final ConcurrencyException ex) {
            System.out.println(
                    "WARNING: It is not possible to add teachers to the course because it has been changed by another user");
        } catch (final IntegrityViolationException ex) {
            LOGGER.error("Error performing the operation", ex);
            System.out.println(
                    "Unfortunatelly there was an unexpected error in the application. Please try again and if the problem persists, contact your system admnistrator.");
        }

        return false;
    }

    private Teacher selectTeacher() {
        final Iterable<Teacher> teacher = this.theController.teachers();
        final SelectWidget<Teacher> selectorTeacher = new SelectWidget<>("Teacher :", teacher, new TeacherPrinter());

        selectorTeacher.show();

        if (selectorTeacher.selectedOption() == 0) {
            return null;
        }

        final Teacher theTeacher = selectorTeacher.selectedElement();

        return theTeacher;
    }

    @Override
    public String headline() {
        return "Add Teacher";
    }
}
