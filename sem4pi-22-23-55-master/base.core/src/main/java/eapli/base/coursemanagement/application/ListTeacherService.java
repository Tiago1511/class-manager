package eapli.base.coursemanagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teacherManagement.domain.Acronym;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.base.teacherManagement.dto.TeacherDTO;
import eapli.base.teacherManagement.repositories.TeacherRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.application.ApplicationService;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


@ApplicationService
public class ListTeacherService {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final TeacherRepository teacherRepository = PersistenceContext.repositories().teachers();

    private Iterable<TeacherDTO> transformToDTO(final Iterable<Teacher> types) {
        return StreamSupport.stream(types.spliterator(), true)
                .map(Teacher::toDTO).collect(Collectors.toUnmodifiableList());
    }
        public Iterable<TeacherDTO> teachers() {
            authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.ADMIN, BaseRoles.POWER_USER);
            return transformToDTO(this.teacherRepository.findAll());
        }

    public Iterable<Teacher> allTeachers() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.ADMIN, BaseRoles.POWER_USER);
        return this.teacherRepository.findAll();
    }

    public Optional<Teacher> teacher(String acronym) {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.ADMIN, BaseRoles.POWER_USER);
        return this.teacherRepository.ofIdentity(new Acronym(acronym));
    }
}
