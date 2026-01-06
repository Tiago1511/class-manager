package eapli.base.boardManagement.repositories;

import eapli.base.boardManagement.domain.Board;
import eapli.base.boardManagement.domain.PostIt;
import eapli.framework.domain.repositories.DomainRepository;
import eapli.framework.domain.repositories.LockableDomainRepository;

import java.util.List;

public interface PostitRepository extends DomainRepository<Integer, PostIt>, LockableDomainRepository<Integer, PostIt> {

    public List<PostIt> findPostitByBoard(Board board);

    public List<PostIt> findPostitByBoardUndoable(Board board);

    public PostIt findPostitById(Integer id);

    public void deletePostit(Integer id);

}