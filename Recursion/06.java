package com.codestates.coplit;
import java.util.*;

public class Solution {
    public int arrProduct(int[] arr){
        if (arr.length == 0) { return 1; }
        return arr[0] * arrProduct(Arrays.copyOfRange(arr, 1, arr.length));
    }
}


//        Solution sol = new Solution();
//        int output = sol.arrProduct(new int[]{1, -2, 1, 3});
//        System.out.println(output); // --> -6
