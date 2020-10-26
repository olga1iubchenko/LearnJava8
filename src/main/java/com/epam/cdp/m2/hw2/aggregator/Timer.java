package com.epam.cdp.m2.hw2.aggregator;

public class Timer {

    private final String timerName;
    private long started;

    public Timer(String timerName) {
        this.timerName = timerName;
        this.started = System.nanoTime(); //To have more rounded results use System.currentTimeMillis();
    }

    public void timeMe() {
        System.out.println(
                String.format("Execution of '%s' takes %dms to run.",
                        timerName,
                        started-System.nanoTime()));  //To have more rounded results use System.currentTimeMillis();
    }

}
