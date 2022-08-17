package com.codestates.coplit;
import java.util.*;

public class Solution {
    private String value;
    private ArrayList<Solution> children;

    //전달인자가 없을 경우의 생성자
    public Solution() {	 
        this.value = null;
        this.children = null;
    }
    
    //전달인자가 존재할 경우의 생성자
    public Solution(String data) {	
        this.value = data;
        this.children = null;
    }

    // setter와 getter
    public void setValue(String data) { this.value = data; }
    public String getValue() { return value; }
    
    // node를 tree에 추가
    public void addChildNode(Solution node) {
        if(children == null) children = new ArrayList<>();
        children.add(node);
    }
    
    // node를 tree에서 삭제
    public void removeChildNode(Solution node) { if(children != null) children.remove(node); }

    // tree에 존재하는 자손 반환
    public ArrayList<Solution> getChildrenNode() { return children; }

    // 재귀를 사용하여 tree에서 value 찾기
    public boolean contains(String data) {  
        if(value.equals(data)) return true;
        if(children != null) {
            for(int i = 0; i < children.size(); i++) { return children.get(i).contains(data); }
        }
        return false;
    }
}
