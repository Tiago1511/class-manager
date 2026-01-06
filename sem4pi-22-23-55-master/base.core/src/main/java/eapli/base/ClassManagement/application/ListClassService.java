package eapli.base.ClassManagement.application;

import eapli.base.ClassManagement.application.repositories.ClassRepository;
import eapli.base.ClassManagement.domain.Class;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.repositories.CourseRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

public class ListClassService {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final ClassRepository classRepository = PersistenceContext.repositories().classes();


    public Iterable<Class> allClasses() {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.ADMIN, BaseRoles.POWER_USER);
        return this.classRepository.allClasses();

    }
}
