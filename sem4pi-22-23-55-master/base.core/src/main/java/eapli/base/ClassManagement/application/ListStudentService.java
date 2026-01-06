package eapli.base.ClassManagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.studentCourseManagment.repositories.StudentRepository;
import eapli.framework.application.ApplicationService;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;

@ApplicationService
public class ListStudentService {
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final StudentRepository studentRepository = PersistenceContext.repositories().students();

    //needs part of the students

}
