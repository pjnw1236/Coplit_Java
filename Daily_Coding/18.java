package com.codestates.coplit;

public class Solution {
    public int numberSearch(String str) {
        int denominator = 0;
        int numerator = 0;

        if (str == null) {
            return 0;
        }

        for (int i=0; i<str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                denominator += str.charAt(i) - '0';
            } else if (str.charAt(i) != ' ') {
                numerator += 1;
            }
        }
        return Math.round(denominator / (float) numerator);
    }
}
