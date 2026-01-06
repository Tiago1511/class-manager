package eapli.base.coursemanagement.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatusTest {

    @Test
    void status() {
        Status status = Status.CLOSE;
        assertEquals(Status.CLOSE, status.status());
    }

    @Test
    void failstatus() {
        Status status = Status.CLOSE;
        assertNotEquals(Status.OPEN, status.status());
    }

    @Test
    void open() {
        Status status = Status.OPEN;
        assertEquals(Status.OPEN, status.open());
    }

    @Test
    void isClose() {
        Status status = Status.CLOSE;
        assertTrue(status.isClose());
    }

    @Test
    void failIsClose() {
        Status status = Status.CLOSED;
        assertFalse(status.isClose());
    }

    @Test
    void isProgress() {
        Status status = Status.PROGRESS;
        assertTrue(status.isProgress());
    }

    @Test
    void failIsProgress() {
        Status status = Status.OPEN;
        assertFalse(status.isProgress());
    }

    @Test
    void openCourses() {
        Status status = Status.OPEN;
        assertTrue(status.openCourses());
    }

    @Test
    void failOpenCourses() {
        Status status = Status.PROGRESS;
        assertFalse(status.openCourses());
    }

    @Test
    void enrollCourses() {
        Status status = Status.ENROLL;
        assertTrue(status.enrollCourses());
    }

    @Test
    void failEnrollCourses() {
        Status status = Status.ENROLL;
        assertTrue(status.enrollCourses());
    }
    @Test
    void testToString() {
        Status status = Status.CLOSE;
        assertEquals("CLOSE", status.toString());
    }

    @Test
    void FailtestToString() {
        Status status = Status.CLOSE;
        assertNotEquals("OPEN", status.toString());
    }
}