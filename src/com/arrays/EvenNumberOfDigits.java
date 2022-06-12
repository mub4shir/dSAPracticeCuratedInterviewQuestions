package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberOfDigits {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        int[]arr ={1,0,33,111,222,2,2,2333,333333,3333,3};

        list =getEvenDigitNumbers(arr);
        for (Integer x:
             list ) {
            System.out.println(x);
        }
    }

        static List<Integer> getEvenDigitNumbers (int[] arr) {
            // add your logic here
            List<Integer> list = new ArrayList<Integer>();
            boolean flag;
            for(int i=0; i<arr.length;i++){
                flag=checkIfEven(arr[i]);
                if(flag && arr[i]!=0) list.add(arr[i]);
            }
            return list;

        }


        static Boolean checkIfEven(int num){
            int cnt=0;
            while(num>0){
                num /=10;
                cnt++;
            }
            if(cnt%2==0) return true;
            else return false;
        }
    }

