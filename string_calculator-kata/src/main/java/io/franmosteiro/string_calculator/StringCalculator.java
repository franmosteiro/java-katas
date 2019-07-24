package io.franmosteiro.string_calculator;

import java.math.BigDecimal;

public class StringCalculator {

    public String add(String inputStr) {
        String overall = "";
        String[] hits = inputStr.split(",");
        if (hits.length == 1) {
            if ("".equals(hits[0])) {
                overall = "0";
            } else {
                overall = hits[0];
            }
        }
        return overall;
    }
}
