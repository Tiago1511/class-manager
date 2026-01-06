package eapli.base.boardManagement.repositories;

import eapli.base.boardManagement.domain.Board;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.domain.repositories.LockableDomainRepository;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;

import java.util.List;

public interface BoardRepository extends DomainRepository<Integer, Board>, LockableDomainRepository<Integer, Board> {

    List<Board> findAllBoardsOwnByUser(SystemUser username);

    List<Board> findAllBoardsAvailableToUser(SystemUser username);

}
