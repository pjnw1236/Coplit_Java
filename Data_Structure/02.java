package com.codestates.coplit;
import java.util.*;

public class Solution {

    private ArrayList<Integer> listQueue = new ArrayList<Integer>();

    public void add(Integer data) { listQueue.add(data); }  // 데이터 추가
    public Integer poll() {  // 선입선출 방식으로 데이터 꺼내어 반환
        if(listQueue.size() == 0) { return null; }
        else { return listQueue.remove(0); }
    }
    public int size() { return listQueue.size(); }  // 큐의 크기 반환
    public Integer peek() {  // 가장 앞에 있는 원소 반환
        if(listQueue.size() == 0) { return null; }
        else { return listQueue.get(0); }
    }
    public String show() { return listQueue.toString(); }  // toString 메서드를 이용해 반환
    public void clear() { listQueue.clear(); }  // 큐 초기화
}
