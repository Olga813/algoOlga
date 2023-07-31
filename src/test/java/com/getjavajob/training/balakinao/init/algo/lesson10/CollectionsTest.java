package com.getjavajob.training.balakinao.init.algo.lesson10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static java.util.Collections.addAll;
import static java.util.Collections.binarySearch;
import static java.util.Collections.copy;
import static java.util.Collections.disjoint;
import static java.util.Collections.fill;
import static java.util.Collections.frequency;
import static java.util.Collections.max;
import static java.util.Collections.min;
import static java.util.Collections.replaceAll;
import static java.util.Collections.reverse;
import static java.util.Collections.rotate;
import static java.util.Collections.sort;
import static java.util.Collections.swap;
import static test.Assert.assertEquals;

public class CollectionsTest {

    public static void main(String[] args) {
        testCollectionSort();
        testCollectionBinarySearch();
        testCollectionReverse();
        testCollectionCopy();
        testCollectionFill();
        testCollectionAddAll();
        testCollectionNCopy();
        testCollectionReplaceAll();
        testCollectionRotate();
        testCollectionMin();
        testCollectionMax();
        testCollectionDisjoint();
        testCollectionFrequency();
        testCollectionSwap();
    }

    public static void testCollectionSort() {
        List <Integer> collectionsExpected = new LinkedList <>();
        collectionsExpected.add(7);
        collectionsExpected.add(5);
        collectionsExpected.add(1);
        collectionsExpected.add(9);
        sort(collectionsExpected);
        assertEquals("lesson10.CollectionsTest.testCollectionSort", "[1, 5, 7, 9]", collectionsExpected.toString());
    }

    public static void testCollectionBinarySearch() {
        List <Integer> collectionsExpected = new LinkedList <>();
        collectionsExpected.add(7);
        collectionsExpected.add(5);
        collectionsExpected.add(1);
        collectionsExpected.add(9);
        binarySearch(collectionsExpected, 5);
        assertEquals("lesson10.CollectionsTest.testCollectionBinarySearch", 1, binarySearch(collectionsExpected, 5));
    }

    public static void testCollectionReverse() {
        List <Integer> collectionsExpected = new LinkedList <>();
        collectionsExpected.add(7);
        collectionsExpected.add(5);
        collectionsExpected.add(1);
        collectionsExpected.add(9);
        reverse(collectionsExpected);
        assertEquals("lesson10.CollectionsTest.testCollectionReverse", "[9, 1, 5, 7]", collectionsExpected.toString());
    }

    public static void testCollectionCopy() {
        ArrayList <Integer> stcList = new ArrayList <>();
        stcList.add(7);
        stcList.add(5);
        stcList.add(5);
        ArrayList <Integer> collectionsExpected = new ArrayList <>();
        collectionsExpected.add(71);
        collectionsExpected.add(5);
        collectionsExpected.add(15);
        collectionsExpected.add(9);
        collectionsExpected.add(71);
        collectionsExpected.add(15);
        copy(collectionsExpected, stcList);
        assertEquals("lesson10.CollectionsTest.testCollectionCopy", "[7, 5, 5, 9, 71, 15]",
            collectionsExpected.toString());
    }

    public static void testCollectionFill() {
        List <Integer> collectionsExpected = new LinkedList <>();
        collectionsExpected.add(7);
        collectionsExpected.add(5);
        collectionsExpected.add(1);
        collectionsExpected.add(9);
        fill(collectionsExpected, 9);
        assertEquals("lesson10.CollectionsTest.testCollectionFill", "[9, 9, 9, 9]", collectionsExpected.toString());
    }

    public static void testCollectionAddAll() {
        List <Integer> collectionsExpected = new LinkedList <>();
        addAll(collectionsExpected, 7, 8, 5, 2, 1);
        assertEquals("lesson10.CollectionsTest.testCollectionAddAll", "[7, 8, 5, 2, 1]",
            collectionsExpected.toString());
    }

    public static void testCollectionNCopy() {
        assertEquals("lesson10.CollectionsTest.testCollectionNCopy", "[6, 6, 6, 6]",
            Collections.nCopies(4, 6).toString());
    }

    public static void testCollectionReplaceAll() {
        List <Integer> collectionsExpected = new LinkedList <>();
        addAll(collectionsExpected, 7, 8, 5, 2, 1, 5);
        replaceAll(collectionsExpected, 5, 48);
        assertEquals("lesson10.CollectionsTest.testCollectionReplaceAll", "[7, 8, 48, 2, 1, 48]",
            collectionsExpected.toString());
    }

    public static void testCollectionRotate() {
        List <Integer> collectionsExpected = new LinkedList <>();
        addAll(collectionsExpected, 7, 8, 5, 2, 1, 5);
        rotate(collectionsExpected, 2);
        assertEquals("lesson10.CollectionsTest.testCollectionRotate", "[1, 5, 7, 8, 5, 2]",
            collectionsExpected.toString());
    }

    public static void testCollectionMin() {
        List <Integer> collectionsExpected = new LinkedList <>();
        addAll(collectionsExpected, 7, 8, 5, 2, 1, 5);
        assertEquals("lesson10.CollectionsTest.testCollectionMin", "1",
            min(collectionsExpected).toString());
    }

    public static void testCollectionMax() {
        List <Integer> collectionsExpected = new LinkedList <>();
        addAll(collectionsExpected, 7, 8, 5, 2, 1, 5);
        assertEquals("lesson10.CollectionsTest.testCollectionMax", "8",
            max(collectionsExpected).toString());
    }

    public static void testCollectionDisjoint() {
        List <Integer> collectionsExpected = new ArrayList <>();
        addAll(collectionsExpected, 6, 8, 8, 2, 1, 9);
        ;
        List <Integer> collectionsExpected2 = new ArrayList <>();
        addAll(collectionsExpected2, 7, 8, 5, 2, 1, 5);
        assertEquals("lesson10.CollectionsTest.testCollectionDisjoint", false,
            disjoint(collectionsExpected, collectionsExpected2));
    }

    public static void testCollectionFrequency() {
        List <Integer> collectionsExpected = new LinkedList <>();
        addAll(collectionsExpected, 7, 8, 5, 2, 1, 5);
        assertEquals("lesson10.CollectionsTest.testCollectionFrequency", 2,
            frequency(collectionsExpected, 5));
    }

    public static void testCollectionSwap() {
        List <Integer> collectionsExpected = new LinkedList <>();
        addAll(collectionsExpected, 7, 8, 5, 2, 1, 5);
        swap(collectionsExpected, 0, 1);
        assertEquals("lesson10.CollectionsTest.testCollectionSwap", "[8, 7, 5, 2, 1, 5]",
            collectionsExpected.toString());
    }

}