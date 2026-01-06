package eapli.base.ClassManagement.domain;

import eapli.base.coursemanagement.domain.Course;
import eapli.base.teacherManagement.domain.Teacher;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalTime;
import java.util.Calendar;

public class ClassBuilderTest {
    Course course;
    Teacher teacherLecturing;
    Calendar startingDat = java.util.Calendar.getInstance();
    LocalTime startingTime = java.time.LocalTime.of(10, 27, 17);
    LocalTime endingTime = java.time.LocalTime.of(11, 27, 17);
    Class classUnderTest = new Class(course, "desc", teacherLecturing, startingDat, startingTime, endingTime);


    Calendar finishingDate;
    ClassBuilder classBuilder = new ClassBuilder().course(course).description("desc").endingTime(endingTime).startingTime(startingTime).stratingDate(startingDat).teacher(teacherLecturing);

    @Test
    public void testCode() throws Exception {
        ClassBuilder result = classBuilder.code(0);
        Assert.assertEquals(classBuilder.code(0), result);
    }

    @Test
    public void testDescription() throws Exception {
        ClassBuilder result = classBuilder.description("desc");
        Assert.assertEquals(classBuilder.description("desc"), result);
    }

    @Test
    public void testFinishingDate() throws Exception {
        ClassBuilder result = classBuilder.finishingDate(finishingDate);
        Assert.assertEquals(classBuilder.finishingDate(finishingDate), result);
    }

    @Test
    public void testStratingDate() throws Exception {
        ClassBuilder result = classBuilder.stratingDate(startingDat);
        Assert.assertEquals(classBuilder.stratingDate(startingDat), result);
    }

    @Test
    public void testStartingTime() throws Exception {
        ClassBuilder result = classBuilder.startingTime(LocalTime.of(10, 55, 43));
        Assert.assertEquals(classBuilder.startingTime(startingTime), result);
    }

    @Test
    public void testEndingTime() throws Exception {
        ClassBuilder result = classBuilder.endingTime(LocalTime.of(10, 55, 43));
        Assert.assertEquals(classBuilder.endingTime(endingTime), result);
    }
}
