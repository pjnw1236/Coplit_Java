package com.codestates.coplit;
import java.util.*;

public class Solution {
    public boolean and(boolean[] arr){
        if (arr.length == 0) { return true; }
        if (arr[0]) {
            return and(Arrays.copyOfRange(arr, 1, arr.length));
        } else {
            return false;
        }
    }
}


//        Solution sol = new Solution();
//        boolean output = sol.and(new boolean[]{true, true, false});
//        System.out.println(output); // --> false
