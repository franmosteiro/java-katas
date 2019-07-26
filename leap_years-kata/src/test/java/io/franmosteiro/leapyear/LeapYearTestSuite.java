package io.franmosteiro.leapyear;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class LeapYearTestSuite {

    @Test
    public void year_divisible_by_400_should_be_leap() {
        assertTrue(new Year(400).isLeap());
        assertTrue(new Year(2000).isLeap());
        assertTrue(new Year(1200).isLeap());
        assertTrue(new Year(3600).isLeap());

        assertFalse(new Year(2005).isLeap());
        assertFalse(new Year(1700).isLeap());
        assertFalse(new Year(1800).isLeap());
        assertFalse(new Year(1900).isLeap());
        assertFalse(new Year(2100).isLeap());
        assertFalse(new Year(1000).isLeap());
    }

    @Test
    public void year_divisible_by_4_and_not_by_100_should_be_leap() {
        assertTrue(new Year(2008).isLeap());
        assertTrue(new Year(2012).isLeap());
        assertTrue(new Year(2016).isLeap());
        assertTrue(new Year(404).isLeap());
    }

    @Test
    public void year_not_divisible_by_4_and_should_not_be_leap() {
        assertFalse(new Year(2017).isLeap());
        assertFalse(new Year(2018).isLeap());
        assertFalse(new Year(2019).isLeap());
    }

}
