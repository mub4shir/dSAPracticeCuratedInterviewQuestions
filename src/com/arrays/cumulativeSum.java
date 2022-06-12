package com.arrays;

class cumulativeSum {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[]  res= getCumulativeSum(arr);
        for (int x: res) {
            System.out.println(x);
        }
    }
   static int[] getCumulativeSum (int[] arr) {
        // add your logic here
        int prefixSum[] = new int[arr.length];
        prefixSum[0]=arr[0];
        for(int i=1;i<arr.length;i++)
            prefixSum[i]=prefixSum[i-1] + arr[i];
        return prefixSum;

    }
}