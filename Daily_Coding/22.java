package com.codestates.coplit;

public class Solution {
    public int[] bubbleSort(int[] arr) {
        int tmp = 0;
        int swap_cnt = 0;

        for (int i=0; i<arr.length-1; i++) {
            swap_cnt = 0;
            for (int j=0; j<arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    swap_cnt += 1;
                }
            }
            if (swap_cnt == 0) {
                break;
            }
        }
        return arr;
    }
}
