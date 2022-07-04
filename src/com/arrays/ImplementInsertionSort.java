package com.arrays;

public class ImplementInsertionSort {
    void insertionSort(int[] arr) {
        // add your logic here
        for (var i = 1; i < arr.length; i++) {
            var current = arr[i];
            var j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}




