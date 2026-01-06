package eapli.base.examManagement.repositories;

import eapli.base.examManagement.domain.automaticExamDomain.Question;
import eapli.framework.domain.repositories.DomainRepository;

public interface QuestionRepository extends DomainRepository<Long, Question> {
  Iterable<Question> questionsByType(String type);
}
