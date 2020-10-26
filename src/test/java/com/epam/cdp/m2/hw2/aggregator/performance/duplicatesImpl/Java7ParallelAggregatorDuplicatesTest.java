package com.epam.cdp.m2.hw2.aggregator.performance.duplicatesImpl;

import com.epam.cdp.m2.hw2.aggregator.Java7ParallelAggregator;
import com.epam.cdp.m2.hw2.aggregator.performance.Java7AggregationDuplicatesPerformanceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Java7ParallelAggregatorDuplicatesTest extends Java7AggregationDuplicatesPerformanceTest {

    public Java7ParallelAggregatorDuplicatesTest() {
        super(new Java7ParallelAggregator());
    }
}
