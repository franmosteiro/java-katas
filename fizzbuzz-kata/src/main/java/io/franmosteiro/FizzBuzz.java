package io.franmosteiro;

import java.util.ArrayList;

public class FizzBuzz {

    public ArrayList<String> getData() {

        ArrayList<String> result = new ArrayList<String>(100);

        for (int number = 0; number <= 100; number++) {
            if (number % 3 == 0 && number % 5 == 0){
                result.add("FizzBuzz");
            } else if (number % 3 == 0){
                result.add("Fizz");
            } else if (number % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(number));
            }
        }
        return result;
    }

    public static void main(String[] args){
        FizzBuzz sut = new FizzBuzz();
        for (String line : sut.getData()) {
            System.out.println(line);
        }
    }
}
