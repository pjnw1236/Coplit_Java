package com.codestates.coplit;
import java.util.*;

public class Solution {
    public Integer boardGame(int[][] board, String operation) {

        int N = board.length;
        int answer = 0;  // (0, 0)은 항상 0임

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('U', 0);
        map.put('D', 1);
        map.put('L', 2);
        map.put('R', 3);

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        int x = 0;
        int y = 0;

        int nx;
        int ny;

        for (int i=0; i<operation.length(); i++) {
            nx = x + dx[map.get(operation.charAt(i))];
            ny = y + dy[map.get(operation.charAt(i))];
            if ((0 <= nx && nx < N) && (0 <= ny && ny < N)) {
                x = nx;
                y = ny;
                answer += board[x][y];
            }
            else { return null; }
        }

        return answer;

    }
}
