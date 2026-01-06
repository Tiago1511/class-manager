package eapli.base.app.backoffice.console.presentation.authz.RegisterUI;

import eapli.base.clientusermanagement.domain.MecanographicNumber;
import eapli.base.studentManagement.application.RegisterStudentController;
import eapli.base.usermanagement.application.RegisterUserController;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import java.util.List;

public class RegisterStudentUI extends AbstractUI {

   // private RegisterUserController ctrl = new RegisterUserController();
    private RegisterStudentController ctrl= new RegisterStudentController();

    @Override
    protected boolean doShow() {
        selectUser();
        int index= Console.readInteger("\nSelect User (number):")-1;
        SystemUser systemUser = users().get(index);

        final String mecanographicNumber = Console.readLine("Mecanographic Number:");
        final String taxNumber = Console.readLine("Tax Number:");
        final String birthday = Console.readLine("Birth Day:");

        ctrl.registerNewStudent(systemUser,mecanographicNumber,taxNumber,birthday);
        return false;
    }

    protected void selectUser(){
        System.out.printf("   Username   Email\n");
        for (int i = 0; i < users().size(); i++) {
            System.out.printf("\n%d. %s  %s\n",i+1,users().get(i).username(),users().get(i).email());
        }
    }
    protected List<SystemUser> users(){
        List<SystemUser> userList = ctrl.getUsers();
        return userList;
    }

    @Override
    public String headline() {
        return "Register Student...";
    }
}
