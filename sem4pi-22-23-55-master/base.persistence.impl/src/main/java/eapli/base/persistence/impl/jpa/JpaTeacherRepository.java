package eapli.base.persistence.impl.jpa;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.domain.Status;
import eapli.base.teacherManagement.domain.Acronym;
import eapli.base.teacherManagement.domain.TaxNumber;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.base.teacherManagement.repositories.TeacherRepository;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

import javax.persistence.Query;
import java.util.*;

public class JpaTeacherRepository extends BasepaRepositoryBase<Teacher, Acronym, TaxNumber> implements TeacherRepository {

    public JpaTeacherRepository() {
        super("acronym");
    }

    @Override
    public Optional<Teacher> findByCode(String code) {
        return Optional.ofNullable(entityManager().find(Teacher.class, code));
    }

    @Override
    public Iterable<Teacher> findBySystemUser(SystemUser systemUser) {
        final Query query = entityManager().createQuery("SELECT t FROM Teacher t WHERE t.systemUser = :systemUser",
                Teacher.class);
        query.setParameter("systemUser", systemUser);
        return  query.getResultList();
    }

    @Override
    public Optional<Teacher> findByEmail(String email) {
        return Optional.ofNullable(entityManager().find(Teacher.class, email));
    }

    @Override
    public Optional<Teacher> findByUsername(String username) {
        return Optional.ofNullable(entityManager().find(Teacher.class, username));
    }


    @Override
    public Optional<Teacher> findByAcronym(Acronym acronym) {
        final Map<String, Object> params = new HashMap<>();
        params.put("acronym",acronym);
        return matchOne("e.acronym=:acronym",acronym);
    }

    @Override
    public Optional<Teacher> ofIdentity(Acronym id) {
        return Optional.of(entityManager().find(Teacher.class, id));
    }

    @Override
    public boolean containsOfIdentity(Acronym id) {
        return TeacherRepository.super.containsOfIdentity(id);
    }

    @Override
    public boolean contains(Teacher entity) {
        return TeacherRepository.super.contains(entity);
    }

    @Override
    public void deleteOfIdentity(Acronym entityId) {

    }

    @Override
    public void remove(Teacher entity) {
        TeacherRepository.super.remove(entity);
    }

    @Override
    public void removeOfIdentity(Acronym entityId) {
        TeacherRepository.super.removeOfIdentity(entityId);
    }
}
