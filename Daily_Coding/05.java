package com.codestates.coplit;

public class Solution {
    public String firstReverse(String str) {

        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();

    }
}
