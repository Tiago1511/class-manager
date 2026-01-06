package eapli.base.app.backoffice.console.presentation.boards;

import eapli.base.boardManagement.application.PostitController;
import eapli.base.boardManagement.domain.Board;
import eapli.base.boardManagement.domain.PostIt;
import eapli.base.boardManagement.repositories.PostitRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

import java.util.List;
import java.util.Objects;

public class UndoChangePostitUI extends AbstractUI {

    private final PostitController ctrl = new PostitController();
    private final PostitRepository postitRepository = PersistenceContext.repositories().postits();

    @Override
    protected boolean doShow() {
        final AuthorizationService authz = AuthzRegistry.authorizationService();

        final SystemUser systemUser = (authz.session().get().authenticatedUser());

        final Iterable<Board> board = this.ctrl.board(systemUser);

        final SelectWidget<Board> select = new SelectWidget<>("Select a Board:", board, new BoardPrinter());

        select.show();

        final Board theBoard = select.selectedElement();
        if (select.selectedOption() == 0)
            return false;

        if (theBoard == null)
            return false;

        System.out.println("Which Post-it would you like to undo changes?");

        List<PostIt> postitByBoard = postitRepository.findPostitByBoardUndoable(theBoard);

        int numberPostits = postitByBoard.size();

        for (int i = 0; i < numberPostits; i++) {
            System.out.printf("%d.  %3d  %20s   %20s\n", i, postitByBoard.get(i).identity(), postitByBoard.get(i).getTitle(), postitByBoard.get(i).getContent());
        }

        final int position = Console.readInteger("Choose an option:");

        final PostIt postIt = postitByBoard.get(position);

        final String undoChanges = Console.readLine("Are you sure you want to undo changes?\nThe last change of your post it will be permanently deleted. (y/n):");

        try {
            if (Objects.equals(undoChanges, "Y") || Objects.equals(undoChanges, "y")){
                ctrl.undoChangePostit(postIt, theBoard);
                System.out.println("\nPost It undone successfully!");
            } else {
                System.out.println("Okay, taking you back to the main menu.");
            }
        } catch (final Exception e) {
            System.out.printf(e.getMessage());
        }
        return false;
    }

    @Override
    public String headline() {
        return "Undo Post It";
    }
}