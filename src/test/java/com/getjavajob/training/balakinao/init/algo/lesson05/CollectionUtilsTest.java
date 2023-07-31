package com.getjavajob.training.balakinao.init.algo.lesson05;

import java.util.ArrayList;
import java.util.Collection;

import static com.getjavajob.training.balakinao.init.algo.lesson05.CollectionUtils.filter;
import static com.getjavajob.training.balakinao.init.algo.lesson05.CollectionUtils.forAllDo;
import static com.getjavajob.training.balakinao.init.algo.lesson05.CollectionUtils.transformCurCol;
import static com.getjavajob.training.balakinao.init.algo.lesson05.CollectionUtils.transformNewCol;
import static test.Assert.assertEquals;

public class CollectionUtilsTest {

    public static void main(String[] args) {
        testCollectionUtilsFilter();
        testTransformNewCol();
        testTransformCurCol();
        testForAllDo();
    }

    public static void testCollectionUtilsFilter() {
        Collection<Employee> collEmployeeActual = new ArrayList<>();
        collEmployeeActual.add(new Employee(1, "Olga", "Balakina", 34, 500));
        collEmployeeActual.add(new Employee(2, "Ivan", "Petrov", 40, 400));
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Olga", "Balakina", 34, 500));
        employees.add(new Employee(2, "Ivan", "Petrov", 40, 400));
        employees.add(new Employee(3, "Nick", "Belov", 19, 900));
        Collection<Employee> collEmployeeExpected = filter(employees,
            new Predicate<>() {
                public boolean apply(Employee employee) {
                    return employee.getAge() > 30;
                }
            });
        assertEquals("lesson05.CollectionUtilsTest.testCollectionUtilsFilter", collEmployeeActual,
            collEmployeeExpected);
    }

    public static void testTransformNewCol() {
        Collection<String> collEmployeeActual = new ArrayList<>();
        collEmployeeActual.add("Balakina");
        collEmployeeActual.add("Petrov");
        collEmployeeActual.add("Belov");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Olga", "Balakina", 34, 500));
        employees.add(new Employee(2, "Ivan", "Petrov", 40, 400));
        employees.add(new Employee(3, "Nick", "Belov", 19, 900));
        Collection<String> collEmployeeExpected = transformNewCol(employees, new Transformer<Employee,
            String>() {
            public String transform(Employee employee) {
                String obj = employee.surname;
                return obj;
            }
        });
        assertEquals("lesson05.CollectionUtilsTest.testTransformNewCol", collEmployeeActual, collEmployeeExpected);
    }

    public static void testTransformCurCol() {
        Collection<Employee> collEmployeeActual = new ArrayList<>();
        collEmployeeActual.add(new Employee(0, null, "Balakina", 0, 0));
        collEmployeeActual.add(new Employee(0, null, "Petrov", 0, 0));
        collEmployeeActual.add(new Employee(0, null, "Belov", 0, 0));
        ArrayList<Employee> collEmployeeExpected = new ArrayList<>();
        collEmployeeExpected.add(new Employee(1, "Olga", "Balakina", 34, 500));
        collEmployeeExpected.add(new Employee(2, "Ivan", "Petrov", 40, 400));
        collEmployeeExpected.add(new Employee(3, "Nick", "Belov", 19, 900));
        transformCurCol(collEmployeeExpected, new Transformer<Employee, String>() {
            @Override
            public String transform(Employee employee) {
                employee.setId(0);
                employee.setAge(0);
                employee.setName(null);
                employee.setSalary(0);
                return employee.getSurname();
            }
        });
        assertEquals("lesson05.CollectionUtilsTest.testTransformCurCol", collEmployeeActual, collEmployeeExpected);
    }

    public static void testForAllDo() {
        Collection<Employee> collEmployeeActual = new ArrayList<>();
        collEmployeeActual.add(new Employee(1, "Olga", "Balakina", 34, 700));
        collEmployeeActual.add(new Employee(2, "Ivan", "Petrov", 40, 600));
        collEmployeeActual.add(new Employee(3, "Nick", "Belov", 19, 1100));
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Olga", "Balakina", 34, 500));
        employees.add(new Employee(2, "Ivan", "Petrov", 40, 400));
        employees.add(new Employee(3, "Nick", "Belov", 19, 900));
        Collection<Employee> collEmployeeExpected = forAllDo(employees,
            new Closures<Employee>() {
                @Override
                public Employee execute(Employee employee) {
                    employee.setSalary(employee.getSalary() + 200);
                    return employee;
                }
            });
        assertEquals("lesson05.CollectionUtilsTest.testForAllDo", collEmployeeActual, collEmployeeExpected);
    }

}