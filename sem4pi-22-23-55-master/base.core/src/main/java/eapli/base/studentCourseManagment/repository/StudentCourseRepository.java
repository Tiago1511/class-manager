package eapli.base.studentCourseManagment.repository;

import eapli.base.studentCourseManagment.domain.StudentCourse;
import eapli.base.studentManagement.domain.Student;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.infrastructure.authz.domain.model.Username;

import java.util.Optional;

public interface StudentCourseRepository extends DomainRepository<Long, StudentCourse> {

        Optional<Student> findByUsername(Username name);

        public Iterable<Student> findAllActive();
}
