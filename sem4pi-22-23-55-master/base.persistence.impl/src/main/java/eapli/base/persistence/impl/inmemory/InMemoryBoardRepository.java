package eapli.base.persistence.impl.inmemory;

import eapli.base.boardManagement.domain.Board;
import eapli.base.boardManagement.repositories.BoardRepository;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.List;

public class InMemoryBoardRepository extends InMemoryDomainRepository<Board,Integer> implements BoardRepository {
    static {
        InMemoryInitializer.init();
    }

    @Override
    public List<Board> findAllBoardsOwnByUser(SystemUser username) {
        return null;
    }

    @Override
    public List<Board> findAllBoardsAvailableToUser(SystemUser username) {
        return null;
    }
}
