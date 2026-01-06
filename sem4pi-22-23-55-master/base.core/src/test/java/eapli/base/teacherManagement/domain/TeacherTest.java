package eapli.base.teacherManagement.domain;

import eapli.base.studentManagement.domain.Student;
import eapli.base.studentManagement.domain.StudentBuilder;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.domain.model.*;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TeacherTest {

    private final String anAcronym = "abc";
    private final String anotherAcronym = "xyz";


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
    public void ensureTeacherEqualsPassesForTheSameAcronym() throws Exception{
        final Teacher aTeacher = new TeacherBuilder().acronym(anAcronym).systemUser(getNewDummyUser()).build();

        final Teacher anotherTeacher = new TeacherBuilder().acronym(anAcronym).systemUser(getNewDummyUser()).build();

        final boolean expected= aTeacher.equals(anotherTeacher);
        assertTrue(expected);

    }


    @Test
    public void ensureTeacherEqualsFailsForDifferentAcronyms()throws Exception {
        final Set<Role> roles=new HashSet<>();
        roles.add(BaseRoles.ADMIN);

        final Teacher aTeacher = new TeacherBuilder().acronym(anotherAcronym).systemUser(getNewDummyUser()).build();

        final Teacher anotherTeacher = new TeacherBuilder().acronym(anAcronym).systemUser(getNewDummyUser()).build();

        final boolean expected= aTeacher.equals(anotherTeacher);
        assertFalse(expected);
    }


    @Test
    public void ensureTeacherEqualsAreTheSameForTheSameInstance() throws Exception {
        final Teacher teacher = new TeacherBuilder().acronym(anAcronym)
                .systemUser(getNewDummyUser()).build();

        final boolean expected = teacher.equals(teacher);

        assertTrue(expected);
    }

    @Test
    public void ensureTeacherEqualsFailsForDifferentObjectTypes() throws Exception {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);

        final Teacher aTeacher = new TeacherBuilder().acronym(anAcronym)
                .systemUser(getNewDummyUser()).build();

        final boolean expected = aTeacher.equals(getNewDummyUser());

        assertFalse(expected);
    }

    @Test
    public void ensureTeacherIsTheSameAsItsInstance() throws Exception {
        final Teacher aTeacher = new TeacherBuilder().acronym(anAcronym)
                .systemUser(getNewDummyUser()).build();

        final boolean expected = aTeacher.sameAs(aTeacher);

        assertTrue(expected);
    }

    @Test
    public void ensureTwoTeachersWithDifferentAcronymsAreNotTheSame() throws Exception {
        final Set<Role> roles = new HashSet<>();
        roles.add(BaseRoles.ADMIN);
        final Teacher aTeacher = new TeacherBuilder().acronym(anAcronym)
                .systemUser(getNewDummyUser()).build();

        final Teacher anotherTeacher = new TeacherBuilder()
                .acronym(anotherAcronym).systemUser(getNewDummyUser()).build();

        final boolean expected = aTeacher.sameAs(anotherTeacher);

        assertFalse(expected);
    }


}
