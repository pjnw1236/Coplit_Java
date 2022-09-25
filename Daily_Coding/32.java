package com.codestates.coplit;

import java.util.Arrays;

public class Solution {
    public int orderOfPresentation(int N, int[] K) {
        int answer = 0;
        boolean[] visited = new boolean[N+1];

        int tmp;

        for (int i=0; i<K.length; i++) {
            int num = K[i];
            visited[num] = true;
            boolean[] candidates = Arrays.copyOfRange(visited, 1, num);
            tmp = 0;
            for (boolean candidate : candidates) {
                if (!candidate) {
                    tmp += 1;
                }
            }
            answer += tmp * factorial(N-i-1);
        }

        return answer;
    }


    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

}
