package io.franmosteiro;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsCalculatorShould {

    private StatsCalculator calculator;
    private Integer[] stats;

    @BeforeAll
    void setUp() {
        this.calculator = new StatsCalculator();
    }

    @Test
    void return_minimun_value_from_input_stats() {

        this.stats = new Integer[] { 0, -1 };
        assertEquals(-1, calculator.getMinimumValue(this.stats));

        this.stats = new Integer[] { 12350, 98745 };
        assertEquals(12350, calculator.getMinimumValue(this.stats));
    }

    @Test
    void return_minimum_as_zero_for_empty_input_stats() {

        this.stats = new Integer[0];
        assertEquals(0, calculator.getMinimumValue(this.stats));
    }

    @Test
    void return_maximum_value_from_input_stats() {

        this.stats = new Integer[] { 100, 1324 };
        assertEquals(1324, calculator.getMaximumValue(this.stats));

        this.stats = new Integer[] { -5, 1 };
        assertEquals(1, calculator.getMaximumValue(this.stats));
    }

    @Test
    void return_maximum_as_zero_for_empty_input_stats() {

        this.stats = new Integer[0];
        assertEquals(0, calculator.getMaximumValue(this.stats));

    }

    @Test
    void return_number_of_elements_from_input_stats() {

        this.stats = new Integer[] { 10, -41, 2, 5 };
        assertEquals(4, calculator.getNumberOfElements(this.stats));

        this.stats = new Integer[] { 10 };
        assertEquals(1, calculator.getNumberOfElements(this.stats));

        this.stats = new Integer[0];
        assertEquals(0, calculator.getNumberOfElements(this.stats));
    }

    @Test
    void return_average_value_from_input_stats() {

        this.stats = new Integer[] { 1, -4, 3, 5 };
        assertEquals(1.25, calculator.getAverage(this.stats));

        this.stats = new Integer[] { 1, 4, 3, 5 };
        assertEquals(3.25, calculator.getAverage(this.stats));

        this.stats = new Integer[0];
        assertEquals(0.0, calculator.getAverage(this.stats));
    }

}
