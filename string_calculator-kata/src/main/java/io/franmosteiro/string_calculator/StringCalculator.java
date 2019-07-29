package io.franmosteiro.string_calculator;

public class StringCalculator {

    public String add(String inputStr) throws ExceededNumberOfParametersException {

        String[] hits = inputStr.split(",");
        int result = 0;

        if (hits.length > 3) {
            throw new ExceededNumberOfParametersException();
        }

        if (!"".equals(inputStr)) {
            if (hits.length > 0) {
                for (int i = 0; i < hits.length; i++) {
                    if (!"".equals(hits[i]))  {
                        result += Integer.valueOf(hits[i]);
                    }
                }
            }

        }

        return String.valueOf(result);
    }
}
