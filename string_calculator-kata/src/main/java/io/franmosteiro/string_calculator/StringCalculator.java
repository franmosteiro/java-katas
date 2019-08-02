package io.franmosteiro.string_calculator;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Optional;

public class StringCalculator {

    public static final String SEPARATORS_REGEXP = "[,|\\n]";

    private String delimiter;
    private String inputData;

    public StringCalculator(String inputData) {
        this.delimiter = SEPARATORS_REGEXP;
        this.inputData = inputData;
    }

    public String add() {

        if ("".equals(this.inputData)) {
            return "0";
        }

        return Arrays.asList(this.inputData.split(this.delimiter))
                    .stream()
                    .map(BigDecimal::new)
                    .reduce(new BigDecimal(0), (sum1, sum2) -> sum1.add(sum2)).toString();
    }
    
}
