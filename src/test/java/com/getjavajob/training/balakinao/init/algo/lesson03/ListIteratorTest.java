package com.getjavajob.training.balakinao.init.algo.lesson03;

import static test.Assert.assertEquals;

public class ListIteratorTest {

    public static void main(String[] args) throws AssertionError {
        testHasNext();
        testNext();
        testHasPrevious();
        testPrevious();
        testNextIndex();
        testPreviousIndex();
        testRemove();
        testSet();
        testAdd();
    }

    public static void testHasNext() {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add("0");
        dynamicArray.add("1");
        dynamicArray.add("2");
        DynamicArray.ListIterator listIterator = dynamicArray.listIterator();
        assertEquals("lesson03.DynamicArrayListIteratorTest.testHasNextTrue", true, listIterator.hasNext());
        listIterator.next();
        listIterator.next();
        listIterator.next();
        assertEquals("lesson03.DynamicArrayListIteratorTest.testHasNextFalse", false, listIterator.hasNext());
    }

    public static void testNext() {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(0);
        dynamicArray.add(1);
        dynamicArray.add(2);
        DynamicArray.ListIterator listIterator = dynamicArray.listIterator();
        listIterator.next();
        listIterator.next();
        assertEquals("lesson03.DynamicArrayListIteratorTest.testNext", 2, listIterator.next());
    }

    public static void testHasPrevious() {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add("0");
        dynamicArray.add("1");
        dynamicArray.add("2");
        DynamicArray.ListIterator listIterator = dynamicArray.listIterator(3);
        assertEquals("lesson03.DynamicArrayListIteratorTest.testHasPreviousTrue", true, listIterator.hasPrevious());
        listIterator.previous();
        listIterator.previous();
        listIterator.previous();
        assertEquals("lesson03.DynamicArrayListIteratorTest.testHasPreviousFalse", false, listIterator.hasPrevious());
    }

    public static void testPrevious() {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add("0");
        dynamicArray.add("1");
        dynamicArray.add("2");
        DynamicArray.ListIterator listIterator = dynamicArray.listIterator(3);
        listIterator.previous();
        listIterator.previous();
        assertEquals("lesson03.DynamicArrayListIteratorTest.testPrevious", "0", listIterator.previous());
    }

    public static void testNextIndex() {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add("0");
        dynamicArray.add("1");
        dynamicArray.add("2");
        DynamicArray.ListIterator listIterator = dynamicArray.listIterator();
        listIterator.next();
        listIterator.next();
        listIterator.next();
        assertEquals("lesson03.DynamicArrayListIteratorTest.testNextIndex", 3, listIterator.nextIndex());
    }

    public static void testPreviousIndex() {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add("0");
        dynamicArray.add("1");
        dynamicArray.add("2");
        DynamicArray.ListIterator listIterator = dynamicArray.listIterator(3);
        listIterator.previous();
        listIterator.previous();
        assertEquals("lesson03.DynamicArrayListIteratorTest.testPreviousIndex", 0, listIterator.previousIndex());
    }

    public static void testRemove() {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add("0");
        dynamicArray.add("1");
        dynamicArray.add("2");
        DynamicArray.ListIterator listIterator = dynamicArray.listIterator(2);
        listIterator.next();
        listIterator.remove();
        assertEquals("lesson03.DynamicArrayListIteratorTest.testRemove", new Object[] {"0", "1"}, dynamicArray.toArray());
    }

    public static void testSet() {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add("0");
        dynamicArray.add("1");
        dynamicArray.add("2");
        DynamicArray.ListIterator listIterator = dynamicArray.listIterator(1);
        listIterator.next();
        listIterator.set("7");
        assertEquals("lesson03.DynamicArrayListIteratorTest.testSet", new Object[] {"0", "7", "2"}, dynamicArray.toArray());
    }

    public static void testAdd() {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add("0");
        dynamicArray.add("1");
        dynamicArray.add("2");
        DynamicArray.ListIterator listIterator = dynamicArray.listIterator(1);
        listIterator.next();
        listIterator.add("7");
        assertEquals("lesson03.DynamicArrayListIteratorTest.testAdd", new Object[] {"0", "1", "7", "2"}, dynamicArray.toArray());
    }

}