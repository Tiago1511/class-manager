package eapli.base.coursemanagement.application;


import eapli.base.coursemanagement.application.viadto.CourseDTOParser;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.CourseBuilder;
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
public class OpenCourseController {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final ListCourseService svc = new ListCourseService();

    private final Status STATUS = Status.OPEN;

    private final CourseRepository courseRepository = PersistenceContext.repositories().courses();

    public Course openCourse(Course course) {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.ADMIN, BaseRoles.POWER_USER);
        Preconditions.nonNull(course);


        course.status(STATUS);

        //final var courses = new CourseBuilder().ofType(course.).withAcronym(course.acronym()).withName(course.name()).withObjectives(course.objectives()).withCredits(course.credits()).withBibliography(course.bibliography()).withCoordinator(course.coordinator()).withScientificArea(course.scientificArea()).withStatus(STATUS).build(

        //final var course = new CourseDTOParser().valueOf(dto);

        return courseRepository.save(course);
    }

    public Iterable<Course> status() {
        return svc.closeCourses();
    }

    /*public Course openCourse(Course course) {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.ADMIN, BaseRoles.POWER_USER);
        if(course == null) {
            throw new IllegalArgumentException();
        }

        course.status(Status.OPEN);

        return courseRepository.save(course);
    }*/

}
