package eapli.base.coursemanagement.application;

import eapli.base.coursemanagement.application.viadto.CourseDTOParser;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.Status;
import eapli.base.coursemanagement.dto.CourseDTO;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.validations.Preconditions;

@UseCaseController
public class CloseCourseController {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final ListCourseService svc = new ListCourseService();

    private final CourseRepository courseRepository = PersistenceContext.repositories().courses();

    private final Status STATUS = Status.CLOSED;

    public Course closeCourse(Course course) {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.ADMIN, BaseRoles.POWER_USER);
        Preconditions.nonNull(course);

        course.status(STATUS);

        return courseRepository.save(course);
    }

    public Iterable<Course> status() {
        return svc.progressCourses();
    }
}
