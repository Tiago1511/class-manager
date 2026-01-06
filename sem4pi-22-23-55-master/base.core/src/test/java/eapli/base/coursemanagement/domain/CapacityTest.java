package eapli.base.coursemanagement.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CapacityTest {

    @Test
    void maxCapacity() {
        assertThrows(IllegalArgumentException.class, () -> {
            Capacity capacity = new Capacity(10, 2);
            capacity.maxCapacity();
        });
    }

    @Test
    void minCapacity() {
        assertThrows(IllegalArgumentException.class, () -> {
            Capacity capacity = new Capacity(-1, 20);
            capacity.maxCapacity();
        });
    }

    @Test
    void minCapacityZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Capacity capacity = new Capacity(0, 20);
            capacity.maxCapacity();
        });
    }

    @Test
    void capacity() {
        Capacity capacity = new Capacity(10, 20);
        assertEquals(10, capacity.minCapacity());
        assertEquals(20, capacity.maxCapacity());
    }
}