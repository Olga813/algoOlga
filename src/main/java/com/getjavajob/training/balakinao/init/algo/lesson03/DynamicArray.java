package com.getjavajob.training.balakinao.init.algo.lesson03;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

import static java.lang.System.arraycopy;

public class DynamicArray {

    private Object[] array;
    private int quantityElements;
    private int modCount;
    private int index;

    public DynamicArray() {
        this.array = new Object[10];
    }

    public DynamicArray(int beginSize) {
        if (beginSize > 0) {
            this.array = new Object[beginSize];
        } else if (beginSize == 0) {
            this.array = new Object[10];
        } else {
            throw new ArrayIndexOutOfBoundsException("Illegal Capacity: " +
                beginSize);
        }
    }

    public void fillArrayPint() {
        for (int i = 0; i <= quantityElements - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public Object set(int index, Object element) {
        handlesRangeIndex(index);
        Object replaceElement = array[index];
        array[index] = element;
        return replaceElement;
    }

    public boolean add(Object element) {
        if (quantityElements == array.length) {
            reSize((3 * array.length) / 2 + 1);
        }
        array[quantityElements++] = element;
        modCount++;
        return true;
    }

    public void reSize(int newLength) {
        Object[] temporaryArray = new Object[newLength];
        arraycopy(array, 0, temporaryArray, 0, quantityElements);
        array = temporaryArray;
    }

    public Object get(int index) {
        handlesRangeIndex(index);
        return array[index];
    }

    public Object remove(int index) {
        handlesRangeIndexRemove(index);
        Object oldValue = array[index];
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

    public int size() {
        return quantityElements;
    }

    public int indexOf(Object element) {
        for (int i = 0; i < quantityElements; i++) {
            if (element.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(Object element) {
        return indexOf(element) >= 0;
    }

    public Object[] toArray() {
        Object[] arrayCopy = new Object[quantityElements];
        arraycopy(array, 0, arrayCopy, 0, quantityElements);
        return arrayCopy;
    }

    public void add(int index, Object element) {
        handlesRangeIndex(index);
        if (quantityElements == array.length) {
            reSize((3 * array.length) / 2 + 1);
        }
        arraycopy(array, index, array, index + 1, quantityElements - index);
        array[index] = element;
        quantityElements++;
        modCount++;
    }

    public ListIterator listIterator(int index) {
        handlesRangeIndex(index);
        return new ListIterator(index);
    }

    public ListIterator listIterator() {
        return new ListIterator(0);
    }

 class ListIterator implements Iterator {

        private int cursor;
        private int lastRet = -1;
        private int expectedModCount = modCount;

        public ListIterator() {
            super();
        }

        public ListIterator(int index) {
            if (index > quantityElements) {
                throw new ArrayIndexOutOfBoundsException("Illegal Capacity");
            }
            this.cursor = index;
        }

        public boolean hasNext() {
            return cursor<quantityElements && array[index] != null;
        }

        public Object next() {
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

        public boolean hasPrevious() {
            return cursor != 0;
        }

        public Object previous() {
            checkModification();
            if (cursor - 1 < 0) {
                throw new NoSuchElementException();
            }
            return array[lastRet = --cursor];
        }

        public int nextIndex() {
            return cursor;
        }

        public int previousIndex() {
            return cursor - 1;
        }

        public void remove() {
            if (lastRet < 0) {
                throw new IllegalStateException();
            }
            checkModification();
            DynamicArray.this.remove(lastRet);
                cursor = lastRet;
                lastRet = -1;
                expectedModCount = modCount;
        }

        public void set(Object element) {
            if (lastRet < 0)
                throw new IllegalStateException();
            checkModification();
                DynamicArray.this.set(lastRet, element);
        }

        public void add(Object element) {
                DynamicArray.this.add(cursor++, element);
                lastRet = -1;
                expectedModCount = modCount;
        }
    }

}