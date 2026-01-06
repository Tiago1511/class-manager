package eapli.base.coursemanagement.domain;

import eapli.base.teacherManagement.domain.Acronym;
import eapli.base.teacherManagement.domain.TaxNumber;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.base.usermanagement.domain.BaseRoles;
import eapli.framework.infrastructure.authz.domain.model.*;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CourseBuilderTest {

    private final Capacity capacity = new Capacity(10, 20);

    private final Status status = Status.OPEN;

    private final String title = "Intro-Java-Sem01";

    private final String code = "123";

    private final String description = "Programming in Java";

    private final Edition edition = new Edition("Intro-Java-Sem01");

    private final String aMecanographicNumber = "abc";
    private final String anotherMecanographicNumber = "xyz";

    public static SystemUser dummyUser(final String username, final Role... roles) {
        // should we load from spring context?
        final SystemUserBuilder userBuilder = new SystemUserBuilder(new NilPasswordPolicy(), new PlainTextEncoder());
        return userBuilder.with(username, "duMMy1", "dummy", "dummy", "a@b.ro").withRoles(roles).build();
    }

    private SystemUser getNewDummyUserTwo() {
        return dummyUser("dummy-two", BaseRoles.TEACHER);
    }

    Teacher teacher = new Teacher(getNewDummyUserTwo(), new Acronym("ASD"), new TaxNumber("223925810"), new Date("12/12/1965"));
    Teacher teacherOne = new Teacher(getNewDummyUserTwo(), new Acronym("ASD"), new TaxNumber("223925810"), new Date("12/12/1965"));

    Teacher teacherTwo = new Teacher(getNewDummyUserTwo(), new Acronym("ASF"), new TaxNumber("223925810"), new Date("12/12/1965"));
    CourseBuilder courseBuilder = new CourseBuilder();
    @Test
    void capacity() {
        assertSame(courseBuilder, courseBuilder.capacity(capacity));
    }

    @Test
    void failCapacity() {
        Capacity expected = new Capacity(10, 50);
        CourseBuilder courseBuilder1 = new CourseBuilder();
        assertNotSame(courseBuilder1, courseBuilder.capacity(expected));
    }

    @Test
    void status() {
        assertSame(courseBuilder, courseBuilder.status(status));
    }

    @Test
    void failStatus() {
        Status expected = Status.CLOSE;
        CourseBuilder courseBuilder1 = new CourseBuilder();
        assertNotSame(courseBuilder1, courseBuilder.status(expected));
    }

    @Test
    void title() {
        assertSame(courseBuilder, courseBuilder.title(title));
    }

    @Test
    void failTitle() {
        String expected = "Intro-Java-Sem02";
        CourseBuilder courseBuilder1 = new CourseBuilder();
        assertNotSame(courseBuilder1, courseBuilder.title(expected));
    }

    @Test
    void code() {
        assertSame(courseBuilder, courseBuilder.code(code));
    }

    @Test
    void failCode() {
        String expected = "1234";
        CourseBuilder courseBuilder1 = new CourseBuilder();
        assertNotSame(courseBuilder1, courseBuilder.code(expected));
    }

    @Test
    void description() {
        assertSame(courseBuilder, courseBuilder.description(description));
    }

    @Test
    void failDescription() {
        String expected = "Programming in C";
        CourseBuilder courseBuilder1 = new CourseBuilder();
        assertNotSame(courseBuilder1, courseBuilder.description(expected));
    }

    @Test
    void teacher() {
        HashSet teacherSet = new HashSet<>();
        teacherSet.add(teacher);
        teacherSet.add(teacherTwo);
        assertSame(courseBuilder, courseBuilder.teacher(teacherSet));
    }

    @Test
    void failTeacherSet() {
        HashSet teacherSet = new HashSet();
        teacherSet.add(teacher);
        teacherSet.add(teacher);
        teacherSet.add(teacherOne);
        assertEquals(1, teacherSet.size());
    }

    @Test
    void failTeacher() {
        HashSet teacherSet = new HashSet();
        teacherSet.add(teacher);
        CourseBuilder courseBuilder1 = new CourseBuilder();
        assertNotSame(courseBuilder1, courseBuilder.teacher(teacherSet));
    }

    @Test
    void build() {
        HashSet teacherSet = new HashSet();
        teacherSet.add(teacher);
        teacherSet.add(teacherTwo);
        Course expected = new Course(title, code, edition, description,capacity, status, teacher, teacherSet);
        CourseBuilder courseBuilder1 = new CourseBuilder();
        courseBuilder1.capacity(capacity);
        courseBuilder1.status(status);
        courseBuilder1.title(title);
        courseBuilder1.code(code);
        courseBuilder1.description(description);
        courseBuilder1.teacher(teacherSet);
        courseBuilder1.edition(edition);
        assertEquals(expected, courseBuilder1.build());
    }
}