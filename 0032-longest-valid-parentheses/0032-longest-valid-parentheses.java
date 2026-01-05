class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length(), ans = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(c=='('){
                st.push(i);
            }else{
                st.pop();
                if(st.empty()){
                    st.push(i);
                }else{
                    Integer current = i-st.peek();
                    ans = Math.max(current,ans);
                }
            }
        }
        return ans;
    }
}