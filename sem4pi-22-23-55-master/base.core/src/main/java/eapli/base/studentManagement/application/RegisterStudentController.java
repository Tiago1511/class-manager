package eapli.base.studentManagement.application;

import eapli.base.studentManagement.domain.Student;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.studentManagement.domain.StudentBuilder;
import eapli.base.studentCourseManagment.repositories.StudentRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.*;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;

import java.text.ParseException;
import java.util.*;

public class RegisterStudentController {
    private final UserRepository repository = PersistenceContext.repositories().users();
    private final StudentRepository studentRepository = PersistenceContext.repositories().students();

    private final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final TransactionalContext txCtx = PersistenceContext.repositories()
            .newTransactionalContext();




    public Student registerNewStudent(final SystemUser user, final String mecanographicNumber, final String taxNumber, final String birthday)  {

        if (user.isActive()){
            Student student = null;
            try {
                student = new StudentBuilder().systemUser(user).taxNumber(taxNumber).mecanographicNumber(mecanographicNumber).birthday(birthday).build();
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            studentRepository.save(student);
            return student;
               }else {
            throw new IllegalArgumentException("This user is not active");
        }
    }

    public List<SystemUser> getUsers(){
        return (List<SystemUser>) repository.findByActive(true);
    }

    public Student signUpAllStudents(final SystemUser systemUser, String mecanographicNumber, Date birthDate, String taxPayerNumber) {

        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.MANAGER);


        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.STUDENT);

        Student student= null;


        txCtx.beginTransaction();
        student = registerNewStudent(systemUser,mecanographicNumber,taxPayerNumber,birthDate.toString());
        txCtx.commit();

        return student;
    }



}
