package com.getjavajob.training.balakinao.init.algo.lesson09;

import com.getjavajob.training.balakinao.init.algo.lesson05.Employee;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;

import static test.Assert.assertEquals;

public class SortedMapTest {

    public static void main(String[] args) {
        testFirstKey();
        testLastKey();
        testHeadMap();
        testSubMap();
        testTailMap();
        testKeySet();
        testValues();
        testEntrySet();
    }

    public static void testEntrySet() {
        TreeMap <Integer, String> treeMap = new TreeMap <>();
        treeMap.put(1, "Olga");
        treeMap.put(2, "Ivan");
        treeMap.put(3, "Nick");
        treeMap.put(4, "Oleg");
        treeMap.put(5, "Ira");
        assertEquals("lesson09.SortedMapTest.testEntrySet", "[1=Olga, 2=Ivan, 3=Nick, 4=Oleg, 5=Ira]",
            treeMap.entrySet().toString());
    }

    public static void testValues() {
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
        Collection <Employee> employeesExpected = new LinkedHashSet <>();
        employeesExpected.add(employee1);
        employeesExpected.add(employee2);
        employeesExpected.add(employee3);
        employeesExpected.add(employee4);
        employeesExpected.add(employee5);
        assertEquals("lesson09.SortedMapTest.testValues", employeesExpected.toString(),
            treeMap.values().toString());
    }

    public static void testKeySet() {
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
        assertEquals("lesson09.SortedMapTest.testKeySet", "[1, 2, 3, 4, 5]",
            treeMap.keySet().toString());
    }

    public static void testFirstKey() {
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
        assertEquals("lesson09.SortedMapTest.testFirstKey", "1",
            treeMap.firstKey().toString());
    }

    public static void testLastKey() {
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
        assertEquals("lesson09.SortedMapTest.testLastKey", "5",
            treeMap.lastKey().toString());
    }

    public static void testHeadMap() {
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
        employeesExpected.put(1, employee1);
        assertEquals("lesson09.SortedMapTest.testHeadMap", employeesExpected.toString(),
            treeMapActual.headMap(2).toString());
    }

    public static void testSubMap() {
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
        employeesExpected.put(2, employee2);
        employeesExpected.put(3, employee3);
        assertEquals("lesson09.SortedMapTest.testSubMap", employeesExpected.toString(),
            treeMapActual.subMap(2, 4).toString());
    }

    public static void testTailMap() {
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
        employeesExpected.put(2, employee2);
        employeesExpected.put(3, employee3);
        employeesExpected.put(4, employee4);
        employeesExpected.put(5, employee5);
        assertEquals("lesson09.SortedMapTest.testTailMap", employeesExpected.toString(),
            treeMapActual.tailMap(2).toString());
    }

}