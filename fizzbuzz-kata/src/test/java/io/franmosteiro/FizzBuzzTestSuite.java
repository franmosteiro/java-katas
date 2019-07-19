package io.franmosteiro;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTestSuite {

    @Test
    public void first_number_should_print_1() {
        FizzBuzz classUnderTest = new FizzBuzz();
        assertEquals("1", classUnderTest.getData().get(1));
    }

    @Test
    public void third_number_should_print_Fizz() {
        FizzBuzz classUnderTest = new FizzBuzz();
        assertEquals("Fizz", classUnderTest.getData().get(3));
    }

    @Test
    public void fifth_number_should_print_Buzz() {
        FizzBuzz classUnderTest = new FizzBuzz();
        assertEquals("Buzz", classUnderTest.getData().get(5));
    }

    @Test
    public void any_multiple_of_three_should_print_Fizz() {
        FizzBuzz classUnderTest = new FizzBuzz();
        assertEquals("Fizz", classUnderTest.getData().get(6));
    }

    @Test
    public void any_multiple_of_five_should_print_Buzz() {
        FizzBuzz classUnderTest = new FizzBuzz();
        assertEquals("Buzz", classUnderTest.getData().get(25));
    }

    @Test
    public void any_multiple_of_three_and_five_should_print_FizzBuzz() {
        FizzBuzz classUnderTest = new FizzBuzz();
        assertEquals("FizzBuzz", classUnderTest.getData().get(45));
    }

}
