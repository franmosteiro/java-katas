package io.franmosteiro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StatsCalculator {

    public static int getMinimumValue(Integer[] stats) {
        return toStream(stats).min(Comparator.naturalOrder()).orElse(0);
    }

    public static int getMaximumValue(Integer[] stats) {
        return toStream(stats).max(Comparator.naturalOrder()).orElse(0);
    }

    public static long getNumberOfElements(Integer[] stats) {
        return toStream(stats).count();
    }

    public static double getAverage(Integer[] stats) {
        return toStream(stats).mapToDouble(a -> a).average().orElse(0.0);
    }

    private static Stream<Integer> toStream(Integer[] stats) {
        return Arrays.stream(stats);
    }
    
}
