package com.L00163287.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class L00163287ApplicationTests {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAddition() {
        assertEquals(9.0, calculator.addition(4, 5), "Addition worked");
    }

    @Test
    void testSubtraction() {
        assertEquals(5.0, calculator.subtraction(10, 5), "Substraction worked");
    }

    @Test
    void testMultiplication() {
        assertEquals(50.0, calculator.multiply(10, 5), "Multiplication worked");
    }

    @Test
    void testDivision() { assertEquals(5.0, calculator.division(50, 10), "Division worked"); }

    @Test
    void testReminder() { assertEquals(0.0, calculator.Reminder(10, 2), "Reminder worked"); }

}
