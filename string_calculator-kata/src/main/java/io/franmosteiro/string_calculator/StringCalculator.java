package io.franmosteiro.string_calculator;

import java.math.BigDecimal;

public class StringCalculator {

    public String add(String inputStr) throws ExceededNumberOfParametersException {

        String[] hits = inputStr.split(",");
        BigDecimal result = new BigDecimal(0);

        if (this.checkNotEmpty(inputStr)) {
            if (hits.length > 0 && hits.length <= 3) {
                for (int i = 0; i < hits.length; i++) {
                    if (this.checkNotEmpty(hits[i])) {
                        result = this.sum(result, hits[i]);
                    }
                }
            } else {
                throw new ExceededNumberOfParametersException();
            }
        }
        return String.valueOf(result);
    }

    private BigDecimal sum(BigDecimal parcial, String addition) {
        return parcial.add(new BigDecimal(addition));
    }

    private boolean checkNotEmpty(String str) {
        return !"".equals(str);
    }
}
