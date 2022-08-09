package com.codestates.coplit;
import java.util.*;

public class Solution {
    public boolean or(boolean[] arr){
        if (arr.length == 0) { return false; }
        if (!arr[0]) {
            return or(Arrays.copyOfRange(arr, 1, arr.length));
        } else {
            return true;
        }
    }
}


//        Solution sol = new Solution();
//        boolean output = sol.or(new boolean[]{true, true, false});
//        System.out.println(output); // --> true
