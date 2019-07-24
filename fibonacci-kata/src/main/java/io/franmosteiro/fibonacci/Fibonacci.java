package io.franmosteiro.fibonacci;

public class Fibonacci {

    public int calculateNext(int sequence) throws OutOfBoundsException {
        if (sequence < 0) { throw new OutOfBoundsException(); }
        if (sequence < 2) { return sequence; }
        else { return calculateNext(sequence - 1) + calculateNext(sequence - 2); }
    }
}
