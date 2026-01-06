package eapli.base.persistence.impl.inmemory;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.examManagement.domain.NormalExamDomain.Exam;
import eapli.base.examManagement.domain.automaticExamDomain.AutomaticExam;
import eapli.base.examManagement.repositories.ExamRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryExamRepository extends InMemoryDomainRepository<Exam,Long> implements ExamRepository {

    public Iterable<Exam> courseExams(Course course){
        return null;
    }
}
