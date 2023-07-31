package com.getjavajob.training.balakinao.init.algo.lesson05;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public class UnmodifiableCollection<T> extends AbstractCollection<T> {

    private final Collection<? extends T> coll;

    public UnmodifiableCollection(Collection<? extends T> coll) {
        this.coll = coll;
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        return coll.size();
    }

    @Override
    public boolean contains(Object obj) {
        return coll.contains(obj);
    }

    @Override
    public boolean isEmpty() {
        return coll.isEmpty();
    }

    @Override
    public Object[] toArray() {
        return coll.toArray();
    }

    @Override
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

}