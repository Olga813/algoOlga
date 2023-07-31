package com.getjavajob.training.balakinao.init.algo.lesson09;

import java.util.TreeSet;

import static test.Assert.assertEquals;

public class SortedSetTest {

    public static void main(String[] args) {
        testFirst();
        testLast();
        testHeadSet();
        testSubSet();
        testTailSet();
    }
    public static void testFirst() {
        TreeSet<Integer> treeSet = new TreeSet <>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        assertEquals("lesson09.SortedSetTest.testFirst", "1",
            treeSet.first().toString());
    }
    public static void testLast() {
        TreeSet<Integer> treeSet = new TreeSet <>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        assertEquals("lesson09.SortedSetTest.testLast", "5",
            treeSet.last().toString());
    }
    public static void testHeadSet() {
        TreeSet<Integer> treeSet = new TreeSet <>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        assertEquals("lesson09.SortedSetTest.testHeadSet", "[1, 2]",
            treeSet.headSet(3).toString());
    }
    public static void testSubSet() {
        TreeSet<Integer> treeSet = new TreeSet <>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        assertEquals("lesson09.SortedSetTest.testSubSet", "[2, 3]",
            treeSet.subSet(2,4).toString());
    }
    public static void testTailSet() {
        TreeSet<Integer> treeSet = new TreeSet <>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        TreeSet <Integer> treeSetExpected = new TreeSet <>();
        treeSetExpected.add(3);
        treeSetExpected.add(4);
        treeSetExpected.add(5);
        assertEquals("lesson09.SortedSetTest.testTailSet", treeSetExpected.toString(),
            treeSet.tailSet(3).toString());
    }

}