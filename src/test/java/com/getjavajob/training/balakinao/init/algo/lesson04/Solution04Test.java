package com.getjavajob.training.balakinao.init.algo.lesson04;

import static test.Assert.assertEquals;
import static test.Assert.fail;

public class Solution04Test {

    public static void main(String[] args) {
        testDynamicArrayAddEnd();
        testDynamicArrayAddInvalidIndex();
        testDynamicArrayAddIndexBegin();
        testDynamicArrayAddIndexMiddle();
        testDynamicArrayAddIndexEnd();
        testDynamicArrayRemoveEnd();
        testDynamicArrayRemoveInvalidIndex();
        testDynamicArrayRemoveIndexBegin();
        testDynamicArrayRemoveIndexMiddle();
        testDynamicArrayRemoveBeginObject();
        testDynamicArrayRemoveMiddleObject();
        testDynamicArrayRemoveEndObject();

        testDoublyLinkedListAddEnd();
        testDoublyLinkedListAddInvalidIndex();
        testDoublyLinkedListAddIndexBegin();
        testDoublyLinkedListAddIndexMiddle();
        testDoublyLinkedListAddIndexEnd();
        testDoublyLinkedListRemoveEnd();
        testDoublyLinkedListRemoveInvalidIndex();
        testDoublyLinkedListRemoveIndexBegin();
        testDoublyLinkedListRemoveIndexMiddle();
        testDoublyLinkedListRemoveBeginObject();
        testDoublyLinkedListRemoveMiddleObject();
        testDoublyLinkedListRemoveEndObject();
    }

    public static void testDynamicArrayAddEnd() {
        DynamicArray<Integer> dynamicArrayActual = new DynamicArray<>();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(8);
        dynamicArrayActual.add(7);
        assertEquals("lesson04.Solution04Test.testDynamicArrayAddEnd", true, dynamicArrayActual.add(5));
    }

    public static void testDynamicArrayAddInvalidIndex() {
        DynamicArray<Integer> dynamicArrayActual = new DynamicArray<>();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(8);
        dynamicArrayActual.add(7);
        try {
            dynamicArrayActual.add(52, 7);
            fail("DynamicArrayTest.setOutOfBoundsTest exception must be thrown!!!");
        } catch (Exception e) {
            assertEquals("lesson04.Solution04Test.testDynamicArrayAddInvalidIndex", "Index out of bounds",
                e.getMessage());
        }
    }

    private static void testDynamicArrayAddIndexBegin() {
        DynamicArray<Integer> dynamicArrayActual = new DynamicArray<>();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(8);
        dynamicArrayActual.add(7);
        Object[] arrayExpected = new Object[]{1, 5, 8, 7};
        dynamicArrayActual.add(0, 1);
        assertEquals("lesson04.Solution04Test.testDynamicArrayAddIndexBegin", arrayExpected,
            dynamicArrayActual.toArray());
    }

    private static void testDynamicArrayAddIndexMiddle() {
        DynamicArray<Integer> dynamicArrayActual = new DynamicArray<>();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(8);
        dynamicArrayActual.add(7);
        Object[] arrayExpected = new Object[]{5, 1, 8, 7};
        dynamicArrayActual.add(1, 1);
        assertEquals("lesson04.Solution04Test.testDynamicArrayAddIndexMiddle", arrayExpected,
            dynamicArrayActual.toArray());
    }

    private static void testDynamicArrayAddIndexEnd() {
        DynamicArray<Integer> dynamicArrayActual = new DynamicArray<>();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(7);
        dynamicArrayActual.add(9);
        Object[] arrayExpected = new Object[]{5, 7, 9, 1};
        dynamicArrayActual.add(3, 1);
        assertEquals("lesson04.Solution04Test.testDynamicArrayAddIndexEnd", arrayExpected,
            dynamicArrayActual.toArray());
    }

    public static void testDynamicArrayRemoveEnd() {
        DynamicArray<Integer> dynamicArrayActual = new DynamicArray<>();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(8);
        dynamicArrayActual.add(7);
        Object[] arrayExpected = new Object[]{5, 8};
        dynamicArrayActual.remove(2);
        assertEquals("lesson04.Solution04Test.testDynamicArrayRemoveEnd", arrayExpected, dynamicArrayActual.toArray());
    }

    public static void testDynamicArrayRemoveInvalidIndex() {
        DynamicArray<Integer> dynamicArrayActual = new DynamicArray<>();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(8);
        dynamicArrayActual.add(7);
        try {
            dynamicArrayActual.remove(52);
            fail("DynamicArrayTest.setOutOfBoundsTest exception must be thrown!!!");
        } catch (Exception e) {
            assertEquals("lesson04.Solution04Test.testDynamicArrayRemoveInvalidIndex", "Index out of bounds",
                e.getMessage());
        }
    }

    private static void testDynamicArrayRemoveIndexBegin() {
        DynamicArray<Integer> dynamicArrayActual = new DynamicArray<>();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(8);
        dynamicArrayActual.add(7);
        Object[] arrayExpected = new Object[]{8, 7};
        dynamicArrayActual.remove(0);
        assertEquals("lesson04.Solution04Test.testDynamicArrayRemoveIndexBegin", arrayExpected,
            dynamicArrayActual.toArray
                ());
    }

    private static void testDynamicArrayRemoveIndexMiddle() {
        DynamicArray<Integer> dynamicArrayActual = new DynamicArray<>();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(8);
        dynamicArrayActual.add(7);
        Object[] arrayExpected = new Object[]{5, 7};
        dynamicArrayActual.remove(1);
        assertEquals("lesson04.Solution04Test.testDynamicArrayRemoveIndexMiddle", arrayExpected,
            dynamicArrayActual.toArray());
    }

    private static void testDynamicArrayRemoveBeginObject() {
        DynamicArray<Integer> dynamicArrayActual = new DynamicArray<>();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(6);
        dynamicArrayActual.add(7);
        dynamicArrayActual.add(8);
        Integer enterNumberElement = 5;
        assertEquals("lesson04.Solution04Test.testDynamicArrayRemoveBeginObject", true,
            dynamicArrayActual.remove(enterNumberElement));
    }

    private static void testDynamicArrayRemoveMiddleObject() {
        DynamicArray<Integer> dynamicArrayActual = new DynamicArray<>();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(8);
        dynamicArrayActual.add(7);
        Integer enterNumberElement = 8;
        assertEquals("lesson04.Solution04Test.testDynamicArrayRemoveMiddleObject", true,
            dynamicArrayActual.remove(enterNumberElement));
    }

    public static void testDynamicArrayRemoveEndObject() {
        DynamicArray<Integer> dynamicArrayActual = new DynamicArray<>();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(8);
        dynamicArrayActual.add(7);
        Integer enterNumberElement = 8;
        assertEquals("lesson04.Solution04Test.testDynamicArrayRemoveEndObject", true,
            dynamicArrayActual.remove(enterNumberElement));
    }

    public static void testDoublyLinkedListAddEnd() {
        DoublyLinkedList<Integer> doublyLinkedListActual = new DoublyLinkedList<>();
        doublyLinkedListActual.add(5);
        doublyLinkedListActual.add(8);
        doublyLinkedListActual.add(7);
        assertEquals("lesson03.Solution04Test.testDoublyLinkedListAddEnd", true, doublyLinkedListActual.add(5));
    }

    public static void testDoublyLinkedListAddInvalidIndex() {
        DoublyLinkedList<Integer> doublyLinkedListActual = new DoublyLinkedList<>();
        doublyLinkedListActual.add(5);
        doublyLinkedListActual.add(8);
        doublyLinkedListActual.add(7);
        try {
            doublyLinkedListActual.add(52, 7);
            fail("DoublyLinkedListTest.setOutOfBoundsTest exception must be thrown!!!");
        } catch (Exception e) {
            assertEquals("lesson04.Solution04Test.testDoublyLinkedListAddInvalidIndex", "Index out of bounds",
                e.getMessage());
        }
    }

    private static void testDoublyLinkedListAddIndexBegin() {
        DoublyLinkedList<Integer> doublyLinkedListActual = new DoublyLinkedList<>();
        doublyLinkedListActual.add(5);
        doublyLinkedListActual.add(8);
        doublyLinkedListActual.add(7);
        Object[] arrayExpected = new Object[]{1, 5, 8, 7};
        doublyLinkedListActual.add(0, 1);
        assertEquals("lesson04.Solution04Test.testDoublyLinkedListAddIndexBegin", arrayExpected,
            doublyLinkedListActual.toArray());
    }

    private static void testDoublyLinkedListAddIndexMiddle() {
        DoublyLinkedList<Integer> doublyLinkedListActual = new DoublyLinkedList<>();
        doublyLinkedListActual.add(5);
        doublyLinkedListActual.add(8);
        doublyLinkedListActual.add(7);
        Object[] arrayExpected = new Object[]{5, 1, 8, 7};
        doublyLinkedListActual.add(1, 1);
        assertEquals("lesson04.Solution04Test.testDoublyLinkedListAddIndexMiddle", arrayExpected,
            doublyLinkedListActual.toArray());
    }

    private static void testDoublyLinkedListAddIndexEnd() {
        DoublyLinkedList<Integer> doublyLinkedListActual = new DoublyLinkedList<>();
        doublyLinkedListActual.add(5);
        doublyLinkedListActual.add(7);
        doublyLinkedListActual.add(9);
        Object[] arrayExpected = new Object[]{5, 7, 9, 6};
        doublyLinkedListActual.add(3, 6);
        assertEquals("lesson04.Solution04Test.testDoublyLinkedListAddIndexEnd", arrayExpected,
            doublyLinkedListActual.toArray());
    }

    public static void testDoublyLinkedListRemoveEnd() {
        DoublyLinkedList<Integer> doublyLinkedListActual = new DoublyLinkedList<>();
        doublyLinkedListActual.add(5);
        doublyLinkedListActual.add(8);
        doublyLinkedListActual.add(7);
        Object[] arrayExpected = new Object[]{5, 8};
        doublyLinkedListActual.remove(2);
        assertEquals("lesson04.Solution04Test.testDoublyLinkedListRemoveEnd", arrayExpected,
            doublyLinkedListActual.toArray());
    }

    public static void testDoublyLinkedListRemoveInvalidIndex() {
        DoublyLinkedList<Integer> doublyLinkedListActual = new DoublyLinkedList<>();
        doublyLinkedListActual.add(5);
        doublyLinkedListActual.add(8);
        doublyLinkedListActual.add(7);
        try {
            doublyLinkedListActual.remove(52);
            fail("DoublyLinkedListTest.setOutOfBoundsTest exception must be thrown!!!");
        } catch (Exception e) {
            assertEquals("lesson04.Solution04Test.testDoublyLinkedListRemoveInvalidIndex", "Index out of bounds",
                e.getMessage());
        }
    }

    private static void testDoublyLinkedListRemoveIndexBegin() {
        DoublyLinkedList<Integer> doublyLinkedListActual = new DoublyLinkedList<>();
        doublyLinkedListActual.add(5);
        doublyLinkedListActual.add(8);
        doublyLinkedListActual.add(7);
        Object[] arrayExpected = new Object[]{8, 7};
        doublyLinkedListActual.remove(0);
        assertEquals("lesson04.Solution04Test.testDoublyLinkedListIndexBegin", arrayExpected,
            doublyLinkedListActual.toArray
                ());
    }

    private static void testDoublyLinkedListRemoveIndexMiddle() {
        DoublyLinkedList<Integer> doublyLinkedListActual = new DoublyLinkedList<>();
        doublyLinkedListActual.add(5);
        doublyLinkedListActual.add(8);
        doublyLinkedListActual.add(7);
        Object[] arrayExpected = new Object[]{5, 7};
        doublyLinkedListActual.remove(1);
        assertEquals("lesson04.Solution04Test.testDoublyLinkedListRemoveIndexMiddle", arrayExpected,
            doublyLinkedListActual.toArray());
    }

    private static void testDoublyLinkedListRemoveBeginObject() {
        DoublyLinkedList<Integer> doublyLinkedListActual = new DoublyLinkedList<>();
        doublyLinkedListActual.add(5);
        doublyLinkedListActual.add(6);
        doublyLinkedListActual.add(7);
        doublyLinkedListActual.add(8);
        Integer enterNumberElement = 5;
        assertEquals("lesson04.Solution04Test.testDoublyLinkedListRemoveBeginObject", true,
            doublyLinkedListActual.remove(enterNumberElement));
    }

    private static void testDoublyLinkedListRemoveMiddleObject() {
        DoublyLinkedList<Integer> doublyLinkedListActual = new DoublyLinkedList<>();
        doublyLinkedListActual.add(5);
        doublyLinkedListActual.add(8);
        doublyLinkedListActual.add(7);
        Integer enterNumberElement = 8;
        assertEquals("lesson04.Solution04Test.testDoublyLinkedListRemoveMiddleObject", true,
            doublyLinkedListActual.remove(enterNumberElement));
    }

    public static void testDoublyLinkedListRemoveEndObject() {
        DoublyLinkedList<Integer> doublyLinkedListActual = new DoublyLinkedList<>();
        doublyLinkedListActual.add(5);
        doublyLinkedListActual.add(8);
        doublyLinkedListActual.add(7);
        Integer enterNumberElement = 8;
        assertEquals("lesson04.Solution04Test.testDoublyLinkedListRemoveEndObject", true,
            doublyLinkedListActual.remove(enterNumberElement));
    }

}