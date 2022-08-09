package com.codestates.coplit;
import java.util.*;

public class Solution {
    public int[] reverseArr(int[] arr){
        if (arr.length == 0) { return arr; }
        
        int[] head = Arrays.copyOfRange(arr, arr.length - 1, arr.length);
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length - 1));
        int[] result = new int[head.length + tail.length];

        System.arraycopy(head, 0, result, 0, head.length);
        System.arraycopy(tail, 0, result, head.length, tail.length);

        return result;

    }
}


//        Solution sol = new Solution();
//        int[] output = sol.reverseArr(new int[]{1, 2, 3});
//        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]
