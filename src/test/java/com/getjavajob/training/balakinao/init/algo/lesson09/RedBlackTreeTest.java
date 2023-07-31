package com.getjavajob.training.balakinao.init.algo.lesson09;

import com.getjavajob.training.balakinao.init.algo.lesson03.DynamicArray;

import static test.Assert.assertEquals;

public class RedBlackTreeTest {

    public static void main(String[] args) {
        testAddEnd();
    }

    public static void testAddEnd() {
        DynamicArray dynamicArrayActual = new DynamicArray();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(8);
        dynamicArrayActual.add(7);
        assertEquals("lesson09.RedBlackTreeTest.testAddEnd", true, dynamicArrayActual.add(5));
    }
}