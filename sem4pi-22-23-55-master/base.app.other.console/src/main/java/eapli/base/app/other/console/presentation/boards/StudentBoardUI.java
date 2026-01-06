package eapli.base.app.other.console.presentation.boards;

import eapli.base.boardManagement.domain.Board;
import eapli.base.boardManagement.domain.Cell;
import eapli.base.boardManagement.domain.Column;
import eapli.base.boardManagement.domain.Rows;
import eapli.base.boardManagement.repositories.BoardRepository;
import eapli.base.boardManagement.repositories.ColumnRepository;
import eapli.base.boardManagement.repositories.RowRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.framework.actions.Action;
import eapli.framework.domain.repositories.TransactionalContext;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;
import eapli.framework.io.util.Console;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentBoardUI implements Action {

    BoardRepository boardRepository = PersistenceContext.repositories().boards();
    RowRepository rowRepository = PersistenceContext.repositories().rows();
    ColumnRepository columnRepository = PersistenceContext.repositories().columns();

    final AuthorizationService authz = AuthzRegistry.authorizationService();

    private final TransactionalContext txCtx = PersistenceContext.repositories()
            .newTransactionalContext();
    @Override
    public boolean execute() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the title for the board: ");
        String boardTitle = scanner.nextLine();

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        Set<Rows> rows = row(numRows);

        System.out.print("Enter the number of columns: ");
        int numColumns = scanner.nextInt();
        Set<Column> columns =collum(numColumns);

        Set<Cell> cells =cells(rows,columns);
        final SystemUser systemUser = (authz.session().get().authenticatedUser());

        Set<SystemUser> users = new HashSet<>();
        users.add(systemUser);
        Board board = new Board(boardTitle,rows,columns,cells,systemUser,users);
        try {
            boardRepository.save(board);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return true;
    }


    private Set<Rows> row(int linhas){
        Set<Rows>rows=new HashSet<>();
        int count = 1;


        for (int i =0; i< linhas; i++){
            String titulo = Console.readLine("Enter title");
            Rows r = createRow(count, titulo);
            rows.add(r);
            count++;
        }
        return rows;
    }

    private Set<Column> collum( int colunas){
        Set<Column>columns=new HashSet<>();


        int count = 1;


        for (int i =0; i< colunas; i++){
            String titulo = Console.readLine("Enter title");
            Column c = createCollun(count, titulo);
            columns.add(c);
            count++;
        }
        return columns;
    }

    private Rows createRow(int linha, String titulo){
        Rows row = new Rows(titulo,linha);
        rowRepository.save(row);
        return row;
    }

    private Column createCollun(int coluna, String titulo){
        Column column = new Column(titulo,coluna);
        columnRepository.save(column);

        return column;
    }

    public Set<Cell> cells(Set<Rows> rows, Set<Column>columns){
        Set<Cell> cells = new HashSet<>();
        int numRows = rows.size();
        int numCollumns = columns.size();
        for (int i=0; i<numRows;i++){
            for (int j = 0; j < numCollumns; j++) {
                Cell cell = new Cell(i,j,false);
                cells.add(cell);
            }
        }
        return cells;
    }
}
