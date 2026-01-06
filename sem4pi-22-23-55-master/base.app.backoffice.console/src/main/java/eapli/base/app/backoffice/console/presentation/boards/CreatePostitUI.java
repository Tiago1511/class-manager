package eapli.base.app.backoffice.console.presentation.boards;

import eapli.base.boardManagement.application.PostitController;
import eapli.base.boardManagement.domain.Board;
import eapli.base.boardManagement.domain.Cell;
import eapli.base.boardManagement.domain.Column;
import eapli.base.boardManagement.domain.Rows;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

public class CreatePostitUI extends AbstractUI {
    private final PostitController ctrl = new PostitController();

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
                }-*/
                System.out.printf("%d. Column: %d Tittle:   Row: %d Tittle: \n", i, cellList.get(i).getColuna(), /*theColumn.getColumnTitle(),*/ cellList.get(i).getLinha()/* theRow.rowTitle()*/);
            }
        }

        final int position = Console.readInteger("Choose an option:");

        final Cell cell = cellList.get(position);

        final String hasTitle = Console.readLine("Would you like to add a title? (y/n):");

        final String title;

        if (Objects.equals(hasTitle, "Y") || Objects.equals(hasTitle, "y"))
            title = Console.readLine("Post It Tittle:");
        else
            title = null;

        System.out.println("What type of Post It would you like to create?");
        System.out.println("1 - Text");
        System.out.println("2 - Image");
        System.out.println("Press Any Key To Cancel\n");

        final int typeOfContent = Console.readInteger("Choose an option:");

        try {
            if (typeOfContent == 1) {
                final String content = Console.readLine("Post It Content:");
                this.ctrl.postitCreator(cell, title, content, theBoard);
                System.out.println("\nPost It created successfully!");
            } else if (typeOfContent == 2) {
                String content = Console.readLine("Post It Content:");
                while (!content.contains("http")) {
                    content = Console.readLine("Invalid content. Try again");
                }
                this.ctrl.postitCreator(cell, title, content, theBoard);
                System.out.println("\nPost It created successfully!");
            } else {
                System.out.println("Invalid option!");
            }

        } catch (final Exception e) {
            System.out.printf(e.getMessage());
        }
        return false;
    }

    @Override
    public String headline() {
        return "Create Post It";
    }
}
