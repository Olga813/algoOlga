package com.getjavajob.training.balakinao.init.algo.lesson03;

import static test.Assert.assertEquals;
import static test.Assert.fail;

public class Solution03Test {

    public static void main(String[] args) {
        testAddEnd();
        testAddInvalidIndex();
        testAddIndexBegin();
        testAddIndexMiddle();
        testAddIndexEnd();
        testRemoveEnd();
        testRemoveInvalidIndex();
        testRemoveIndexBegin();
        testRemoveIndexMiddle();
        testRemoveBeginObject();
        testRemoveMiddleObject();
        testRemoveEndObject();
    }

    public static void testAddEnd() {
        DynamicArray dynamicArrayActual = new DynamicArray();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(8);
        dynamicArrayActual.add(7);
        assertEquals("lesson03.Solution03Test.testAddEnd", true, dynamicArrayActual.add(5));
    }

    public static void testAddInvalidIndex() {
        DynamicArray dynamicArrayActual = new DynamicArray();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(8);
        dynamicArrayActual.add(7);
        try {
            dynamicArrayActual.add(52, 7);
            fail("DynamicArrayTest.setOutOfBoundsTest exception must be thrown!!!");
        } catch (Exception e) {
            assertEquals("lesson03.Solution03Test.testAddInvalidIndex", "Index out of bounds", e.getMessage());
        }
    }

    private static void testAddIndexBegin() {
        DynamicArray dynamicArrayActual = new DynamicArray();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(8);
        dynamicArrayActual.add(7);
        Object[] arrayExpected = new Object[]{1, 5, 8, 7};
        dynamicArrayActual.add(0, 1);
        assertEquals("lesson03.Solution03Test.testAddIndexBegin", arrayExpected, dynamicArrayActual.toArray());
    }

    private static void testAddIndexMiddle() {
        DynamicArray dynamicArrayActual = new DynamicArray();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(8);
        dynamicArrayActual.add(7);
        Object[] arrayExpected = new Object[]{5, 1, 8, 7};
        dynamicArrayActual.add(1, 1);
        assertEquals("lesson03.Solution03Test.testAddIndexMiddle", arrayExpected, dynamicArrayActual.toArray());
    }

    private static void testAddIndexEnd() {
        DynamicArray dynamicArrayActual = new DynamicArray();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(7);
        dynamicArrayActual.add(9);
        Object[] arrayExpected = new Object[]{5, 7, 9, 1};
        dynamicArrayActual.add(3, 1);
        assertEquals("lesson03.Solution03Test.testAddIndexEnd", arrayExpected, dynamicArrayActual.toArray());
    }

    public static void testRemoveEnd() {
        DynamicArray dynamicArrayActual = new DynamicArray();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(8);
        dynamicArrayActual.add(7);
        Object[] arrayExpected = new Object[]{5, 8};
        dynamicArrayActual.remove(2);
        assertEquals("lesson03.Solution03Test.testRemoveEnd", arrayExpected, dynamicArrayActual.toArray());
    }

    public static void testRemoveInvalidIndex() {
        DynamicArray dynamicArrayActual = new DynamicArray();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(8);
        dynamicArrayActual.add(7);
        try {
            dynamicArrayActual.remove(52);
            fail("DynamicArrayTest.setOutOfBoundsTest exception must be thrown!!!");
        } catch (Exception e) {
            assertEquals("lesson03.Solution03Test.testRemoveInvalidIndex", "Index out of bounds", e.getMessage());
        }
    }

    private static void testRemoveIndexBegin() {
        DynamicArray dynamicArrayActual = new DynamicArray();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(8);
        dynamicArrayActual.add(7);
        Object[] arrayExpected = new Object[]{8, 7};
        dynamicArrayActual.remove(0);
        assertEquals("lesson03.Solution03Test.testRemoveIndexBegin", arrayExpected, dynamicArrayActual.toArray
            ());
    }

    private static void testRemoveIndexMiddle() {
        DynamicArray dynamicArrayActual = new DynamicArray();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(8);
        dynamicArrayActual.add(7);
        Object[] arrayExpected = new Object[]{5, 7};
        dynamicArrayActual.remove(1);
        assertEquals("lesson03.Solution03Test.testRemoveIndexMiddle", arrayExpected, dynamicArrayActual.toArray());
    }

    private static void testRemoveBeginObject() {
        DynamicArray dynamicArrayActual = new DynamicArray();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(6);
        dynamicArrayActual.add(7);
        dynamicArrayActual.add(8);
        Integer enterNumberElement = 5;
        assertEquals("lesson03.Solution03Test.testRemoveBeginObject", true,
            dynamicArrayActual.remove(enterNumberElement));
    }

    private static void testRemoveMiddleObject() {
        DynamicArray dynamicArrayActual = new DynamicArray();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(8);
        dynamicArrayActual.add(7);
        Integer enterNumberElement = 8;
        assertEquals("lesson03.Solution03Test.testRemoveMiddleObject", true,
            dynamicArrayActual.remove(enterNumberElement));
    }

    public static void testRemoveEndObject() {
        DynamicArray dynamicArrayActual = new DynamicArray();
        dynamicArrayActual.add(5);
        dynamicArrayActual.add(8);
        dynamicArrayActual.add(7);
        Integer enterNumberElement = 8;
        assertEquals("lesson03.Solution03Test.testRemoveEndObject", true,
            dynamicArrayActual.remove(enterNumberElement));
    }

}