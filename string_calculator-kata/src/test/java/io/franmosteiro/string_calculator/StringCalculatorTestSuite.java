package io.franmosteiro.string_calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        assertEquals(Double.valueOf(0), strCalc.add(""));
    }

    @Test
    public void str_containing_one_number_should_return_its_value() {
        assertEquals(Double.valueOf(1.1), strCalc.add("1.1"));
        assertEquals(Double.valueOf(1), strCalc.add("1"));
        assertEquals(Double.valueOf(2), strCalc.add("2"));
        assertEquals(Double.valueOf(5), strCalc.add("5"));
        assertEquals(Double.valueOf(15), strCalc.add("15"));
    }

    @Test
    public void str_containing_2_numbers_should_return_their_sum() {
        assertEquals(Double.valueOf(3), strCalc.add("1,2"));
        assertEquals(Double.valueOf(6), strCalc.add("2,4"));
        assertEquals(Double.valueOf(6), strCalc.add("5,1"));
        assertEquals(Double.valueOf(16), strCalc.add("15,1"));
    }

    @Test
    public void str_containing_3_numbers_should_return_their_sum() {
        assertEquals(Double.valueOf(6), strCalc.add("1,2,3"));
        assertEquals(Double.valueOf(7), strCalc.add("2,4,1"));
        assertEquals(Double.valueOf(6), strCalc.add("5,1,0"));
        assertEquals(Double.valueOf(31), strCalc.add("15,1,15"));
        assertEquals(Double.valueOf(1.1), strCalc.add("0.4,0.4,0.3"));
    }

    @Test
    public void str_containing_newLine_asSeparator_should_return_sum_of_containing_numbers() {
        assertEquals(Double.valueOf(6), strCalc.add("1\n2,3"));
    }

    @Test
    public void str_containing_newLine_inAnIncorrectPosition_should_fail() {
        assertThrows(NumberFormatException.class, () -> strCalc.add("175.2,\n35"));
        assertThrows(NumberFormatException.class, () -> strCalc.add("1.2,3,\n1"));
    }
}
