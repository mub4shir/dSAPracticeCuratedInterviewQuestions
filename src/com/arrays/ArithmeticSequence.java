package com.arrays;

import java.util.Arrays;

public class ArithmeticSequence {
    boolean isArithmeticSequence(int[] arr) {
        // add your logic here
        if (arr.length == 1) return true;
        Arrays.sort(arr);
        int check = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != check) return false;

        }
        return true;

    }

}
