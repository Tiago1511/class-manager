package eapli.base.persistence.impl.jpa;

import eapli.base.examManagement.domain.NormalExamDomain.Exam;
import eapli.base.examManagement.domain.automaticExamDomain.AutomaticFormativeExam;
import eapli.base.examManagement.repositories.AutomaticFormativeExamRepository;
import eapli.base.examManagement.repositories.ExamRepository;

public class JpaAutomaticExam extends BasepaRepositoryBase<AutomaticFormativeExam,Long,Long> implements AutomaticFormativeExamRepository {
    JpaAutomaticExam() {
        super("id");
    }
}
