package io.franmosteiro.string_calculator;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StringCalculator {

    public static final String SEPARATORS_REGEXP = "[,|\\n]";

    public String add(String inputStr) {

        return Arrays.asList(inputStr.split(SEPARATORS_REGEXP)).stream()
                    .reduce("", (sum1, sum2) -> this.sum(sum1, sum2));
    }

    private String sum(String sum1, String sum2) {
        return new BigDecimal(sum1.isEmpty() ? "0" : sum1).add(new BigDecimal(sum2.isEmpty() ? "0" : sum2)).toString();
    }
    
}
