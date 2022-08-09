package com.codestates.coplit; 

public class Solution {
    public int factorial(int num){
        if (num == 0) { return 1; }
        return num*factorial(num-1);
    }
}


//        Solution sol = new Solution();
//        int output = sol.factorial(10);
//        System.out.println(output); // --> 3628800
