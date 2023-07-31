package com.getjavajob.training.balakinao.init.algo.lesson05;

import java.util.ArrayList;

import static com.getjavajob.training.balakinao.init.algo.lesson05.CollectionUtils.unmodifiableCollection;
import static test.Assert.assertEquals;

public class UnmodifiableCollectionTest {

    public static void main(String[] args) {
        testUnmodifiableCollectionSize();
        testUnmodifiableCollectionContains();
        testUnmodifiableCollectionIsEmpty();
        testUnmodifiableCollectionToArray();
    }

    public static void testUnmodifiableCollectionSize() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Olga", "Balakina", 34, 500));
        employees.add(new Employee(2, "Ivan", "Petrov", 40, 400));
        employees.add(new Employee(3, "Nick", "Belov", 19, 900));
        UnmodifiableCollection<Employee> unmodifiableEmployees =
            (UnmodifiableCollection<Employee>) unmodifiableCollection(employees);
        assertEquals("lesson05.UnmodifiableCollectionTest. testUnmodifiableCollectionSize", 3,
            unmodifiableEmployees.size());
    }

    public static void testUnmodifiableCollectionContains() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Olga", "Balakina", 34, 500));
        employees.add(new Employee(2, "Ivan", "Petrov", 40, 400));
        employees.add(new Employee(3, "Nick", "Belov", 19, 900));
        UnmodifiableCollection<Employee> unmodifiableEmployees =
            (UnmodifiableCollection<Employee>) unmodifiableCollection(employees);
        assertEquals("lesson05.UnmodifiableCollectionTest.testUnmodifiableCollectionContains", true,
            unmodifiableEmployees.contains(new Employee(2, "Ivan", "Petrov", 40, 400)));
    }

    public static void testUnmodifiableCollectionIsEmpty() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Olga", "Balakina", 34, 500));
        employees.add(new Employee(2, "Ivan", "Petrov", 40, 400));
        employees.add(new Employee(3, "Nick", "Belov", 19, 900));
        UnmodifiableCollection<Employee> unmodifiableEmployees =
            (UnmodifiableCollection<Employee>) unmodifiableCollection(employees);
        assertEquals("lesson05.UnmodifiableCollectionTest.testUnmodifiableCollectionIsEmpty", false,
            unmodifiableEmployees.isEmpty());
    }

    public static void testUnmodifiableCollectionToArray() {
        ArrayList<Employee> employeesActual = new ArrayList<>();
        employeesActual.add(new Employee(1, "Olga", "Balakina", 34, 500));
        employeesActual.add(new Employee(2, "Ivan", "Petrov", 40, 400));
        employeesActual.add(new Employee(3, "Nick", "Belov", 19, 900));
        Employee[] arrayEmployeesExpected = new Employee[]{new Employee(1, "Olga", "Balakina", 34, 500),
            new Employee(2, "Ivan", "Petrov", 40, 400), new Employee(3, "Nick", "Belov", 19, 900)};
        UnmodifiableCollection<Employee> unmodifiableEmployeesActual =
            (UnmodifiableCollection<Employee>) unmodifiableCollection(employeesActual);
        assertEquals("lesson05.UnmodifiableCollectionTest.testUnmodifiableCollectionIsEmpty", arrayEmployeesExpected,
            unmodifiableEmployeesActual.toArray());
    }

}