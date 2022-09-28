package com.codestates.coplit;

public class Solution {
    public int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        int mid;

        while (left <= right) {
            mid = (left+right)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }
}