package com.getjavajob.training.balakinao.init.algo.lesson05;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

import static test.Assert.assertEquals;

public class QueueTest {

    public static void main(String[] args) {
        testArrayQueueAdd();
        testArrayQueueeOffer();
        testArrayQueueRemove();
        testArrayQueuePoll();
        testArrayQueueElement();
        testArrayQueuePeek();
    }

    public static void testArrayQueueAdd() {
        Queue<Integer> arrayQueueActual = new ArrayDeque<>();
        arrayQueueActual.add(1);
        arrayQueueActual.add(2);
        arrayQueueActual.add(3);
        Queue<Integer> listExpected = new LinkedList<>();
        listExpected.add(1);
        listExpected.add(2);
        listExpected.add(3);
        assertEquals("lesson05.Solution05Test.testArrayQueueAdd", listExpected.toArray(),
            arrayQueueActual.toArray());
    }

    public static void testArrayQueueeOffer() {
        Queue<Integer> arrayQueueActual = new ArrayDeque<>();
        arrayQueueActual.offer(1);
        arrayQueueActual.offer(2);
        arrayQueueActual.offer(3);
        Queue<Integer> listExpected = new LinkedList<>();
        listExpected.add(1);
        listExpected.add(2);
        listExpected.add(3);
        assertEquals("lesson05.Solution05Test.testArrayQueueeOffer", listExpected.toArray(),
            arrayQueueActual.toArray());
    }

    public static void testArrayQueueRemove() {
        Queue<Integer> arrayQueueActual = new ArrayDeque<>();
        arrayQueueActual.offer(1);
        arrayQueueActual.offer(2);
        arrayQueueActual.offer(3);
        arrayQueueActual.remove();
        Queue<Integer> listExpected = new LinkedList<>();
        listExpected.add(2);
        listExpected.add(3);
        assertEquals("lesson05.Solution05Test.testArrayQueueRemove", listExpected.toArray(),
            arrayQueueActual.toArray());
    }

    public static void testArrayQueuePoll() {
        Queue<Integer> arrayQueueActual = new ArrayDeque<>();
        arrayQueueActual.offer(1);
        arrayQueueActual.offer(2);
        arrayQueueActual.offer(3);
        arrayQueueActual.poll();
        Queue<Integer> listExpected = new LinkedList<>();
        listExpected.add(2);
        listExpected.add(3);
        assertEquals("lesson05.Solution05Test.testArrayQueuePoll", listExpected.toArray(),
            arrayQueueActual.toArray());
    }

    public static void testArrayQueueElement() {
        Queue<String> arrayQueueActual = new ArrayDeque<>();
        arrayQueueActual.offer("1");
        arrayQueueActual.offer("2");
        arrayQueueActual.offer("3");
        assertEquals("lesson05.Solution05Test.testArrayQueueElement", "1", arrayQueueActual.element());
    }

    public static void testArrayQueuePeek() {
        Queue<String> arrayQueueActual = new ArrayDeque<>();
        arrayQueueActual.offer("1");
        arrayQueueActual.offer("2");
        arrayQueueActual.offer("3");
        assertEquals("lesson05.Solution05Test.testArrayQueuePeek", "1", arrayQueueActual.peek());
    }

}