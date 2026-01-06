package eapli.base.examManagement.application;

import eapli.base.examManagement.repositories.ExamRepository;
import eapli.base.gradeManagement.repositories.GradeRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.studentCourseManagment.repositories.StudentRepository;
import eapli.base.studentManagement.domain.Student;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

public class FutureExamsController {
    private ExamRepository examRepository= PersistenceContext.repositories().exams();
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final SystemUser systemUser = (authz.session().get().authenticatedUser());

    private final StudentRepository studentRepository= PersistenceContext.repositories().students();
    private Student student = studentRepository.findBySystemUser(systemUser).iterator().next();

    public void futureGrades(){
        System.out.println(examRepository.findAll());
    }
}
