package eapli.base.persistence.impl.jpa;

import eapli.base.Application;
import eapli.base.boardManagement.domain.Board;
import eapli.base.boardManagement.repositories.BoardRepository;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.repositories.impl.jpa.JpaAutoTxRepository;

import javax.persistence.Query;
import java.util.List;

public class JpaBoardRepository extends JpaAutoTxRepository<Board, Integer,Integer> implements BoardRepository {
    public JpaBoardRepository ( final TransactionalContext autoTx) {
        super(autoTx, "id");
    }

    public JpaBoardRepository(final String puname) {
        super(puname, Application.settings().extendedPersistenceProperties(), "id");
    }

    @Override
    public List<Board> findAllBoardsOwnByUser(SystemUser username) {
        final Query query = entityManager().createQuery("SELECT b FROM Board b WHERE b.creator = :CREATOR ", Board.class);
        query.setParameter("CREATOR", username);
        List<Board> resultList = query.getResultList();
        return resultList;
    }

    @Override
    public List<Board> findAllBoardsAvailableToUser(SystemUser username) {
        return null;
    }
}
