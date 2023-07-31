package com.getjavajob.training.balakinao.init.algo.lesson09;

import com.getjavajob.training.balakinao.init.algo.lesson05.Employee;

import java.util.Comparator;
import java.util.TreeSet;

import static test.Assert.assertEquals;

public class NavigableSetTest {

    public static void main(String[] args) {
        testTailSet();
        testDescendingSet();
        testSubSet();
        testCeiling();
        testLower();
        testFloor();
        testHigher();
        testPollFirst();
        testPollLast();
        testHeadSet();
        testTailSet2();
    }
    public static void testTailSet2() {
        TreeSet <Employee> treeSet = new TreeSet <>(new Comparator <Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getId()-o2.getId();
            }
        });
        Employee employee1 = new Employee(101, "Olga", "Balakina", 34, 500);
        Employee employee2 = new Employee(202, "Ivan", "Petrov", 40, 400);
        Employee employee3 = new Employee(303, "Nick", "Belov", 19, 900);
        Employee employee4 = new Employee(404, "Oleg", "Ivanov", 44, 500);
        Employee employee5 = new Employee(505, "Ira", "Bax", 14, 300);
        treeSet.add(employee1);
        treeSet.add(employee2);
        treeSet.add(employee3);
        treeSet.add(employee4);
        treeSet.add(employee5);
        TreeSet <Employee> treeSetExpected = new TreeSet <>(new Comparator <Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getId()-o2.getId();
            }
        });
        treeSetExpected.add(employee4);
        treeSetExpected.add(employee5);
        assertEquals("lesson09.NavigableSetTest.testTailSet", treeSetExpected.toString(),
            treeSet.tailSet(employee4).toString());
    }
    public static void testTailSet() {
        TreeSet <Integer> treeSet = new TreeSet <>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        assertEquals("lesson09.NavigableSetTest.testTailSet", "[30, 40, 50]",
            treeSet.tailSet(23).toString());
    }

    public static void testDescendingSet() {
        TreeSet <Integer> treeSet = new TreeSet <>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        assertEquals("lesson09.NavigableSetTest.testDescendingSet", "[50, 40, 30, 20, 10]",
            treeSet.descendingSet().toString());
    }

    public static void testSubSet() {
        TreeSet <Integer> treeSet = new TreeSet <>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        assertEquals("lesson09.NavigableSetTest.testSubSet", "[20]",
            treeSet.subSet(17, 22).toString());
    }

    public static void testHeadSet() {
        TreeSet <Integer> treeSet = new TreeSet <>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        assertEquals("lesson09.NavigableSetTest.testHeadSet", "[10]",
            treeSet.headSet(17, true).toString());
    }


    public static void testCeiling() {
        TreeSet <Integer> treeSet = new TreeSet <>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        assertEquals("lesson09.NavigableSetTest.testCeiling", "20",
            treeSet.ceiling(20).toString());
    }

    public static void testLower() {
        TreeSet <Integer> treeSet = new TreeSet <>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        assertEquals("lesson09.NavigableSetTest.testLower", "10",
            treeSet.lower(20).toString());
    }

    public static void testFloor() {
        TreeSet <Integer> treeSet = new TreeSet <>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        assertEquals("lesson09.NavigableSetTest.testFloor", "20",
            treeSet.floor(20).toString());
    }

    public static void testHigher() {
        TreeSet <Integer> treeSet = new TreeSet <>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        assertEquals("lesson09.NavigableSetTest.testHigher", "20",
            treeSet.higher(17).toString());
    }

    public static void testPollFirst() {
        TreeSet <Integer> treeSet = new TreeSet <>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        TreeSet <Integer> treeSetExpected = new TreeSet <>();
        treeSetExpected.add(20);
        treeSetExpected.add(30);
        treeSetExpected.add(40);
        treeSetExpected.add(50);
        assertEquals("lesson09.NavigableSetTest.testPollFirstEntry", "10",
            treeSet.pollFirst().toString());
        assertEquals("lesson09.NavigableSetTest.testPollFirstEntry", treeSetExpected.toString(),
            treeSet.toString());
    }

    public static void testPollLast() {
        TreeSet <Integer> treeSet = new TreeSet <>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);
        TreeSet <Integer> treeSetExpected = new TreeSet <>();
        treeSetExpected.add(10);
        treeSetExpected.add(20);
        treeSetExpected.add(30);
        treeSetExpected.add(40);
        assertEquals("lesson09.NavigableSetTest.testPollLast", "50",
            treeSet.pollLast().toString());
        assertEquals("lesson09.NavigableSetTest.testPollLast", treeSetExpected.toString(),
            treeSet.toString());
    }
}

