package com.getjavajob.training.balakinao.init.algo.lesson09;

import com.getjavajob.training.balakinao.init.algo.lesson05.Employee;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;

import static test.Assert.assertEquals;

public class NavigableMapTest {

    public static void main(String[] args) {
        testLowerEntry();
        testLowerKey();
        testFloorEntry();
        testFloorKey();
        testCeilingKey();
        testCeilingEntry();
        testHigherEntry();
        testHigherKey();
        testFirstEntry();
        testLastEntry();
        testPollFirstEntry();
        testPollLastEntry();
        testDescendingMap();
        testNavigableKeySet();
        testDescendingKeySet();
    }

    public static void testDescendingKeySet() {
        TreeMap <Integer, Employee> treeMapActual = new TreeMap <>();
        Employee employee1 = new Employee(101, "Olga", "Balakina", 34, 500);
        Employee employee2 = new Employee(202, "Ivan", "Petrov", 40, 400);
        Employee employee3 = new Employee(303, "Nick", "Belov", 19, 900);
        Employee employee4 = new Employee(404, "Oleg", "Ivanov", 44, 500);
        Employee employee5 = new Employee(505, "Ira", "Bax", 14, 300);
        treeMapActual.put(1, employee1);
        treeMapActual.put(2, employee2);
        treeMapActual.put(3, employee3);
        treeMapActual.put(4, employee4);
        treeMapActual.put(5, employee5);
        Collection <Integer> keyExpected = new LinkedHashSet <>();
        keyExpected.add(5);
        keyExpected.add(4);
        keyExpected.add(3);
        keyExpected.add(2);
        keyExpected.add(1);
        assertEquals("lesson09.NavigableMapTest.testDescendingKeySet", keyExpected.toString(),
            treeMapActual.descendingKeySet().toString());
    }

    public static void testNavigableKeySet() {
        TreeMap <Integer, Employee> treeMapActual = new TreeMap <>();
        Employee employee1 = new Employee(101, "Olga", "Balakina", 34, 500);
        Employee employee2 = new Employee(202, "Ivan", "Petrov", 40, 400);
        Employee employee3 = new Employee(303, "Nick", "Belov", 19, 900);
        Employee employee4 = new Employee(404, "Oleg", "Ivanov", 44, 500);
        Employee employee5 = new Employee(505, "Ira", "Bax", 14, 300);
        treeMapActual.put(1, employee1);
        treeMapActual.put(2, employee2);
        treeMapActual.put(3, employee3);
        treeMapActual.put(4, employee4);
        treeMapActual.put(5, employee5);
        Collection <Integer> keyExpected = new LinkedHashSet <>();
        keyExpected.add(1);
        keyExpected.add(2);
        keyExpected.add(3);
        keyExpected.add(4);
        keyExpected.add(5);
        assertEquals("lesson09.NavigableMapTest.testNavigableKeySet", keyExpected.toString(),
            treeMapActual.navigableKeySet().toString());
    }

    public static void testDescendingMap() {
        TreeMap <Integer, Employee> treeMapActual = new TreeMap <>();
        Employee employee1 = new Employee(101, "Olga", "Balakina", 34, 500);
        Employee employee2 = new Employee(202, "Ivan", "Petrov", 40, 400);
        Employee employee3 = new Employee(303, "Nick", "Belov", 19, 900);
        Employee employee4 = new Employee(404, "Oleg", "Ivanov", 44, 500);
        Employee employee5 = new Employee(505, "Ira", "Bax", 14, 300);
        treeMapActual.put(1, employee1);
        treeMapActual.put(2, employee2);
        treeMapActual.put(3, employee3);
        treeMapActual.put(4, employee4);
        treeMapActual.put(5, employee5);
        Map <Integer, Employee> employeesExpected = new LinkedHashMap <>();
        employeesExpected.put(5, employee5);
        employeesExpected.put(4, employee4);
        employeesExpected.put(3, employee3);
        employeesExpected.put(2, employee2);
        employeesExpected.put(1, employee1);
        assertEquals("lesson09.NavigableMapTest.testDescendingMap", employeesExpected.toString(),
            treeMapActual.descendingMap().toString());
    }

    public static void testPollLastEntry() {
        TreeMap <Integer, Employee> treeMapActual = new TreeMap <>();
        Employee employee1 = new Employee(101, "Olga", "Balakina", 34, 500);
        Employee employee2 = new Employee(202, "Ivan", "Petrov", 40, 400);
        Employee employee3 = new Employee(303, "Nick", "Belov", 19, 900);
        Employee employee4 = new Employee(404, "Oleg", "Ivanov", 44, 500);
        Employee employee5 = new Employee(505, "Ira", "Bax", 14, 300);
        treeMapActual.put(1, employee1);
        treeMapActual.put(2, employee2);
        treeMapActual.put(3, employee3);
        treeMapActual.put(4, employee4);
        treeMapActual.put(5, employee5);
        TreeMap <Integer, Employee> treeMapExpected = new TreeMap <>();
        treeMapExpected.put(1, employee1);
        treeMapExpected.put(2, employee2);
        treeMapExpected.put(3, employee3);
        treeMapExpected.put(4, employee4);
        assertEquals("lesson09.NavigableMapTest.testPollLastEntry", "5=" + employee5,
            treeMapActual.pollLastEntry().toString());
        assertEquals("lesson09.NavigableMapTest.testPollLastEntry", treeMapExpected.toString(),
            treeMapActual.toString());
    }

    public static void testPollFirstEntry() {
        TreeMap <Integer, Employee> treeMapActual = new TreeMap <>();
        Employee employee1 = new Employee(101, "Olga", "Balakina", 34, 500);
        Employee employee2 = new Employee(202, "Ivan", "Petrov", 40, 400);
        Employee employee3 = new Employee(303, "Nick", "Belov", 19, 900);
        Employee employee4 = new Employee(404, "Oleg", "Ivanov", 44, 500);
        Employee employee5 = new Employee(505, "Ira", "Bax", 14, 300);
        treeMapActual.put(1, employee1);
        treeMapActual.put(2, employee2);
        treeMapActual.put(3, employee3);
        treeMapActual.put(4, employee4);
        treeMapActual.put(5, employee5);
        TreeMap <Integer, Employee> treeMapExpected = new TreeMap <>();
        treeMapExpected.put(2, employee2);
        treeMapExpected.put(3, employee3);
        treeMapExpected.put(4, employee4);
        treeMapExpected.put(5, employee5);
        assertEquals("lesson09.NavigableMapTest.testPollFirstEntry", "1=" + employee1,
            treeMapActual.pollFirstEntry().toString());
        assertEquals("lesson09.NavigableMapTest.testPollFirstEntry", treeMapExpected.toString(),
            treeMapActual.toString());
    }

    public static void testFirstEntry() {
        TreeMap <Integer, Employee> treeMap = new TreeMap <>();
        Employee employee1 = new Employee(101, "Olga", "Balakina", 34, 500);
        Employee employee2 = new Employee(202, "Ivan", "Petrov", 40, 400);
        Employee employee3 = new Employee(303, "Nick", "Belov", 19, 900);
        Employee employee4 = new Employee(404, "Oleg", "Ivanov", 44, 500);
        Employee employee5 = new Employee(505, "Ira", "Bax", 14, 300);
        treeMap.put(1, employee1);
        treeMap.put(2, employee2);
        treeMap.put(3, employee3);
        treeMap.put(4, employee4);
        treeMap.put(5, employee5);
        assertEquals("lesson09.NavigableMapTest.testFirstEntry", "1=" + employee1,
            treeMap.firstEntry().toString());
    }

    public static void testLastEntry() {
        TreeMap <Integer, Employee> treeMap = new TreeMap <>();
        Employee employee1 = new Employee(101, "Olga", "Balakina", 34, 500);
        Employee employee2 = new Employee(202, "Ivan", "Petrov", 40, 400);
        Employee employee3 = new Employee(303, "Nick", "Belov", 19, 900);
        Employee employee4 = new Employee(404, "Oleg", "Ivanov", 44, 500);
        Employee employee5 = new Employee(505, "Ira", "Bax", 14, 300);
        treeMap.put(1, employee1);
        treeMap.put(2, employee2);
        treeMap.put(3, employee3);
        treeMap.put(4, employee4);
        treeMap.put(5, employee5);
        assertEquals("lesson09.NavigableMapTest.testLastEntry", "5=" + employee5,
            treeMap.lastEntry().toString());
    }

    public static void testHigherEntry() {
        TreeMap <Integer, Employee> treeMap = new TreeMap <>();
        Employee employee1 = new Employee(101, "Olga", "Balakina", 34, 500);
        Employee employee2 = new Employee(202, "Ivan", "Petrov", 40, 400);
        Employee employee3 = new Employee(303, "Nick", "Belov", 19, 900);
        Employee employee4 = new Employee(404, "Oleg", "Ivanov", 44, 500);
        Employee employee5 = new Employee(505, "Ira", "Bax", 14, 300);
        treeMap.put(1, employee1);
        treeMap.put(2, employee2);
        treeMap.put(3, employee3);
        treeMap.put(4, employee4);
        treeMap.put(5, employee5);
        assertEquals("lesson09.NavigableMapTest.testHigherEntry", "4=" + employee4,
            treeMap.higherEntry(3).toString());
    }

    public static void testHigherKey() {
        TreeMap <Integer, Employee> treeMap = new TreeMap <>();
        Employee employee1 = new Employee(101, "Olga", "Balakina", 34, 500);
        Employee employee2 = new Employee(202, "Ivan", "Petrov", 40, 400);
        Employee employee3 = new Employee(303, "Nick", "Belov", 19, 900);
        Employee employee4 = new Employee(404, "Oleg", "Ivanov", 44, 500);
        Employee employee5 = new Employee(505, "Ira", "Bax", 14, 300);
        treeMap.put(1, employee1);
        treeMap.put(2, employee2);
        treeMap.put(3, employee3);
        treeMap.put(4, employee4);
        treeMap.put(5, employee5);
        assertEquals("lesson09.NavigableMapTest.testHigherKey", "4",
            treeMap.higherKey(3).toString());
    }

    public static void testCeilingEntry() {
        TreeMap <Integer, Employee> treeMap = new TreeMap <>();
        Employee employee1 = new Employee(101, "Olga", "Balakina", 34, 500);
        Employee employee2 = new Employee(202, "Ivan", "Petrov", 40, 400);
        Employee employee3 = new Employee(303, "Nick", "Belov", 19, 900);
        Employee employee4 = new Employee(404, "Oleg", "Ivanov", 44, 500);
        Employee employee5 = new Employee(505, "Ira", "Bax", 14, 300);
        treeMap.put(1, employee1);
        treeMap.put(2, employee2);
        treeMap.put(3, employee3);
        treeMap.put(4, employee4);
        treeMap.put(5, employee5);
        assertEquals("lesson09.NavigableMapTest.testCeilingEntry", "3=" + employee3,
            treeMap.ceilingEntry(3).toString());
    }

    public static void testCeilingKey() {
        TreeMap <Integer, Employee> treeMap = new TreeMap <>();
        Employee employee1 = new Employee(101, "Olga", "Balakina", 34, 500);
        Employee employee2 = new Employee(202, "Ivan", "Petrov", 40, 400);
        Employee employee3 = new Employee(303, "Nick", "Belov", 19, 900);
        Employee employee4 = new Employee(404, "Oleg", "Ivanov", 44, 500);
        Employee employee5 = new Employee(505, "Ira", "Bax", 14, 300);
        treeMap.put(1, employee1);
        treeMap.put(2, employee2);
        treeMap.put(3, employee3);
        treeMap.put(4, employee4);
        treeMap.put(5, employee5);
        assertEquals("lesson09.NavigableMapTest.testCeilingKey", "3",
            treeMap.ceilingKey(5).toString());
    }

    public static void testFloorKey() {
        TreeMap <Integer, Employee> treeMap = new TreeMap <>();
        Employee employee1 = new Employee(101, "Olga", "Balakina", 34, 500);
        Employee employee2 = new Employee(202, "Ivan", "Petrov", 40, 400);
        Employee employee3 = new Employee(303, "Nick", "Belov", 19, 900);
        Employee employee4 = new Employee(404, "Oleg", "Ivanov", 44, 500);
        Employee employee5 = new Employee(505, "Ira", "Bax", 14, 300);
        treeMap.put(1, employee1);
        treeMap.put(2, employee2);
        treeMap.put(3, employee3);
        treeMap.put(4, employee4);
        treeMap.put(5, employee5);
        assertEquals("lesson09.NavigableMapTest.testFloorKey", "3",
            treeMap.floorKey(3).toString());
    }

    public static void testFloorEntry() {
        TreeMap <Integer, Employee> treeMap = new TreeMap <>();
        Employee employee1 = new Employee(101, "Olga", "Balakina", 34, 500);
        Employee employee2 = new Employee(202, "Ivan", "Petrov", 40, 400);
        Employee employee3 = new Employee(303, "Nick", "Belov", 19, 900);
        Employee employee4 = new Employee(404, "Oleg", "Ivanov", 44, 500);
        Employee employee5 = new Employee(505, "Ira", "Bax", 14, 300);
        treeMap.put(1, employee1);
        treeMap.put(2, employee2);
        treeMap.put(3, employee3);
        treeMap.put(4, employee4);
        treeMap.put(5, employee5);
        assertEquals("lesson09.NavigableMapTest.testFloorEntry", "3=" + employee3,
            treeMap.floorEntry(3).toString());
    }

    public static void testLowerEntry() {
        TreeMap <Integer, Employee> treeMap = new TreeMap <>();
        Employee employee1 = new Employee(101, "Olga", "Balakina", 34, 500);
        Employee employee2 = new Employee(202, "Ivan", "Petrov", 40, 400);
        Employee employee3 = new Employee(303, "Nick", "Belov", 19, 900);
        Employee employee4 = new Employee(404, "Oleg", "Ivanov", 44, 500);
        Employee employee5 = new Employee(505, "Ira", "Bax", 14, 300);
        treeMap.put(1, employee1);
        treeMap.put(2, employee2);
        treeMap.put(3, employee3);
        treeMap.put(4, employee4);
        treeMap.put(5, employee5);
        assertEquals("lesson09.NavigableMapTest.testLowerEntry", "2=" + employee2,
            treeMap.lowerEntry(3).toString());
    }

    public static void testLowerKey() {
        TreeMap <Integer, Employee> treeMap = new TreeMap <>();
        Employee employee1 = new Employee(101, "Olga", "Balakina", 34, 500);
        Employee employee2 = new Employee(202, "Ivan", "Petrov", 40, 400);
        Employee employee3 = new Employee(303, "Nick", "Belov", 19, 900);
        Employee employee4 = new Employee(404, "Oleg", "Ivanov", 44, 500);
        Employee employee5 = new Employee(505, "Ira", "Bax", 14, 300);
        treeMap.put(1, employee1);
        treeMap.put(2, employee2);
        treeMap.put(3, employee3);
        treeMap.put(4, employee4);
        treeMap.put(5, employee5);
        assertEquals("lesson09.NavigableMapTest.testLowerKey", "2",
            treeMap.lowerKey(3).toString());
    }

}