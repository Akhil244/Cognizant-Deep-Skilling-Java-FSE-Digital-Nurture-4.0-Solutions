package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        assertEquals(2, 1 + 1);
        assertTrue(5 > 2);
        assertFalse(2 > 5);
        assertNull(null);
        assertNotNull("hello");
    }
}
