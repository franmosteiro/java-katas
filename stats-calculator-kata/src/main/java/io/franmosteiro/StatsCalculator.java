package io.franmosteiro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StatsCalculator {

    private final Stream<Integer> stats;

    public StatsCalculator(Integer[] stats) {
        this.stats = Arrays.stream(stats);
    }

    public int getMinimumValue() {
        return this.stats.min(Comparator.naturalOrder()).orElse(0);
    }

    public int getMaximumValue() {
        return this.stats.max(Comparator.naturalOrder()).orElse(0);
    }

    public long getNumberOfElements() {
        return this.stats.count();
    }

    public double getAverage() {
        return this.stats.mapToDouble(a -> a).average().orElse(0.0);
    }
}
