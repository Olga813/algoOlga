package com.getjavajob.training.balakinao.init.algo.lesson04;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution04 {

    public static void main(String[] args) throws InterruptedException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a elements number DynamicArray . Enter 777 to finish: ");
            DynamicArray<Integer> dynamicArray = new DynamicArray<>();
            DynamicArray<Integer>.ListIteratorImpl dynamicArraylistIterator = dynamicArray.listIterator();
            int enterNumber;
            while ((enterNumber = scanner.nextInt()) != 777) {
                dynamicArray.add(enterNumber);
            }
            dynamicArray.fillArrayPint();
            System.out.println("Let's check the work of the \"add\" method for DynamicArray<T>: " + dynamicArray.add
                (28));
            dynamicArray.fillArrayPint();
            System.out.println("Let's check the work of the \"set\" method for DynamicArray<T>: " + dynamicArray.set(3,
                78));
            dynamicArray.fillArrayPint();
            System.out.println("Let's check the work of the \"get\" method for DynamicArray<T>: " + dynamicArray.get(2));
            dynamicArray.fillArrayPint();
            System.out.println("Let's check the work of the \"remove\" method for DynamicArray<T>: " + dynamicArray.remove(3));
            dynamicArray.fillArrayPint();
            Integer enterNumberElement = 8;
            System.out.println("Let's check the work of the \"remove Object\" method for DynamicArray<T>: " +
                dynamicArray.remove(enterNumberElement));
            System.out.println("Let's check the work of the \"size\" method for DynamicArray<T>: " + dynamicArray.size
                ());
            dynamicArray.fillArrayPint();
            System.out.println("Let's check the work of the \"index0F\" method for DynamicArray<T>: " + dynamicArray.indexOf(4));
            dynamicArray.fillArrayPint();
            System.out.println("Let's check the work of the \"contains\" method for DynamicArray<T>: " + dynamicArray.contains(3));
            dynamicArray.fillArrayPint();
            System.out.println("Let's check the work of the \"toArray\" method for DynamicArray<T>: " + dynamicArray.toArray());
            dynamicArray.fillArrayPint();
            System.out.println("Let's check the work of the \"add\",\"remove\" and \"fillArrayPint\" methods for " +
                "DynamicArray<T>: ");
            dynamicArray.add(3, 18);
            dynamicArray.fillArrayPint();
            System.out.println("Let's check the work of the \"hasNext\" method for ListIteratorImpl implement " +
                "ListIterator: "+ dynamicArraylistIterator.hasNext());
            System.out.println("Let's check the work of the \"next\" method for ListIteratorImpl implement " +
                "ListIterator: " +
                dynamicArraylistIterator.next());
            System.out.println("Let's check the work of the \"hasPrevious\" method for ListIteratorImpl implement " +
                "ListIterator: " + dynamicArraylistIterator.hasPrevious());
            System.out.println("Let's check the work of the \"previous\" method for ListIteratorImpl implement " +
                "ListIterator: " + dynamicArraylistIterator.previous());
            System.out.println("Let's check the work of the \"nextIndex\" method for ListIteratorImpl implement " +
                "ListIterator: " +
                dynamicArraylistIterator.nextIndex());
            System.out.println("Let's check the work of the \"previousIndex()\" method for ListIteratorImpl implement" +
                " ListIterator: " +
                dynamicArraylistIterator.previousIndex());
            System.out.println("Let's check the work of the \"next\" method for ListIteratorImpl implement " +
                "ListIterator: " +
                dynamicArraylistIterator.next());
            System.out.println("Let's check the work of the \"set\", \"remove\" and \"add\" methods for " +
                "ListIteratorImpl implement ListIterator");
            dynamicArraylistIterator.remove();
            dynamicArraylistIterator.set(enterNumberElement);
            dynamicArraylistIterator.add(enterNumberElement);
            dynamicArray.fillArrayPint();

            DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
            DoublyLinkedList<Integer>.DoublyLinkedIterator doublyLinkedListIterator = doublyLinkedList.listIterator();
            System.out.print("Enter a elements number DoublyLinkedList. Enter 777 to finish: ");
            int enterNumber2;
            while (((enterNumber2 = scanner.nextInt())) != 777) {
                doublyLinkedList.add(enterNumber2);
            }
            doublyLinkedList.fillDoublyLinkedList();
          System.out.println("Let's check the work of the \"add\" method for DoublyLinkedList<T>: " +
          doublyLinkedList.add
                (28));
            doublyLinkedList.fillDoublyLinkedList();
            System.out.println("Let's check the work of the \"set\" method for DoublyLinkedList<T>: " + doublyLinkedList.set(3,
                78));
            doublyLinkedList.fillDoublyLinkedList();
            System.out.println("Let's check the work of the \"get\" method for DoublyLinkedList<T>: " + doublyLinkedList.get(2));
            doublyLinkedList.fillDoublyLinkedList();
            System.out.println("Let's check the work of the \"remove\" method for DoublyLinkedList<T>: " + doublyLinkedList.remove(3));
            doublyLinkedList.fillDoublyLinkedList();
            Integer enterNumberElement2 = 8;
            System.out.println("Let's check the work of the \"remove Object\" method for DoublyLinkedList: " +
                doublyLinkedList.remove(enterNumberElement2));
            doublyLinkedList.fillDoublyLinkedList();
            System.out.println("Let's check the work of the \"size\" method for DoublyLinkedList<T>: " + doublyLinkedList .size
                ());
            doublyLinkedList.fillDoublyLinkedList();
            System.out.println("Let's check the work of the \"index0F\" method for DoublyLinkedList<T>: " + doublyLinkedList.indexOf(4));
            doublyLinkedList.fillDoublyLinkedList();
            System.out.println("Let's check the work of the \"contains\" method for DoublyLinkedList<T>: " + doublyLinkedList.contains(3));
            doublyLinkedList.fillDoublyLinkedList();
            System.out.println("Let's check the work of the \"toArray\" method for DoublyLinkedList<T>: " + doublyLinkedList.toArray());
            doublyLinkedList.fillDoublyLinkedList();
            System.out.println("Let's check the work of the \"add\" and \"fillArrayPint\" methods for " +
                "DoublyLinkedList<T>: ");
            doublyLinkedList.add(3, 18);
            doublyLinkedList.fillDoublyLinkedList();

            System.out.println("Let's check the work of the \"hasNext\" method for DoublyLinkedIterator implement " +
                "ListIterator: " +
                doublyLinkedListIterator.hasNext());
           System.out.println("Let's check the work of the \"next\" method for DoublyLinkedIterator implement " +
                "ListIterator: " +
                doublyLinkedListIterator.next());
            System.out.println("Let's check the work of the \"hasPrevious\" method for DoublyLinkedIterator implement " +
                "ListIterator: " + doublyLinkedListIterator.hasPrevious());
            System.out.println("Let's check the work of the \"previous\" method for DoublyLinkedIterator implement " +
                "ListIterator: " + doublyLinkedListIterator.previous());
            System.out.println("Let's check the work of the \"nextIndex\" method for DoublyLinkedIterator implement " +
                "ListIterator: " +
                doublyLinkedListIterator.nextIndex());
            System.out.println("Let's check the work of the \"previousIndex()\" method for DoublyLinkedIterator implement" +
                " ListIterator: " +
                doublyLinkedListIterator.previousIndex());
            System.out.println("Let's check the work of the \"next\" method for DoublyLinkedIterator implement " +
                "ListIterator: " +
                doublyLinkedListIterator.next());
            System.out.println("Let's check the work of the \"set\", \"remove\" and \"add\" methods for " +
                "DoublyLinkedIterator implement ListIterator");
            doublyLinkedListIterator.remove();
            doublyLinkedListIterator.set(8);
            doublyLinkedListIterator.add(8);
            doublyLinkedList.fillDoublyLinkedList();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

}