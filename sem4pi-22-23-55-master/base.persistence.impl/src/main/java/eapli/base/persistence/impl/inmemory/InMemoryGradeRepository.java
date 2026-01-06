package eapli.base.persistence.impl.inmemory;

import eapli.base.examManagement.domain.NormalExamDomain.Exam;
import eapli.base.gradeManagement.domain.Grade;
import eapli.base.gradeManagement.repositories.GradeRepository;
import eapli.base.studentManagement.domain.Student;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryGradeRepository extends InMemoryDomainRepository<Grade,Long> implements GradeRepository {
    @Override
    public Iterable<Grade> studentGrades(Student student) {
        return null;
    }

    @Override
    public Iterable<Grade> examGrades(Exam exam) {
        return null;
    }
}
