package eapli.base.persistence.impl.inmemory;

import eapli.base.examManagement.domain.automaticExamDomain.Question;
import eapli.base.examManagement.repositories.QuestionRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

public class InMemoryAddQuestionRepository extends InMemoryDomainRepository<Question, Long>  implements QuestionRepository {
    @Override
    public Iterable<Question> questionsByType(String type) {
        return null;
    }
}
