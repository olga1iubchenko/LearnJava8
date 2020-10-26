package com.epam.cdp.m2.hw2.aggregator.performance.sumImpl;

import com.epam.cdp.m2.hw2.aggregator.Java7ParallelAggregator;
import com.epam.cdp.m2.hw2.aggregator.performance.Java7AggregationSumPerformanceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Java7ParallelAggregatorSumTest extends Java7AggregationSumPerformanceTest {

    public Java7ParallelAggregatorSumTest() {
        super(new Java7ParallelAggregator());
    }
}
