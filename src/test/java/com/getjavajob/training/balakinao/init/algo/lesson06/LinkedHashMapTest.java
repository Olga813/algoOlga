package com.getjavajob.training.balakinao.init.algo.lesson06;

import java.util.LinkedHashMap;
import java.util.Map;

import static test.Assert.assertEquals;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        testLinkedHashMapPut();
    }

    public static void testLinkedHashMapPut() {
        Map <Integer,String> employees = new LinkedHashMap <>();
        employees.put(10,"Olga");
        employees.put(10,"Olga");
        employees.put(5,"Ivan");
        employees.put(7,"Nick");
        assertEquals("lesson06.LinkedHashMapTest.testLinkedHashMapPut", "{10=Olga, 5=Ivan, 7=Nick}", employees.toString());
    }

}