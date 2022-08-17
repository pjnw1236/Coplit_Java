package com.codestates.coplit;

public class Solution {
    public int computeWhenDouble(double interestRate) {

        int years = 1;
        double result = 1 + interestRate/100 ;

        while (true) {
            if (result >=2) { return years; }
            result *= (1+interestRate/100);
            years += 1;
        }

    }
}
