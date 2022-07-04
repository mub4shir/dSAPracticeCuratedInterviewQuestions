package com.arrays;

import java.util.Arrays;

public class SquareSortedArray {
        int[] getSquareSortedArray (int[] arr) {
            // add your logic here
            for(var i =0; i<arr.length; i++)
                arr[i] *=arr[i];
            Arrays.sort(arr);
            return arr;
        }
}

