package eapli.base.boardManagement.application;

import eapli.base.boardManagement.domain.Board;
import eapli.base.boardManagement.domain.Cell;
import eapli.base.boardManagement.domain.PostIt;
import eapli.base.boardManagement.repositories.BoardRepository;
import eapli.base.boardManagement.repositories.PostitRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;

public class PostitController extends Thread {

    private final PostitRepository postitRepository = PersistenceContext.repositories().postits();
    private final BoardRepository boardRepository = PersistenceContext.repositories().boards();

    public void postitCreator(Cell cell, String title, String content, Board board) {
        final var newPostit = new PostIt(cell, title, content, board, null);
        cell.setHasPostIt(true);
        postitRepository.save(newPostit);
        boardRepository.save(board);

    }
    public Iterable<Board> board(SystemUser user) {
        return boardRepository.findAllBoardsOwnByUser(user);
    }

    public void changePostit(PostIt postit, String title, String content, Cell cell, Board board) {
        if (title == null) {
            title = postit.getTitle();
        }
        if (content == null || content.isEmpty()) {
            content = postit.getContent();
        }
        if (cell == null) {
            cell = postit.getCell();
        } else {
            for (Cell c : board.cells()) {
                if (c.getColuna() == postit.getCell().getColuna() && c.getLinha() == postit.getCell().getLinha()) {
                    c.setHasPostIt(false);
                }
            }
            postit.getCell().setHasPostIt(false);
            cell.setHasPostIt(true);
        }
        PostIt updatedPostit = new PostIt(cell, title, content, postit.getBoard(), postit.getId());
        postit.setActive(false);
        postitRepository.save(updatedPostit);
        postitRepository.save(postit);
        boardRepository.save(postit.getBoard());
    }

    public void undoChangePostit(PostIt postit, Board board) {
        postit.setActive(false);
        postit.getCell().setHasPostIt(false);
        PostIt theLastVersion = postitRepository.findPostitById(postit.getLastVersionId());
        for (Cell c : board.cells()) {
            if (c.getColuna() == theLastVersion.getCell().getColuna() && c.getLinha() == theLastVersion.getCell().getLinha()) {
                c.setHasPostIt(true);
                theLastVersion.getCell().setHasPostIt(true);
            }
        }
        for (Cell c : board.cells()) {
            if (c.getColuna() == postit.getCell().getColuna() && c.getLinha() == postit.getCell().getLinha()) {
                c.setHasPostIt(false);
                postit.getCell().setHasPostIt(false);
            }
        }
        //postitRepository.deletePostit(postit.getId());
        theLastVersion.setActive(true);
        //postit.getBoard().getCell(postit.getCell()).setHasPostIt(true);
        postitRepository.save(postit);
        postitRepository.save(theLastVersion);
        boardRepository.save(postit.getBoard());
    }

    public Iterable<Board> allBoards() {
        return boardRepository.findAll();
    }

    public synchronized void createPostit(String title, Integer id2, String content, Integer linha, Integer coluna) {
        Board theBoard = null;
        Iterable<Board> boards = boardRepository.findAll();
        while (boards.iterator().hasNext()) {
            Board board = boards.iterator().next();
            if (board.identity() ==id2) {
                theBoard = board;
            }
        }
        if (theBoard == null) {
            throw new IllegalArgumentException("Board not found");
        }

        Cell theCell = null;
        Iterable<Cell> cells = theBoard.cells();
        while (cells.iterator().hasNext()) {
            Cell cell = cells.iterator().next();
            if (cell.getLinha() == linha && cell.getColuna() == coluna) {
                theCell = cell;
            }
        }

        if (theCell == null) {
            throw new IllegalArgumentException("Cell not found");
        }
        postitRepository.save(new PostIt(theCell, title, content, theBoard, null));
    }
}
