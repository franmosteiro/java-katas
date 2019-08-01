package io.franmosteiro.string_calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTestSuite {

    private StringCalculator strCalc;

    @BeforeEach
    public void setUp() {
        strCalc = new StringCalculator();
    }

    @Test
    public void empty_str_should_return_zero() {
        assertEquals("0", strCalc.add(""));
    }

    @Test
    public void str_containing_one_number_should_return_its_value() {
        assertEquals("1.1", strCalc.add("1.1"));
        assertEquals("1", strCalc.add("1"));
        assertEquals("2", strCalc.add("2"));
        assertEquals("5", strCalc.add("5"));
        assertEquals("15", strCalc.add("15"));
    }

    @Test
    public void str_containing_2_numbers_should_return_their_sum() {
        assertEquals("3", strCalc.add("1,2"));
        assertEquals("6", strCalc.add("2,4"));
        assertEquals("6", strCalc.add("5,1"));
        assertEquals("16", strCalc.add("15,1"));
        assertEquals("4", strCalc.add("4,"));
        assertEquals("2", strCalc.add(",2"));
        assertEquals("2.2", strCalc.add(",2.2"));
        assertEquals("3.3", strCalc.add("1.1,2.2"));
    }

    @Test
    public void str_containing_3_numbers_should_return_their_sum() {
        assertEquals("6", strCalc.add("1,2,3"));
        assertEquals("7", strCalc.add("2,4,1"));
        assertEquals("6", strCalc.add("5,1,0"));
        assertEquals("31", strCalc.add("15,1,15"));
        assertEquals("1", strCalc.add(",1,0"));
        assertEquals("78", strCalc.add("78,,0"));
        assertEquals("1.1", strCalc.add("0.4,0.4,0.3"));
        assertEquals("0.3", strCalc.add("0.3,,0"));
    }

    @Test
    public void str_containing_newLine_asSeparator_should_return_sum_of_containing_numbers() {
        assertEquals("6", strCalc.add("1\\n2,3"));
        assertEquals("3.3", strCalc.add("1.1\\n2.2"));
        assertEquals("5.3", strCalc.add("1.1,4.2\\n"));
    }

}
