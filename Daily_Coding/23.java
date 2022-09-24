package com.codestates.coplit;
import java.util.*;

public class Solution {
    public int fibonacci(int num) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(0, 1));
        return dp(nums, num);
    }

    public int dp(ArrayList<Integer> nums, int num) {
        if (nums.size() <= num) {
            nums.add(dp(nums, num - 1) + dp(nums, num - 2));
        }
        return nums.get(num);
    }
}
