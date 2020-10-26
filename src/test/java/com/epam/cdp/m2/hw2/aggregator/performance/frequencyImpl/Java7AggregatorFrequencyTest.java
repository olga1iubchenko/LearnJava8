package com.epam.cdp.m2.hw2.aggregator.performance.frequencyImpl;

import com.epam.cdp.m2.hw2.aggregator.Java7Aggregator;
import com.epam.cdp.m2.hw2.aggregator.performance.Java7AggregationFrequencyPerformanceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Java7AggregatorFrequencyTest extends Java7AggregationFrequencyPerformanceTest {

    public Java7AggregatorFrequencyTest() {
        super(new Java7Aggregator());
    }

}
