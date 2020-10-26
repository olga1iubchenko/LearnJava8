package com.epam.cdp.m2.hw2.aggregator.performance.sumImpl;

import com.epam.cdp.m2.hw2.aggregator.Java8Aggregator;
import com.epam.cdp.m2.hw2.aggregator.performance.Java8AggregationSumPerformanceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Java8AggregatorSumTest extends Java8AggregationSumPerformanceTest {

    public Java8AggregatorSumTest() {
        super(new Java8Aggregator());
    }
}

