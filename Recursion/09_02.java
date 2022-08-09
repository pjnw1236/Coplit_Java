package com.codestates.coplit;
import java.util.*;

public class Solution {
    public int[] take(int num, int[] arr){
        if (num == 0) { return new int[0]; }
        if (num >= arr.length) { return arr; }

        int[] head = Arrays.copyOfRange(arr, 0, 1);
        int[] tail = take(num - 1, Arrays.copyOfRange(arr, 1, arr.length));
        int[] result = new int[head.length + tail.length];
        System.arraycopy(head, 0, result, 0, head.length);
        System.arraycopy(tail, 0, result, head.length, tail.length);
      
        return result;
    }
}
