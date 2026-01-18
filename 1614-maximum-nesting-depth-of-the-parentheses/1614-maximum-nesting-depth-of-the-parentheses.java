class Solution {
    public int maxDepth(String s) {
        int strLength = s.length(), start = 0, maxDepth = 0;
        Stack<Character> st = new Stack<>();
        while(start < strLength){
            char currentChar = s.charAt(start++);
            if(currentChar=='('){
                st.push(currentChar);
            }else if(currentChar==')'){
                maxDepth = Math.max(maxDepth, st.size());
                st.pop();
            }
        }
        return maxDepth;
    }
}