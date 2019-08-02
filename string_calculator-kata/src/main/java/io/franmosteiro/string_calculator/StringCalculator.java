package io.franmosteiro.string_calculator;

import java.util.Arrays;

public class StringCalculator {

    public static final String SEPARATORS_REGEXP = "[,|\\n]";

    public Double add(String inputStr) {

        if ("".equals(inputStr)) {
            return 0d;
        }

        return Arrays.asList(inputStr.split(SEPARATORS_REGEXP))
                    .stream()
                    .mapToDouble(Double::parseDouble).sum();
    }
    
}
