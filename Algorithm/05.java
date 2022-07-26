package com.codestates.coplit;
import java.util.*;

public class Solution {
    public ArrayList<String[]> rockPaperScissors(int rounds) {
        String[] RPS = {"rock", "paper", "scissors"};
        ArrayList<String[]> total_result = new ArrayList<>();
        ArrayList<String> answer = new ArrayList<>();
        return combination(total_result, answer, RPS, rounds);
    }

    public ArrayList<String[]> combination( ArrayList<String[]> total_result, ArrayList<String> answer, String[] RPS, int rounds) {
        if (answer.size() == rounds) {
            String[] temp = new String[rounds];
            temp = answer.toArray(temp);
            total_result.add(temp);
            return new ArrayList<String[]>();
        }
        for (int i=0; i<RPS.length; i++) {
            answer.add(RPS[i]);
            combination(total_result, answer, RPS, rounds);
            answer.remove(answer.size()-1);
        }
        return total_result;
    }

}
