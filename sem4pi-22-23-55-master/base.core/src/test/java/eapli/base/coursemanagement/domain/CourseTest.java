package eapli.base.coursemanagement.domain;

import eapli.base.coursemanagement.dto.CourseDTO;
import eapli.base.teacherManagement.domain.Acronym;
import eapli.base.teacherManagement.domain.TaxNumber;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.domain.model.*;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    private final String aMecanographicNumber = "abc";
    private final String anotherMecanographicNumber = "xyz";

    public static SystemUser dummyUser(final String username, final Role... roles) {
        // should we load from spring context?
        final SystemUserBuilder userBuilder = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder());
        return userBuilder.with(username, "duMMy1", "dummy", "dummy", "a@b.ro").withRoles(roles).build();
    }

    private SystemUser getNewDummyUser() {
        return dummyUser("dummy", BaseRoles.ADMIN);
    }

    private SystemUser getNewDummyUserTwo() {
        return dummyUser("dummy-two", BaseRoles.TEACHER);
    }

    Teacher teacher = new Teacher(getNewDummyUserTwo(), new Acronym("ASD"), new TaxNumber("223925810"), new Date("12/12/1965"));
    Course course = new Course("Intro-Java-Sem01", "Java",new Edition("Intro-Java-Sem01"), "Programação Orientada Objetos", new Capacity(20,30), Status.CLOSE, teacher);
    @Test
    void sameAs() {
        Course course = new Course("Intro-Java-Sem01", "Java",new Edition("Intro-Java-Sem01"), "Programação Orientada Objetos", new Capacity(20,30), Status.CLOSE, teacher);
        assertTrue(course.sameAs(course));
    }

    @Test
    void sameAsInstance() {
        assertFalse(course.sameAs(teacher));
    }

    @Test
    void testEquals() {
        Course course = new Course("Intro-Java-Sem01", "Java", new Edition("Intro-Java-Sem01"),"Programação Orientada Objetos", new Capacity(20,30), Status.CLOSE, teacher);
        assertTrue(course.equals(course));
    }

    @Test
    void failTestEquals() {
        Course course = new Course("Intro-Java-Sem01", "Java",new Edition("Intro-Java-Sem01"), "Programação", new Capacity(20,30), Status.CLOSE, teacher);
        assertTrue(course.equals(course));
    }

    @Test
    void testHashCode() {
    }

    @Test
    void identity() {
        String expected = "Java";
        assertEquals(expected, course.identity());
    }

    @Test
    void failIdentity() {
        String expected = "Java1";
        assertNotEquals(expected, course.identity());
    }

    @Test
    void toDTO() {
        CourseDTO courseDTO = new CourseDTO("Java","Intro-Java-Sem01","Intro-Java-Sem01", "Programação Orientada Objetos", 20, 30, "CLOSE", "ASD","223925810");
        assertEquals(courseDTO, course.toDTO());
    }

    @Test
    void failtoDTO() {
        CourseDTO courseDTO = new CourseDTO("Java1","Intro-Java-Sem01", "Intro-Java-Sem01","Programação Orientada Objetos", 20, 30, "CLOSE", "ASD","223925810");
        assertNotEquals(courseDTO, course.toDTO());
    }

    @Test
    void status() {
        Status expected = Status.CLOSE;
        assertEquals(expected, course.status());
    }

    @Test
    void failStatus() {
        Status expected = Status.OPEN;
        assertNotEquals(expected, course.status());
    }

    @Test
    void statusEntity() {
        Status expected = Status.OPEN;
        assertEquals(expected, course.status(Status.OPEN));
    }

    @Test
    void failStatusEntity() {
        Status expected = Status.ENROLL;
        assertNotEquals(expected, course.status(Status.OPEN));
    }

    @Test
    void title() {
        String expected = "Intro-Java-Sem01";
        assertEquals(expected, course.title());
    }

    @Test
    void failtitle() {
        String expected = "Intro-Java-Sem01";
        assertEquals(expected, course.title());
    }
}