package io.franmosteiro;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeapYearsTestSuite {

    @Test
    public void year_divisible_by_400_should_be_leap() {
        LeapYears sut = new LeapYears();
        assertTrue(sut.isLeap(2000));

    }

    @Test
    public void year_not_divisible_by_400_should_not_be_leap() {
        LeapYears sut = new LeapYears();
        assertFalse(sut.isLeap(2005));
        assertFalse(sut.isLeap(1700));
        assertFalse(sut.isLeap(1800));
        assertFalse(sut.isLeap(1900));
        assertFalse(sut.isLeap(2100));
    }

    @Test
    public void year_divisible_by_4_and_not_by_100_should_be_leap() {
        LeapYears sut = new LeapYears();
        assertTrue(sut.isLeap(2008));
        assertTrue(sut.isLeap(2012));
        assertTrue(sut.isLeap(2016));
    }

    @Test
    public void year_not_divisible_by_4_and_should_not_be_leap() {
        LeapYears sut = new LeapYears();
        assertFalse(sut.isLeap(2017));
        assertFalse(sut.isLeap(2018));
        assertFalse(sut.isLeap(2019));
    }

}
