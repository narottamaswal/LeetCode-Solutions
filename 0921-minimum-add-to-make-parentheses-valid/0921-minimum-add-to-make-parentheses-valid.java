class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int i=0,ans=0;
        Stack<Character> st = new Stack<>();
        while(i<n){
            char cc = s.charAt(i++);
            if(cc=='('){
                st.push(cc);
            }else{
                if(st.isEmpty()){
                    ans++; 
                }else{
                    st.pop();
                }
            }   
        }
        return st.size()+ans;
    }
}
// (()((