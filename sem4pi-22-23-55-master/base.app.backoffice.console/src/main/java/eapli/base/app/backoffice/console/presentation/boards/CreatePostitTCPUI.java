package eapli.base.app.backoffice.console.presentation.boards;

import eapli.base.boardManagement.application.PostitController;
import eapli.base.boardManagement.domain.Board;
import eapli.base.boardManagement.domain.Cell;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.SelectWidget;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

public class CreatePostitTCPUI implements Runnable{
    private final PostitController ctrl = new PostitController();

    String titling;
    Integer id;
    String content1;
    Integer linha;
    Integer coluna;

    boolean running = true;
    @Override
    public void run() {
        synchronized (this){
        while (running) {
            final Iterable<Board> board = this.ctrl.allBoards();

            final SelectWidget<Board> select = new SelectWidget<>("Select a Board:", board, new BoardPrinter());

            select.show();

            final Board theBoard = select.selectedElement();
            if (select.selectedOption() == 0) {
                running = false;


            }
            if (theBoard == null)
                running = false;


                System.out.println("Which cell would you like to add the Post It to?");

            Set<Cell> cellSet = theBoard.cells();

            ArrayList<Cell> cellList = new ArrayList<Cell>(cellSet);

            int numberCells = cellSet.size();

            for (int i = 0; i < numberCells; i++) {
                if (cellList.get(i).isHasPostIt() == false)
                    System.out.printf("%d. Column: %3d    Row: %3d\n", i, cellList.get(i).getColuna(), cellList.get(i).getLinha());
            }

            final int position = Console.readInteger("Choose an option:");

            final Cell cell = cellList.get(position);

            coluna = cell.getColuna();

            linha = cell.getLinha();

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
                    content1 = content;
                    id = theBoard.identity();
                    titling = title;
                    this.ctrl.postitCreator(cell, title, content, theBoard);
                    System.out.println("\nPost It created successfully!");
                } else if (typeOfContent == 2) {
                    String content = Console.readLine("Post It Content:");
                    while (!content.contains("http")) {
                        content = Console.readLine("Invalid content. Try again");
                    }
                    this.ctrl.postitCreator(cell, title, content, theBoard);
                    System.out.println("\nPost It created successfully!");
                    System.exit(0);
                } else {
                    System.out.println("Invalid option!");
                }

            } catch (final Exception e) {
                System.out.printf(e.getMessage());
            }
            System.out.println("=====================================");
            if (!running) {
                break;  // Exit the loop and stop executing the Runnable
            }
        }
        }
    }

    public void stop() {
        running = false;
    }

    public String[] getPostitInfo(){
        String[] info = new String[3];
        info[0] = titling;
        info[1] = id.toString();
        info[2] = content1;
        info[3] = linha.toString();
        info[4] = coluna.toString();
        return info;
    }


}
