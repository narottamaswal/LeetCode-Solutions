class Solution {
    public int scoreOfParentheses(String s) {
        int n=s.length(),cnt=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                cnt++;
            }else{
                if(s.charAt(i-1)=='('){
                    st.push(cnt);
                }                
                cnt--;
            }
        }
        int ans=0;
        while(!st.isEmpty()){
            ans=ans+(int)Math.pow(2,st.pop()-1);
        }
        return ans;

    }
}