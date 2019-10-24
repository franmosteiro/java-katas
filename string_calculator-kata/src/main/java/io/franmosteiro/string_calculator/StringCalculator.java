package io.franmosteiro.string_calculator;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Optional;

public class StringCalculator {

    public static final String SEPARATORS_REGEXP = "[,|\n]";

    private String delimiter;
    private String inputData;

    public StringCalculator(String inputData) {
        this.delimiter = SEPARATORS_REGEXP;
        this.inputData = inputData;
    }

    public String add() {

        if (this.inputData.isEmpty()) {
            return "0";
        }

        if (this.inputData.contains(",\n")) {
            return "Number expected but '\\n' found at position " + this.inputData.lastIndexOf("\n");
        }

        if (this.inputData.lastIndexOf(",") == this.inputData.length() - 1 || this.inputData.lastIndexOf("\n") == this.inputData.length() - 1) {
            return '"' + this.inputData + '"' + " is invalid and should return the message Number expected but EOF found";
        }

        return Arrays.asList(this.inputData.split(this.delimiter))
                    .stream()
                    .map(BigDecimal::new)
                    .reduce(new BigDecimal(0), (sum1, sum2) -> sum1.add(sum2)).toString();
    }
    
}
