package eapli.base.app.sharedBoards.console.boards;

public class main {
    public static void main(String[] args) {
        CreateBoard createBoard = new CreateBoard();
        Thread thread1= new Thread(createBoard);

        thread1.start();
    }
}
