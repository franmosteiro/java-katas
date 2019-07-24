package io.franmosteiro.string_calculator;

import java.math.BigDecimal;

public class StringCalculator {

    public String add(String inputStr) {
        String[] hits = inputStr.split(",");
        return "".equals(hits[0]) ? "0" : hits[0];
    }
}
