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
        assertEquals(5.0, calculator.subtraction(10, 5), "Addition worked");
    }

    @Test
    void testMultiplication() {
        assertEquals(50.0, calculator.multiply(10, 5), "Addition worked");
    }

}
