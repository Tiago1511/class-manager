package eapli.base.studentCourseManagment.repositories;

import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.studentManagement.domain.Student;
import eapli.base.teacherManagement.domain.Acronym;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.util.Optional;

public interface StudentRepository extends DomainRepository<MecanographicNumber, Student> {


    Optional <Student> findByEmail(String email);

    Optional <Student> findByMecanographicNumber(MecanographicNumber mecanographicNumber);
    Optional<Student> ofIdentity(String id);
    Iterable<Student> findBySystemUser(SystemUser systemUser);
}
