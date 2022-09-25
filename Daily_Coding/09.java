package com.codestates.coplit;

public class Solution {
    public boolean ABCheck(String str) {
        str = str.toLowerCase();
        System.out.println("str = " + str);
        String pattern01 = ".*a...b.*";
        String pattern02 = ".*b...a.*";

        if (str.matches(pattern01) || str.matches(pattern02)) {
            return true;
        }
        return false;
    }
}
