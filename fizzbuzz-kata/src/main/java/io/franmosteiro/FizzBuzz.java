package io.franmosteiro;

import java.util.stream.IntStream;

public class FizzBuzz {

    public static String translate(int number) {

        String result;

        if (isFizzBuzz(number)){
            result = "FizzBuzz";
        } else if (isFizz(number)){
            result = "Fizz";
        } else if (isBuzz(number)) {
            result = "Buzz";
        } else {
            result = Integer.toString(number);
        }
        return result;
    }

    public static boolean isFizz(int numberToBeChecked) {
        return numberToBeChecked % 3 == 0;
    }

    public static boolean isBuzz(int numberToBeChecked) {
        return numberToBeChecked % 5 == 0;
    }

    public static boolean isFizzBuzz(int numberToBeChecked) {
        return isFizz(numberToBeChecked) && isBuzz(numberToBeChecked);
    }

    public static void main(String[] args){
        IntStream.rangeClosed(1, 101).forEach(number -> Printer.print(FizzBuzz.translate(number)));
    }
}
