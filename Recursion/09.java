package com.codestates.coplit;
import java.util.*;

public class Solution {
    public int[] take(int num, int[] arr){
        if (num == 0) { return new int[0]; }  // new int[]{};
        if (num >= arr.length) { return arr; }
        return take(num, Arrays.copyOfRange(arr, 0, arr.length-1));
    }
}


//        Solution sol = new Solution();
//        int[] output = sol.take(2, new int[]{1, -2, 1, 3});
//        System.out.println(Arrays.toString(output)); // --> [1, -2]
