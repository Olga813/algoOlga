package com.getjavajob.training.balakinao.init.algo.lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.copyOf;
import static java.util.Arrays.copyOfRange;
import static java.util.Arrays.fill;
import static java.util.Arrays.parallelPrefix;
import static java.util.Arrays.parallelSetAll;
import static java.util.Arrays.parallelSort;
import static java.util.Arrays.setAll;
import static java.util.Arrays.sort;
import static java.util.Collections.addAll;
import static test.Assert.assertEquals;

public class ArraysTest {

    public static void main(String[] args) {
        testArraysSort();
        testArraysParallelSort();
        testArraysBinarySearch();
        testArraysBinarySearchWithRange();
        testArraysCopy0f();
        testArraysCopy0fRange();
        testArraysSortWithRange();
        testArraysParallelSortWithRange();
        testArraysFill();
        testArraysFillWithRange();
        testArraysAsList();
        testArraysParallelSetAll();
        testArraysSetAll();
        testArraysParallelPrefix();
    }

    public static void testArraysAsList() {
        Integer[] arrayActual = {5, 4, 8, 4, 3};
        List <Integer> listActual = Arrays.asList(arrayActual);
        List <Integer> listExpected = new ArrayList <>();
        addAll(listExpected, 5, 4, 8, 4, 3);
        assertEquals("lesson10.ArraysTest.testArraysAsList", listExpected,
            listActual);
    }

    public static void testArraysSetAll() {
        int[] arrayActual = {2, 4, 8, 14, 33};
        setAll(arrayActual, i -> i + 10);
        assertEquals("lesson10.ArraysTest.testArraysSetAll", Arrays.toString(new int[]{10, 11, 12, 13, 14}),
            Arrays.toString(arrayActual));
    }

    public static void testArraysParallelSetAll() {
        int[] arrayActual = {5, 4, 8, 4, 3};
        parallelSetAll(arrayActual, i -> i + 10);
        assertEquals("lesson10.ArraysTest.testArraysParallelSetAll", Arrays.toString(new int[]{10, 11, 12, 13, 14}),
            Arrays.toString(arrayActual));
    }

    public static void testArraysParallelPrefix() {
        int[] arrayActual = {5, 4, 8, 4, 3};
        parallelPrefix(arrayActual, (i, j) -> i + j);
        assertEquals("lesson10.ArraysTest.testArraysParallelPrefix", Arrays.toString(new int[]{5, 9, 17, 21, 24}),
            Arrays.toString(arrayActual));
    }

    public static void testArraysSort() {
        int[] arrayActual = {5, 4, 8, 4, 3};
        sort(arrayActual);
        assertEquals("lesson10.ArraysTest.testArraysSort", Arrays.toString(new int[]{3, 4, 4, 5, 8}),
            Arrays.toString(arrayActual));
    }

    public static void testArraysParallelSort() {
        int[] arrayActual = {5, 4, 8, 4, 3};
        parallelSort(arrayActual);
        assertEquals("lesson10.ArraysTest.testArraysParallelSort", Arrays.toString(new int[]{3, 4, 4, 5, 8}),
            Arrays.toString(arrayActual));
    }

    public static void testArraysBinarySearch() {
        int[] arrayActual = {3, 4, 4, 5, 8};
        assertEquals("lesson10.ArraysTest.testArraysBinarySearch", 4,
            binarySearch(arrayActual, 8));
    }

    public static void testArraysCopy0f() {
        int[] arrayActual = {5, 4, 8, 4, 3};
        assertEquals("lesson10.ArraysTest.testArraysCopy0f", "[5, 4, 8, 4, 3, 0, 0, 0, 0, 0]",
            Arrays.toString(copyOf(arrayActual, 10)));
    }

    public static void testArraysCopy0fRange() {
        int[] arrayActual = {5, 4, 8, 4, 3};
        assertEquals("lesson10.ArraysTest.testArraysCopy0fRange", "[8, 4]",
            Arrays.toString(copyOfRange(arrayActual, 2, 4)));
    }

    public static void testArraysSortWithRange() {
        int[] arrayActual = {5, 4, 8, 4, 3};
        sort(arrayActual, 2, 5);
        assertEquals("lesson10.ArraysTest.testArraysSortWithRange", Arrays.toString(new int[]{5, 4, 3, 4, 8}),
            Arrays.toString(arrayActual));
    }

    public static void testArraysBinarySearchWithRange() {
        int[] arrayActual = {5, 4, 8, 4, 3};
        parallelSort(arrayActual, 1, 4);
        assertEquals("lesson10.ArraysTest.testArraysBinarySearchWithRange", Arrays.toString(new int[]{5, 4, 4, 8, 3}),
            Arrays.toString(arrayActual));
    }

    public static void testArraysParallelSortWithRange() {
        int[] arrayActual = {3, 4, 5, 8, 15, 75, 98, 115, 214};
        assertEquals("lesson10.ArraysTest.testArraysParallelSortWithRange", 4,
            binarySearch(arrayActual, 2, 7, 15));
    }

    public static void testArraysFill() {
        int[] arrayActual = {5, 4, 8, 4, 3};
        fill(arrayActual, 4);
        assertEquals("lesson10.ArraysTest.testArraysFill", Arrays.toString(new int[]{4, 4, 4, 4, 4}),
            Arrays.toString(arrayActual));
    }

    public static void testArraysFillWithRange() {
        int[] arrayActual = {5, 4, 8, 4, 3};
        fill(arrayActual, 2, 4, 7);
        assertEquals("lesson10.ArraysTest.testArraysFillWithRange", Arrays.toString(new int[]{5, 4, 7, 7, 3}),
            Arrays.toString(arrayActual));
    }

}