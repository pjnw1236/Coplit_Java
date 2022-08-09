package com.codestates.coplit;
import java.util.*;

public class Solution {
    public int arrLength(int[] arr){
        if (arr.length == 0) { return 0; }
        return 1 + arrLength(Arrays.copyOfRange(arr, 1, arr.length));
    }
}


//        Solution sol = new Solution();
//        int output = sol.arrLength(new int[]{1, -2, 1, 3});
//        System.out.println(output); // --> 4
