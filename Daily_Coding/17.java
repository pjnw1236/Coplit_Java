package com.codestates.coplit;

public class Solution {
    public String computeSquareRoot(int num) {
        float root = (float) Math.pow(num, 0.5);
        String result = String.format("%.2f", root);
        return result;
    }
}
