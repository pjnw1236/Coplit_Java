package com.codestates.coplit;
import java.util.*;

public class Solution {
    public ArrayList<Stack> browserStack(String[] actions, String start) {
        Stack<String> prevStack = new Stack<>();
        Stack<String> nextStack = new Stack<>();
        Stack<String> current = new Stack<>();
        ArrayList<Stack> result = new ArrayList<>();

        current.push(start);

        for (String act : actions) {
            // -1인 경우 : 뒤로 가기 버튼
            if (act.equals("-1") && (!(prevStack.isEmpty()))) {
                nextStack.push(current.pop());
                current.push(prevStack.pop());
            }

            // 1인 경우 : 앞으로 가기 버튼
            else if (act.equals("1") && (!(nextStack.isEmpty()))) {
                prevStack.push(current.pop());
                current.push(nextStack.pop());
            }

            // 영어 대문자인 경우
            else if (('A' <= act.charAt(0)) && (act.charAt(0) <= 'Z')) {
                prevStack.push(current.pop());
                current.push(act);
                nextStack.clear();
            }
        }

        result.add(prevStack);
        result.add(current);
        result.add(nextStack);

        return result;

    }
}
