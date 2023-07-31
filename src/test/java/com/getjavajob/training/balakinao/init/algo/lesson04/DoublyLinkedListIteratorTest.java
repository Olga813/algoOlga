package com.getjavajob.training.balakinao.init.algo.lesson04;

import static test.Assert.assertEquals;

public class DoublyLinkedListIteratorTest {

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
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.add("0");
        doublyLinkedList.add("1");
        doublyLinkedList.add("2");
        DoublyLinkedList<String>.DoublyLinkedIterator listIterator = doublyLinkedList.listIterator();
        assertEquals("lesson04. DoublyLinkedListIteratorTest.testHasNextTrue", true, listIterator.hasNext());
        listIterator.next();
        listIterator.next();
        listIterator.next();
        assertEquals("lesson04.DoublyLinkedListIteratorTest.testHasNextFalse", false, listIterator.hasNext());
    }

    public static void testNext() {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.add("0");
        doublyLinkedList.add("1");
        doublyLinkedList.add("2");
        DoublyLinkedList<String>.DoublyLinkedIterator listIterator = doublyLinkedList.listIterator();
        listIterator.next();
        listIterator.next();
        assertEquals("lesson04.DoublyLinkedListIteratorTest.testNext", "2", listIterator.next());
    }

    public static void testHasPrevious() {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.add("0");
        doublyLinkedList.add("1");
        doublyLinkedList.add("2");
        DoublyLinkedList<String>.DoublyLinkedIterator listIterator = doublyLinkedList.listIterator(3);
        assertEquals("lesson04.DoublyLinkedListIteratorTest.testHasPreviousTrue", true, listIterator.hasPrevious());
        listIterator.previous();
        listIterator.previous();
        listIterator.previous();
        assertEquals("lesson04.DoublyLinkedListIteratorTest.testHasPreviousFalse", false, listIterator.hasPrevious());
    }

    public static void testPrevious() {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.add("0");
        doublyLinkedList.add("1");
        doublyLinkedList.add("2");
        DoublyLinkedList<String>.DoublyLinkedIterator listIterator = doublyLinkedList.listIterator(3);
        listIterator.previous();
        listIterator.previous();
        assertEquals("lesson04.DoublyLinkedListIteratorTest.testPrevious", "0", listIterator.previous());
    }

    public static void testNextIndex() {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.add("0");
        doublyLinkedList.add("1");
        doublyLinkedList.add("2");
        DoublyLinkedList<String>.DoublyLinkedIterator listIterator = doublyLinkedList.listIterator();
        listIterator.next();
        listIterator.next();
        assertEquals("lesson04.DoublyLinkedListIteratorTest.testNextIndex", 2, listIterator.nextIndex());
    }

    public static void testPreviousIndex() {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.add("0");
        doublyLinkedList.add("1");
        doublyLinkedList.add("2");
        DoublyLinkedList<String>.DoublyLinkedIterator listIterator = doublyLinkedList.listIterator(3);
        listIterator.previous();
        listIterator.previous();
        assertEquals("lesson04.DoublyLinkedListIteratorTest.testPreviousIndex", 0, listIterator.previousIndex());
    }

    public static void testRemove() {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.add("0");
        doublyLinkedList.add("1");
        doublyLinkedList.add("2");
        DoublyLinkedList<String>.DoublyLinkedIterator listIterator = doublyLinkedList.listIterator(2);
        listIterator.next();
        listIterator.remove();
        assertEquals("lesson04.DoublyLinkedListIteratorTest.testRemove", new Object[]{"0", "1"},
            doublyLinkedList.toArray());
    }

    public static void testSet() {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.add("0");
        doublyLinkedList.add("1");
        doublyLinkedList.add("2");
        DoublyLinkedList<String>.DoublyLinkedIterator listIterator = doublyLinkedList.listIterator(1);
        listIterator.next();
        listIterator.set("7");
        assertEquals("lesson04.DoublyLinkedListIteratorTest.testSet", new Object[]{"0", "7", "2"},
            doublyLinkedList.toArray());
    }

    public static void testAdd() {
        DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.add("5");
        doublyLinkedList.add("9");
        doublyLinkedList.add("8");
        DoublyLinkedList<String>.DoublyLinkedIterator listIterator = doublyLinkedList.listIterator(1);
        listIterator.next();
        listIterator.add("7");
        assertEquals("lesson04. DoublyLinkedListIteratorTest.testAdd", new Object[]{"5", "9", "7", "8"},
            doublyLinkedList.toArray());
    }

}