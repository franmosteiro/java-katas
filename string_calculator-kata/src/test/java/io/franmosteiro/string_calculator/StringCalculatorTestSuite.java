package io.franmosteiro.string_calculator;

import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTestSuite {

    @Test
    public void empty_str_should_return_zero() {
        assertEquals("0", new StringCalculator("0").add());
    }

    @Test
    public void str_containing_one_number_should_return_its_value() {
        assertEquals("1.1", new StringCalculator("1.1").add());
        assertEquals("1", new StringCalculator("1").add());
        assertEquals("2", new StringCalculator("2").add());
        assertEquals("5", new StringCalculator("5").add());
        assertEquals("15", new StringCalculator("15").add());
    }

    @Test
    public void str_containing_2_numbers_should_return_their_sum() {
        assertEquals("3", new StringCalculator("1,2").add());
        assertEquals("6", new StringCalculator("2,4").add());
        assertEquals("6", new StringCalculator("5,1").add());
        assertEquals("16", new StringCalculator("15,1").add());
    }

    @Test
    public void str_containing_3_numbers_should_return_their_sum() {
        assertEquals("6", new StringCalculator("1,2,3").add());
        assertEquals("7", new StringCalculator("2,4,1").add());
        assertEquals("6", new StringCalculator("5,1,0").add());
        assertEquals("31", new StringCalculator("15,1,15").add());
        assertEquals("1.1", new StringCalculator("0.4,0.4,0.3").add());
    }

    @Test
    public void str_containing_newLine_asSeparator_should_return_sum_of_containing_numbers() {
        assertEquals("6", new StringCalculator("1\n2,3").add());
    }

    @Test
    public void str_containing_newLine_inAnIncorrectPosition_should_fail() {
        assertEquals("Number expected but '\\n' found at position 6", new StringCalculator("175.2,\n35").add());
        assertEquals("Number expected but '\\n' found at position 8", new StringCalculator("1.2,3,2,\n1").add());
    }
}
