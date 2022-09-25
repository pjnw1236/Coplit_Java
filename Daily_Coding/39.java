package com.codestates.coplit;

import java.util.PriorityQueue;

public class Solution {
    public int[] heapSort(int[] arr) {
        PriorityQueue<Integer> hq = new PriorityQueue<>();

        for (int i=0; i<arr.length; i++) {
            hq.add(arr[i]); 
        }
        
        for (int i=0; i<arr.length; i++) {
            arr[i] = hq.poll(); 
        }
        
        return arr;
    }
}
