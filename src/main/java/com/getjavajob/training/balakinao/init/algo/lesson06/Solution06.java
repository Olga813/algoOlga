package com.getjavajob.training.balakinao.init.algo.lesson06;

import com.getjavajob.training.balakinao.init.algo.lesson05.Employee;

import java.security.Key;

public class Solution06 {

    public static void main(String[] args) {
        AssociativeArray <Integer, Employee> employees = new AssociativeArray <>();
        Employee employee1 = new Employee(1, "Olga", "Balakina", 34, 500);
        Employee employee2 = new Employee(2, "Ivan", "Petrov", 40, 400);
        Employee employee3 = new Employee(3, "Nick", "Belov", 19, 900);
        employees.add(employee1.getId(), employee1);
        employees.add(employee2.getId(), employee2);
        employees.add(employee3.getId(), employee3);
        System.out.println(employees);
        System.out.println("Get the third element "+ employees.get(3).toString());
        employees.remove(2);
        System.out.println("Remove one element "+ employees);
        System.out.println("Size associativeArray "+ employees.size());
        int employee1HashCode= employees.hash(employee1.hashCode());
        System.out.println("HashCode employee1 "+employee1HashCode);
        System.out.println("Index for employee1 "+employees.indexFor(employee1HashCode,employees.size()));
        HashMapMatrix <Key, Integer> matrixNumbers = new HashMapMatrix <>();
        matrixNumbers.set(1,7, 8);
        matrixNumbers.set(20,70, 80);
        matrixNumbers.set(7,5, 70);
        System.out.println("Value: "+matrixNumbers.get(4,7));
        System.out.println(matrixNumbers);
    }

}