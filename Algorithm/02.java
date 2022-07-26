package com.codestates.coplit;

public class Solution {
    public int partTimeJob(int k) {
	    
        int[] coins = new int[]{500, 100, 50, 10, 5, 1};
        int cnt = 0;
        for (int coin : coins) {
            if (k == 0) { break; }
            cnt += k/coin;
            k %= coin;
        }

        return cnt;

    }
}
