package com.codestates.coplit;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<String> powerSet(String str) {

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (!list.contains(str.substring(i,i+1))) {
                list.add(str.substring(i, i+1));
            }
        }
        Collections.sort(list);

        ArrayList<String> answer = new ArrayList<>();
        combination(list, answer, 0, "");
        Collections.sort(answer);
        return answer;
    }

    public void combination(ArrayList<String> list, ArrayList<String> answer, int depth, String tmp) {
        if (depth == list.size()) {
            if (!answer.contains(tmp)) {
                answer.add(tmp);
                return;
            } else {
                return;
            }
        }

        for (int i=depth; i<list.size(); i++) {
            combination(list, answer, depth+1, tmp+"");
            combination(list, answer, depth+1, tmp+list.get(depth));
        }
    }

}
