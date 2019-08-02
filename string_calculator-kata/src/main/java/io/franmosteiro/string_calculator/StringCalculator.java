package io.franmosteiro.string_calculator;

import java.math.BigDecimal;
import java.util.Arrays;

public class StringCalculator {

    public static final String SEPARATORS_REGEXP = "[,|\\n]";

    public String add(String inputStr) {

        if ("".equals(inputStr)) {
            return "0";
        }

        return Arrays.asList(inputStr.split(SEPARATORS_REGEXP))
                    .stream()
                    .map(BigDecimal::new)
                    .reduce(new BigDecimal(0), (sum1, sum2) -> sum1.add(sum2)).toString();
    }
    
}
