package io.franmosteiro.fibonacci;

import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTestSuite {

    @Test
    public void when_zero_sequence_returns_zero() {
        Fibonacci fib = new Fibonacci();
        assertEquals(0, fib.calculate(0));
    }

}
