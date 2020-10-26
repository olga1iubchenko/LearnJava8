package com.epam.cdp.m2.hw2.aggregator.performance.duplicatesImpl;

import com.epam.cdp.m2.hw2.aggregator.Java7Aggregator;
import com.epam.cdp.m2.hw2.aggregator.performance.Java7AggregationDuplicatesPerformanceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Java7AggregatorDuplicatesTest extends Java7AggregationDuplicatesPerformanceTest {

    public Java7AggregatorDuplicatesTest() {
        super(new Java7Aggregator());
    }
}
