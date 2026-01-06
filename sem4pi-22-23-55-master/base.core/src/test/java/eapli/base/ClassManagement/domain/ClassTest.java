package eapli.base.ClassManagement.domain;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.teacherManagement.domain.Teacher;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;
import java.util.Calendar;


public class ClassTest {
    Course course;
    Teacher teacherLecturing;
    Calendar startingDat = java.util.Calendar.getInstance();
    LocalTime startingTime = java.time.LocalTime.of(10, 27, 17);
    LocalTime endingTime = java.time.LocalTime.of(11, 27, 17);
    Class classUnderTest = new Class(course, "desc", teacherLecturing, startingDat, startingTime, endingTime);



    @Test
    public void testEquals() {
        boolean result = classUnderTest.equals("o");
        Assert.assertFalse(result);
    }


    @Test
    public void testStartingDate() {
        Calendar result = classUnderTest.startingDate();
        Assert.assertEquals(startingDat, result);
    }

}
