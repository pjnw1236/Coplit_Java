package com.codestates.coplit;
import java.util.*;

public class Solution {
    public int paveBox(Integer[] boxes) {

        Queue<Integer> q = new LinkedList<>();
        for (Integer box : boxes) { q.add(box); }
        int result = 0;

        int check = q.peek();
        int cnt = 0;

        while (!q.isEmpty()) {
            if (check >= q.peek()) { cnt += 1; q.poll(); }
            else { result = max(result, cnt); check = q.poll(); cnt = 1; }
        }

        result = max(result, cnt); 
        return result;

    }

    public int max (int a, int b) {
        if (a >= b) { return a; }
        else { return b; }
    }
}

