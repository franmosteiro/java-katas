package io.franmosteiro.fibonacci;

import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTestSuite {

    @Test
    public void when_sequence_is_zero_returns_zero() {
        Fibonacci fib = new Fibonacci();
        assertEquals(0, fib.calculate(0));
    }

    @Test
    public void when_sequence_is_one_returns_zero() {
        Fibonacci fib = new Fibonacci();
        assertEquals(1, fib.calculate(1));
    }

}
