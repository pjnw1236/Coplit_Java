package com.codestates.coplit;

public class Solution {
    public int[] insertionSort(int[] arr) {
        for (int idx = 1; idx < arr.length; idx++) {
            int target = idx;
            while (target > 0 && arr[target - 1] > arr[target]) {
                int temp = arr[target - 1];
                arr[target - 1] = arr[target];
                arr[target] = temp;
                target -= 1;
            }
        }

        return arr;
    }
}
