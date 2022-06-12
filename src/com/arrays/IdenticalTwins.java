package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class IdenticalTwins {


        int getIdenticalTwinsCount (int[] arr) {
            // add your logic here
// 		int cnt=0;
// 		for(int i=0; i<arr.length;i++){
// 			for(int j=i+1;j<arr.length;j++){
// 				if(arr[i]==arr[j] && i<j) cnt++;

// 			}

// 		}
// 		return cnt ;
            HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

            for(int i=0; i<arr.length;i++){
                Integer val = freq.get(arr[i]);
                if(val==null) freq.put(arr[i],1);
                else freq.put(arr[i],++val);
            }
            int cnt=0;

            for(Map.Entry<Integer, Integer> x : freq.entrySet())
                cnt += (x.getValue() * (x.getValue()-1)) /2;

            return cnt;
        }
    }

