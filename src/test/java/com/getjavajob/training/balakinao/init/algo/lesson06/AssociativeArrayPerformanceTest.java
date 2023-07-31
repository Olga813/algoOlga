package com.getjavajob.training.balakinao.init.algo.lesson06;

import java.util.HashMap;
import java.util.Map;

import static com.getjavajob.training.balakinao.init.algo.util.StopWatch.getElapsedTime;
import static com.getjavajob.training.balakinao.init.algo.util.StopWatch.start;

public class AssociativeArrayPerformanceTest {

    public static void main(String[] args) {
   testAddToHashMap();
    testAddToAssociativeArray();
   testGetToHashMap();
   testGetToAssociativeArray();
    testRemoveToHashMap();
    testRemoveToAssociativeArray();
    }

    public static void testAddToHashMap() {
        int cap = 10_000_000;
        Map <Integer, String> hashMap = new HashMap <>();
        System.out.println("--------  HashMap Put " + cap + " elements --------");
        start();
        for (int i = 0; i < cap; i++) {
            hashMap.put(i, "" + i);
        }
        System.out.println("HashMap.put(key, value): " + getElapsedTime() + " ms");
    }

    public static void testAddToAssociativeArray() {
        int cap = 10_000_000;
        AssociativeArray <Integer, String> associativeArray = new AssociativeArray();
        System.out.println("--------  AssociativeArray Addition " + cap + " elements --------");
        start();
        for (int i = 0; i < cap; i++) {
            associativeArray.add(i, "" + i);
        }
        System.out.println("AssociativeArray.add(key, value): " + getElapsedTime() + " ms");
    }

    public static void testGetToHashMap() {
        int cap = 77_000_000;
        Map <Integer, Integer> hashMap = new HashMap <>();
        for (int i = 0; i < cap; i++) {
            hashMap.put(i, 2);
        }
        System.out.println("--------  HashMap Getting " + cap + " elements --------");
        start();
        for (int i = 0; i < cap; i++) {
            hashMap.get(i);
        }
        System.out.println("HashMap.get(key): " + getElapsedTime() + " ms");
    }

    public static void testGetToAssociativeArray() {
        int cap = 77_000_000;
        AssociativeArray <Integer, Integer> associativeArray = new AssociativeArray();
        for (int i = 0; i < cap; i++) {
            associativeArray.add(i, 2);
        }
        System.out.println("--------  AssociativeArray Getting " + cap + " elements --------");
        start();
        for (int i = 0; i < cap; i++) {
            associativeArray.get(i);
        }
        System.out.println("AssociativeArray.get(key): " + getElapsedTime() + " ms");
    }

    public static void testRemoveToHashMap() {
        int cap = 60_000_000;
        Map <Integer,Integer> hashMap = new HashMap <>();
        for (int i = 0; i < cap; i++) {
            hashMap.put(i,2);
        }
        System.out.println("--------  HashMap Removing " + cap + " elements --------");
        start();
        for (int i = 0; i < cap; i++) {
            hashMap.remove(i);
        }
        System.out.println("HashMap.remove(key): " + getElapsedTime() + " ms");
    }

    public static void testRemoveToAssociativeArray() {
        int cap = 60_000_000;
        AssociativeArray <Integer, Integer> associativeArray = new AssociativeArray();
        for (int i = 0; i < cap; i++) {
            associativeArray.add(i,2);
        }
        System.out.println("--------  AssociativeArray Removing " + cap + " elements --------");
        start();
        for (int i = 0; i < cap; i++) {
            associativeArray.remove(i);
        }
        System.out.println("AssociativeArray.remove(key): " + getElapsedTime() + " ms");
    }

}