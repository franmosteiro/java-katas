package io.franmosteiro.string_calculator;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class StringCalculator {

    public static final String SEPARATOR = "[,|\\\\n]";

    public String add(String inputStr) {

        String[] hits = inputStr.split(SEPARATOR);

        return Arrays.stream(hits)
                .reduce("", (sum1, sum2) ->
                        this.sum(sum1, sum2)
                );
    }

    private String sum(String sum1, String sum2) {
        return this.bigDecimalToString(sum1).add(this.bigDecimalToString(sum2)).toString();
    }

    private BigDecimal bigDecimalToString(String predicate){
        return new BigDecimal(predicate.isEmpty() ? "0" : predicate);
    }
}
