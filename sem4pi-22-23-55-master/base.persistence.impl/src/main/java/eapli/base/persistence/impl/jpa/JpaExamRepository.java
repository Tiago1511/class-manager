package eapli.base.persistence.impl.jpa;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.examManagement.domain.NormalExamDomain.Exam;
import eapli.base.examManagement.domain.automaticExamDomain.AutomaticExam;
import eapli.base.examManagement.repositories.ExamRepository;
import eapli.base.studentManagement.domain.Student;

import javax.persistence.Query;
import java.time.LocalTime;
import java.util.Calendar;

public class JpaExamRepository extends BasepaRepositoryBase<Exam,Long,Long> implements ExamRepository {

    JpaExamRepository(){super("id");}

    public Iterable<Exam> courseExams(Course course){

        final Query query = entityManager().createQuery("SELECT exam FROM Exam exam WHERE exam.course =: course",Exam.class);
        query.setParameter("course",course);

        return query.getResultList();
    }
}
