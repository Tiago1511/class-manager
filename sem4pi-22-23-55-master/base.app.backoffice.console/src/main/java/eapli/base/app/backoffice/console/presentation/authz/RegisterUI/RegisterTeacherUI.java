package eapli.base.app.backoffice.console.presentation.authz.RegisterUI;

import eapli.base.teacherManagement.application.RegisterTeacherController;
import eapli.base.teacherManagement.domain.Acronym;
import eapli.base.teacherManagement.domain.TaxNumber;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.io.util.Console;
import eapli.framework.presentation.console.AbstractUI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class RegisterTeacherUI extends AbstractUI {

//    private final RegisterUserController ctrl = new RegisterUserController();

    private final RegisterTeacherController ctrl = new RegisterTeacherController();

    @Override
    protected boolean doShow() {
       // System.out.printf(users().get(1).email().toString()+"\n\n"); // ta tudo mal
        selectUser();
        int index= Console.readInteger("\nSelect User (number):")-1;
        SystemUser systemUser = users().get(index);

         String acronymDescription=null;
         String taxNumberDescription=null;
        final String birthday;

        // readData(acronymDescription,taxNumberDescription);
        taxNumberDescription = Console.readLine("Tax Number:");

        acronymDescription = Console.readLine("Acronym:");
        birthday = Console.readLine("Birth Day:");

        ctrl.registerNewTeacher(systemUser,acronymDescription,taxNumberDescription,birthday);
        return false;
    }

    protected void selectUser(){
        System.out.printf("   Username   Email\n");
        for (int i = 0; i < users().size(); i++) {
            System.out.printf("\n%d. %s  %s\n",i+1,users().get(i).username(),users().get(i).email());
        }
    }

    protected void readData(String acronymDescription, String taxNumberDescription){

        Acronym acronym=null;
        TaxNumber taxNumber=null;

        while(acronym==null||taxNumber==null){
            try {
                taxNumberDescription = Console.readLine("Tax Number:");
                taxNumber = new TaxNumber(taxNumberDescription);

                acronymDescription = Console.readLine("Acronym:");
                 acronym = new Acronym(acronymDescription);

            }catch (IllegalArgumentException e){
                System.out.printf("\nError on the typed data\n");
            }
        }


    }

    protected List<SystemUser> users(){
        List<SystemUser> userList = ctrl.getUsers();
        return userList;
    }


    @Override
    public String headline() {
        return "Register Teacher";
    }
}
