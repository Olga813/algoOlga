package com.getjavajob.training.balakinao.init.algo.lesson04;

import static test.Assert.assertEquals;

public class DynamicArrayListIteratorTest {

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
        DynamicArray<String> dynamicArray = new DynamicArray<>();
        dynamicArray.add("0");
        dynamicArray.add("1");
        dynamicArray.add("2");
        DynamicArray<String>.ListIteratorImpl listIterator = dynamicArray.listIterator();
        assertEquals("lesson04.DynamicArrayListIteratorTest.testHasNextTrue", true, listIterator.hasNext());
        listIterator.next();
        listIterator.next();
        listIterator.next();
        assertEquals("lesson04.DynamicArrayListIteratorTest.testHasNextFalse", false, listIterator.hasNext());
    }

    public static void testNext() {
        DynamicArray<String> dynamicArray = new DynamicArray<>();
        dynamicArray.add("0");
        dynamicArray.add("1");
        dynamicArray.add("2");
        DynamicArray<String>.ListIteratorImpl listIterator = dynamicArray.listIterator();
        listIterator.next();
        listIterator.next();
        assertEquals("lesson04.DynamicArrayListIteratorTest.testNext", "2", listIterator.next());
    }

    public static void testHasPrevious() {
        DynamicArray<String> dynamicArray = new DynamicArray<>();
        dynamicArray.add("0");
        dynamicArray.add("1");
        dynamicArray.add("2");
        DynamicArray<String>.ListIteratorImpl listIterator = dynamicArray.listIterator(3);
        assertEquals("lesson04.DynamicArrayListIteratorTest.testHasPreviousTrue", true, listIterator.hasPrevious());
        listIterator.previous();
        listIterator.previous();
        listIterator.previous();
        assertEquals("lesson04.DynamicArrayListIteratorTest.testHasPreviousFalse", false, listIterator.hasPrevious());
    }

    public static void testPrevious() {
        DynamicArray<String> dynamicArray = new DynamicArray<>();
        dynamicArray.add("0");
        dynamicArray.add("1");
        dynamicArray.add("2");
        DynamicArray<String>.ListIteratorImpl listIterator = dynamicArray.listIterator(3);
        listIterator.previous();
        listIterator.previous();
        assertEquals("lesson04.DynamicArrayListIteratorTest.testPrevious", "0", listIterator.previous());
    }

    public static void testNextIndex() {
        DynamicArray<String> dynamicArray = new DynamicArray<>();
        dynamicArray.add("0");
        dynamicArray.add("1");
        dynamicArray.add("2");
        DynamicArray<String>.ListIteratorImpl listIterator = dynamicArray.listIterator();
        listIterator.next();
        listIterator.next();
        assertEquals("lesson04.DynamicArrayListIteratorTest.testNextIndex", 2, listIterator.nextIndex());
    }

    public static void testPreviousIndex() {
        DynamicArray<String> dynamicArray = new DynamicArray<>();
        dynamicArray.add("0");
        dynamicArray.add("1");
        dynamicArray.add("2");
        DynamicArray<String>.ListIteratorImpl listIterator = dynamicArray.listIterator(3);
        listIterator.previous();
        listIterator.previous();
        assertEquals("lesson04.DynamicArrayListIteratorTest.testPreviousIndex", 0, listIterator.previousIndex());
    }

    public static void testRemove() {
        DynamicArray<String> dynamicArray = new DynamicArray<>();
        dynamicArray.add("0");
        dynamicArray.add("1");
        dynamicArray.add("2");
        DynamicArray<String>.ListIteratorImpl listIterator = dynamicArray.listIterator(2);
        listIterator.next();
        listIterator.remove();
        assertEquals("lesson04.DynamicArrayListIteratorTest.testRemove", new Object[]{"0", "1"},
            dynamicArray.toArray());
    }

    public static void testSet() {
        DynamicArray<String> dynamicArray = new DynamicArray<>();
        dynamicArray.add("0");
        dynamicArray.add("1");
        dynamicArray.add("2");
        DynamicArray<String>.ListIteratorImpl listIterator = dynamicArray.listIterator(1);
        listIterator.next();
        listIterator.set("7");
        assertEquals("lesson04.DynamicArrayListIteratorTest.testSet", new Object[]{"0", "7", "2"},
            dynamicArray.toArray());
    }

    public static void testAdd() {
        DynamicArray<String> dynamicArray = new DynamicArray<>();
        dynamicArray.add("0");
        dynamicArray.add("1");
        dynamicArray.add("2");
        DynamicArray<String>.ListIteratorImpl listIterator = dynamicArray.listIterator(1);
        listIterator.next();
        listIterator.add("7");
        assertEquals("lesson04.DynamicArrayListIteratorTest.testAdd", new Object[]{"0", "1", "7", "2"}, dynamicArray.toArray());
    }

}