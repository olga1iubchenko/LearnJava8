package com.epam.cdp.m2.hw2.aggregator.performance.sumImpl;

import com.epam.cdp.m2.hw2.aggregator.Java7Aggregator;
import com.epam.cdp.m2.hw2.aggregator.performance.Java7AggregationSumPerformanceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Java7AggregatorSumTest extends Java7AggregationSumPerformanceTest {

    public Java7AggregatorSumTest() {
        super(new Java7Aggregator());
    }

}
