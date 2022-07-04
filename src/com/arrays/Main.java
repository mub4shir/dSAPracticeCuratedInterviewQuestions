package com.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers ={43,1,111,46,22,5,6,7,888,89,0};
        var sorter = new BubbleSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
