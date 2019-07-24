package io.franmosteiro.fibonacci;

public class Fibonacci {

    public int calculateNext(int sequence) {
        if (sequence < 2) {
            return sequence;
        } else {
            return calculateNext(sequence - 1) + calculateNext(sequence - 2);
        }
    }
}
