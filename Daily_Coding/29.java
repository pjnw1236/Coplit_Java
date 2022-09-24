package com.codestates.coplit;
import java.util.*;

public class Solution {
    public int tiling(int num) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2));
        if (num <= 2) {
            return num;
        }
        for (int i=0; i<num-2; i++) {
            list.add(list.get(i) + list.get(i+1)); 
        }
        
        return list.get(list.size()-1);
    }
}
