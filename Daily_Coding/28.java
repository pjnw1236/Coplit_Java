package com.codestates.coplit;
import java.util.*;

public class Solution {
    public boolean balancedBrackets(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<str.length(); i++) {
            if ((str.charAt(i) == '(') || (str.charAt(i) == '{') || (str.charAt(i) == '[')) {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                if ((stack.size() > 0) && (stack.peek() == '(')) {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (str.charAt(i) == '}') {
                if ((stack.size() > 0) && (stack.peek() == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (str.charAt(i) == ']') {
                if ((stack.size() > 0) && (stack.peek() == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
