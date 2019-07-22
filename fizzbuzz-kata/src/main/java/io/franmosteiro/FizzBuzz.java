package io.franmosteiro;

import java.util.ArrayList;

public class FizzBuzz {

    public ArrayList<String> getData() {

        ArrayList<String> result = new ArrayList<String>(100);

        for (int number = 0; number <= 100; number++) {
            if (isFizzBuzz(number)){
                result.add("FizzBuzz");
            } else if (isFizz(number)){
                result.add("Fizz");
            } else if (isBuzz(number)) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(number));
            }
        }
        return result;
    }

    public boolean isFizz(int numberToBeChecked) {
        return numberToBeChecked % 3 == 0;
    }

    public boolean isBuzz(int numberToBeChecked) {
        return numberToBeChecked % 5 == 0;
    }

    public boolean isFizzBuzz(int numberToBeChecked) {
        return isFizz(numberToBeChecked) && isBuzz(numberToBeChecked);
    }


    public static void main(String[] args){
        FizzBuzz sut = new FizzBuzz();
        for (String line : sut.getData()) {
            System.out.println(line);
        }
    }
}
