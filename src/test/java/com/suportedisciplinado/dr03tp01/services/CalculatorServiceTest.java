package com.suportedisciplinado.dr03tp01.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    void add() {
        Double result = calculatorService.add(10.0, 4.0);
        assertEquals(14.0, result);
    }

    @Test
    void subtract() {
        Double result = calculatorService.subtract(5.0, 3.0);
        assertEquals(2.0, result);
    }

    @Test
    void multiply() {
        Double result = calculatorService.multiply(5.0, 3.0);
        assertEquals(15.0, result);
    }

    @Test
    void divide() {
        Double result = calculatorService.divide(6.0, 3.0);
        assertEquals(2.0, result);
    }
}