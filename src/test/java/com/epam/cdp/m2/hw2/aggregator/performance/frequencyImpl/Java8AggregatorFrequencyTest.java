package com.epam.cdp.m2.hw2.aggregator.performance.frequencyImpl;

import com.epam.cdp.m2.hw2.aggregator.Java8Aggregator;
import com.epam.cdp.m2.hw2.aggregator.performance.Java8AggregationFrequencyPerformanceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Java8AggregatorFrequencyTest extends Java8AggregationFrequencyPerformanceTest {

    public Java8AggregatorFrequencyTest() {
        super(new Java8Aggregator());
    }
}

