package io.franmosteiro;

public class LeapYears {

    public boolean isLeap(int year) throws Exception {

        if (isDivisibleBy400(year)) {
            return true;
        }

        if (isDivisibleBy100NotBy400(year)) {
            return false;
        }

        if (isDivisibleBy4NotBy100(year)) {
            return true;
        }

        if (isNotDivisibleBy4(year)) {
            return false;
        }

        throw new Exception();
    }

    private boolean isDivisibleBy400(int year) {
        return year % 400 == 0;
    }

    private boolean isDivisibleBy100NotBy400(int year) {
        return (year % 100 == 0) && (year % 400 != 0);
    }

    private boolean isDivisibleBy4NotBy100(int year) {
        return (year % 4 == 0) && (year % 100 != 0);
    }

    private boolean isNotDivisibleBy4(int year) {
        return year % 4 != 0;
    }
}
