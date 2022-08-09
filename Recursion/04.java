package com.codestates.coplit;

public class Solution {
    public int fibonacci(int num){
        if (num<=1) { return num; }
        return fibonacci(num-1) + fibonacci(num-2);
    }
}


//        Solution sol = new Solution();
//        int output = sol.fibonacci(9);
//        System.out.println(output); // ->> 34
