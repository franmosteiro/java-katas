package io.franmosteiro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsCalculatorShould {

    private StatsCalculator calculator;
    private Integer[] stats;

    @Test
    void return_minimun_value_from_input_stats() {

        this.stats = new Integer[] { 0, -1 };
        this.calculator = new StatsCalculator(this.stats);

        assertEquals(-1, calculator.getMinimumValue());

        this.stats = new Integer[] { 12350, 98745 };
        this.calculator = new StatsCalculator(this.stats);

        assertEquals(12350, calculator.getMinimumValue());
    }

    @Test
    void return_minimum_as_zero_for_empty_input_stats() {
        this.stats = new Integer[0];
        this.calculator = new StatsCalculator(this.stats);

        assertEquals(0, calculator.getMinimumValue());
    }

    @Test
    void return_maximum_value_from_input_stats() {

        this.stats = new Integer[] { 100, 1324 };
        this.calculator = new StatsCalculator(this.stats);

        assertEquals(1324, calculator.getMaximumValue());

        this.stats = new Integer[] { -5, 1 };
        this.calculator = new StatsCalculator(this.stats);

        assertEquals(1, calculator.getMaximumValue());
    }

    @Test
    void return_maximum_as_zero_for_empty_input_stats() {
        this.stats = new Integer[0];
        this.calculator = new StatsCalculator(this.stats);

        assertEquals(0, calculator.getMaximumValue());
    }

    @Test
    void return_number_of_elements_from_input_stats() {

        this.stats = new Integer[] { 10, -41, 2, 5 };
        this.calculator = new StatsCalculator(this.stats);

        assertEquals(4, calculator.getNumberOfElements());

        this.stats = new Integer[] { 10 };
        this.calculator = new StatsCalculator(this.stats);

        assertEquals(1, calculator.getNumberOfElements());

        this.stats = new Integer[0];
        this.calculator = new StatsCalculator(this.stats);

        assertEquals(0, calculator.getNumberOfElements());
    }

    @Test
    void return_average_value_from_input_stats() {

        this.stats = new Integer[] { 1, -4, 3, 5 };
        this.calculator = new StatsCalculator(this.stats);

        assertEquals(1.25, calculator.getAverage());

        this.stats = new Integer[] { 1, 4, 3, 5 };
        this.calculator = new StatsCalculator(this.stats);

        assertEquals(3.25, calculator.getAverage());

        this.stats = new Integer[0];
        this.calculator = new StatsCalculator(this.stats);

        assertEquals(0.0, calculator.getAverage());
    }

}
