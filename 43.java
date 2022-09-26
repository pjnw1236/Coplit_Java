package com.codestates.coplit;

public class Solution {
    public String spiralTraversal(Character[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;

        int[][] d = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        int i = 0;
        int x = 0, y = -1;
        int idx = 0;
        int nx, ny;

        String answer = "";

        while (i < M*N) {
            nx = x + d[idx][0];
            ny = y + d[idx][1];
            if (isValid(nx, ny, M, N) && isNotNull(matrix, nx, ny)) {
                x = nx;
                y = ny;
                answer += matrix[x][y];
                matrix[x][y] = null;
                i += 1;
            } else {
                idx = (idx+1)%4;
            }
        }
        return answer;
    }

    public boolean isValid(int nx, int ny, int M, int N) {
        return (nx >= 0 && nx < M && ny >= 0 && ny < N);
    }

    public boolean isNotNull(Character[][] matrix, int nx, int ny) {
        return  !(matrix[nx][ny] == null);
    }


}
