package com.codestates.coplit; 

public class Solution {
    public int sumTo(int num){
        if (num == 0) { return 0; }
        return num+sumTo(num-1);
    }
}


//        Solution sol = new Solution();
//        int output = sol.sumTo(10);
//        System.out.println(output); // --> 55
