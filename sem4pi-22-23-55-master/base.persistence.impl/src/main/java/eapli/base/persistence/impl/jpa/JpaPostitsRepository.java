package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.boardManagement.domain.Board;
import eapli.base.boardManagement.domain.PostIt;
import eapli.base.boardManagement.repositories.PostitRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.Query;
import java.util.List;

public class JpaPostitsRepository extends JpaAutoTxRepository<PostIt,Integer, Integer> implements PostitRepository {

    public JpaPostitsRepository(TransactionalContext autoTx) {
        super(autoTx, "id");
    }

    public JpaPostitsRepository(String persistenceUnitName) {
        super(persistenceUnitName, Application.settings().extendedPersistenceProperties(), "code");
    }

    @Override
    public List<PostIt> findPostitByBoard(Board board) {
        final Query query = entityManager().createQuery("SELECT p FROM PostIt p WHERE p.board = :BOARD AND p.active = true ", PostIt.class);
        query.setParameter("BOARD", board);
        List<PostIt> resultList = query.getResultList();
        return resultList;

    }

    @Override
    public List<PostIt> findPostitByBoardUndoable(Board board) {
        final Query query = entityManager().createQuery("SELECT p FROM PostIt p WHERE p.board = :BOARD AND p.lastVersionId != NULL AND p.active = true ", PostIt.class);
        query.setParameter("BOARD", board);
        List<PostIt> resultList = query.getResultList();
        return resultList;
    }

    public PostIt findPostitById(Integer id) {
        final Query query = entityManager().createQuery("SELECT p FROM PostIt p WHERE p.id = :ID", PostIt.class);
        query.setParameter("ID", id);
        PostIt result = (PostIt) query.getSingleResult();
        return result;
    }

    @Override
    public void deletePostit(Integer id) {
        final Query query = entityManager().createQuery("DELETE FROM PostIt p WHERE p.id = :ID");
        query.setParameter("ID", id);
        int deletedCount = query.executeUpdate();
    }
}
