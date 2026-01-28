class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length(), depth = 0;
        int[] ans = new int[n];
        int i=0;
        for(char c:seq.toCharArray()){
            if(c=='('){
                ans[i]=depth%2;
                depth++;
            }else{
                depth--;
                ans[i]=depth%2;
            }
            i++;
        }
        return ans;
    }
}