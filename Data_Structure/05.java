package com.codestates.coplit; 
import java.util.*;

public class Solution { 
	public int queuePrinter(int bufferSize, int capacities, int[] documents) {
    
    Queue<Integer> q = new LinkedList<>();
    for (int doc : documents) { q.add(doc); }
    int[] arr = new int[bufferSize];

    int time = 1;
    arr[0] = q.poll();

    while (!q.isEmpty()) {
      time += 1;
      for (int i=bufferSize-2; i>=0; i--) {
      arr[i+1] = arr[i];
      }
            
      arr[0] = 0;
      if ((q.peek() + Arrays.stream(arr).sum()) <= capacities) {
        arr[0] = q.poll();
        }
    }
    
    return time + bufferSize;

	} 
}
