package com.getjavajob.training.balakinao.init.algo.lesson10;

import java.util.Arrays;

public class Sorting {

    private int[] sortArray;
    private int size;
    int quantityElements;

    @Override
    public String toString() {
        return "Sorting{" +
            "sortArray=" + Arrays.toString(sortArray) +
            ", size=" + size +
            ", quantityElements=" + quantityElements +
            '}';
    }

    public Sorting(int size) {
        if (size >= 0) {
            this.sortArray = new int[size];
            this.size = size;
        } else {
            throw new ArrayIndexOutOfBoundsException("Illegal capacity: " +
                size);
        }
    }

    public void add(int value) {
        if (size < quantityElements + 1) {
            throw new ArrayIndexOutOfBoundsException("Index out of length " +
                size);
        }
        sortArray[quantityElements++] = value;
    }

    public void fillArrayPint() {
        for (int i = 0; i <= quantityElements - 1; i++) {
            System.out.print(sortArray[i] + " ");
        }
        System.out.println();
    }

    public void bubbleSort() {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int out = size - 1; out >= 1; out--) {
                for (int in = 0; in < out; in++) {
                    if (sortArray[in] > sortArray[in + 1]) {
                        swap(sortArray, in, in + 1);
                        needIteration = true;
                    }
                }
            }
        }
    }

    public void swap(int[] array, int first, int second) {
        int dummy = array[first];
        array[first] = array[second];
        array[second] = dummy;
    }

    public void insertionSort() {
        if (!isSorted(sortArray)) {
            for (int left = 0; left < sortArray.length; left++) {
                int value = sortArray[left];
                int i = left - 1;
                for (; i >= 0; i--) {
                    if (value < sortArray[i]) {
                        sortArray[i + 1] = sortArray[i];
                    } else {
                        break;
                    }
                }
                sortArray[i + 1] = value;
            }
        }
    }

    public boolean isSorted(int sortArray[]) {
        int first = sortArray[0];
        for (int i = 1; i < size; i++) {
            if (first > sortArray[i]) {
                return false;
            }
            first = sortArray[i];
        }
        return true;
    }

    public void mergeSort() {
        if (!isSorted(sortArray)) {
            int[] buffer = Arrays.copyOf(sortArray, sortArray.length);
            mergeSort(sortArray, buffer, 0, sortArray.length - 1);
        }
    }
    public void mergeSort(int[] sortArray, int[] buffer, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(sortArray, buffer, left, middle);
            mergeSort(sortArray, buffer, middle + 1, right);
            int k = left;
            for (int i = left, j = middle + 1; i <= middle || j <= right; ) {
                if (j > right || (i <= middle && sortArray[i] < sortArray[j])) {
                    buffer[k] = sortArray[i];
                    ++i;
                } else {
                    buffer[k] = sortArray[j];
                    ++j;
                }
                ++k;
            }
            for (int i = left; i <= right; ++i) {
                sortArray[i] = buffer[i];
            }
        }
    }

    public void quickSort() {
        if (!isSorted(sortArray)) {
            quickSort(sortArray, 0, size - 1);
        }
    }

    public void quickSort(int sortArray[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(sortArray, begin, end);
            quickSort(sortArray, begin, partitionIndex - 1);
            quickSort(sortArray, partitionIndex + 1, end);
        }
    }

    private int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;
        return i + 1;
    }

}