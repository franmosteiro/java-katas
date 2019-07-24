package io.franmosteiro.fibonacci;

public class Fibonacci {

    public int calculateNext(int sequence) {
        if (sequence == 2) {
            return 1;
        } else if (sequence == 3) {
            return 2;
        } else {
            return sequence;
        }
    }
}
