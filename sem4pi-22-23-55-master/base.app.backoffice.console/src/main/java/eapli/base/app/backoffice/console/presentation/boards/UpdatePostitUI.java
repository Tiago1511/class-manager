package eapli.base.app.backoffice.console.presentation.boards;

import eapli.base.boardManagement.application.PostitController;
import eapli.base.boardManagement.domain.*;
import eapli.base.boardManagement.repositories.PostitRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class UpdatePostitUI extends AbstractUI {


    private final PostitController ctrl = new PostitController();
    private PostitRepository postitRepository = PersistenceContext.repositories().postits();

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

        System.out.println("Which Post-it would you like to update?");


        List<PostIt> postitByBoard = postitRepository.findPostitByBoard(theBoard);

        int numberPostits = postitByBoard.size();

        for (int i = 0; i < numberPostits; i++) {
            System.out.printf("%d.  %d  %s\n", i, postitByBoard.get(i).identity(), postitByBoard.get(i).getTitle());
        }

        final int position = Console.readInteger("Choose an option:");

        final PostIt postIt = postitByBoard.get(position);

        final String changeTitle = Console.readLine("Would you like to update the title? (y/n):");

        final String title;

        if (Objects.equals(changeTitle, "Y") || Objects.equals(changeTitle, "y"))
            title = Console.readLine("Post It Tittle:");
        else
            title = null;

        final String changeContent = Console.readLine("Would you like to update the content? (y/n):");

        final String content;

        if (Objects.equals(changeContent, "Y") || Objects.equals(changeContent, "y"))
            content = Console.readLine("Post It Content:");
        else
            content = null;

        final String changePosition = Console.readLine("Would you like to update the position? (y/n):");

        final Cell cell;

        if (Objects.equals(changePosition, "Y") || Objects.equals(changePosition, "y")) {
            System.out.println("Which cell would you like to add the Post It to?");

            Set<Cell> cellSet = theBoard.cells();

            ArrayList<Cell> cellList = new ArrayList<Cell>(cellSet);

            int numberCells = cellSet.size();

            for (int i = 0; i < numberCells; i++) {
                if (cellList.get(i).isHasPostIt() == false){
                    /*Rows theRow = null;
                    Column theColumn = null;
                    for (Rows row : theBoard.getRows()) {
                            if (row.position() == cellList.get(i).getLinha())
                                theRow = row;
                    }
                    for (Column column : theBoard.getColumns()){
                        if (column.position() == cellList.get(i).getLinha())
                            theColumn = column;
                    }*/
                    System.out.printf("%d. Column: %d Tittle:   Row: %d Tittle: \n", i, cellList.get(i).getColuna() /*theColumn.getColumnTitle()*/, cellList.get(i).getLinha()/*, theRow.rowTitle()*/);
                }
            }

            final int position2 = Console.readInteger("Choose an option:");

            cell = cellList.get(position2);

        }else
            cell = null;

        try {
            ctrl.changePostit(postIt, title, content, cell, theBoard);
            System.out.println("Post It updated successfully!");
        } catch (final Exception e) {
            System.out.printf(e.getMessage());
        }
        return false;
    }

    @Override
    public String headline() {
        return "Update Post It";
    }
}
