package com.codestates.coplit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public boolean isSubsetOf(int[] base, int[] sample) {
        List<Integer> list = Arrays.stream(base).boxed().collect(Collectors.toList());
        for (int num : sample) {
            if (!list.contains(num)) {
                return false;
            }
        }
        return true;
    }
}
