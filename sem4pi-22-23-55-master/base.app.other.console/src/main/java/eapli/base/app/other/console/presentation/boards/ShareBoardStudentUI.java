package eapli.base.app.other.console.presentation.boards;

import eapli.base.boardManagement.application.ShareBoardController;
import eapli.base.boardManagement.domain.Board;
import eapli.framework.actions.Action;

import java.util.Scanner;

public class ShareBoardStudentUI implements Action {

    ShareBoardController shareBoardController = new ShareBoardController();

    @Override
    public boolean execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select board");
        Board board = shareBoardController.selectedBoard();
        System.out.println("Select type of user");
        System.out.println("1. Managers");
        System.out.println("2. Teachers");
        System.out.println("3. Students");
        System.out.println("0. Exit");
        int option= sc.nextInt();
        switch (option){
            case 1:
                shareBoardController.ManagerShare(board);
                break;
            case 2:
                shareBoardController.TeacherShare(board);
                break;
            case 3:
                shareBoardController.StudentShare(board);
                break;

        }

        return true;
    }

    }


