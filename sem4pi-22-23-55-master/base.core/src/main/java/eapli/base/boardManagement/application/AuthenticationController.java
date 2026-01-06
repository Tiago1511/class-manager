package eapli.base.boardManagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.teacherManagement.application.RegisterTeacherController;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;


import java.util.List;

public class AuthenticationController {
    //private UserRepository repo = PersistenceContext.repositories().users();
    private final RegisterTeacherController ctrl = new RegisterTeacherController();

    //private Server server;


    public void verifyLogin(String username) {
        if (ctrl.getUsers().isEmpty()) {
            for (SystemUser user : ctrl.getUsers()) {
                if (user.identity().toString().equals(username)) {
                    //return true;
                }
            }
        }
        //return false;
    }


    protected List<SystemUser> users(){
        List<SystemUser> userList = ctrl.getUsers();
        return userList;
    }
}
