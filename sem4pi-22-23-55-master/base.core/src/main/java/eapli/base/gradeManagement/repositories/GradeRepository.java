package eapli.base.gradeManagement.repositories;

import eapli.base.examManagement.domain.NormalExamDomain.Exam;
import eapli.base.gradeManagement.domain.Grade;
import eapli.base.studentManagement.domain.Student;
import eapli.framework.domain.repositories.DomainRepository;

public interface GradeRepository extends DomainRepository <Long,Grade>{

    Iterable<Grade> studentGrades(Student student);

    Iterable<Grade> examGrades (Exam exam);


}
