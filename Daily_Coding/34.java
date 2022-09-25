package com.codestates.coplit;

public class Solution {
    public int[][] rotateMatrix(int[][] matrix, int K) {
        if (matrix == null) { return null; }
        K%=4;
        int N = matrix.length;
        int M = matrix[0].length;

        if (K==0) {
            return matrix;
        } else if (K==1) {
            int[][] answer = new int[M][N];
            for (int i=0; i<N; i++) {
                for (int j=0; j<M; j++) {
                    answer[j][N-1-i] = matrix[i][j];
                }
            }
            return answer;
        } else if (K==2) {
            int[][] answer = new int[N][M];
            for (int i=0; i<N; i++) {
                for (int j=0; j<M; j++) {
                    answer[N-1-i][M-1-j] = matrix[i][j];
                }
            }
            return answer;
        } else {
            int[][] answer = new int[M][N];
            for (int i=0; i<N; i++) {
                for (int j=0; j<M; j++) {
                    answer[M-1-j][i] = matrix[i][j];
                }
            }
            return answer;
        }
    }
}
