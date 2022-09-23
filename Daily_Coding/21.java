package com.codestates.coplit;
import java.util.*;

// 양수는 3개이상 음수는 2개이상이라 가정
public class Solution {
    public int largestProductOfThree(int[] arr) {
        Arrays.sort(arr);
        int arrLength = arr.length;
        
        int candidate1 = arr[arrLength - 1] * arr[arrLength - 2] * arr[arrLength - 3];
        int candidate2 = arr[arrLength - 1] * arr[0] * arr[1];
        
        return Math.max(candidate1, candidate2);
    }
}
