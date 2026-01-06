package eapli.base.examManagement.application;

import eapli.base.gradeManagement.domain.Grade;
import eapli.base.gradeManagement.repositories.GradeRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.studentCourseManagment.repositories.StudentRepository;
import eapli.base.studentManagement.domain.Student;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;


public class StudentGradesController {
    private static GradeRepository gradeRepository = PersistenceContext.repositories().grades();

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final SystemUser systemUser = (authz.session().get().authenticatedUser());

    private final StudentRepository studentRepository= PersistenceContext.repositories().students();
    private Student student = studentRepository.findBySystemUser(systemUser).iterator().next();

    public List<Grade> grades(){
        return (List<Grade>) gradeRepository.studentGrades(student);
    }


}
