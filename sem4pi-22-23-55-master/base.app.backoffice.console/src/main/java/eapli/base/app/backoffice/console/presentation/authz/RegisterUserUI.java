package eapli.base.app.backoffice.console.presentation.authz;

import eapli.base.app.backoffice.console.presentation.authz.RegisterUI.RegisterManagerUI;
import eapli.base.app.backoffice.console.presentation.authz.RegisterUI.RegisterStudentUI;
import eapli.base.app.backoffice.console.presentation.authz.RegisterUI.RegisterTeacherUI;
import eapli.framework.actions.menu.Menu;
import eapli.framework.presentation.console.AbstractUI;
import eapli.framework.presentation.console.menu.MenuItemRenderer;
import eapli.framework.presentation.console.menu.MenuRenderer;
import eapli.framework.presentation.console.menu.VerticalMenuRenderer;

import java.awt.*;

public class RegisterUserUI extends AbstractUI{

    @Override
    protected boolean doShow() {
        final Menu rolesMenu = roleOfUser();
        final MenuRenderer renderer = new VerticalMenuRenderer(rolesMenu, MenuItemRenderer.DEFAULT);
        return renderer.render();
    }

    private Menu roleOfUser(){
        final Menu menu = new Menu("Select type of User to register...n");

        menu.addItem(1,"Register Teacher", new RegisterTeacherUI()::show);
        menu.addItem(2,"Register Student", new RegisterStudentUI()::show);
        menu.addItem(3,"Register Manager", new RegisterManagerUI()::show);


        return menu;
    }

    @Override
    public String headline() {
        return "Register User";
    }

}
    /* private final RegisterUserController ctrl=new RegisterUserController();

    @Override
    protected boolean doShow() {

        System.out.printf(users().get(1).email().toString()+"\n\n"); // ta tudo mal

        final String acronym = Console.readLine("Acronym:");
        final String taxNumber = Console.readLine("Tax Number:");

        ctrl.registerNewTeacher(users().get(1),acronym,taxNumber); //criar metodo para selecionar user
        return false;
    }

    protected List<Role> roles() {
        List<Role> roleList = Arrays.asList(ctrl.getRoleTypes());
        System.out.printf(roleList.toString());
        return roleList;
    }

    protected List<SystemUser> users(){
        List<SystemUser> userList = ctrl.getUsers();
        System.out.printf(userList.toString());
        return userList;
    }




    @Override
    public String headline() {
        return "Register user";
    }

*/

