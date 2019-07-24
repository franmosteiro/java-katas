package io.franmosteiro.fibonacci;

import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTestSuite {

    @Test
    public void when_place_in_sequence_is_0_returns_0() {
        Fibonacci fib = new Fibonacci();
        assertEquals(0, fib.calculateNext(0));
    }

    @Test
    public void when_place_in_sequence_is_1_returns_0() {
        Fibonacci fib = new Fibonacci();
        assertEquals(1, fib.calculateNext(1));
    }

    @Test
    public void when_place_in_sequence_is_2_returns_1() {
        Fibonacci fib = new Fibonacci();
        assertEquals(1, fib.calculateNext(2));
    }

    @Test
    public void when_place_in_sequence_is_3_returns_2() {
        Fibonacci fib = new Fibonacci();
        assertEquals(2, fib.calculateNext(3));
    }

    @Test
    public void when_place_in_sequence_is_4_returns_3() {
        Fibonacci fib = new Fibonacci();
        assertEquals(3, fib.calculateNext(4));
    }

    @Test
    public void when_place_in_sequence_is_5_returns_5() {
        Fibonacci fib = new Fibonacci();
        assertEquals(5, fib.calculateNext(5));
    }

    @Test
    public void when_place_in_sequence_is_6_returns_8() {
        Fibonacci fib = new Fibonacci();
        assertEquals(8, fib.calculateNext(6));
    }

    @Test
    public void when_place_in_sequence_is_7_returns_13() {
        Fibonacci fib = new Fibonacci();
        assertEquals(13, fib.calculateNext(7));
    }

    @Test
    public void when_place_in_sequence_is_8_returns_21() {
        Fibonacci fib = new Fibonacci();
        assertEquals(21, fib.calculateNext(8));
    }

    @Test
    public void when_place_in_sequence_is_9_returns_34() {
        Fibonacci fib = new Fibonacci();
        assertEquals(34, fib.calculateNext(9));
    }

}
