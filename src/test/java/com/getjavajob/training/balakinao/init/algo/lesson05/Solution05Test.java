package com.getjavajob.training.balakinao.init.algo.lesson05;

import com.getjavajob.training.balakinao.init.algo.lesson04.DoublyLinkedList;

import java.util.List;
import java.util.Queue;

import static test.Assert.assertEquals;

public class Solution05Test {

    public static void main(String[] args) {
        testLinkedListStackPush();
        testLinkedListStackPop();
        testLinkedListQueueAdd();
        testLinkedListQueueRemove();
    }

    public static void testLinkedListStackPush() {
        Stack<Integer> linkedListStackActual = new LinkedListStack<>();
        linkedListStackActual.push(5);
        linkedListStackActual.push(7);
        linkedListStackActual.push(8);
        List<Integer> listExpected = new DoublyLinkedList<>();
        listExpected.add(8);
        listExpected.add(7);
        listExpected.add(5);
        assertEquals("lesson05.Solution05Test.testLinkedListStackPush", listExpected.toArray(),
            linkedListStackActual.toArray());
    }

    public static void testLinkedListStackPop() {
        Stack<Integer> linkedListStackActual = new LinkedListStack<>();
        linkedListStackActual.push(1);
        linkedListStackActual.push(2);
        linkedListStackActual.push(3);
        List<Integer> listExpected = new DoublyLinkedList<>();
        listExpected.add(2);
        listExpected.add(1);
        linkedListStackActual.pop();
        assertEquals("lesson05.Solution05Test.testLinkedListStackPop", listExpected.toArray(),
            linkedListStackActual.toArray());
    }

    public static void testLinkedListQueueAdd() {
        Queue<Integer> linkedListQueueActual = new LinkedListQueue<>();
        linkedListQueueActual.add(7);
        linkedListQueueActual.add(8);
        linkedListQueueActual.add(5);
        List<Integer> listExpected = new DoublyLinkedList<>();
        listExpected.add(7);
        listExpected.add(8);
        listExpected.add(5);
        assertEquals("lesson05.Solution05Test.testLinkedListQueueAdd", listExpected.toArray(),
            linkedListQueueActual.toArray());
    }

    public static void testLinkedListQueueRemove() {
        Queue<Integer> linkedListQueueActual = new LinkedListQueue<>();
        linkedListQueueActual.add(8);
        linkedListQueueActual.add(5);
        linkedListQueueActual.add(7);
        List<Integer> listExpected = new DoublyLinkedList<>();
        listExpected.add(5);
        listExpected.add(7);
        linkedListQueueActual.remove();
        assertEquals("lesson05.Solution05Test.testLinkedListQueueRemove", listExpected.toArray(),
            linkedListQueueActual.toArray());
    }

}