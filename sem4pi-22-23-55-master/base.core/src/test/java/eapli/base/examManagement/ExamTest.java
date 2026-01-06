package eapli.base.examManagement;
import eapli.base.coursemanagement.domain.Course;
import eapli.base.coursemanagement.dto.CourseDTO;
import eapli.base.examManagement.domain.NormalExamDomain.Exam;
import eapli.base.teacherManagement.domain.Teacher;
import eapli.base.teacherManagement.domain.TeacherBuilder;
import eapli.framework.infrastructure.authz.application.AuthorizationService;
import eapli.framework.infrastructure.authz.application.AuthzRegistry;
import eapli.framework.infrastructure.authz.domain.model.SystemUser;
import eapli.framework.infrastructure.authz.domain.model.SystemUserBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExamTest {
    private final String title = "Sample Exam";
    private final String examContent = "Sample exam content";
    private final Course course = null;// new CourseDTO("SC1","Sciences","Intro-Sciences-Sem2","Biology, Chemistry, and Physics",30,100,"OPEN",teacherUser.acronym().acronym(),teacherUser.taxNumber().taxNumber());
    //Teacher teacherUser = new TeacherBuilder().systemUser(systemUser).acronym("mp").build();//(systemUser,"mp","123456789","1/1/1990");

  //  private final AuthorizationService authz = AuthzRegistry.authorizationService();
//    private final SystemUser systemUser = (authz.session().get().authenticatedUser());


    @Test
    public void testExamInitialization() {
        Exam exam = new Exam(title, examContent, course);

        assertEquals(title, exam.getTitle());
        assertEquals(examContent, exam.getExamContent());
        assertEquals(course, exam.getCourse());
    }

    @Test
    public void testExamEqualsPassesForTheSameTitle() {
        Exam exam1 = new Exam("Sample Exam", examContent, course);
        Exam exam2 = new Exam("Sample Exam", "Different exam content", course);

        boolean expected = exam1.equals(exam2);

        assertFalse(expected);
    }

    @Test
    public void testExamEqualsFailsForDifferentTitle() {
        Exam exam1 = new Exam("Sample Exam 1", examContent, course);
        Exam exam2 = new Exam("Sample Exam 2", examContent, course);

        boolean expected = exam1.equals(exam2);

        assertFalse(expected);
    }

    @Test
    public void testExamEqualsAreTheSameForTheSameInstance() {
        Exam exam = new Exam(title, examContent, course);

        boolean expected = exam.equals(exam);

        assertTrue(expected);
    }

    @Test
    public void testExamEqualsFailsForDifferentObjectTypes() {
        Exam exam = new Exam(title, examContent, course);

        boolean expected = exam.equals("Some other object");

        assertFalse(expected);
    }

    @Test
    public void testExamSameAsReturnsTrueForTheSameInstance() {
        Exam exam = new Exam(title, examContent, course);

        boolean expected = exam.sameAs(exam);

        assertTrue(expected);
    }

    @Test
    public void testExamSameAsReturnsFalseForDifferentInstances() {
        Exam exam1 = new Exam("Sample Exam 1", examContent, course);
        Exam exam2 = new Exam("Sample Exam 2", examContent, course);

        boolean expected = exam1.sameAs(exam2);

        assertTrue(expected);
    }
}
