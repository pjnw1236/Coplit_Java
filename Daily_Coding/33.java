package com.codestates.coplit;

public class Solution {
    public int robotPath(int[][] room, int[] src, int[] dst) {
        int M = room.length;
        int N = room[0].length;
        room = bfs(room, src, M, N, 0);
        return room[dst[0]][dst[1]]/2;
    }

    public int[][] bfs(int[][] room, int[] src, int M, int N, int num) {
        int row = src[0];
        int col = src[1];

        if (row < 0 || row >= M || col < 0 || col >= N) {
            return room;
        }
        if (room[row][col] == 0 || room[row][col] > num) {
            room[row][col] = num;
        } else {
            return room;
        }

        bfs(room, new int[]{row+1, col}, M, N, num+2);
        bfs(room, new int[]{row-1, col}, M, N, num+2);
        bfs(room, new int[]{row, col+1}, M, N, num+2);
        bfs(room, new int[]{row, col-1}, M, N, num+2);

        return room;
    }
}
