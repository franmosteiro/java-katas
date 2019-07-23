package io.franmosteiro;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTestSuite {

    @Test
    public void should_return_number() {
        assertEquals("1", FizzBuzz.translate(1));
        assertEquals("26", FizzBuzz.translate(26));
        assertEquals("151", FizzBuzz.translate(151));
    }

    @Test
    public void should_return_Fizz() {
        assertEquals("Fizz", FizzBuzz.translate(3));
        assertEquals("Fizz", FizzBuzz.translate(6));
        assertEquals("Fizz", FizzBuzz.translate(12));
    }

    @Test
    public void should_return_buzz() {
        assertEquals("Buzz", FizzBuzz.translate(5));
        assertEquals("Buzz", FizzBuzz.translate(25));
        assertEquals("Buzz", FizzBuzz.translate(55));
    }

    @Test
    public void should_return_FizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.translate(15));
        assertEquals("FizzBuzz", FizzBuzz.translate(45));
        assertEquals("FizzBuzz", FizzBuzz.translate(90));
    }

}
