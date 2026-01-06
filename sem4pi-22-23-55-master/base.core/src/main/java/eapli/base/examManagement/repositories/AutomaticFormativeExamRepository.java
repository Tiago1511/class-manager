package eapli.base.examManagement.repositories;

import eapli.base.examManagement.domain.NormalExamDomain.Exam;
import eapli.base.examManagement.domain.automaticExamDomain.AutomaticExam;
import eapli.base.examManagement.domain.automaticExamDomain.AutomaticFormativeExam;
import eapli.framework.domain.repositories.DomainRepository;

public interface AutomaticFormativeExamRepository extends DomainRepository<Long, AutomaticFormativeExam> {
}
