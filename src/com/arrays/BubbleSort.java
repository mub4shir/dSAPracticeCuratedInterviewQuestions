package com.arrays;
import java.util.Arrays;

public class BubbleSort {

    public void sort(int[] array) {
        boolean isSorted;
        for (var i = 0; i < array.length; i++) {
            isSorted = true;
            for (var j = 1; j < array.length - i; j++)
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                    isSorted=false;
                }
            if(isSorted) return;
        }
        System.out.println(Arrays.toString(array));
    }
    public void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * Time Complexity Analysis
     * best => (array already sorted) passes => O(1) and O(n) comparisons(more accurately n-1 comparisons) => O(n) or linear in best case
     * worst=> (array sorted in reverse order) passes => O(n) and O(n) comparisons (more accurately n-1 comparisons)=> O(n^2) or quadratic in worst case
     */

}
