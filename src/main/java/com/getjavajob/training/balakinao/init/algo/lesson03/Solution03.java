package com.getjavajob.training.balakinao.init.algo.lesson03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution03 {

    public static void main(String[] args) throws InterruptedException {
       try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a elements number DynamicArray . Enter 777 to finish: ");
            DynamicArray dynamicArray = new DynamicArray();
            DynamicArray.ListIterator listIterator = dynamicArray.listIterator();
            int enterNumber;
            while (((enterNumber = scanner.nextInt())) != 777) {
                dynamicArray.add(enterNumber);
            }
            dynamicArray.fillArrayPint();
            System.out.println("Let's check the work of the \"add\" method for DynamicArray: " + dynamicArray.add
                (28));
            dynamicArray.fillArrayPint();
            System.out.println("Let's check the work of the \"set\" method for DynamicArray: " + dynamicArray.set(3,
                78));
            dynamicArray.fillArrayPint();
            System.out.println("Let's check the work of the \"get\" method for DynamicArray: " + dynamicArray.get(2));
            dynamicArray.fillArrayPint();
            System.out.println("Let's check the work of the \"remove\" method for DynamicArray: " + dynamicArray.remove(3));
            dynamicArray.fillArrayPint();
            Integer enterNumberElement = 8;
            System.out.println("Let's check the work of the \"remove Object\" method for DynamicArray: " +
                dynamicArray.remove(enterNumberElement));
            System.out.println("Let's check the work of the \"size\" method for DynamicArray: " + dynamicArray.size
                ());
            dynamicArray.fillArrayPint();
            System.out.println("Let's check the work of the \"index0F\" method for DynamicArray: " + dynamicArray.indexOf(4));
            dynamicArray.fillArrayPint();
            System.out.println("Let's check the work of the \"contains\" method for DynamicArray: " + dynamicArray.contains(3));
            dynamicArray.fillArrayPint();
            System.out.println("Let's check the work of the \"toArray\" method for DynamicArray: " + dynamicArray.toArray());
            dynamicArray.fillArrayPint();
            System.out.println("Let's check the work of the \"add\",\"remove\" and \"fillArrayPint\" methods for " +
                "DynamicArray: ");
            dynamicArray.add(3, 18);
            dynamicArray.fillArrayPint();
            System.out.println("Let's check the work of the \"hasNext\" method for  ListIterator(DynamicArray): " +
                listIterator.hasNext());
            System.out.println("Let's check the work of the \"next\" method for  ListIterator(DynamicArray): " +
                listIterator.next());
            System.out.println("Let's check the work of the \"hasPrevious\" method for  ListIterator(DynamicArray): "
                + listIterator.hasPrevious());
            System.out.println("Let's check the work of the \"previous\" method for  ListIterator(DynamicArray): " +
                listIterator.previous());
            System.out.println("Let's check the work of the \"nextIndex\" method for  ListIterator(DynamicArray): " +
                listIterator.nextIndex());
            System.out.println("Let's check the work of the \"previousIndex()\" method for  ListIterator" +
                "(DynamicArray): " +
                listIterator.previousIndex());
            System.out.println("Let's check the work of the \"next\" method for  ListIterator(DynamicArray): " +
                listIterator.next());
            System.out.println("Let's check the work of the \"set\", \"remove\" and \"add\" methods for ListIterator" +
                "(DynamicArray)");
            listIterator.remove();
            listIterator.set(enterNumberElement);
            listIterator.add(enterNumberElement);
            dynamicArray.fillArrayPint();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

}