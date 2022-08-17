package com.codestates.coplit;

public class Solution {
    public long ocean(int target, int[] type) {

        long[] result = new long[target+1];
        result[0] = 1;

        for (int i=0; i<type.length; i++) {
            for (int j=0; j<=target; j++) {
                if (type[i] <= j) { result[j] += result[j-type[i]]; }
            }
        }

        return result[target];

    }
}
