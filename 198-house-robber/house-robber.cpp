class Solution {
public:
    int moneyRobbed(vector<int> &dp,int n,vector<int> & nums,int currentIndex){
        if(currentIndex>n-1){
            return 0;
        }
        if(dp[currentIndex]!=-1){
            return dp[currentIndex];
        }
       dp[currentIndex]=max(
            nums[currentIndex]+moneyRobbed(dp,n,nums,currentIndex+2),
            nums[currentIndex]+moneyRobbed(dp,n,nums,currentIndex+3)
        );
        return dp[currentIndex];
    }
    int rob(vector<int>& nums) {
        if(nums.size()==1)return nums[0];
        else if(nums.size()==2)return max(nums[0],nums[1]);
        vector<int> dp(105,-1);
        int finalans=0;
         return max(
             moneyRobbed(dp,nums.size(),nums,0),
             moneyRobbed(dp,nums.size(),nums,1)
         );
    }
};