package com.getjavajob.training.balakinao.init.algo.lesson08;

import com.getjavajob.training.balakinao.init.algo.lesson05.Employee;
import com.getjavajob.training.balakinao.init.algo.lesson07.Node;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import static test.Assert.assertEquals;

public class BinarySearchTreeTest {

    public static void main(String[] args) {
        testCompare();
        testToString();
        testAdd();
        testTreeSearch();
    }

    public static void testCompare() {
        BinarySearchTree <Employee> binarySearchTree = new BinarySearchTree <>(new Comparator <Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        Employee employee1 = new Employee(1, "Olga", "Balakina", 34, 500);
        Employee employee2 = new Employee(2, "Ivan", "Petrov", 40, 400);
        Employee employee3 = new Employee(3, "Nick", "Belov", 19, 900);
        Employee employee4 = new Employee(4, "Oleg", "Ivanov", 44, 500);
        Employee employee5 = new Employee(5, "Ira", "Bax", 14, 300);
        binarySearchTree.add(employee1);
        binarySearchTree.add(employee2);
        binarySearchTree.add(employee3);
        binarySearchTree.add(employee4);
        binarySearchTree.add(employee5);
        Collection <Employee> collEmployeeActual = new ArrayList <>();
        collEmployeeActual.add(employee5);
        collEmployeeActual.add(employee3);
        collEmployeeActual.add(employee1);
        collEmployeeActual.add(employee2);
        collEmployeeActual.add(employee4);
        assertEquals("lesson08.BinarySearchTreeTest.testCompare", collEmployeeActual.toString(),
            binarySearchTree.inOrder().toString());
    }

    public static void testAdd() {
        BinarySearchTree <Integer> binarySearchTree = new BinarySearchTree <>();
        binarySearchTree.add(40);
        binarySearchTree.add(30);
        binarySearchTree.add(50);
        binarySearchTree.add(25);
        binarySearchTree.add(35);
        binarySearchTree.add(45);
        binarySearchTree.add(60);
        assertEquals("lesson08.BinarySearchTreeTest.testAdd", "(40(30(25,35),50(45,60)))",
            binarySearchTree.toString());
    }

    public static void testToString() {
        BinarySearchTree <Integer> binarySearchTree = new BinarySearchTree <>();
        binarySearchTree.add(40);
        binarySearchTree.add(30);
        binarySearchTree.add(50);
        binarySearchTree.add(25);
        binarySearchTree.add(35);
        binarySearchTree.add(45);
        binarySearchTree.add(60);
        assertEquals("lesson08.BinarySearchTreeTest.testToString", "(40(30(25,35),50(45,60)))",
            binarySearchTree.toString());
    }

    public static void testTreeSearch() {
        BinarySearchTree <Integer> binarySearchTree = new BinarySearchTree <>();
        binarySearchTree.add(40);
        binarySearchTree.add(30);
        binarySearchTree.add(50);
        Node <Integer> n25 = binarySearchTree.add(25);
        binarySearchTree.add(35);
        binarySearchTree.add(45);
        binarySearchTree.add(60);
        assertEquals("lesson08.BinarySearchTreeTest.testTreeSearch", n25,
            binarySearchTree.treeSearch(n25, 25));
    }

}