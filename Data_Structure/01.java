package com.codestates.coplit;
import java.util.*;

public class Solution {

    private ArrayList<Integer> listStack = new ArrayList<Integer>();

    // push : 스택에 데이터 추가
    public void push(Integer data) { listStack.add(data); }

    // pop : 가장 나중에 추가된 데이터를 스택에서 꺼내 반환
    public Integer pop() {
        if(listStack.size() == 0) { return null; }
        else { return listStack.remove(listStack.size() - 1); }
    }

    // size : 스택 삽입되어 있는 데이터의 개수 반환
    public int size() { return listStack.size(); }

    // peek : 가장 나중에 삽입된 데이터 반환
    public Integer peek() {
        if(listStack.size() == 0) { return null; }
        else { return listStack.get(listStack.size() - 1); }
    }

    // show : 스택에 있는 모든 데이터를 String 타입으로 변환하여 반환
    public String show() { return listStack.toString(); }

    // clear : 스택에 있는 데이터 모두 삭제
    public void clear() { listStack.clear(); }
}


//        Solution stack = new Solution();
//        stack.size(); // 0
//        for(int i = 1; i < 10; i++) { stack.push(i); }
//        System.out.println(stack.pop()); // 9
//        System.out.println(stack.pop()); // 8
//        System.out.println(stack.size()); // 7
//        stack.push(8);
//        System.out.println(stack.size()); // 8
//        System.out.println(stack.show()); // [1, 2, 3, 4, 5, 6, 7, 8]
