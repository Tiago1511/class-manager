package eapli.base.examManagement.repositories;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.examManagement.domain.NormalExamDomain.Exam;
import eapli.base.examManagement.domain.automaticExamDomain.AutomaticExam;
import eapli.framework.domain.repositories.DomainRepository;

public interface ExamRepository extends DomainRepository<Long, Exam> {

    public Iterable<Exam> courseExams(Course course);
}
