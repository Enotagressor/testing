package pro.sky.testing.service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.testing.exeption.ZeroExeption;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.testing.service.Constants.*;

class CalculServiceTest {
    private final CalculatorService calculatorService = new CalculService();

    @Test
    void plusOneOne() {
        Integer result = calculatorService.plus(ONE, ONE);
        assertEquals(ONE + ONE, result);
    }
    @Test
    void plusTwoOne() {
        Integer result = calculatorService.plus(TWO, ONE);
        assertEquals(TWO + ONE, result);
    }

    @Test
    void minusTwoOne() {
        Integer result = calculatorService.minus(TWO, ONE);
        assertEquals(TWO - ONE, result);
    }
    @Test
    void minusThreeOne() {
        Integer result = calculatorService.minus(THREE, ONE);
        assertEquals(THREE - ONE, result);
    }

    @Test
    void multiplyTwoThree() {
        Integer result = calculatorService.multiply(TWO, THREE);
        assertEquals(TWO * THREE, result);
    }
    @Test
    void multiplyTwoTwo() {
        Integer result = calculatorService.multiply(TWO, TWO);
        assertEquals(TWO * TWO, result);
    }

    @Test
    void divideTwoTwo() {
        Integer result = calculatorService.divide(TWO, TWO);
        assertEquals(TWO / TWO, result);
    }
    @Test
    void divideThreeOne() {
        Integer result = calculatorService.divide(THREE, ONE);
        assertEquals(THREE / ONE, result);
    }
    @Test
    void divideByZeroExeption(){
        assertThrows(ZeroExeption.class, () -> calculatorService.divide(ONE, ZERO));
    }
}