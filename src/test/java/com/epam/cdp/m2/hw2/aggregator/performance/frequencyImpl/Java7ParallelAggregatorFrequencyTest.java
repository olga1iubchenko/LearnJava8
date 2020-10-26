package com.epam.cdp.m2.hw2.aggregator.performance.frequencyImpl;

import com.epam.cdp.m2.hw2.aggregator.Java7ParallelAggregator;
import com.epam.cdp.m2.hw2.aggregator.performance.Java7AggregationFrequencyPerformanceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Java7ParallelAggregatorFrequencyTest extends Java7AggregationFrequencyPerformanceTest {

    public Java7ParallelAggregatorFrequencyTest() {
        super(new Java7ParallelAggregator());
    }
}
