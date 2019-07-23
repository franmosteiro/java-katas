package io.franmosteiro;

public class LeapYears {

    public boolean isLeap(int year) {
        if (isDivisibleBy400(year)) {
            return true;
        } else if (isDivisibleBy4NotBy100(year)) {
            return true;
        }
        return false;
    }

    private boolean isDivisibleBy400(int year) {
        return year % 400 == 0;
    }

    private boolean isDivisibleBy4NotBy100(int year) {
        return (year % 4 == 0) && (year % 100 != 0);
    }
}
