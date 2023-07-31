package com.getjavajob.training.balakinao.init.algo.lesson10;

public class Solution10 {

    public static void main(String[] args) {
        Sorting sorting = new Sorting(4);
        sorting.add(8);
        sorting.add(5);
        sorting.add(3);
        sorting.add(7);
        System.out.print("Sortable array: ");
        sorting.fillArrayPint();
        sorting.bubbleSort();
        System.out.print("Array after bubble sorting: ");
        sorting.fillArrayPint();

        Sorting sortingInsertionSort = new Sorting(6);
        sortingInsertionSort.add(4);
        sortingInsertionSort.add(5);
        sortingInsertionSort.add(9);
        sortingInsertionSort.add(7);
        sortingInsertionSort.add(0);
        sortingInsertionSort.add(7);
        System.out.print("Sortable array: ");
        sortingInsertionSort.fillArrayPint();
        sortingInsertionSort.insertionSort();
        System.out.print("Array after Insertion sorting: ");
        sortingInsertionSort.fillArrayPint();

        Sorting sortingMergeSort = new Sorting(6);
        sortingMergeSort.add(4);
        sortingMergeSort.add(15);
        sortingMergeSort.add(10);
        sortingMergeSort.add(7);
        sortingMergeSort.add(0);
        sortingMergeSort.add(71);
        System.out.print("Sortable array: ");
        sortingMergeSort.fillArrayPint();
        sortingMergeSort.mergeSort();
        System.out.print("Array after Merge sorting: ");
        sortingMergeSort.fillArrayPint();

        Sorting sortingQuickSort = new Sorting(6);
        sortingQuickSort.add(4);
        sortingQuickSort.add(15);
        sortingQuickSort.add(10);
        sortingQuickSort.add(7);
        sortingQuickSort.add(0);
        sortingQuickSort.add(71);
        System.out.print("Sortable array: ");
        sortingQuickSort.fillArrayPint();
        sortingQuickSort.quickSort();
        System.out.print("Array after Quick sorting: ");
        sortingQuickSort.fillArrayPint();
    }

}
