package io.franmosteiro.string_calculator;

import java.math.BigDecimal;
import java.util.Arrays;

public class StringCalculator {

    public static final String SEPARATOR = ",";

    public String add(String inputStr) throws ExceededNumberOfParametersException {

        String[] hits = inputStr.split(SEPARATOR);

        if (hits.length > 3) {
            throw new ExceededNumberOfParametersException();
        }

        return Arrays.stream(hits)
                .reduce("", (sum1, sum2) ->
                        this.sum(sum1, sum2).toString()
                );
    }

    private BigDecimal sum(String sum1, String sum2) {
        return this.stringToNumber(sum1).add(this.stringToNumber(sum2));
    }

    private boolean checkEmpty(String str) {
        return "".equals(str);
    }

    private BigDecimal stringToNumber(String predicate){
        return new BigDecimal(this.checkEmpty(predicate) ? "0" : predicate);
    }
}
