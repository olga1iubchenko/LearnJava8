package com.epam.cdp.m2.hw2.aggregator.performance.duplicatesImpl;

import com.epam.cdp.m2.hw2.aggregator.Java8Aggregator;
import com.epam.cdp.m2.hw2.aggregator.performance.Java8AggregationDuplicatesPerformanceTest;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Java8AggregatorDuplicatesTest extends Java8AggregationDuplicatesPerformanceTest {

    public Java8AggregatorDuplicatesTest() {
        super(new Java8Aggregator());
    }
}

