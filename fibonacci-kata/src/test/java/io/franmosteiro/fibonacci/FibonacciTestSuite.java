package io.franmosteiro.fibonacci;

import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTestSuite {

    @Test
    public void when_sequence_is_0_returns_0() {
        Fibonacci fib = new Fibonacci();
        assertEquals(0, fib.calculate(0));
    }

    @Test
    public void when_sequence_is_1_returns_0() {
        Fibonacci fib = new Fibonacci();
        assertEquals(1, fib.calculate(1));
    }

    @Test
    public void when_sequence_is_2_returns_1() {
        Fibonacci fib = new Fibonacci();
        assertEquals(1, fib.calculate(2));
    }

}
