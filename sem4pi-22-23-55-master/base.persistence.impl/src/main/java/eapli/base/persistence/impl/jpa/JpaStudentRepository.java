package eapli.base.persistence.impl.jpa;

import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.studentManagement.domain.Student;
import eapli.base.studentCourseManagment.repositories.StudentRepository;
import eapli.base.teacherManagement.domain.TaxNumber;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import javax.persistence.Query;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class JpaStudentRepository extends BasepaRepositoryBase<Student, MecanographicNumber, TaxNumber> implements StudentRepository {
    JpaStudentRepository() {
        super("mecanographicNumber");
    }


    @Override
    public Optional<Student> findByEmail(String email) {
        final Map<String, Object> params = new HashMap<>();
        params.put("email",email);
        return matchOne("e.email=:email",email);
    }

    @Override
    public Optional<Student> findByMecanographicNumber(MecanographicNumber mecanographicNumber) {
        final Map<String, Object> params = new HashMap<>();
        params.put("mecanographicNumber",mecanographicNumber);
        return matchOne("e.mecanographicNumber=:mecanographicNumber",mecanographicNumber);
    }

    @Override
    public Optional<Student> ofIdentity(String id) {
        return Optional.empty();
    }

    @Override
    public Iterable<Student> findBySystemUser(SystemUser systemUser) {
        final Query query = entityManager().createQuery("SELECT s FROM Student s WHERE s.systemUser = :systemUser",
                Student.class);
        query.setParameter("systemUser", systemUser);
        return  query.getResultList();
    }


    @Override
    public Optional<Student> ofIdentity(MecanographicNumber id) {
        return Optional.empty();
    }

    @Override
    public void deleteOfIdentity(MecanographicNumber entityId) {

    }
}
