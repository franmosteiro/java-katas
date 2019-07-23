package io.franmosteiro;

public class LeapYears {

    public boolean isLeap(int year) {

        boolean isLeap = false;

        if (isDivisibleBy400(year)) {
            isLeap = true;
        }

        if (isDivisibleBy100NotBy400(year)) {
            isLeap = false;
        }

        if (isDivisibleBy4NotBy100(year)) {
            isLeap = true;
        }

        if (isNotDivisibleBy4(year)) {
            isLeap = false;
        }

        return isLeap;
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
