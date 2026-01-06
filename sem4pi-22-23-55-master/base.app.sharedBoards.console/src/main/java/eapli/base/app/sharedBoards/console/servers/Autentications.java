package eapli.base.app.sharedBoards.console.servers;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;

import java.util.List;

public class Autentications {
    private final UserRepository repository = PersistenceContext.repositories().users();

    /*public boolean authenticate(String username, String password){
        List<SystemUser> users = getUsers();
        for (SystemUser user: users) {
            if (user.username().toString().equals(username) && .equals(password)){
                return true;
            }
        }
        return false;
    }*/

    public List<SystemUser> getUsers(){
        return (List<SystemUser>) repository.findAll();
    }
}
