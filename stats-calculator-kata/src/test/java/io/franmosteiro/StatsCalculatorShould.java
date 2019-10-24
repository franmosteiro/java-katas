package io.franmosteiro;

import org.junit.jupiter.api.Test;

import static io.franmosteiro.StatsCalculator.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsCalculatorShould {

    private Integer[] stats;

    @Test
    void return_minimun_value_from_input_stats() {

        this.stats = new Integer[] { 0, -1 };
        assertEquals(-1, getMinimumValue(this.stats));

        this.stats = new Integer[] { 12350, 98745 };
        assertEquals(12350, getMinimumValue(this.stats));
    }

    @Test
    void return_minimum_as_zero_for_empty_input_stats() {

        this.stats = new Integer[0];
        assertEquals(0, getMinimumValue(this.stats));
    }

    @Test
    void return_maximum_value_from_input_stats() {

        this.stats = new Integer[] { 100, 1324 };
        assertEquals(1324, getMaximumValue(this.stats));

        this.stats = new Integer[] { -5, 1 };
        assertEquals(1, getMaximumValue(this.stats));
    }

    @Test
    void return_maximum_as_zero_for_empty_input_stats() {

        this.stats = new Integer[0];
        assertEquals(0, getMaximumValue(this.stats));

    }

    @Test
    void return_number_of_elements_from_input_stats() {

        this.stats = new Integer[] { 10, -41, 2, 5 };
        assertEquals(4, getNumberOfElements(this.stats));

        this.stats = new Integer[] { 10 };
        assertEquals(1, getNumberOfElements(this.stats));

        this.stats = new Integer[0];
        assertEquals(0, getNumberOfElements(this.stats));
    }

    @Test
    void return_average_value_from_input_stats() {

        this.stats = new Integer[] { 1, -4, 3, 5 };
        assertEquals(1.25, getAverage(this.stats));

        this.stats = new Integer[] { 1, 4, 3, 5 };
        assertEquals(3.25, getAverage(this.stats));

        this.stats = new Integer[0];
        assertEquals(0.0, getAverage(this.stats));
    }

}
