package com.codestates.coplit;

public class Solution {
    public String compressString(String str) {
        if (str.length() == 0) {
            return "";
        }

        String answer = "";
        int cnt = 1;
        char ch = str.charAt(0);

        str += " ";

        for (int i=1; i<str.length(); i++) {
            if (str.charAt(i) == ch) {
                cnt += 1;
            } else {
                if (cnt >= 3) {
                    answer += "" + cnt + ch;
                } else {
                    for (int j=0; j<cnt; j++) {
                        answer += ch;
                    }
                }
                cnt = 1;
                ch = str.charAt(i);
            }
        }
        return answer;

    }
}
