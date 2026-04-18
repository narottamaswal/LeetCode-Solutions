class Solution {
public:
    int rob(vector<int>& nums) {
        if(nums.size()==1)return nums[0];
        else if(nums.size()==2)return max(nums[0],nums[1]);
        vector<int> dp(105,-1);
        int n = nums.size();
        dp[n - 1] = nums[n - 1];
        dp[n] = 0;  
        for (int i = n - 2; i >= 0; i--) {
            dp[i] = max(nums[i] + dp[i + 2], nums[i] + dp[i + 3]);
        }
        return max(dp[0], dp[1]);
    }
};