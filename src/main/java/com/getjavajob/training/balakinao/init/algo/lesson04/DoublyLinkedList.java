package com.getjavajob.training.balakinao.init.algo.lesson04;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class DoublyLinkedList<T> extends AbstractList<T> {

    private int size;
    private Node<T> last;
    private Node<T> first;
    private int modCount;

 Node<T> node(int index) {
        if (index < (size >> 1)) {
            Node<T> x = first;
            for (int i = 0; i < index; i++){
                x = x.next;}
            return x;
        } else {
            Node<T> x = last;
            for (int i = size - 1; i > index; i--){
                x = x.prev;}
            return x;
        }
    }

    @Override
    public T set(int index, T element) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        } else {
            Node<T> temp = node(index);
            T elementOld = temp.item;
            temp.item = element;
            return elementOld;
        }
    }

   @Override
    public boolean add(T element) {
        Node<T> newNode = new Node<>(last, element, null);
        if (last == null) {
            last = newNode;
            first = newNode;
        } else {
            last = newNode;
            last.prev.next = newNode;
        }

        size++;
        modCount++;
        return true;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        return node(index).item;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        Node<T> temp= node(index);
        T oldTemp =temp.item;
        unlink(temp);
        return oldTemp;
    }

    void unlink(Node<T> temp) {
            Node<T> next = temp.next;
            Node<T> prev = temp.prev;
            if (prev == null) {
                first = next;
            } else {
                prev.next = next;
                temp.prev = null;
            }
            if (next == null) {
                last = prev;
            } else {
                next.prev = prev;
                temp.next = null;
            }
            temp.item = null;
            size--;
            modCount++;
    }

    @Override
    public boolean remove(Object element) {
        Node<T> temp = first;
        if (element == null) {
            for (int i = 0; i < size; i++) {
                unlink(temp);
                temp = first.next;
            }
            return true;
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(temp.item)) {
                    unlink(temp);
                    return true;
                }
                temp = first.next;
            }
        }
        return false;
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        } else if (index == size) {
            add(element);
        } else{
            Node<T> temp = node(index);
            final Node<T> prev = temp.prev;
            final Node<T> newNode = new Node<>(prev, element, temp);
            temp.prev = newNode;
            if (prev == null) {
                first = newNode;
            } else {
                prev.next = newNode;
            }
            size++;
            modCount++;
        }
    }

    @Override
    public int indexOf(Object element) {
        Node<T> temp = first;
        if (element == null) {
            for (int i = 0; i < size; i++) {
                if (temp.item == null) {
                    return i;
                }
                temp = first.next;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (element.equals(temp.item)) {
                    return i;
                }
                temp = first.next;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object element) {
        return indexOf(element) >= 0;
    }

    @Override
    public T[] toArray() {
        T[] arrayCopy = (T[]) new Object[size];
        int i = 0;
        Node<T> temp = first;
        while (temp != null) {
            arrayCopy[i++] = temp.item;
            temp = temp.next;
        }
        return arrayCopy;
    }

        public void fillDoublyLinkedList() {
        T[] arrayCopy = (T[]) new Object[size];
        int index = 0;
        Node<T> temp = first;
        while (temp != null) {
            arrayCopy[index++] = temp.item;
            temp = temp.next;
        }
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.print(arrayCopy[i] + " ");
        }
        System.out.println();
    }

    public DoublyLinkedIterator listIterator() {
        return new DoublyLinkedIterator();
    }

    public DoublyLinkedIterator listIterator(int index) {
        if (index > size || index < 0) {
            throw new ArrayIndexOutOfBoundsException(index + "Index out of bounds");
        }
        return new DoublyLinkedIterator(index);
    }

    private static class Node<T> {

        T item;
        Node<T> next;
        Node<T> prev;
        Node(Node<T> prev, T element, Node<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    class DoublyLinkedIterator implements ListIterator<T> {

        private Node<T> lastReturned;
        private Node<T> next;
        private int nextIndex;
        private int expectedModCount = modCount;

        public DoublyLinkedIterator() {
           if (size==0) {
              next=null;
           }
           else {
            next = node(0);}
        nextIndex = 0;
        }

        public DoublyLinkedIterator(int index) {
            if (index > size) {
                throw new IndexOutOfBoundsException("Illegal Capacity");
            } else if (index==size) {
                next =null;
            }
            else {
            next = node(index);}
            nextIndex = index;
        }

        @Override
        public boolean hasNext() {
            return nextIndex < size;
        }

        @Override
        public T next() {
            checkModification();
            if (nextIndex >= size) {
                throw new NoSuchElementException();
            }
            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.item;
        }

        void checkModification() {
            if (modCount != expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override
        public boolean hasPrevious() {
            return nextIndex != 0;
        }

        @Override
        public T previous() {
            checkModification();
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            if (next == null) {
                lastReturned = next = last;
            } else {
                lastReturned = next=next.prev;
            }
            nextIndex--;
            return lastReturned.item;
        }

        @Override
        public int nextIndex() {
            return nextIndex;
        }

        @Override
        public int previousIndex() {
            return nextIndex - 1;
        }

        @Override
        public void remove() {
            checkModification();
            expectedModCount++;
            DoublyLinkedList.this.remove(nextIndex - 1);
            nextIndex--;
        }

        @Override
        public void set(T element) {
            checkModification();
            expectedModCount++;
            if (modCount == 1) {
                first.item = element;
            } else {
                Node<T> temp = first;
                for (int i = 0; i < modCount; i++) {
                    temp = first.next;
                }
                lastReturned = temp;
            }
            lastReturned.item = element;
        }

        @Override
        public void add(T element) {
            checkModification();
            lastReturned = null;
            if (next == null) {
                DoublyLinkedList.this.add(element);
            } else {
               DoublyLinkedList.this.add(nextIndex, element);
}
            nextIndex++;
            expectedModCount++;
        }
    }

}