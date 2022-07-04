package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoSortedArrays {
        int[] mergeSortedArrays(int[] A, int[] B) {
            // add your logic here
            int len = A.length + B.length;
            int[] C = new int[len];
            int i=A.length-1;
            int j=B.length-1;
            int k = len-1;

            while(i>=0 && j>=0){
                if(A[i]>B[j]) C[k--]=A[i--];
                else C[k--]=B[j--];
            }
            while(i>=0){
                C[k--]=A[i--];
            }
            while(j>=0){
                C[k--]=B[j--];
            }
            return C;

        }


//        public int[] twoSum(int[] numbers, int target ){
//            Map<Integer,Integer> map = new HashMap<>();
//            for (int i = 0; i < numbers.length; i++) {
//                int x = numbers[i];
//                if(map.containsKey(target-x)){
//                    return new int[]{map.get(target-x), i};
//                }
//                map.put(x,i);
//
//            }
//            throw new  IllegalArgumentException("no two sum solution")
//        }
    }

