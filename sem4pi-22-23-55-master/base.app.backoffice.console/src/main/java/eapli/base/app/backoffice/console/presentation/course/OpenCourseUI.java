package eapli.base.app.backoffice.console.presentation.course;

import eapli.base.coursemanagement.application.OpenCourseController;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.dto.CourseDTO;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OpenCourseUI extends AbstractUI {

    private static final Logger LOGGER = LogManager.getLogger(OpenCourseUI.class);
    private final OpenCourseController theController = new OpenCourseController();

        @Override
        protected boolean doShow() {
            final Iterable<Course> status = this.theController.status();
            final SelectWidget<Course> selector = new SelectWidget<>("Courses:", status, new CoursePrinter());

            selector.show();


             if (selector.selectedOption() == 0) {
                return false;
             }

            //final Course theCourse2 = selector.selectedElement().toEntity();
            final Course theCourse = selector.selectedElement();

            if (theCourse == null) {
                return false;
            }

            /*if (theCourse2 == null) {
                return false;
            }*/

            try{
                this.theController.openCourse(theCourse);
                //this.theController.openCourse(theCourse2);
            } catch (@SuppressWarnings("unused") final ConcurrencyException ex) {
                System.out.println(
                        "WARNING: It is not possible to change the course state because it was changed by another user");
            } catch (final IntegrityViolationException ex) {
                LOGGER.error("Error performing the operation", ex);
                System.out.println(
                        "Unfortunatelly there was an unexpected error in the application. Please try again and if the problem persists, contact your system admnistrator.");
            }

            return true;
        }

        @Override
        public String headline() {
            return "Open Course";
        }
}
