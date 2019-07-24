package io.franmosteiro.string_calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTestSuite {

    @Test
    public void empty_str_should_return_zero() {
        StringCalculator strCalc = new StringCalculator();
        assertEquals("0", strCalc.add(""));
    }
}
