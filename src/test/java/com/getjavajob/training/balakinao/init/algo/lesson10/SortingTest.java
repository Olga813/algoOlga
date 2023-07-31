package com.getjavajob.training.balakinao.init.algo.lesson10;

import static test.Assert.assertEquals;

public class SortingTest {

    public static void main(String[] args) {
        testBubbleSort();
        testInsertionSort();
        testMergeSort();
        testQuickSort();
    }

    public static void testBubbleSort() {
        Sorting sortingActual = new Sorting(4);
        sortingActual.add(4);
        sortingActual.add(15);
        sortingActual.add(10);
        sortingActual.add(7);
        sortingActual.bubbleSort();
        Sorting sortingExpected = new Sorting(4);
        sortingExpected.add(4);
        sortingExpected.add(7);
        sortingExpected.add(10);
        sortingExpected.add(15);
        assertEquals("lesson10.SortingTest.testBubbleSort", sortingExpected.toString(), sortingActual.toString());
    }

    public static void testInsertionSort() {
        Sorting sortingActual = new Sorting(4);
        sortingActual.add(4);
        sortingActual.add(15);
        sortingActual.add(10);
        sortingActual.add(7);
        sortingActual.insertionSort();
        Sorting sortingExpected = new Sorting(4);
        sortingExpected.add(4);
        sortingExpected.add(7);
        sortingExpected.add(10);
        sortingExpected.add(15);
        assertEquals("lesson10.SortingTest.testInsertionSort", sortingExpected.toString(), sortingActual.toString());
    }

    public static void testMergeSort() {
        Sorting sortingActual = new Sorting(4);
        sortingActual.add(4);
        sortingActual.add(15);
        sortingActual.add(10);
        sortingActual.add(7);
        sortingActual.mergeSort();
        Sorting sortingExpected = new Sorting(4);
        sortingExpected.add(4);
        sortingExpected.add(7);
        sortingExpected.add(10);
        sortingExpected.add(15);
        assertEquals("lesson10.SortingTest.testMergeSort", sortingExpected.toString(), sortingActual.toString());
    }

    public static void testQuickSort() {
        Sorting sortingActual = new Sorting(4);
        sortingActual.add(4);
        sortingActual.add(15);
        sortingActual.add(10);
        sortingActual.add(7);
        sortingActual.quickSort();
        Sorting sortingExpected = new Sorting(4);
        sortingExpected.add(4);
        sortingExpected.add(7);
        sortingExpected.add(10);
        sortingExpected.add(15);
        assertEquals("lesson10.SortingTest.testQuickSort", sortingExpected.toString(), sortingActual.toString());
    }

}