package io.franmosteiro.leapyear;

public class Year {

    private int year;

    Year(int year) {
        this.year = year;
    }

    public boolean isLeap() {
        return (isDivisibleBy4() && !isDivisibleBy100()) || isDivisibleBy400();
    }

    private boolean isDivisibleBy400() {
        return this.year % 400 == 0;
    }

    private boolean isDivisibleBy4() {
        return this.year % 4 == 0;
    }

    private boolean isDivisibleBy100() {
        return this.year % 100 == 0;
    }

}
