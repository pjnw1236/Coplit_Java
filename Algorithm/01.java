package com.codestates.coplit;
import java.util.*;

public class Solution {
    public int movingStuff(int[] stuff, int limit) {
        Arrays.sort(stuff);
        int cnt = 0;
        int left = 0;
        int right = stuff.length-1;

        while (left < right) {
            if (stuff[left]+stuff[right] <= limit) {
                cnt += 1;
                left += 1;
                right -= 1;
            } 
            else { right -= 1; }
        }

        return stuff.length - cnt;

    }
}
