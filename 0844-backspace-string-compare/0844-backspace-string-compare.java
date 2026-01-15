import java.util.*;
class Solution {
    public String getString(String e){
        Deque<Character> q = new ArrayDeque<>();
        for(char a:e.toCharArray()){
            if(a=='#'){
                if(!q.isEmpty()){
                    q.pop();
                }
            }else{
                q.push(a);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!q.isEmpty()){
            sb.append(q.poll());
        }
        String d= sb.reverse().toString();        
        System.out.println(d);
        return d;
    }
    public boolean backspaceCompare(String s, String t) {
        return getString(s).equalsIgnoreCase(getString(t)); 
    }
}