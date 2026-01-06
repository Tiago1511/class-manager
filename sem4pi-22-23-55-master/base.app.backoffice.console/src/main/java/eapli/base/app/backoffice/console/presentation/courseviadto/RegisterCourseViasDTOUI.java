package eapli.base.app.backoffice.console.presentation.courseviadto;

import eapli.base.app.backoffice.console.presentation.course.TeacherPrinterDTO;
import eapli.base.coursemanagement.application.viadto.RegisterCourseViasDTOController;
import eapli.base.coursemanagement.dto.CourseDTO;
import eapli.base.teacherManagement.dto.TeacherDTO;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

public class RegisterCourseViasDTOUI extends AbstractUI {

    private final RegisterCourseViasDTOController theController = new RegisterCourseViasDTOController();

    @Override
    protected boolean doShow() {
        final Iterable<TeacherDTO> headTeacher = this.theController.teacher();

        final SelectWidget<TeacherDTO> selector = new SelectWidget<>("Head Teacher:", headTeacher,
                new TeacherPrinterDTO());

        selector.show();
        final TeacherDTO theHeadTeacher = selector.selectedElement();

        if (selector.selectedOption() == 0) {
            return false;
        }

        final String code = Console.readLine("Course Code:");
        final String title = Console.readLine("Course Title:");
        final String description = Console.readLine("Course Description:");
        final String edition = Console.readLine("Course Edition:");
        final Integer minCapacity = Console.readInteger( "Minimum Capacity");
        final Integer maxCapacity = Console.readInteger( "Maximum Capacity");

        try {
            final var course = new CourseDTO(code, title, edition, description, minCapacity, maxCapacity, "CLOSE", theHeadTeacher.getAcronym(), theHeadTeacher.getTaxNumber());

            this.theController.registerCourse(course);

        } catch (@SuppressWarnings("unused") final Exception e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    @Override
    public String headline() {
        return "Register Course";
    }
}
