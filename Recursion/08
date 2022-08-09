package com.codestates.coplit;
import java.util.*;

public class Solution {
    public int[] drop(int num, int[] arr){
        if (num == 0) { return arr; }
        if (num >= arr.length) { return new int[0]; }  // new int[]{};
        return drop(num-1, Arrays.copyOfRange(arr, 1, arr.length));
    }
}


//        Solution sol = new Solution();
//        int[] output = sol.drop(2, new int[]{1, -2, 1, 3});
//        System.out.println(Arrays.toString(output)); // --> [1, 3]
