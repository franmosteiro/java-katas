package io.franmosteiro.leapyear;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeapYearTestSuite {

    @Test
    public void year_divisible_by_400_should_be_leap() {
        LeapYear sut = new LeapYear();
        assertTrue(sut.isLeap(400));
        assertTrue(sut.isLeap(2000));
        assertTrue(sut.isLeap(1200));
        assertTrue(sut.isLeap(3600));

        assertFalse(sut.isLeap(2005));
        assertFalse(sut.isLeap(1700));
        assertFalse(sut.isLeap(1800));
        assertFalse(sut.isLeap(1900));
        assertFalse(sut.isLeap(2100));
        assertFalse(sut.isLeap(1000));
    }

    @Test
    public void year_divisible_by_4_and_not_by_100_should_be_leap() {
        LeapYear sut = new LeapYear();
        assertTrue(sut.isLeap(2008));
        assertTrue(sut.isLeap(2012));
        assertTrue(sut.isLeap(2016));
        assertTrue(sut.isLeap(404));
    }

    @Test
    public void year_not_divisible_by_4_and_should_not_be_leap() {
        LeapYear sut = new LeapYear();
        assertFalse(sut.isLeap(2017));
        assertFalse(sut.isLeap(2018));
        assertFalse(sut.isLeap(2019));
    }

}
