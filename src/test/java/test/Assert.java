package test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Assert {

    public static void assertEquals(String testName, boolean expected, boolean actual) {
        if (expected == actual) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed: expected " + expected + ", actual " + actual);
        }
    }

    public static void assertEquals(String testName, int expected, int actual) {
        if (expected == actual) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed: expected " + expected + ", actual " + actual);
        }
    }

    public static void assertEquals(String testName, double expected, double actual) {
        if (expected == actual) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed: expected " + expected + ", actual " + actual);
        }
    }

    public static void assertEquals(String testName, String expected, String actual) {
        if (expected.equals(actual)) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed: expected " + expected + ", actual " + actual);
        }
    }

    public static void assertEquals(String testName, String[] expected, String[] actual) {
        if (Arrays.equals(expected, actual)) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed: expected " + expected + ", actual " + actual);
        }
    }

    public static void assertEquals(String testName, int[] expected, int[] actual) {
        if (Arrays.equals(expected, actual)) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed: expected " + expected + ", actual " + actual);
        }
    }

    public static void assertEquals(String testName, int[][] expected, int[][] actual) {
        if (Arrays.deepEquals(expected, actual)) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed: expected " + expected + ", actual " + actual);
        }
    }

    public static void assertEquals(String testName, double[] expected, double[] actual) {
        if (Arrays.equals(expected, actual)) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed: expected " + expected + ", actual " + actual);
        }
    }

    public static void assertEquals(String testName, List<?> expected, List<?> actual) {
        if (Objects.equals(expected, actual)) {
            System.out.println(testName + " passed");

        } else {
            System.out.println(testName + " failed: expected " + expected + ", actual " + actual);
        }
    }

    public static void assertEquals(String testName, Object[] expected, Object[] actual) {
        if (Arrays.equals(expected, actual)) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed: expected " + expected + ", actual " + actual);
        }
    }

    public static void assertEquals(String testName, Object expected, Object actual) {
        if (Objects.equals(expected, actual)) {
            System.out.println(testName + " passed");
        } else {
            System.out.println(testName + " failed: expected " + expected + ", actual " + actual);
        }
    }

    public static void fail(String whereError) throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException(whereError);
    }

}