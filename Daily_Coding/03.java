package com.codestates.coplit;

public class Solution {
    public boolean powerOfTwo(long num) {
        long R = 1;
        
        while (true) {
            if (R == num) { return true; } 
            else if (R > num) { return false; }
            R *= 2;
        }
        
    }
}
