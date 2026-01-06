package eapli.base.coursemanagement.application;


import eapli.base.coursemanagement.domain.Capacity;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.CourseBuilder;
import eapli.base.coursemanagement.domain.Status;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;

@UseCaseController
public class RegisterCourseController {

    private final AuthorizationService authz;
    private final CourseRepository repository;

    public RegisterCourseController(final AuthorizationService authz, final CourseRepository repository) {
        // dependency injection - to make this object more testable we don't create the
        // infrastructure objects to avoid coupling to the implementation. This way, the controller
        // can be used in different scenarios with different implementations of the repository. for
        // instance, unit testing.
        this.authz = authz;
        this.repository = repository;
    }

    /*public Course registerCourse(String code, String name, String description) {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER,
                BaseRoles.ADMIN);

        final Course newCourse = new Course(code, name, description);
        return repository.save(newCourse);
    }

    public Course registerCourse(String code, String title, String description, Integer minCapacity, Integer maxCapacity ) {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER,
                BaseRoles.ADMIN);

        final Course newCourse = new Course(title, code, description, new Capacity(minCapacity, maxCapacity));
        return repository.save(newCourse);
    }*/

    public Course registerCourse(String code, String title, String description, Integer minCapacity, Integer maxCapacity ) {
        return registerCourse(code, title, description, minCapacity, maxCapacity, Status.CLOSE);
    }
    public Course registerCourse(final String code, final String title, final String description, final Integer minCapacity, final Integer maxCapacity, final Status status) {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.ADMIN, BaseRoles.POWER_USER);

        final var newCourse = new CourseBuilder().code(code).title(title).description(description).capacity(new Capacity(minCapacity,maxCapacity)).status(status).build();

        if (newCourse == null) {
            return null;
        }

        return repository.save(newCourse);
    }

}
