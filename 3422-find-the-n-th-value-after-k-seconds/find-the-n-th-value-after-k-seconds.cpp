class Solution {
public:
    int valueAfterKSeconds(int n, int k) {
        vector<int> dp(n+1,0);
        const unsigned M=1000000007;
        dp[0]=1;
        while(k>=0){
            int ans=0;
            for(int i=1;i<n;i++){
                dp[i]=((dp[i]%M)+(dp[i-1]%M))%M;
            }
            k--;
        }
        return dp[n-1];
    }
};

