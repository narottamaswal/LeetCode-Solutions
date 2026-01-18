class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0, strLength = s.length(), start =0, bracket=0;
        while(start<strLength){
            char currentChar = s.charAt(start++);
            if(currentChar=='('){
                bracket++;
            }else if(currentChar==')'){
                bracket--;
            }
            maxDepth = Math.max(maxDepth,bracket);
        }
        return maxDepth;
    }
}