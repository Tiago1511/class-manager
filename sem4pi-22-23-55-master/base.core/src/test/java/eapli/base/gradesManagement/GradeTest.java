package eapli.base.gradesManagement;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.examManagement.domain.NormalExamDomain.Exam;
import eapli.base.gradeManagement.domain.Grade;
import eapli.base.studentManagement.domain.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeTest {
    private final String examTitle = "Sample Exam";
    private final String examContent = "Sample exam content";
    private final Course course = null;
    private final Student student = null;

    @Test
    public void testGradeInitialization() {
        Exam exam = new Exam(examTitle, examContent, course);
        int score = 85;

        Grade grade = new Grade(exam, score, student);

        assertEquals(exam, grade.getExam());
        assertEquals(score, grade.getScore());

    }

    @Test
    public void testGradeSameAsReturnsTrueForTheSameInstance() {
        Exam exam = new Exam(examTitle, examContent, course);
        int score = 85;

        Grade grade = new Grade(exam, score, student);

        boolean expected = grade.sameAs(grade);

        assertFalse(expected);
    }

    @Test
    public void testGradeSameAsReturnsFalseForDifferentInstances() {
        Exam exam1 = new Exam(examTitle, examContent, course);
        int score1 = 85;
        //Student student1 = new Student(null,null,null);

        Grade grade1 = new Grade(exam1, score1,null);

        Exam exam2 = new Exam(examTitle, examContent, course);
        int score2 = 90;
        //Student student2 = new Student();

        Grade grade2 = new Grade(exam2, score2, null);

        boolean expected = grade1.sameAs(grade2);

        assertFalse(expected);
    }
}