package io.franmosteiro.fibonacci;

public class Fibonacci {

    public int calculateNext(int sequence) {
        if (sequence == 2) {
            return calculateNext(0) + calculateNext(1);
        } else if (sequence == 3) {
            return calculateNext(1) + calculateNext(2);
        } else {
            return sequence;
        }
    }
}
