package com.getjavajob.training.balakinao.init.algo.lesson01;

import static com.getjavajob.training.balakinao.init.algo.lesson01.Solution07.swapBitByBitWay1;
import static com.getjavajob.training.balakinao.init.algo.lesson01.Solution07.swapBitByBitWay2;
import static com.getjavajob.training.balakinao.init.algo.lesson01.Solution07.swapNumbersWay1;
import static com.getjavajob.training.balakinao.init.algo.lesson01.Solution07.swapNumbersWay2;

import static test.Assert.assertEquals;

public class Solution07Test {

    public static void main(String[] args) {
       testSwapBitByBitWay1();
       testSwapBitByBitWay2();
       testSwapNumbersWay1();
       testSwapNumbersWay2();
    }

    public static void testSwapBitByBitWay1() {
        assertEquals("lesson01.Solution07Test.swapBitByBitWay1","NumberA:5 NumberB:2" , swapBitByBitWay1(2,5));
    }

    public static void  testSwapBitByBitWay2() {
        assertEquals("lesson01.Solution07Test.swapBitByBitWay2","NumberA:5 NumberB:2" , swapBitByBitWay2(2,5));
    }

    public static void testSwapNumbersWay1() {
        assertEquals("lesson01.Solution07Test.swapNumbersWay1","NumberA:5 NumberB:2" , swapNumbersWay1(2,5));
    }

    public static void testSwapNumbersWay2() {
        assertEquals("lesson01.Solution07Test.swapNumbersWay2","NumberA:5 NumberB:2" , swapNumbersWay2(2,5));
    }

}