package eapli.base.persistence.impl.inmemory;

import eapli.base.teacherManagement.domain.Acronym;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.base.teacherManagement.repositories.TeacherRepository;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.Optional;

public class InMemoryTeacherRepository extends InMemoryDomainRepository<Teacher, Acronym> implements TeacherRepository {

    @Override
    public Optional<Teacher> findByCode(String code) {
        return Optional.empty();
    }

    @Override
    public Iterable<Teacher> findBySystemUser(SystemUser systemUser) {
        return null;
    }


    @Override
    public Optional<Teacher> findByEmail(String email) {

        return matchOne(e->e.systemUser().email().toString().equals(email));
    }

    @Override
    public Optional<Teacher> findByUsername(String username) {
        return  matchOne(e->e.systemUser().username().toString().equals(username));
    }


    @Override
    public Optional<Teacher> findByAcronym(Acronym acronym) {

        return matchOne(e->e.acronym().equals(acronym));
    }


}
