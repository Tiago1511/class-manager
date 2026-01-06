package eapli.base.coursemanagement.application.viadto;

import eapli.base.coursemanagement.application.ListTeacherService;
import eapli.base.coursemanagement.dto.CourseDTO;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teacherManagement.dto.TeacherDTO;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.UseCaseController;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

@UseCaseController
public class RegisterCourseViasDTOController {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final ListTeacherService svc = new ListTeacherService();
    private final CourseRepository courseRepository = PersistenceContext.repositories().courses();

    public CourseDTO registerCourse(final CourseDTO dto) {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN);

        //rever
        final var newCourse = new CourseDTOParser().valueOf(dto);

        return courseRepository.save(newCourse).toDTO();
    }

    public Iterable<TeacherDTO> teacher() {
        return svc.teachers();
    }
}
