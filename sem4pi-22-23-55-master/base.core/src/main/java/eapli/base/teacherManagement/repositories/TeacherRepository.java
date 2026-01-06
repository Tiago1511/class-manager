package eapli.base.teacherManagement.repositories;

import eapli.base.studentManagement.domain.Student;
import eapli.base.teacherManagement.domain.Acronym;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import java.util.Optional;

public interface TeacherRepository extends DomainRepository<Acronym, Teacher> {


    Optional <Teacher> findByEmail(String email);

    Optional <Teacher> findByUsername(String username);

    Optional<Teacher> findByAcronym(Acronym acronym);
    Optional<Teacher> findByCode(String code);

    Iterable<Teacher> findBySystemUser(SystemUser systemUser);

}
