package com.getjavajob.training.balakinao.init.algo.lesson05;

import com.getjavajob.training.balakinao.init.algo.lesson04.DoublyLinkedList;

import java.util.List;

public class LinkedListQueue<E> extends AbstractList<E> {

    private List<E> list = new DoublyLinkedList<>();

    @Override
    public boolean add(E item) {
        return list.add(item);
    }

    @Override
    public E remove() {
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.size() > 0;
    }

    public E[] toArray() {
        return (E[]) list.toArray();
    }

}