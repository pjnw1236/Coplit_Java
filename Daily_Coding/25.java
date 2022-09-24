package com.codestates.coplit;

public class Solution {
    public long power(int base, int exponent) {
        Long answer = 1L;
        for (int i=0; i<exponent; i++) {
            answer = (answer * base) % 94906249;
        }
        return answer;
    }
}
