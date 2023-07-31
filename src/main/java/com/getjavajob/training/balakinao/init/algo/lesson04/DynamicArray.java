package com.getjavajob.training.balakinao.init.algo.lesson04;


import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import static java.lang.System.arraycopy;

public class DynamicArray<T> extends AbstractList<T> {

    private T[] array;
    private int quantityElements;
    private int modCount;
    private int index;

    @SuppressWarnings("unchecked cast")
    public DynamicArray() {
        this.array = (T[]) new Object[10];
    }

    public DynamicArray(int beginSize) {
        if (beginSize > 0) {
            this.array = (T[]) new Object[beginSize];
        } else if (beginSize == 0) {
            this.array = (T[]) new Object[10];
        } else {
            throw new ArrayIndexOutOfBoundsException("Illegal Capacity: " +
                beginSize);
        }
    }

    public DynamicArray(Collection<? extends T> enterCollection) {
        T[] temporaryArray = (T[]) enterCollection.toArray();
        if ((quantityElements = temporaryArray.length) != 0) {
            this.array = temporaryArray;
        } else {
            this.array = (T[]) new Object[10];
        }
    }

    public void fillArrayPint() {
        for (int i = 0; i <= quantityElements - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    @Override
    public T set(int index, T element) {
        handlesRangeIndex(index);
        T replaceElement = array[index];
        array[index] = element;
        modCount++;
        return replaceElement;
    }

    @Override
    public boolean add(T element) {
        if (quantityElements == array.length) {
            reSize((3 * array.length) / 2 + 1);
        }
        array[quantityElements++] = element;
        modCount++;
        return true;
    }

    public void reSize(int newLength) {
        T[] temporaryArray = (T[]) new Object[newLength];
        arraycopy(array, 0, temporaryArray, 0, quantityElements);
        array = temporaryArray;
    }

    @Override
    public T get(int index) {
        handlesRangeIndex(index);
        return array[index];
    }

    @Override
    public T remove(int index) {
        handlesRangeIndexRemove(index);
        T oldValue = array[index];
        modCount++;
        if ((quantityElements - 1) > index) {
            arraycopy(array, index + 1, array, index, quantityElements - 1 - index);
        }
        array[--quantityElements] = null;
        return oldValue;
    }

    public void handlesRangeIndexRemove(int index) {
        if (index < 0 || index >= quantityElements) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
    }

    public void handlesRangeIndex(int index) {
        if (index < 0 || index > quantityElements) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
    }

    @Override
    public boolean remove(Object element) {
        if (element == null) {
            for (int i = 0; i < quantityElements; i++) {
                if (array[i] == null) {
                    remove(i);
                    modCount++;
                    return true;
                }
            }
        } else {
            for (int i = 0; i < quantityElements; i++) {
                if (array[i].equals(element)) {
                    remove(i);
                    modCount++;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void add(int index, T element) {
        handlesRangeIndex(index);
        if (quantityElements == array.length) {
            reSize((3 * array.length) / 2 + 1);
        }
        arraycopy(array, index, array, index + 1, quantityElements - index);
        array[index] = element;
        quantityElements++;
        modCount++;
    }

    @Override
    public int indexOf(Object element) {
        for (int i = 0; i < quantityElements; i++) {
            if (element.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return quantityElements;
    }

    @Override
    public boolean contains(Object element) {
        return indexOf(element) >= 0;
    }

    @Override
    public T[] toArray() {
        T[] arrayCopy = (T[]) new Object[quantityElements];
        arraycopy(array, 0, arrayCopy, 0, quantityElements);
        return arrayCopy;
    }

    @Override
    public <T> T[] toArray(T[] arrayEnterCollection) {
        T[] arrayCopy = (T[]) new Object[arrayEnterCollection.length];
        arraycopy(arrayEnterCollection, 0, arrayCopy, 0, quantityElements);
        return arrayCopy;
    }


    public ListIteratorImpl listIterator() {
        return new ListIteratorImpl();
    }

    public ListIteratorImpl listIterator(int index) {
        handlesRangeIndex(index);
        return new ListIteratorImpl(index);
    }

    class ListIteratorImpl implements ListIterator<T> {

        private int cursor;
        private int lastRet = -1;
        private int expectedModCount = modCount;

        public ListIteratorImpl() {
        }

        public ListIteratorImpl(int index) {
            if (index > quantityElements) {
                throw new ArrayIndexOutOfBoundsException("Illegal Capacity");
            }
            cursor = index;
        }

        @Override
        public boolean hasNext() {
            return cursor<quantityElements && array[index] != null;
        }

        @Override
        public T next() {
            checkModification();
            if (cursor >= quantityElements) {
                throw new NoSuchElementException();
            }
            cursor++;
            return array[lastRet = cursor - 1];
        }

        void checkModification() {
            if (modCount != expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override
        public boolean hasPrevious() {
            return cursor != 0;
        }

        @Override
        public T previous() {
            checkModification();
            if (cursor - 1 < 0) {
                throw new NoSuchElementException();
            }
            cursor--;
            return array[lastRet = cursor];
        }

        @Override
        public int nextIndex() {
            return cursor;
        }

        @Override
        public int previousIndex() {
            return cursor - 1;
        }

        @Override
        public void remove() {
            if (lastRet < 0) {
                throw new IllegalStateException();
            }
            checkModification();
            expectedModCount = modCount;
            DynamicArray.this.remove(lastRet);
            cursor = lastRet;
            lastRet = -1;
        }

        @Override
        public void set(T element) {
            if (lastRet < 0)
                throw new IllegalStateException();
            checkModification();
            expectedModCount++;
            DynamicArray.this.set(lastRet, element);
        }

        @Override
        public void add(T element) {
            checkModification();
            DynamicArray.this.add(cursor, element);
            cursor++;
            lastRet = -1;
            expectedModCount = modCount;

        }
    }

}