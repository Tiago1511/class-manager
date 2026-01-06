package eapli.base.ClassManagement.application.viaDTO;

import eapli.base.ClassManagement.DTO.ClassDTO;
import eapli.base.ClassManagement.application.repositories.ClassRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

public class RegisterClassViaDTOController {
    private final AuthorizationService auth = AuthzRegistry.authorizationService();
    private final ClassRepository classRepository = PersistenceContext.repositories().classes();

    public ClassDTO registerClass(final ClassDTO dto) {
        auth.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.ADMIN, BaseRoles.TEACHER);

        final var newClass = new ClassDTOParser().valueOf(dto);
        return null;
        //once the repository is having an error, this code doesn't run
        //return classRepository.save(newClass).toDTO();
    }
}
