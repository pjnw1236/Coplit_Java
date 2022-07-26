package com.codestates.coplit;

public class Solution {
    public String letterCapitalize(String str) {
        if (str.equals("")) { return str; }
        if (str.replace(" ", "").equals("")) { return ""; }

        String answer ="";
        Character prev = ' ';

        for (int i=0; i<str.length(); i++) {
            if (prev.equals(' ')) {
                answer += Character.toUpperCase(str.charAt(i));
                prev = str.charAt(i);
            } else {
                answer += str.charAt(i);
                prev = str.charAt(i);
            }
        }

        return answer;

    }
}
