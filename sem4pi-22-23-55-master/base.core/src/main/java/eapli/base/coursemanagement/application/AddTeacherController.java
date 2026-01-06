package eapli.base.coursemanagement.application;

import eapli.base.coursemanagement.application.viadto.CourseDTOParser;
import eapli.base.coursemanagement.domain.Capacity;
import eapli.base.coursemanagement.domain.CourseBuilder;
import eapli.base.coursemanagement.domain.Edition;
import eapli.base.coursemanagement.domain.Status;
import eapli.base.coursemanagement.dto.CourseDTO;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.base.teacherManagement.dto.TeacherDTO;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.validations.Preconditions;

import java.util.Optional;
import java.util.Set;

@UseCaseController
public class AddTeacherController {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final ListTeacherService svc = new ListTeacherService();

    private final ListCourseService svc2 = new ListCourseService();

    private final CourseRepository courseRepository = PersistenceContext.repositories().courses();

    public CourseDTO addTeacherCourse(CourseDTO dto, TeacherDTO teacherDTO) {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.ADMIN, BaseRoles.POWER_USER);
        Preconditions.nonNull(dto);

        final var course = new CourseDTOParser().valueOf(dto);

        return courseRepository.save(course).toDTO();
    }

    public CourseDTO addTeacherCourse(CourseDTO dto, Set<Teacher> teachers) {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.ADMIN, BaseRoles.POWER_USER);
        Preconditions.nonNull(dto);

        //final var course = new CourseParser().valueOf(dto);
        final Teacher teacher = teachersDTO(dto);
        final var course = new CourseBuilder().ofType(teacher).code(dto.code).title(dto.title).edition(new Edition(dto.edition)).description(dto.description).capacity(new Capacity(dto.minCapacity, dto.maxCapacity)).status(Status.valueOf(dto.status)).teacher(teachers).build();

        return courseRepository.save(course).toDTO();
    }

    public Iterable<Teacher> teachers() {
        return svc.allTeachers();
    }

    public Teacher teachersDTO(CourseDTO dto) {
        Optional<Teacher> teacher = svc.teacher(dto.getAcronym());
        // pegar no theacher do Optional<Teacher>
        return teacher.get();
    }

    public Iterable<CourseDTO> course() {
        return svc2.allCourses();
    }
}
