package com.example;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorLifecycleTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
        System.out.println("Setting up Calculator instance...");
    }

    @After
    public void tearDown() {
        System.out.println("Tearing down after test...");
    }

    @Test
    public void testAddition() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }
}