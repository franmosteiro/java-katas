package io.franmosteiro.string_calculator;

public class StringCalculator {

    public String add(String inputStr) {

        String[] hits = inputStr.split(",");
        int result = 0;
        if (!"".equals(inputStr)) {
            if (hits.length > 0) {
                for (int i = 0; i < hits.length; i++) {
                    result += Integer.valueOf(hits[i]);
                }
            }

        }
        return String.valueOf(result);
    }
}
