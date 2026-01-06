package eapli.base.managerManagement.domain;

import eapli.base.studentManagement.domain.Student;
import eapli.base.studentManagement.domain.StudentBuilder;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.base.teacherManagement.domain.TeacherBuilder;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.domain.model.*;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ManagerTest {

    private final String anEmail = "a@email.com";
    private final String anotherEmail = "another@email.com";


    public static SystemUser dummyUser(final String username,String email, final Role... roles) {
        // should we load from spring context?
        final SystemUserBuilder userBuilder = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder());
        return userBuilder.with(username, "duMMy1", "dummy", "dummy", email).withRoles(roles).build();
    }

    private SystemUser getNewDummyUser() {
        return dummyUser("dummy", anEmail,BaseRoles.ADMIN);
    }

    private SystemUser getNewDummyUserTwo() {
        return dummyUser("dummy-two",anotherEmail ,BaseRoles.ADMIN);
    }



    @Test
    public void ensureManagerEqualsAreTheSameForTheSameInstance() throws Exception {
        final Manager manager = new ManagerBuilder()
                .systemUser(getNewDummyUser()).build();

        final boolean expected = manager.equals(manager);

        assertTrue(expected);
    }

    @Test
    public void ensureManagerEqualsFailsForDifferentObjectTypes() throws Exception {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);

        final Manager aManager = new ManagerBuilder().systemUser(getNewDummyUser()).build();

        final boolean expected = aManager.equals(getNewDummyUser());

        assertFalse(expected);
    }

    @Test
    public void ensureManagerIsTheSameAsItsInstance() throws Exception {
        final Manager aManager = new ManagerBuilder()
                .systemUser(getNewDummyUser()).build();

        final boolean expected = aManager.sameAs(aManager);

        assertTrue(expected);
    }


}
