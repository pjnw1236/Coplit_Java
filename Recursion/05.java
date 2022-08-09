package com.codestates.coplit;
import java.util.Arrays;

public class Solution {
    public int arrSum(int[] arr){
        if (arr.length == 0) { return 0; }
        return arr[0] + arrSum(Arrays.copyOfRange(arr, 1, arr.length));
    }
}


//        Solution sol = new Solution();
//        int output = sol.arrSum(new int[]{-1, -2, 1, 3});
//        System.out.println(output); // --> 1
