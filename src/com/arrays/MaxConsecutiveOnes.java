package com.arrays;

public class MaxConsecutiveOnes {
    int getMaxConsecutiveOnes(int[] A) {
        // add your logic here
        int res = 0;
        int cnt = 0;
        for (var x : A) {
            if (x != 1) cnt = 0;
            else {
                cnt++;
                res = Math.max(res, cnt);
            }
        }
        return res;
    }
}
