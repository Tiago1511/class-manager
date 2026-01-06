package eapli.base.boardManagement.application;

import eapli.base.boardManagement.domain.Board;
import eapli.base.boardManagement.repositories.BoardRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;

import java.util.List;

public class ViewBoardHistoryUpdatesController {

    private final TransactionalContext txCtx = PersistenceContext.repositories().newTransactionalContext();
    private final BoardRepository boardRepository = PersistenceContext.repositories().boards(txCtx);

    public List<Board> findAllBoardsAvailableToUser(SystemUser username){
        return boardRepository.findAllBoardsAvailableToUser(username);
    }
}
