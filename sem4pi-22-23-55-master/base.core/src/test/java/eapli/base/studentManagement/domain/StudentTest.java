package eapli.base.studentManagement.domain;

import eapli.base.clientusermanagement.domain.ClientUser;
import eapli.base.clientusermanagement.domain.ClientUserBuilder;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.domain.model.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nuno Bettencourt [NMB] on 03/04/16.
 */
public class StudentTest {
    private final String aMecanographicNumber = "1211221";
    private final String anotherMecanographicNumber = "1211111";


    public static SystemUser dummyUser(final String username, final Role... roles) {
        // should we load from spring context?
        final SystemUserBuilder userBuilder = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder());
        return userBuilder.with(username, "duMMy1", "dummy", "dummy", "a@b.ro").withRoles(roles).build();
    }

    private SystemUser getNewDummyUser() {
        return dummyUser("dummy", BaseRoles.ADMIN);
    }

    private SystemUser getNewDummyUserTwo() {
        return dummyUser("dummy-two", BaseRoles.ADMIN);
    }

    @Test
    public void ensureStudentEqualsPassesForTheSameMecanographicNumber() throws Exception{
        final Student aStudent = new StudentBuilder().mecanographicNumber(aMecanographicNumber).systemUser(getNewDummyUser()).build();

        final Student anotherStudent = new StudentBuilder().mecanographicNumber(aMecanographicNumber).systemUser(getNewDummyUser()).build();

        final boolean expected= aStudent.equals(anotherStudent);
        assertTrue(expected);

    }


    @Test
    public void ensureStudentEqualsFailsForDifferentMecanographicNumber()throws Exception {
        final Set<Role> roles=new HashSet<>();
        roles.add(BaseRoles.ADMIN);

        final Student aStudent = new StudentBuilder().mecanographicNumber(anotherMecanographicNumber).systemUser(getNewDummyUser()).build();

        final Student anotherStudent = new StudentBuilder().mecanographicNumber(aMecanographicNumber).systemUser(getNewDummyUser()).build();

        final boolean expected= aStudent.equals(anotherStudent);
        assertFalse(expected);
    }


    @Test
    public void ensureStudentEqualsAreTheSameForTheSameInstance() throws Exception {
        final Student student = new Student();

        final boolean expected = student.equals(student);

        assertTrue(expected);
    }

    @Test
    public void ensureClientUserEqualsFailsForDifferenteObjectTypes() throws Exception {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);

        final Student aStudent = new StudentBuilder().mecanographicNumber(aMecanographicNumber)
                .systemUser(getNewDummyUser()).build();

        final boolean expected = aStudent.equals(getNewDummyUser());

        assertFalse(expected);
    }

    @Test
    public void ensureStudentIsTheSameAsItsInstance() throws Exception {
        final Student aStudent = new StudentBuilder().mecanographicNumber(aMecanographicNumber)
                .systemUser(getNewDummyUser()).build();

        final boolean expected = aStudent.sameAs(aStudent);

        assertTrue(expected);
    }

    @Test
    public void ensureTwoStudentsWithDifferentMecanographicNumbersAreNotTheSame() throws Exception {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);
        final Student aStudent = new StudentBuilder().mecanographicNumber(aMecanographicNumber)
                .systemUser(getNewDummyUser()).build();

        final Student anotherStudent = new StudentBuilder()
                .mecanographicNumber(anotherMecanographicNumber).systemUser(getNewDummyUser()).build();

        final boolean expected = aStudent.sameAs(anotherStudent);

        assertFalse(expected);
    }


}
