class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length(),i=0;
        if(n%2!=0) return false;
        Stack<Integer> st = new Stack<>();
        Stack<Integer> lc = new Stack<>();
        while(i<n){
            char sc = s.charAt(i), l = locked.charAt(i);
            if(l=='0'){
                lc.push(i);
            }else if(sc=='('){
                st.push(i);
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }else if(!lc.isEmpty()){
                    lc.pop();
                }else{
                    return false;
                }
            }
            i++;
        }
        while(!st.isEmpty() && !lc.isEmpty() && st.peek()<lc.peek()){
            st.pop();
            lc.pop();
        }
        return st.isEmpty();
    }
}