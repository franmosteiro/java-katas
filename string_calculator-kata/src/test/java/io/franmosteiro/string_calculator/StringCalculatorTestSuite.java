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
    public void empty_str_should_return_zero() throws ExceededNumberOfParametersException {
        assertEquals("0", strCalc.add(""));
    }

    @Test
    public void str_containing_one_number_should_return_its_value() throws ExceededNumberOfParametersException {
        assertEquals("1", strCalc.add("1"));
        assertEquals("2", strCalc.add("2"));
        assertEquals("5", strCalc.add("5"));
        assertEquals("15", strCalc.add("15"));
    }

    @Test
    public void str_containing_2_numbers_should_return_their_sum() throws ExceededNumberOfParametersException {
        assertEquals("3", strCalc.add("1,2"));
        assertEquals("6", strCalc.add("2,4"));
        assertEquals("6", strCalc.add("5,1"));
        assertEquals("16", strCalc.add("15,1"));
    }

    @Test
    public void str_containing_3_numbers_should_return_their_sum() throws ExceededNumberOfParametersException {
        assertEquals("6", strCalc.add("1,2,3"));
        assertEquals("7", strCalc.add("2,4,1"));
        assertEquals("6", strCalc.add("5,1,0"));
        assertEquals("31", strCalc.add("15,1,15"));
    }

    @Test
    public void str_containing_4_numbers_or_more_should_fail() throws ExceededNumberOfParametersException {
        assertThrows(ExceededNumberOfParametersException.class, () -> {
            strCalc.add("1,2,3,4");
        });
    }

}
