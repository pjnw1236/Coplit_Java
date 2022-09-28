package com.codestates.coplit;

public class Solution {
    public int LSCS(int[] arr) {
        int tmp = 0;
        int answer = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            tmp = tmp + arr[i];
            if(tmp > answer) { answer = tmp; }
            if (tmp < 0) { tmp = 0; }
        }
        
        return answer;
    }
}
