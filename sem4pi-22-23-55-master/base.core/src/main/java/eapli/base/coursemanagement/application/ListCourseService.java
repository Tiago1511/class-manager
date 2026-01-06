package eapli.base.coursemanagement.application;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.dto.CourseDTO;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.ApplicationService;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@ApplicationService
public class  ListCourseService {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final CourseRepository courseRepository = PersistenceContext.repositories().courses();

    private Iterable<CourseDTO> transformToDTO(final Iterable<Course> types) {
        return StreamSupport.stream(types.spliterator(), true)
                .map(Course::toDTO).collect(Collectors.toUnmodifiableList());
    }

    public Iterable<Course>  closeCourses() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.ADMIN, BaseRoles.POWER_USER);
        return this.courseRepository.closeCourses();
    }

    public Iterable<Course> progressCourses() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.ADMIN, BaseRoles.POWER_USER);
        return this.courseRepository.progressCourses();
    }

    public Iterable<Course> openCourses() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.ADMIN, BaseRoles.POWER_USER);
        return this.courseRepository.openCourses();
    }

    public Iterable<Course> enrollCourses() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.ADMIN, BaseRoles.POWER_USER);
        return this.courseRepository.enrollCourses();
    }

    public Iterable<CourseDTO> allCourses() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.ADMIN, BaseRoles.POWER_USER);
        return transformToDTO(this.courseRepository.findAll());
    }
}
