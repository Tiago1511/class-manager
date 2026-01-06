package eapli.base.coursemanagement.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditionTest {

    @Test
    void FailvalidCapacity() {
        assertThrows(IllegalArgumentException.class, () -> {
            Edition edition = new Edition("Intro-Java-Sem-01");
            edition.validCapacity("Intro-Java-Sem-01");
        });
    }

    @Test
    void validCapacity() {
        Edition edition = new Edition("Intro-Java-Sem01");
        assertTrue(edition.validCapacity("Intro-Java-Sem01"));
    }
}