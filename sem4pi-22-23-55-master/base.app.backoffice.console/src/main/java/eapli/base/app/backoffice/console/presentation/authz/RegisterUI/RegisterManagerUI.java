package eapli.base.app.backoffice.console.presentation.authz.RegisterUI;

import eapli.base.managerManagement.application.RegisterManagerController;
import eapli.base.usermanagement.application.RegisterUserController;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import java.util.List;

public class RegisterManagerUI extends AbstractUI {

    RegisterManagerController ctrl = new RegisterManagerController();
    RegisterUserController uCtrl= new RegisterUserController();

    @Override
    protected boolean doShow() {
        selectUser();
        int index= Console.readInteger("\nSelect User (number):")-1;
        SystemUser systemUser = users().get(index);

        final String birthday = Console.readLine("Birth Day:");

        ctrl.registerNewManager(systemUser,birthday);
        return false;
    }

    @Override
    public String headline() {
        return "Register Manager...";
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

}
