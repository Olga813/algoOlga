package com.getjavajob.training.balakinao.init.algo.lesson06;

import java.util.HashSet;

import static test.Assert.assertEquals;

public class SetTest {

    public static void main(String[] args) {
        testHashSetAdd();
        testHashSetAddAll();
    }

    public static void testHashSetAdd() {
        HashSet <String> employees = new HashSet <>();
        employees.add("Olga");
        employees.add("Olga");
        employees.add("Ivan");
        employees.add("Nick");
        assertEquals("lesson06.SetTest.testHashSetAdd", "[Olga, Nick, Ivan]", employees.toString());
    }
    public static void testHashSetAddAll() {
        HashSet <String> employees = new HashSet <>();
        employees.add("Olga");
        employees.add("Olga");
        employees.add("Ivan");
        employees.add("Nick");
        HashSet <String> employeesWomens = new HashSet <>();
        employeesWomens.add("Marina");
        employeesWomens.add("Olga");
        employees.addAll(employeesWomens);
        assertEquals("lesson06.SetTest.testHashSetAddAll", "[Olga, Nick, Ivan, Marina]", employees.toString());
    }

}