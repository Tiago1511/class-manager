package eapli.base.app.backoffice.console.presentation.boards;

import javax.swing.*;

import eapli.base.boardManagement.application.ShareBoardController;
import eapli.base.boardManagement.domain.Board;
import eapli.base.boardManagement.repositories.BoardRepository;
import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.managerManagement.domain.Manager;
import eapli.framework.actions.Action;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.Username;
import eapli.framework.io.util.Console;

import java.util.List;
import java.util.Scanner;

public class ShareBoardUI implements Action {

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


