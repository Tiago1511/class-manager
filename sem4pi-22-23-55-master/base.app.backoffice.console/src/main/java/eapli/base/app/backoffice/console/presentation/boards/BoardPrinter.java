package eapli.base.app.backoffice.console.presentation.boards;

import eapli.base.boardManagement.domain.Board;
import eapli.framework.visitor.Visitor;

public class BoardPrinter implements Visitor<Board> {
    @Override
    public void visit(Board aBoard) {
        System.out.printf("ID: %d   Title: %s", aBoard.identity(), aBoard.getBoardTitle());

    }
}
