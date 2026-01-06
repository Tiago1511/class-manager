package eapli.base.persistence.impl.inmemory;

import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.studentManagement.domain.Student;
import eapli.base.studentCourseManagment.repositories.StudentRepository;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

public class InMemoryStudentRepository  extends InMemoryDomainRepository<Student, MecanographicNumber> implements StudentRepository {



    @Override
    public Optional<Student> findByEmail(String email) {
        return matchOne(e->e.systemUser().email().toString().equals(email));
    }

    @Override
    public Optional<Student> findByMecanographicNumber(MecanographicNumber mecanographicNumber) {
        return matchOne(e->e.mecanographicNumber().equals(mecanographicNumber));
    }

    @Override
    public Optional<Student> ofIdentity(String id) {
        return Optional.empty();
    }

    @Override
    public Iterable<Student> findBySystemUser(SystemUser systemUser) {
        return null;
    }
}
