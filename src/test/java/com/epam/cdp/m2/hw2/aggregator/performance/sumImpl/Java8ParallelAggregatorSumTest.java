package com.epam.cdp.m2.hw2.aggregator.performance.sumImpl;

import com.epam.cdp.m2.hw2.aggregator.Java8ParallelAggregator;
import com.epam.cdp.m2.hw2.aggregator.performance.Java8AggregationSumPerformanceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Java8ParallelAggregatorSumTest extends Java8AggregationSumPerformanceTest {

    public Java8ParallelAggregatorSumTest() {
        super(new Java8ParallelAggregator());
    }
}
