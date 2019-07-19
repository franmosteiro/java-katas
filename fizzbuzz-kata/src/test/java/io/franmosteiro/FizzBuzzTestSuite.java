package io.franmosteiro;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTestSuite {

    @Test
    public void first_number_should_print_1() {
        FizzBuzz classUnderTest = new FizzBuzz();
        assertEquals("1", classUnderTest.printData().get(1));
    }

    @Test
    public void second_number_should_print_2() {
        FizzBuzz classUnderTest = new FizzBuzz();
        assertEquals("2", classUnderTest.printData().get(2));
    }

    @Test
    public void third_number_should_print_Fizz() {
        FizzBuzz classUnderTest = new FizzBuzz();
        assertEquals("Fizz", classUnderTest.printData().get(3));
    }

}
