package com.codestates.coplit;

public class Solution {
    public int rotatedArraySearch(int[] rotated, int target) {
        for (int i=0; i<rotated.length; i++) {
            if (rotated[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
