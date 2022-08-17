package com.codestates.coplit;

public class Solution {
    public String firstCharacter(String str) {

        if (str.equals("")) { return str; }

        String answer = "";
        String[] strs = str.split(" ");
        for (String element : strs) { answer += element.substring(0, 1); }

        return answer;

    }
}
