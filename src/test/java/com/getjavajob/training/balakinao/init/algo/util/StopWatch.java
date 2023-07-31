package com.getjavajob.training.balakinao.init.algo.util;

public class StopWatch {

    private static long timeStart;

    public static  long start() {
        return timeStart = System.currentTimeMillis();
    }

    public static long getElapsedTime() {
        return System.currentTimeMillis() - timeStart;
    }

}