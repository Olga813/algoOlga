package com.getjavajob.training.balakinao.init.algo.lesson04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.getjavajob.training.balakinao.init.algo.util.StopWatch.getElapsedTime;
import static com.getjavajob.training.balakinao.init.algo.util.StopWatch.start;

public class JdkListsPerformanceTest {

    public static void main(String[] args) {
        testAddObjToBeginToLinkedList();
        testAddObjToBeginToArrayListDefaultSize();
        testAddObjToBeginToArrayListNoDefaultSize();

        testAddObjToMiddleToLinkedList();
        testAddObjToMiddleToArrayListDefaultSize();
        testAddObjToMiddleToArrayListNoDefaultSize();

        testAddObjToEndToLinkedList();
        testAddObjToEndToArrayListDefaultSize();
        testAddObjToEndToArrayListNoDefaultSize();

        testRemoveObjInBeginInLinkedList();
        testRemoveObjInBeginInArrayListDefaultSize();
        testRemoveObjInBeginInArrayListNoDefaultSize();

        testRemoveObjInMiddleInLinkedList();
        testRemoveObjInMiddleInArrayListDefaultSize();
        testRemoveObjInMiddleInArrayListNoDefaultSize();

        testRemoveObjInEndInLinkedList();
        testRemoveObjInEndInArrayListDefaultSize();
        testRemoveObjInEndInArrayListNoDefaultSize();

    }

    public static void testAddObjToBeginToArrayListDefaultSize() {
        int cap = 90_000;
        List<Integer> arrayList = new ArrayList();
        System.out.println("-------- ArrayList Addition (default size) " + cap + " elements to the beginning --------");
        start();
        for (int i = 0; i < cap; i++) {
            arrayList.add(0, i);
        }
        System.out.println("ArrayList(default size).add(index, element): " + getElapsedTime() + " ms");
    }

    public static void testAddObjToBeginToArrayListNoDefaultSize() {
        int cap = 90_000;
        List<Integer> arrayList = new ArrayList(cap);
        System.out.println("-------- ArrayList Addition (size of test date) " + cap + " elements to the beginning " +
            "--------");
        start();
        for (int i = 0; i < cap; i++) {
            arrayList.add(0, i);
        }
        System.out.println("ArrayList (size of test date).add(index, element) : " + getElapsedTime() + " ms");
    }

    public static void testAddObjToBeginToLinkedList() {
        int cap = 90_000;
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("-------- Linked List " + cap + " elements to the beginning --------");
        start();
        for (int i = 0; i < cap; i++) {
            linkedList.add(0, i);
        }
        System.out.println("LinkedList.add(index,element): " + getElapsedTime() + " ms");
    }

    public static void testAddObjToMiddleToArrayListDefaultSize() {
        int cap = 120_000;
        List<Integer> arrayList = new ArrayList();
        System.out.println("-------- ArrayList Addition (default size) " + cap + " elements to the middle --------");
        for (int i = 0; i < cap; i++) {
            arrayList.add(i);
        }
        start();
        for (int i = cap / 2; i < cap; i++) {
            arrayList.add(i, i);
        }
        System.out.println("ArrayList(default size).add(index, element): " + getElapsedTime() + " ms");
    }

    public static void testAddObjToMiddleToArrayListNoDefaultSize() {
        int cap = 120_000;
        List<Integer> arrayList = new ArrayList(cap);
        System.out.println("-------- ArrayList Addition (size of test date) " + cap + " elements to the middle " +
            "--------");
        for (int i = 0; i < cap; i++) {
            arrayList.add(i);
        }
        start();
        for (int i = cap / 2; i < cap; i++) {
            arrayList.add(i, i);
        }
        System.out.println("ArrayList(size of test date).add(index, element): " + getElapsedTime() + " ms");
    }

    public static void testAddObjToMiddleToLinkedList() {
        int cap = 120_000;
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("-------- Linked List " + cap + " elements to the middle --------");
        for (int i = 0; i < cap; i++) {
            linkedList.add(i);
        }
        start();
        for (int i = cap / 2; i < cap; i++) {
            linkedList.add(i, i);
        }
        System.out.println("LinkedList.add(index, element): " + getElapsedTime() + " ms");
    }

    public static void testAddObjToEndToArrayListDefaultSize() {
        int cap = 25_000_000;
        List<Integer> arrayList = new ArrayList();
        System.out.println("-------- ArrayList Addition (default size) " + cap + " elements to the end --------");
        System.gc();
        start();
        for (int i = 0; i < cap; i++) {
            arrayList.add(i);
        }
        System.out.println("ArrayList(default size).add(index, element): " + getElapsedTime() + " ms");
    }

    public static void testAddObjToEndToArrayListNoDefaultSize() {
        int cap = 25_000_000;
        List<Integer> arrayList = new ArrayList(cap);
        System.out.println("-------- ArrayList Addition (size of test date) " + cap + " elements to the end --------");
        System.gc();
        start();
        for (int i = 0; i < cap; i++) {
            arrayList.add(i);
        }
        System.out.println("ArrayList(size of test date).add(index, element): " + getElapsedTime() + " ms");
    }

    public static void testAddObjToEndToLinkedList() {
        int cap = 25_00_000;
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("-------- Linked List Addition" + cap + " elements to the end --------");
        start();
        for (int i = 0; i < cap; i++) {
            linkedList.add(i);
        }
        System.out.println("LinkedList.add(index, element): " + getElapsedTime() + " ms");
    }

    public static void testRemoveObjInBeginInArrayListDefaultSize() {
        int cap = 150_000;
        List<Integer> arrayList = new ArrayList();
        System.out.println("-------- ArrayList Removing (default size) " + cap + " elements in the beginning --------");
        for (int i = 0; i < cap; i++) {
            arrayList.add(i);
        }
        start();
        for (int i = 0; i < cap; i++) {
            arrayList.remove(0);
        }
        System.out.println("ArrayList(default size).remove(int index): " + getElapsedTime() + " ms");
    }

    public static void testRemoveObjInBeginInArrayListNoDefaultSize() {
        int cap = 150_000;
        List<Integer> arrayList = new ArrayList(cap);
        System.out.println("-------- ArrayList Removing (size of test date) " + cap + " elements in the beginning " +
            "--------");
        for (int i = 0; i < cap; i++) {
            arrayList.add(i);
        }
        start();
        for (int i = 0; i < cap; i++) {
            arrayList.remove(0);
        }
        System.out.println("ArrayList(size of test date).remove(int index): " + getElapsedTime() + " ms");
    }

    public static void testRemoveObjInBeginInLinkedList() {
        int cap = 150_000;
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("-------- Linked List Removing" + cap + " elements in the beginning --------");
        for (int i = 0; i < cap; i++) {
            linkedList.add(i);
        }
        start();
        for (int i = 0; i < cap; i++) {
            linkedList.remove(0);
        }
        System.out.println("LinkedList.remove(int index): " + getElapsedTime() + " ms");
    }

    public static void testRemoveObjInMiddleInArrayListDefaultSize() {
        int cap = 160_000;
        List<Integer> arrayList = new ArrayList();
        System.out.println("-------- ArrayList Removing (default size)" + cap + " elements in the middle --------");
        for (int i = 0; i < cap; i++) {
            arrayList.add(i);
        }
        start();
        for (int i = 0; i < cap / 3; i++) {
            arrayList.remove(cap / 3);
        }
        System.out.println("ArrayList(default size).remove(int index): " + getElapsedTime() + " ms");
    }

    public static void testRemoveObjInMiddleInArrayListNoDefaultSize() {
        int cap = 160_000;
        List<Integer> arrayList = new ArrayList(cap);
        System.out.println("-------- ArrayList Removing (size of test date) " + cap + " elements in the middle " +
            "--------");
        for (int i = 0; i < cap; i++) {
            arrayList.add(i);
        }
        start();
        for (int i = 0; i < cap / 3; i++) {
            arrayList.remove(cap / 3);
        }
        System.out.println("ArrayList(size of test date).remove(int index): " + getElapsedTime() + " ms");
    }

    public static void testRemoveObjInMiddleInLinkedList() {
        int cap = 160_000;
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("-------- Linked List Removing " + cap + " elements in the middle --------");
        for (int i = 0; i < cap; i++) {
            linkedList.add(i);
        }
        start();
        for (int i = 0; i < cap / 3; i++) {
            linkedList.remove(cap / 3);
        }
        System.out.println("LinkedList.remove(int index): " + getElapsedTime() + " ms");
    }

    public static void testRemoveObjInEndInArrayListDefaultSize() {
        int cap = 150_00_000;
        List<Integer> arrayList = new ArrayList();
        System.out.println("-------- ArrayList Removing (default size) " + cap + " elements in the end --------");
        for (int i = 0; i < cap; i++) {
            arrayList.add(7);
        }
        System.gc();
        start();
        for (int i = cap - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        System.out.println("ArrayList(default size).remove(int index): " + getElapsedTime() + " ms");
    }

    public static void testRemoveObjInEndInArrayListNoDefaultSize() {
        int cap = 150_00_000;
        List<Integer> arrayList = new ArrayList(cap);
        System.out.println("-------- ArrayList Removing (size of test date) " + cap + " elements in the end --------");
        for (int i = 0; i < cap; i++) {
            arrayList.add(7);
        }
        System.gc();
        start();
        for (int i = cap - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        System.out.println("ArrayList(size of test date).remove(int index): " + getElapsedTime() + " ms");
    }

    public static void testRemoveObjInEndInLinkedList() {
        int cap = 150_00_000;
        List<Integer> linkedList = new LinkedList<>();
        System.out.println("-------- Linked List Removing " + cap + " elements in the end --------");
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

}