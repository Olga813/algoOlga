package com.getjavajob.training.balakinao.init.algo.lesson06;

import java.util.HashMap;
import java.util.Map;

import static test.Assert.assertEquals;

public class AssociativeArrayTest {

    public static void main(String[] args) {
        testAssociativeArrayAdd();
        testAssociativeArrayAddDuplicateKeys();
        testAssociativeArrayGet();
        testAssociativeArrayRemove();
        testPolygenelubricants();
    }

    public static void testAssociativeArrayAdd() {
        Map <Integer, String> employeesExpected = new HashMap <>();
        employeesExpected.put(1, "Olga");
        employeesExpected.put(2, "Ivan");
        employeesExpected.put(3, "Nick");
        AssociativeArray <Integer, String> employeesActual = new AssociativeArray <>();
        employeesActual.add(1, "Olga");
        employeesActual.add(2, "Ivan");
        employeesActual.add(3, "Nick");
        assertEquals("lesson05.Solution06Test.testAssociativeArrayAdd", employeesExpected.toString(),
            employeesActual.toString());
    }

    public static void testAssociativeArrayAddDuplicateKeys() {
        Map <Integer, String> employeesExpected = new HashMap <>();
        employeesExpected.put(1, "Olga");
        employeesExpected.put(2, "Kiril");
        employeesExpected.put(3, "Nick");
        AssociativeArray <Integer, String> employeesActual = new AssociativeArray <>();
        employeesActual.add(1, "Olga");
        employeesActual.add(2, "Ivan");
        employeesActual.add(2, "Kiril");
        employeesActual.add(3, "Nick");
        assertEquals("lesson05.Solution06Test.testAssociativeArrayAddDuplicateKeys", employeesExpected.toString(),
            employeesActual.toString());
    }

    public static void testAssociativeArrayGet() {
        AssociativeArray <Integer, String> employeesActual = new AssociativeArray <>();
        employeesActual.add(1, "Olga");
        employeesActual.add(2, "Ivan");
        employeesActual.add(3, "Nick");
        assertEquals("lesson05.Solution06Test.testAssociativeArrayGet", "Olga",
            employeesActual.get(1));
    }

    public static void testAssociativeArrayRemove() {
        Map <Integer, String> employeesExpected = new HashMap <>();
        employeesExpected.put(2, "Ivan");
        employeesExpected.put(3, "Nick");
        AssociativeArray <Integer, String> employeesActual = new AssociativeArray <>();
        employeesActual.add(1, "Olga");
        employeesActual.add(2, "Ivan");
        employeesActual.add(3, "Nick");
        employeesActual.remove(1);
        assertEquals("lesson05.Solution06Test.testAssociativeArrayRemove", employeesExpected.toString(),
            employeesActual.toString());
    }

    /** From this we can conclude that the calculation of the index by the formula
     * key.hashCode() % arr.length is not suitable, you need to use hashCode &( length-1)
     */
    public static void testPolygenelubricants() {
        Map <String, String> employeesExpected = new HashMap <>();
        employeesExpected.put("polygenelubricants", "Olga");
        employeesExpected.put("random", "Ivan");
        AssociativeArray <String, String> employeesActual = new AssociativeArray <>();
        employeesActual.add("polygenelubricants", "Olga");
        employeesActual.add("random", "Ivan");
        assertEquals("lesson05.Solution06Test.testPolygenelubricants", employeesExpected.toString(),
            employeesActual.toString());
    }

}