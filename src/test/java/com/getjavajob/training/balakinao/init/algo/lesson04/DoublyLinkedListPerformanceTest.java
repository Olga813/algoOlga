package com.getjavajob.training.balakinao.init.algo.lesson04;

import java.util.LinkedList;
import java.util.List;

import static com.getjavajob.training.balakinao.init.algo.util.StopWatch.getElapsedTime;
import static com.getjavajob.training.balakinao.init.algo.util.StopWatch.start;

public class DoublyLinkedListPerformanceTest {

    public static void main(String[] args) {
        testAddObjToBeginToLinkedList();
        testAddObjToBeginToDoublyLinkedList();
        testAddObjToMiddleToLinkedList();
        testAddObjToMiddleToDoublyLinkedList();
        testAddObjToEndToLinkedList();
        testAddObjToEndToDoublyLinkedList();
        testRemoveObjInBeginInLinkedList();
        testRemoveObjInBeginInDoublyLinkedList();
        testRemoveObjInMiddleInLinkedList();
        testRemoveObjInMiddleInDoublyLinkedList();
        System.gc();
        testRemoveObjInEndInLinkedList();
        System.gc();
        testRemoveObjInEndInDoublyLinkedList();
    }

    public static void testAddObjToBeginToLinkedList() {
        int cap = 9_000_000;
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("-------- LinkedList Addition " + cap + " elements to the beginning --------");
        start();
        for (int i = 0; i < cap; i++) {
            linkedList.add(0, i);
        }
        System.out.println("LinkedList.add(index, element): " + getElapsedTime() + " ms");
    }

    public static void testAddObjToBeginToDoublyLinkedList() {
        int cap = 9_000_000;
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        System.out.println("-------- DoublyLinkedList Addition " + cap + " elements to the beginning --------");
        start();
        for (int i = 0; i < cap; i++) {
            doublyLinkedList.add(0, i);
        }
        System.out.println("DoublyLinkedList.add(index, element): " + getElapsedTime() + " ms");
    }

    public static void testAddObjToMiddleToLinkedList() {
        int cap = 60_000;
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("-------- LinkedList Addition " + cap + " elements to the middle --------");
        for (int i = 0; i < cap; i++) {
            linkedList.add(i);
        }
        start();
        for (int i = cap / 2; i < cap; i++) {
            linkedList.add(i, i);
        }
        System.out.println("LinkedList.add(ind,index, element): " + getElapsedTime() + " ms");
    }

    public static void testAddObjToMiddleToDoublyLinkedList() {
        int cap = 60_000;
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        System.out.println("-------- DoublyLinkedList Addition " + cap + " elements to the middle --------");
        for (int i = 0; i < cap; i++) {
            doublyLinkedList.add(i);
        }
        start();
        for (int i = cap / 2; i < cap; i++) {
            doublyLinkedList.add(i, i);
        }
        System.out.println("DoublyLinkedList.add(index, element): " + getElapsedTime() + " ms");
    }

    public static void testAddObjToEndToLinkedList() {
        int cap = 13_000_000;
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("-------- ArrayList Addition " + cap + " elements to the end --------");
        System.gc();
        start();
        for (int i = 0; i < cap; i++) {
            linkedList.add(i);
        }
        System.out.println("LinkedList.add(index, element): " + getElapsedTime() + " ms");
    }

    public static void testAddObjToEndToDoublyLinkedList() {
        int cap = 13_000_000;
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        System.out.println("-------- DoublyLinkedList Addition " + cap + " elements to the end --------");
        start();
        for (int i = 0; i < cap; i++) {
            doublyLinkedList.add(i);
        }
        System.out.println("DoublyLinkedList.add(index, element): " + getElapsedTime() + " ms");
    }

    public static void testRemoveObjInBeginInLinkedList() {
        int cap = 37_000_000;
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("-------- LinkedList Removing " + cap + " elements in the beginning --------");
        for (int i = 0; i < cap; i++) {
            linkedList.add(i);
        }
        start();
        for (int i = 0; i < cap; i++) {
            linkedList.remove(0);
        }
        System.out.println("LinkedList.remove(int index): " + getElapsedTime() + " ms");
    }

    public static void testRemoveObjInBeginInDoublyLinkedList() {
        int cap = 37_000_000;
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        System.out.println("-------- DoublyLinkedList Removing " + cap + " elements in the beginning --------");
        for (int i = 0; i < cap; i++) {
            doublyLinkedList.add(i);
        }
        start();
        for (int i = 0; i < cap; i++) {
            doublyLinkedList.remove(0);
        }
        System.out.println("DoublyLinkedList.remove(int index): " + getElapsedTime() + " ms");
    }

    public static void testRemoveObjInMiddleInLinkedList() {
        int cap = 80_000;
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("-------- LinkedList Removing " + cap + " elements in the middle --------");
        for (int i = 0; i < cap; i++) {
            linkedList.add(i);
        }
        start();
        for (int i = 0; i < cap / 3; i++) {
            linkedList.remove(cap / 3);
        }
        System.out.println("LinkedList.remove(int index): " + getElapsedTime() + " ms");
    }

    public static void testRemoveObjInMiddleInDoublyLinkedList() {
        int cap = 80_000;
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        System.out.println("-------- DoublyLinkedList Removing " + cap + " elements in the middle --------");
        for (int i = 0; i < cap; i++) {
            doublyLinkedList.add(i);
        }
        start();
        for (int i = 0; i < cap / 3; i++) {
            doublyLinkedList.remove(cap / 3);
        }
        System.out.println("DoublyLinkedList.remove(int index): " + getElapsedTime() + " ms");
    }

    public static void testRemoveObjInEndInLinkedList() {
        int cap = 60_000_000;
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("-------- LinkedList Removing " + cap + " elements in the end --------");
        for (int i = 0; i < cap; i++) {
            linkedList.add(7);
        }
        System.gc();
        start();
        for (int i = cap - 1; i >= 0; i--) {
            linkedList.remove(i);
        }
        System.out.println("LinkedList.remove(int index): " + getElapsedTime() + " ms");
    }

    public static void testRemoveObjInEndInDoublyLinkedList() {
        int cap = 60_000_000;
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        System.out.println("-------- DoublyLinkedList Removing " + cap + " elements in the end --------");
        for (int i = 0; i < cap; i++) {
            doublyLinkedList.add(7);
        }
        System.gc();
        start();
        for (int i = cap - 1; i >= 0; i--) {
            doublyLinkedList.remove(i);
        }
        System.out.println("DoublyLinkedList.remove(int index): " + getElapsedTime() + " ms");
    }

}
