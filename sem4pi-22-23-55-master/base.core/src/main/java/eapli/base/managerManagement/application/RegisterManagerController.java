package eapli.base.managerManagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.managerManagement.domain.Manager;
import eapli.base.managerManagement.domain.ManagerBuilder;
import eapli.base.managerManagement.repositories.ManagerRepository;
import eapli.base.studentManagement.domain.Student;
import eapli.base.studentManagement.domain.StudentBuilder;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class RegisterManagerController {
    private final UserRepository repository = PersistenceContext.repositories().users();
    private final ManagerRepository managerRepository= PersistenceContext.repositories().managers();


    public Manager registerNewManager(final SystemUser user, final String birthday){

        if (user.isActive()){
            Manager manager=null;

            try {
                manager = new ManagerBuilder().systemUser(user).birthday(birthday).build();
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }

            managerRepository.save(manager);
            return manager;
        }else {
            throw new IllegalArgumentException("This user is not active");
        }
    }

    public List<SystemUser> getUsers(){
        return (List<SystemUser>) repository.findByActive(true);
    }

}
