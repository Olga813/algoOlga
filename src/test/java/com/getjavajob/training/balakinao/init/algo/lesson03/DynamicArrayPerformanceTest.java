package com.getjavajob.training.balakinao.init.algo.lesson03;

import java.util.ArrayList;
import java.util.List;

import static com.getjavajob.training.balakinao.init.algo.util.StopWatch.getElapsedTime;
import static com.getjavajob.training.balakinao.init.algo.util.StopWatch.start;

public class DynamicArrayPerformanceTest {

    public static void main(String[] args) {
        testAddObjToBeginToArrayList();
        testAddObjToBeginToDynamicArray();
        testAddObjToMiddleToArrayList();
        testAddObjToMiddleToDynamicArray();
        testAddObjToEndToArrayList();
        testAddObjToEndToDynamicArray();
        testRemoveObjInBeginInArrayList();
        testRemoveObjInBeginInDynamicArray();
        testRemoveObjInMiddleInArrayList();
        testRemoveObjInMiddleInDynamicArray();
        testRemoveObjInEndInArrayList();
        testRemoveObjInEndInDynamicArray();
    }

    public static void testAddObjToBeginToArrayList() {
        int cap = 90_000;
        List<Integer> arrayList = new ArrayList();
        System.out.println("-------- ArrayList Addition " + cap + " elements to the beginning --------");
        start();
        for (int i = 0; i < cap; i++) {
            arrayList.add(0, i);
        }
        System.out.println("ArrayList.add(index,element): " + getElapsedTime() + " ms");
    }

    public static void testAddObjToBeginToDynamicArray() {
        int cap = 90_000;
        DynamicArray dynamicArray = new DynamicArray();
        System.out.println("-------- DynamicArray Addition " + cap + " elements to the beginning --------");
        start();
        for (int i = 0; i < cap; i++) {
            dynamicArray.add(0, i);
        }
        System.out.println("DynamicArray.add(index,element): " + getElapsedTime() + " ms");
    }

    public static void testAddObjToMiddleToArrayList() {
        int cap = 120_000;
        List<Integer> arrayList = new ArrayList();
        System.out.println("-------- ArrayList Addition " + cap + " elements to the middle --------");
        for (int i = 0; i < cap; i++) {
            arrayList.add(i);
        }
        start();
        for (int i = cap / 2; i < cap; i++) {
            arrayList.add(i, i);
        }
        System.out.println("ArrayList.add(ind,index,element): " + getElapsedTime() + " ms");
    }

    public static void testAddObjToMiddleToDynamicArray() {
        int cap = 120_000;
        DynamicArray dynamicArray = new DynamicArray();
        System.out.println("-------- DynamicArray Addition " + cap + " elements to the middle --------");
        for (int i = 0; i < cap; i++) {
            dynamicArray.add(i);
        }
        start();
        for (int i = cap / 2; i < cap; i++) {
            dynamicArray.add(i, i);
        }
        System.out.println("DynamicArray.add(index, element): " + getElapsedTime() + " ms");
    }

    public static void testAddObjToEndToArrayList() {
        int cap = 25_000_000;
        List<Integer> arrayList = new ArrayList();
        System.out.println("-------- ArrayList Addition " + cap + " elements to the end --------");
        System.gc();
        start();
        for (int i = 0; i < cap; i++) {
            arrayList.add(i);
        }
        System.out.println("ArrayList.add(index, element): " + getElapsedTime() + " ms");
    }

    public static void testAddObjToEndToDynamicArray() {
        int cap = 25_000_000;
        DynamicArray dynamicArray = new DynamicArray();
        System.out.println("-------- DynamicArray Addition " + cap + " elements to the end --------");
        start();
        for (int i = 0; i < cap; i++) {
            dynamicArray.add(i);
        }
        System.out.println("DynamicArray.add(index, element): " + getElapsedTime() + " ms");
    }

    public static void testRemoveObjInBeginInArrayList() {
        int cap = 150_000;
        List<Integer> arrayList = new ArrayList();
        System.out.println("-------- ArrayList Removing " + cap + " elements in the beginning --------");
        for (int i = 0; i < cap; i++) {
            arrayList.add(i);
        }
        start();
        for (int i = 0; i < cap; i++) {
            arrayList.remove(0);
        }
        System.out.println("ArrayList.remove(int index): " + getElapsedTime() + " ms");
    }

    public static void testRemoveObjInBeginInDynamicArray() {
        int cap = 150_000;
        DynamicArray dynamicArray = new DynamicArray();
        System.out.println("-------- DynamicArray Removing " + cap + " elements in the beginning --------");
        for (int i = 0; i < cap; i++) {
            dynamicArray.add(i);
        }
        start();
        for (int i = 0; i < cap; i++) {
            dynamicArray.remove(0);
        }
        System.out.println("DynamicArray.remove(int index): " + getElapsedTime() + " ms");
    }

    public static void testRemoveObjInMiddleInArrayList() {
        int cap = 160_000;
        List<Integer> arrayList = new ArrayList();
        System.out.println("-------- ArrayList Removing " + cap + " elements in the middle --------");
        for (int i = 0; i < cap; i++) {
            arrayList.add(i);
        }
        start();
        for (int i = 0; i < cap / 3; i++) {
            arrayList.remove(cap / 3);
        }
        System.out.println("ArrayList.remove(int index): " + getElapsedTime() + " ms");
    }

    public static void testRemoveObjInMiddleInDynamicArray() {
        int cap = 160_000;
        DynamicArray dynamicArray = new DynamicArray();
        System.out.println("-------- DynamicArray Removing " + cap + " elements in the middle --------");
        for (int i = 0; i < cap; i++) {
            dynamicArray.add(i);
        }
        start();
        for (int i = 0; i < cap / 3; i++) {
            dynamicArray.remove(cap / 3);
        }
        System.out.println("DynamicArray.remove(int index): " + getElapsedTime() + " ms");
    }

    public static void testRemoveObjInEndInArrayList() {
        int cap = 150_000_000;
        List<Integer> arrayList = new ArrayList();
        System.out.println("-------- ArrayList Removing " + cap + " elements in the end --------");
        for (int i = 0; i < cap; i++) {
            arrayList.add(7);
        }
        System.gc();
        start();
        for (int i = cap - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        System.out.println("ArrayList.remove(int index): " + getElapsedTime() + " ms");
    }

    public static void testRemoveObjInEndInDynamicArray() {
        int cap = 150_000_000;
        DynamicArray dynamicArray = new DynamicArray();
        System.out.println("-------- DynamicArray Removing " + cap + " elements in the end --------");
        for (int i = 0; i < cap; i++) {
            dynamicArray.add(7);
        }
        System.gc();
        start();
        for (int i = cap - 1; i >= 0; i--) {
            dynamicArray.remove(i);
        }
        System.out.println("DynamicArray.remove(int index): " + getElapsedTime() + " ms");
    }

}
