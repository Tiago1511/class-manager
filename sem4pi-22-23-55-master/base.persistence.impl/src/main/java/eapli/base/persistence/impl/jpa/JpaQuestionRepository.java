package eapli.base.persistence.impl.jpa;

import eapli.base.examManagement.domain.automaticExamDomain.Question;
import eapli.base.examManagement.repositories.QuestionRepository;
import eapli.base.gradeManagement.domain.Grade;

import javax.persistence.Query;

public class JpaQuestionRepository extends BasepaRepositoryBase<Question,Long,Long> implements QuestionRepository {
    JpaQuestionRepository(){super("id");}

    public Iterable<Question> questions(Question question) {

        final Query query = entityManager().createQuery("SELECT question FROM Question question");

        return  null;

    }

    @Override
    public Iterable<Question> questionsByType(String type) {
        final Query query = entityManager().createQuery("SELECT q FROM Question q WHERE q.type = :type",
                Question.class);
        query.setParameter("type", type);
        return  query.getResultList();
    }


}
