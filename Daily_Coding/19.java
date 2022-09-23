package com.codestates.coplit;

public class Solution {
    public String decryptCaesarCipher(String str, int secret) {
        String answer = "";
        for (char ch : str.toCharArray()) {
            if (ch == ' ') {
                answer += ch;
            } else {
                int check = (ch - secret - 'a') % 26;
                if (check < 0) {
                    check += 26;
                }
                answer += (char) (check + 'a');
            }
        }
        return answer;
    }
}
