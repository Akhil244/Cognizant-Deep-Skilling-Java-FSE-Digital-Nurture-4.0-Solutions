package com.example;

import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class CalculatorLifecycleTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        // Arrange (setup before each test)
        calculator = new Calculator();
        System.out.println("Setting up Calculator instance...");
    }

    @After
    public void tearDown() {
        // Teardown (after each test)
        System.out.println("Tearing down after test...\n");
    }

    @Test
    public void testAddition() {
        // Arrange: handled by setUp

        // Act
        int result = calculator.add(2, 3);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testDivision() {
        // Act
        int result = calculator.divide(10, 2);

        // Assert
        assertEquals(5, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        // Act & Assert: exception expected
        calculator.divide(10, 0);
    }
}
