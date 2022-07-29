package pro.sky.testing.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.testing.service.Constants.*;

public class CalculServiceParamTest {
    private final CalculatorService calculatorService = new CalculService();

    private static Stream<Arguments> provideCalculatorParams(){
        return Stream.of(
          Arguments.of(ONE, TWO),
          Arguments.of(TWO, TWO),
          Arguments.of(TWO, THREE),
          Arguments.of(ZERO, THREE)
        );
    }
    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldPlusCorrect(Integer num1, Integer num2){
        Integer result = calculatorService.plus(num1, num2);
        assertEquals(num1 + num2, result);
    }
    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldMinusCorrect(Integer num1, Integer num2){
        Integer result = calculatorService.minus(num1, num2);
        assertEquals(num1 - num2, result);
    }
    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldMultiplyCorrect(Integer num1, Integer num2){
        Integer result = calculatorService.multiply(num1, num2);
        assertEquals(num1 * num2, result);
    }
    @ParameterizedTest
    @MethodSource("provideCalculatorParams")
    public void shouldDivideCorrect(Integer num1, Integer num2){
        Integer result = calculatorService.divide(num1, num2);
        assertEquals(num1 / num2, result);
    }
}
