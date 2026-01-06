package eapli.base.persistence.impl.jpa;

import eapli.base.examManagement.domain.NormalExamDomain.Exam;
import eapli.base.gradeManagement.domain.Grade;
import eapli.base.gradeManagement.repositories.GradeRepository;
import eapli.base.studentManagement.domain.Student;

import javax.persistence.Query;

public class JpaGradeRepository extends BasepaRepositoryBase<Grade,Long,Long> implements GradeRepository {
    JpaGradeRepository() {
        super("id");
    }

    @Override
    public Iterable<Grade> studentGrades(Student student) {

        final Query query = entityManager().createQuery("SELECT g FROM Grade g WHERE g.student = :student",
                Grade.class);
        query.setParameter("student", student);
        return  query.getResultList();

    }

    @Override
    public Iterable<Grade> examGrades(Exam exam) {

        final Query query = entityManager().createQuery("SELECT g FROM Grade g WHERE g.exam = :exam",
                Grade.class);
        query.setParameter("exam", exam);
        return  query.getResultList();

    }


}
