class Solution {
    private boolean isValid(String x){
        if(x.charAt(0)=='0') return false;
        int n = Integer.parseInt(x);
        return n>=1 && n<=26;
    }
    private int dfs(int i, String s, int[] dp){
        if(i>=s.length()){
            return 1;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        if(s.charAt(i)=='0')return 0;
        int oneStep =dfs(i+1,s,dp), twoStep=0;
        if(i<s.length()-1 && isValid(s.substring(i,i+2))){
            twoStep=dfs(i+2,s,dp);
        }
        return dp[i]=oneStep+twoStep;

    }
    public int numDecodings(String s) {
        if(s.isEmpty() || s.charAt(0)=='0') return 0;
        int n = s.length();
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return dfs(0,s,dp); 
        //return dfs(0,)   
    }
}