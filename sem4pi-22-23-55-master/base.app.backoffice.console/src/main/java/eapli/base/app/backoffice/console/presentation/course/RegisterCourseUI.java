package eapli.base.app.backoffice.console.presentation.course;


import eapli.base.coursemanagement.application.RegisterCourseController;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

@SuppressWarnings("squid:S106")
public class RegisterCourseUI extends AbstractUI {

    private final RegisterCourseController theController = new RegisterCourseController(AuthzRegistry.authorizationService(), PersistenceContext.repositories().courses());

    @Override
    protected boolean doShow() {
        final String code = Console.readLine("Course Code:");
        final String title = Console.readLine("Course Title:");
        final String description = Console.readLine("Course Description:");
        final Integer minCapacity = Console.readInteger( "Minimum Capacity");
        final Integer maxCapacity = Console.readInteger( "Maximum Capacity");

        try {
            //this.theController.registerCourse(code, title, description);
            this.theController.registerCourse(code, title, description, minCapacity, maxCapacity);

        } catch (@SuppressWarnings("unused") final Exception e) {
            System.out.printf(e.getMessage());
            //System.out.println("That code is already in use.");
        }

        return false;
    }

    @Override
    public String headline() {
        return "Register Course";
    }
}
