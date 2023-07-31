package com.getjavajob.training.balakinao.init.algo.lesson05;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import static com.getjavajob.training.balakinao.init.algo.lesson05.CollectionUtils.filter;
import static com.getjavajob.training.balakinao.init.algo.lesson05.CollectionUtils.forAllDo;
import static com.getjavajob.training.balakinao.init.algo.lesson05.CollectionUtils.transformNewCol;
import static com.getjavajob.training.balakinao.init.algo.lesson05.CollectionUtils.unmodifiableCollection;

public class Solution05 {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Let's add 10 elements to Queue: ");
        Queue<Integer> linkedListQueue = new LinkedListQueue<>();
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
            linkedListQueue.add(i);
        }
        System.out.println("Delete the oll elements in Queue: ");
        while (!linkedListQueue.isEmpty()) {
            System.out.println(linkedListQueue.remove());
        }

        System.out.println("Let's add 10 elements to Stack: ");
        Stack<Integer> linkedListStack = new Stack<>();
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
            linkedListStack.push(i);
        }
        System.out.println("Delete the oll elements in Stack: ");
        while (!linkedListStack.isEmpty()) {
            System.out.println(linkedListStack.pop());
        }
        Employee employee1 = new Employee(1, "Olga", "Balakina", 34, 500);
        Employee employee2 = new Employee(2, "Ivan", "Petrov", 40, 400);
        Employee employee3 = new Employee(3, "Nick", "Belov", 19, 900);
        List<Employee> employees = Arrays.asList(employee1, employee2, employee3);
        List<Employee> employeesAfterFilter = (List<Employee>) filter(employees, new Predicate<>() {
            public boolean apply(Employee employee) {
                return employee.getAge() > 30;
            }
        });
        for (Employee element : employeesAfterFilter) {
            System.out.println("Employee: id = " + element.getId() + ", name = " + element.getName() + ", surname = " + element.getSurname() + ", age = " +  element.getAge() + ", salary = " + element.getSalary());
        }
        List<String> employeesAfterTransform = (List<String>) transformNewCol(employees, new Transformer<Employee,
            String>() {
            public String transform(Employee employee) {
                String obj = employee.surname;
                return obj;
            }
        });
        for (Object element : employeesAfterTransform) {
            System.out.println("Last name employee= " + element);
        }
     List<Employee> employeesAfterIncreaseSalary = (List<Employee>) forAllDo(employees,
            new Closures<Employee>() {
                @Override
                public Employee execute(Employee employee) {
                    employee.setSalary(employee.getSalary() + 200);
                    return employee;
                }
            });
        for (Employee element : employeesAfterIncreaseSalary) {
            System.out.println("Employee: id = " + element.getId() + ", name = " + element.getName() + ", surname = " + element.getSurname() + ", age = " +  element.getAge() + ", salary = " + element.getSalary());
        }

        CollectionUtils.transformCurCol(employees, new Transformer<Employee, String>() {
            @Override
            public String transform(Employee employee) {
                employee.setId(0);
                employee.setAge(0);
                employee.setName(null);
                employee.setSalary(0);
                return employee.getSurname();
            }
        });
        for (Employee element : employees) {
            System.out.println("Employee: id = " + element.getId() + ", name = " + element.getName() + ", surname = " + element.getSurname() + ", age = " +  element.getAge() + ", salary = " + element.getSalary());
        }

        UnmodifiableCollection<Employee> unmodifiableEmployees =
            (UnmodifiableCollection<Employee>) unmodifiableCollection(employees);
        System.out.println("Employees size = " + unmodifiableEmployees.size());
    }

}