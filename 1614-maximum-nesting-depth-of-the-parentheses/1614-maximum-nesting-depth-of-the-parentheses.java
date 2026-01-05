class Solution {
    public int maxDepth(String s) {
        int n = s.length(),i=0,o=0, ans =0;
        while(i<n){
            char cc = s.charAt(i++);
            if(cc=='('){
                o++;
            }else if(cc==')'){
                o--;
            }
            ans = Math.max(o,ans);
        }
        return ans;
    }
}