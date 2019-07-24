package io.franmosteiro.fibonacci;

import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTestSuite {

    @Test
    public void should_be_the_addition_of_previous_two_sequences() {
        Fibonacci fib = new Fibonacci();
        assertEquals(0, fib.calculateNext(0));
        assertEquals(1, fib.calculateNext(1));
        assertEquals(1, fib.calculateNext(2));
        assertEquals(2, fib.calculateNext(3));
        assertEquals(3, fib.calculateNext(4));
        assertEquals(5, fib.calculateNext(5));
        assertEquals(8, fib.calculateNext(6));
        assertEquals(13, fib.calculateNext(7));
        assertEquals(21, fib.calculateNext(8));
        assertEquals(34, fib.calculateNext(9));
    }

}
