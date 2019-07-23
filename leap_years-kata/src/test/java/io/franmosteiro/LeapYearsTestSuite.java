package io.franmosteiro;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeapYearsTestSuite {

    @Test
    public void year_divisible_by_400_should_be_leap() {
        LeapYears sut = new LeapYears();
        assertTrue(sut.isLeap(400));
    }

    @Test
    public void year_divisible_by_405_should_not_be_leap() {
        LeapYears sut = new LeapYears();
        assertFalse(sut.isLeap(405));
    }

}
