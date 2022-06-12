package com.arrays;
import java.util.ArrayList;
import java.util.List;

class PositiveCumulativeSum {
    List<Integer> getPositiveCumulativeSum (int[] arr) {

        int prefixSum[] = new int[arr.length];

        List<Integer> list = new ArrayList<Integer>();

        prefixSum[0]=arr[0];

        for(int i=1;i<arr.length;i++)
            prefixSum[i]=prefixSum[i-1] + arr[i];

        for(int i=0; i<prefixSum.length;i++)
            if(prefixSum[i]>0) list.add(prefixSum[i]);

        return list;
    }


}
