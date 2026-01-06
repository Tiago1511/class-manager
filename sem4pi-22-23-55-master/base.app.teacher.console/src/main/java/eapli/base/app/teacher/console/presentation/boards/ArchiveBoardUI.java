package eapli.base.app.teacher.console.presentation.boards;

import eapli.base.boardManagement.application.ArchiveBoardController;
import eapli.base.boardManagement.domain.Board;
import eapli.base.boardManagement.domain.BoardHistoryUpdates;
import eapli.framework.domain.repositories.ConcurrencyException;
import eapli.framework.domain.repositories.IntegrityViolationException;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.application.UserManagementService;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ArchiveBoardUI extends AbstractUI {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArchiveBoardUI.class);
    private final ArchiveBoardController theController = new ArchiveBoardController();
    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final UserManagementService userSvc = AuthzRegistry.userService();


    @Override
    protected boolean doShow() {
        int i = 0;

        List<Board> boards = theController.findAllBoardsOwnByUser(authz.session().get().authenticatedUser());

        if (boards.isEmpty()) {
            System.out.println("There is no shared board owned by you!");
        } else {
            for (Board board : boards) {
                System.out.printf("%d. %s",++i,board);
            }

            System.out.println("\nEnter shared board number to archive or 0 to finish ");
            final int option = Console.readOption(1,boards.size(),0);

            if(option == 0)
                return false;

            Board board = boards.get(option-1);

            try {
                board.getUpdates().add(new BoardHistoryUpdates(String.format("The Owner %s archived the board",board.getOwner().identity())));
                this.theController.archiveBoard(board);
                System.out.printf("\nYou have archived the board %s\n\n", board.identity());
            } catch (final IntegrityViolationException | ConcurrencyException e) {
                LOGGER.error("Error performing the operation", e);
                System.out.println(
                        "Unfortunately there was an unexpected error in the application. Please try again and if the problem persists, contact your system administrator.");
            }

            return true;
        }
        return false;
    }

    @Override
    public String headline() {
        return "Archive a Board";
    }
}
