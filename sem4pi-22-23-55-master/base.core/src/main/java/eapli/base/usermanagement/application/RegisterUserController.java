package eapli.base.usermanagement.application;

import eapli.base.infrastructure.persistence.PersistenceContext;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.base.usermanagement.domain.RegisteredUser;
import eapli.base.usermanagement.domain.UserBuilder;
import eapli.framework.general.domain.model.EmailAddress;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.application.UserManagementService;
import eapli.framework.infrastructure.authz.domain.model.*;
import eapli.framework.infrastructure.authz.domain.repositories.UserRepository;

import java.util.List;
import java.util.Set;

public class RegisterUserController {

    private final AuthorizationService authz = AuthzRegistry.authorizationService();
    private final UserManagementService userSvc = AuthzRegistry.userService();

    private final UserRepository repository = PersistenceContext.repositories().users();

    /**
     * Get existing RoleTypes available to the user.
     *
     * @return a list of RoleTypes
     */

    public List<SystemUser> getUsers(){
        return (List<SystemUser>) repository.findByActive(true);
    }

    public SystemUser findByEmail(String email){
        throw new UnsupportedOperationException();
    }


    public SystemUser registerUser(final Username username, final Password password, final Name name, final EmailAddress email, final Set<Role> roles) {
        authz.ensureAuthenticatedUserHasAnyOf(BaseRoles.POWER_USER, BaseRoles.TEACHER,BaseRoles.STUDENT,BaseRoles.MANAGER);
        return userSvc.registerUser(username, password,name,email,roles);
    }


    public RegisteredUser registerNewTeacher(final SystemUser user, final String acronym, final String taxNumber){

        if (user.isActive()){ // isto ta correto?
            return new UserBuilder().systemUser(user).acronym(acronym).taxNumber(taxNumber).build();
        }else {
            throw new IllegalArgumentException("This user is not active");
        }
    }

    public RegisteredUser registerNewStudent(final SystemUser user, final String mecanographicNumber, final String taxNumber){

        if (user.isActive()){ // isto ta correto?
            return new UserBuilder().systemUser(user).mecanographicNumber(mecanographicNumber).taxNumber(taxNumber).build();
        }else {
            throw new IllegalArgumentException("This user is not active");
        }
    }




}
