package com.getjavajob.training.balakinao.init.algo.lesson06;

import java.util.LinkedHashSet;

import static test.Assert.assertEquals;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        testLinkedHashSetAdd();
    }

    public static void testLinkedHashSetAdd() {
        LinkedHashSet <String> employees = new LinkedHashSet <>();
        employees.add("Olga");
        employees.add("Olga");
        employees.add("Ivan");
        employees.add("Nick");
        assertEquals("lesson06.LinkedHashSetTest.testLinkedHashSetAdd", "[Olga, Ivan, Nick]", employees.toString());
    }

}