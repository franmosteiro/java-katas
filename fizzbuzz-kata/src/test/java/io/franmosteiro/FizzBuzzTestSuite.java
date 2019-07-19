package io.franmosteiro;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTestSuite {

    @Test
    public void should_print_1_if_1() {
        FizzBuzz classUnderTest = new FizzBuzz();
        assertEquals("1", classUnderTest.print());
    }
}
