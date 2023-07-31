package com.getjavajob.training.balakinao.init.algo.lesson05;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import static test.Assert.assertEquals;

public class DequeTest {

    public static void main(String[] args) {
        testAestArrayDequeAddFirst();
        testArrayDequeAddLast();
        testArrayDequeOfferFirst();
        testArrayDequeOfferLast();
        testArrayDequeRemoveFirst();
        testArrayDequeRemoveLast();
        testArrayDequePollFirst();
        testArrayDequePollLast();
        testArrayDequeGetFirst();
        testArrayDequeGetLast();
        testArrayDequePeekFirst();
        testArrayDequePeekLast();
        testArrayDequeRemoveFirstOccurrence();
        testArrayDequeRemoveLastOccurrence();
        testArrayDequePush();
        testArrayDequePop();
    }

    public static void testAestArrayDequeAddFirst() {
        Deque<Integer> arrayDequeActual = new ArrayDeque<>();
        arrayDequeActual.addFirst(1);
        arrayDequeActual.addFirst(2);
        arrayDequeActual.addFirst(3);
        Queue<Integer> listExpected = new LinkedList<>();
        listExpected.add(3);
        listExpected.add(2);
        listExpected.add(1);
        assertEquals("lesson05.Solution05Test.testAestArrayDequeAddFirst", listExpected.toArray(),
            arrayDequeActual.toArray());
    }

    public static void testArrayDequeAddLast() {
        Deque<Integer> arrayDequeActual = new ArrayDeque<>();
        arrayDequeActual.addLast(1);
        arrayDequeActual.addLast(2);
        arrayDequeActual.addLast(3);
        Queue<Integer> listExpected = new LinkedList<>();
        listExpected.add(1);
        listExpected.add(2);
        listExpected.add(3);
        assertEquals("lesson05.Solution05Test.testArrayDequeAddLast", listExpected.toArray(),
            arrayDequeActual.toArray());
    }

    public static void testArrayDequeOfferFirst() {
        Deque<Integer> arrayDequeActual = new ArrayDeque<>();
        arrayDequeActual.addLast(1);
        arrayDequeActual.addLast(2);
        arrayDequeActual.addLast(3);
        assertEquals("lesson05.Solution05Test.testArrayDequeOfferFirst", true,
            arrayDequeActual.offerFirst(5));
    }

    public static void testArrayDequeOfferLast() {
        Deque<Integer> arrayDequeActual = new ArrayDeque<>();
        arrayDequeActual.addLast(1);
        arrayDequeActual.addLast(2);
        arrayDequeActual.addLast(3);
        assertEquals("lesson05.Solution05Test.testArrayDequeOfferLast", true,
            arrayDequeActual.offerLast(5));
    }

    public static void testArrayDequeRemoveFirst() {
        Deque<Integer> arrayDequeActual = new ArrayDeque<>();
        arrayDequeActual.addLast(1);
        arrayDequeActual.addLast(2);
        arrayDequeActual.addLast(3);
        arrayDequeActual.removeFirst();
        Queue<Integer> listExpected = new LinkedList<>();
        listExpected.add(2);
        listExpected.add(3);
        assertEquals("lesson05.Solution05Test.testArrayDequeRemoveFirst", listExpected.toArray(),
            arrayDequeActual.toArray());
    }

    public static void testArrayDequeRemoveLast() {
        Deque<Integer> arrayDequeActual = new ArrayDeque<>();
        arrayDequeActual.addLast(1);
        arrayDequeActual.addLast(2);
        arrayDequeActual.addLast(3);
        arrayDequeActual.removeLast();
        Queue<Integer> listExpected = new LinkedList<>();
        listExpected.add(1);
        listExpected.add(2);
        assertEquals("lesson05.Solution05Test.testArrayDequeRemoveLast", listExpected.toArray(),
            arrayDequeActual.toArray());
    }

    public static void testArrayDequePollFirst() {
        Deque<String> arrayDequeActual = new ArrayDeque<>();
        arrayDequeActual.addLast("1");
        arrayDequeActual.addLast("2");
        arrayDequeActual.addLast("3");
        assertEquals("lesson05.Solution05Test.testArrayDequePollFirst", "1",
            arrayDequeActual.pollFirst());
    }

    public static void testArrayDequePeekFirst() {
        Deque<String> arrayDequeActual = new ArrayDeque<>();
        arrayDequeActual.addLast("1");
        arrayDequeActual.addLast("2");
        arrayDequeActual.addLast("3");
        assertEquals("lesson05.Solution05Test.testArrayDequePeekFirst", "1",
            arrayDequeActual.peekFirst());
    }

    public static void testArrayDequePollLast() {
        Deque<String> arrayDequeActual = new ArrayDeque<>();
        arrayDequeActual.addLast("1");
        arrayDequeActual.addLast("2");
        arrayDequeActual.addLast("3");
        assertEquals("lesson05.Solution05Test.testArrayDequePollLast", "3",
            arrayDequeActual.pollLast());
    }

    public static void testArrayDequePeekLast() {
        Deque<String> arrayDequeActual = new ArrayDeque<>();
        arrayDequeActual.addLast("1");
        arrayDequeActual.addLast("2");
        arrayDequeActual.addLast("3");
        assertEquals("lesson05.Solution05Test.testArrayDequePeekLast", "3",
            arrayDequeActual.peekLast());
    }

    public static void testArrayDequeGetFirst() {
        Deque<String> arrayDequeActual = new ArrayDeque<>();
        arrayDequeActual.addLast("1");
        arrayDequeActual.addLast("2");
        arrayDequeActual.addLast("3");
        assertEquals("lesson05.Solution05Test.testArrayDequeGetFirst", "1",
            arrayDequeActual.getFirst());
    }

    public static void testArrayDequeGetLast() {
        Deque<String> arrayDequeActual = new ArrayDeque<>();
        arrayDequeActual.addLast("1");
        arrayDequeActual.addLast("2");
        arrayDequeActual.addLast("3");
        assertEquals("lesson05.Solution05Test.testArrayDequeGetLast", "3",
            arrayDequeActual.getLast());
    }

    public static void testArrayDequeRemoveFirstOccurrence() {
        Deque<String> arrayDequeActual = new ArrayDeque<>();
        arrayDequeActual.addLast("1");
        arrayDequeActual.addLast("2");
        arrayDequeActual.addLast("3");
        assertEquals("lesson05.Solution05Test.testArrayDequeRemoveFirstOccurrence", true,
            arrayDequeActual.removeFirstOccurrence("3"));
    }

    public static void testArrayDequeRemoveLastOccurrence() {
        Deque<String> arrayDequeActual = new ArrayDeque<>();
        arrayDequeActual.addLast("1");
        arrayDequeActual.addLast("2");
        arrayDequeActual.addLast("3");
        assertEquals("lesson05.Solution05Test.testArrayDequeRemoveLastOccurrence", true,
            arrayDequeActual.removeLastOccurrence("1"));
    }

    public static void testArrayDequePush() {
        Deque<Integer> arrayDequeActual = new ArrayDeque<>();
        arrayDequeActual.push(1);
        arrayDequeActual.push(2);
        arrayDequeActual.push(3);
        Queue<Integer> listExpected = new LinkedList<>();
        listExpected.add(3);
        listExpected.add(2);
        listExpected.add(1);
        assertEquals("lesson05.Solution05Test.testArrayDequePush", listExpected.toArray(),
            arrayDequeActual.toArray());
    }

    public static void testArrayDequePop() {
        Deque<String> arrayDequeActual = new ArrayDeque<>();
        arrayDequeActual.addLast("1");
        arrayDequeActual.addLast("2");
        arrayDequeActual.addLast("3");
        assertEquals("lesson05.Solution05Test.testArrayDequePop", "1",
            arrayDequeActual.pop());
    }

}