package eapli.base.persistence.impl.inmemory;

import eapli.base.boardManagement.domain.Board;
import eapli.base.boardManagement.domain.PostIt;
import eapli.base.boardManagement.repositories.PostitRepository;
import eapli.framework.infrastructure.repositories.impl.inmemory.InMemoryDomainRepository;

import java.util.List;

public class InMemoryPostitRepository extends InMemoryDomainRepository<PostIt, Integer> implements PostitRepository {


    @Override
    public List<PostIt> findPostitByBoard(Board board) {
        return null;
    }

    @Override
    public List<PostIt> findPostitByBoardUndoable(Board board) {
        return null;
    }

    @Override
    public PostIt findPostitById(Integer id) {
        return null;
    }

    @Override
    public void deletePostit(Integer id) {

    }


}
