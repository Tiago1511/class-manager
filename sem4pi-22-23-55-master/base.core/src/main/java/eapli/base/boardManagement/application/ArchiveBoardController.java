package eapli.base.boardManagement.application;

import eapli.base.boardManagement.domain.Board;
import eapli.base.boardManagement.repositories.BoardRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.framework.application.UseCaseController;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.time.util.CurrentTimeCalendars;

import java.util.List;

@UseCaseController
public class ArchiveBoardController {
    private final TransactionalContext txCtx = PersistenceContext.repositories().newTransactionalContext();
    private final BoardRepository boardRepository = PersistenceContext.repositories().boards(txCtx);

    public Board archiveBoard(Board board){
        board.updateBoard();
        board.archiveBoard(CurrentTimeCalendars.now());
        txCtx.beginTransaction();
        board = boardRepository.save(board);
        txCtx.commit();
        return board;
    }

    public List<Board> findAllBoardsOwnByUser(SystemUser username){
        return boardRepository.findAllBoardsOwnByUser(username);
    }
}
