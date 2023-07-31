package com.getjavajob.training.balakinao.init.algo.lesson06;

import java.util.HashMap;
import java.util.Map;

import static test.Assert.assertEquals;

public class MapTest {

    public static void main(String[] args) {
        testHashMapSize();
        testHashMapIsEmpty();
        testHashMapContainsKey();
        testHashMapContainsValue();
        testHashMapGet();
        testHashMapPut();
        testHashMapRemoveKey();
        testHashMapRemoveKeyValue();
        testHashMapPutAll();
        testHashMapClear();
        testHashMapKeySet();
        testHashMapValues();
        testHashMapEntrySet();
        testHashMapGetOrDefault();
        testHashMapPutIfAbsent();
        testHashMapEquals();
        testHashMapForEach();
        testHashMapReplaceAll();
        testHashMapReplace();
        testHashMapReplaceNewValue();
        testHashMapHashCode();
        testHashMapCompute();
        testHashMapComputeIfAbsent();
        testHashMapComputeIfPresent();
        testHashMapMerge();
    }

    public static void testHashMapSize() {
        Map <Integer, String> employees = new HashMap <>();
        employees.put(0, "Olga");
        employees.put(1, "Olga");
        employees.put(2, "Ivan");
        employees.put(3, "Nick");
                assertEquals("lesson06.MapTest.testHashMapSize", 4, employees.size());
    }

    public static void testHashMapIsEmpty() {
        Map <Integer, String> employees = new HashMap <>();
        assertEquals("lesson06.MapTest.testHashMapIsEmpty", true, employees.isEmpty());
    }

    public static void testHashMapContainsKey() {
        Map <Integer, String> employees = new HashMap <>();
        employees.put(0, "Olga");
        employees.put(1, "Olga");
        employees.put(2, "Ivan");
        employees.put(3, "Nick");
        assertEquals("lesson06.MapTest.testHashMapContainsKey", true, employees.containsKey(2));
    }

    public static void testHashMapContainsValue() {
        Map <Integer, String> employees = new HashMap <>();
        employees.put(0, "Olga");
        employees.put(1, "Olga");
        employees.put(2, "Ivan");
        employees.put(3, "Nick");
        assertEquals("lesson06.MapTest.testHashMapContainsValue", true, employees.containsValue("Olga"));
    }

    public static void testHashMapGet() {
        Map <Integer, String> employees = new HashMap <>();
        employees.put(0, "Olga");
        employees.put(1, "Olga");
        employees.put(2, "Ivan");
        employees.put(3, "Nick");
        assertEquals("lesson06.MapTest.testHashMapGet", "Nick", employees.get(3));
    }

    public static void testHashMapPut() {
        Map <Integer, String> employeesActual = new HashMap <>();
        employeesActual.put(0, "Olga");
        employeesActual.put(1, "Olga");
        employeesActual.put(2, "Ivan");
        employeesActual.put(3, "Nick");
        assertEquals("lesson06.MapTest.testHashMapPut", "{0=Olga, 1=Olga, 2=Ivan, 3=Nick}", employeesActual.toString());
    }

    public static void testHashMapRemoveKey() {
        Map <Integer, String> employeesActual = new HashMap <>();
        employeesActual.put(0, "Olga");
        employeesActual.put(1, "Olga");
        employeesActual.put(2, "Ivan");
        employeesActual.put(3, "Nick");
        employeesActual.remove(1);
        assertEquals("lesson06.MapTest.testHashMapRemoveKey", "{0=Olga, 2=Ivan, 3=Nick}", employeesActual.toString());
    }

    public static void testHashMapPutAll() {
        Map <Integer, String> employeesActual = new HashMap <>();
        employeesActual.put(2, "Ivan");
        employeesActual.put(3, "Nick");
        Map <Integer, String> employeesWomens = new HashMap <>();
        employeesWomens.put(0, "Olga");
        employeesWomens.put(1, "Olga");
        employeesActual.putAll(employeesWomens);
        assertEquals("lesson06.MapTest.testHashMapPutAll", "{0=Olga, 1=Olga, 2=Ivan, 3=Nick}",
            employeesActual.toString());
    }

    public static void testHashMapClear() {
        Map <Integer, String> employeesActual = new HashMap <>();
        employeesActual.put(0, "Olga");
        employeesActual.put(1, "Olga");
        employeesActual.put(2, "Ivan");
        employeesActual.put(3, "Nick");
        employeesActual.clear();
        assertEquals("lesson06.MapTest.testHashMapClear", "{}", employeesActual.toString());
    }

    public static void testHashMapKeySet() {
        Map <Integer, String> employeesActual = new HashMap <>();
        employeesActual.put(0, "Olga");
        employeesActual.put(1, "Olga");
        employeesActual.put(2, "Ivan");
        assertEquals("lesson06.MapTest.testHashMapKeySet", "[0, 1, 2]", employeesActual.keySet().toString());
    }

    public static void testHashMapValues() {
        Map <Integer, String> employeesActual = new HashMap <>();
        employeesActual.put(0, "Olga");
        employeesActual.put(1, "Olga");
        employeesActual.put(2, "Ivan");
        assertEquals("lesson06.MapTest.testHashMapValues", "[Olga, Olga, Ivan]", employeesActual.values().toString());
    }

    public static void testHashMapEntrySet() {
        Map <Integer, String> employeesActual = new HashMap <>();
        employeesActual.put(0, "Olga");
        employeesActual.put(1, "Olga");
        employeesActual.put(2, "Ivan");
        employeesActual.put(3, "Nick");
        assertEquals("lesson06.MapTest.testHashMapEntrySet", "[0=Olga, 1=Olga, 2=Ivan, 3=Nick]",
            employeesActual.entrySet().toString());
    }

    public static void testHashMapGetOrDefault() {
        Map <Integer, String> employees = new HashMap <>();
        employees.put(0, "Olga");
        employees.put(1, "Olga");
        employees.put(2, "Ivan");
        employees.put(3, "Nick");
        assertEquals("lesson06.MapTest.testHashMapGetOrDefault", "Error", employees.getOrDefault(4, "Error"));
    }

    public static void testHashMapPutIfAbsent() {
        Map <Integer, String> employeesActual = new HashMap <>();
        employeesActual.put(0, "Olga");
        employeesActual.put(1, "Olga");
        employeesActual.put(2, "Ivan");
        employeesActual.put(3, "Nick");
        employeesActual.putIfAbsent(1, "Olga");
        assertEquals("lesson06.MapTest.testHashMapPutIfAbsent", "{0=Olga, 1=Olga, 2=Ivan, 3=Nick}",
            employeesActual.toString());
    }

    public static void testHashMapReplace() {
        Map <Integer, String> employeesActual = new HashMap <>();
        employeesActual.put(0, "Olga");
        employeesActual.put(1, "Olga");
        employeesActual.put(2, "Ivan");
        employeesActual.put(3, "Nick");
        employeesActual.replace(2, "Tim");
        assertEquals("lesson06.MapTest.testHashMapReplace", "{0=Olga, 1=Olga, 2=Tim, 3=Nick}",
            employeesActual.toString());
    }

    public static void testHashMapReplaceNewValue() {
        Map <Integer, String> employeesActual = new HashMap <>();
        employeesActual.put(0, "Olga");
        employeesActual.put(1, "Olga");
        employeesActual.put(2, "Ivan");
        employeesActual.put(3, "Nick");
        employeesActual.replace(2, "Ivan", "Yan");
        assertEquals("lesson06.MapTest.testHashMapReplace", "{0=Olga, 1=Olga, 2=Yan, 3=Nick}",
            employeesActual.toString());
    }

        public static void testHashMapRemoveKeyValue () {
            Map <Integer, String> employeesActual = new HashMap <>();
            employeesActual.put(0, "Olga");
            employeesActual.put(1, "Olga");
            employeesActual.put(2, "Ivan");
            employeesActual.put(3, "Nick");
            employeesActual.remove(1, "Olga");
            assertEquals("lesson06.MapTest.testHashMapRemoveKeyValue", "{0=Olga, 2=Ivan, 3=Nick}", employeesActual.toString());
        }

    public static void testHashMapEquals() {
        Map <Integer, String> employeesActual = new HashMap <>();
        employeesActual.put(1, "Olga");
        employeesActual.put(2, "Nick");
        Map <Integer, String> employeesExpected = new HashMap <>();
        employeesExpected.put(1, "Olga");
        employeesExpected.put(2, "Nick");
        assertEquals("lesson06.MapTest.testHashMapEquals", true,
            employeesActual.equals(employeesExpected));
    }

    public static void testHashMapForEach() {
        Map <Integer, String> employeesActual = new HashMap <>();
        employeesActual.put(0, "Olga");
        employeesActual.put(1, "Olga");
        employeesActual.put(2, "Ivan");
        employeesActual.put(3, "Nick");
        StringBuilder result = new StringBuilder();
        employeesActual.forEach((a,b) ->result.append(b).append(" "));
        assertEquals("lesson06.MapTest.testHashMapForEach", "Olga Olga Ivan Nick ", result.toString());
    }

    public static void testHashMapReplaceAll() {
        Map <Integer, String> employeesActual = new HashMap <>();
        employeesActual.put(0, "Olga");
        employeesActual.put(1, "Olga");
        employeesActual.put(2, "Ivan");
        employeesActual.put(3, "Nick");
        employeesActual.replaceAll((key, value) -> value.toUpperCase());
        assertEquals("lesson06.MapTest.testHashMapReplaceAll", "{0=OLGA, 1=OLGA, 2=IVAN, 3=NICK}", employeesActual.toString());
    }

    public static void testHashMapHashCode() {
        Map <Integer, String> employeesActual = new HashMap <>();
        employeesActual.put(0, "Olga");
        employeesActual.put(1, "Olga");
        employeesActual.put(2, "Ivan");
        employeesActual.put(3, "Nick");
        Map <Integer, String> employeesExpected = new HashMap <>();
        employeesExpected.put(0, "Lida");
        employeesExpected.put(1, "Olga");
        employeesExpected.put(2, "Kiril");
        employeesExpected.put(3, "Nick");
        assertEquals("lesson06.MapTest.testHashMapHashCode", employeesExpected.get(1).hashCode(),
            employeesActual.get(1).hashCode());
    }
    public static void testHashMapCompute() {
        Map <Integer, String> employeesActual = new HashMap <>();
        employeesActual.put(0, "Olga");
        employeesActual.put(1, "Olga");
        employeesActual.put(2, "Ivan");
        employeesActual.put(3, "Nick");
        employeesActual.compute(1, (a,b) -> b+" Balakina");
        assertEquals("lesson06.MapTest.testHashMapCompute", "{0=Olga, 1=Olga Balakina, 2=Ivan, 3=Nick}",
            employeesActual.toString());
    }

    public static void testHashMapComputeIfAbsent() {
        Map <Integer, String> employeesActual = new HashMap <>();
        employeesActual.put(0, "Olga");
        employeesActual.put(1, "Olga");
        employeesActual.put(2, "Ivan");
        employeesActual.put(3, "Nick");
        employeesActual.computeIfAbsent(5, b ->"Vika".toUpperCase());
        assertEquals("lesson06.MapTest.testHashMapComputeIfAbsent", "{0=Olga, 1=Olga, 2=Ivan, 3=Nick, 5=VIKA}",
            employeesActual.toString());
    }

    public static void testHashMapComputeIfPresent() {
        Map <Integer, String> employeesActual = new HashMap <>();
        employeesActual.put(0, "Olga");
        employeesActual.put(1, "Olga");
        employeesActual.put(2, "Ivan");
        employeesActual.put(3, "Nick");
        employeesActual.computeIfPresent(1,(a,b)->b.toUpperCase());
        assertEquals("lesson06.MapTest.testHashMapComputeIfPresent", "{0=Olga, 1=OLGA, 2=Ivan, 3=Nick}",
            employeesActual.toString());
    }

    public static void testHashMapMerge() {
        Map <Integer, String> employeesActual = new HashMap <>();
        employeesActual.put(0, "Olga");
        employeesActual.put(1, "Olga");
        employeesActual.put(2, "Ivan");
        employeesActual.put(3, "Nick");
        employeesActual.merge(1,"Olga",(a,b)->null);
        assertEquals("lesson06.MapTest.testHashMapMerge", "{0=Olga, 2=Ivan, 3=Nick}",
            employeesActual.toString());
    }

}