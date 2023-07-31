package com.getjavajob.training.balakinao.init.algo.lesson05;

import com.getjavajob.training.balakinao.init.algo.lesson04.DoublyLinkedList;

import java.util.List;

public class LinkedListStack<E> implements Stack<E> {

    private List<E> list = new DoublyLinkedList<>();

    @Override
    public void push(E item) {
        list.add(0, item);
    }

    @Override
    public E pop() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.size()>0;
    }

    public E[] toArray() {
        return (E[]) list.toArray();
    }

}