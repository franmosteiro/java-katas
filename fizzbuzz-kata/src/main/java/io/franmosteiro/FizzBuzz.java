package io.franmosteiro;

import java.util.ArrayList;

public class FizzBuzz {

    public ArrayList<String> printData() {

        ArrayList<String> result = new ArrayList<String>(100);

        for (int i = 0; i < 100; i++) {
            if (i == 3){
                result.add("Fizz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }
}
