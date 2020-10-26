package com.epam.cdp.m2.hw2.aggregator;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ParallelExecutionJava7 extends RecursiveTask<Long> {
    private static int numOfThreads = Runtime.getRuntime().availableProcessors();
    static ForkJoinPool pool = new ForkJoinPool(numOfThreads);
    int low;
        int high;
        int[] array;

        ParallelExecutionJava7 (int[] array, int low, int high) {
            this.array = array;
            this.low   = low;
            this.high  = high;
        }

        protected Long compute() {

            if(high - low <= 10) {
                long sum = 0;

                for(int i = low; i < high; ++i)
                    sum += array[i];
                return sum;
            } else {
                int mid = low + (high - low) / 2;
                ParallelExecutionJava7 left  = new ParallelExecutionJava7(array, low, mid);
                ParallelExecutionJava7 right = new ParallelExecutionJava7(array, mid, high);
                left.fork();
                long rightResult = right.compute();
                long leftResult  = left.join();
                return leftResult + rightResult;
            }
        }
    }

