class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int currentMaxSum=nums[0], largestSum=nums[0];
        for(int i=1;i<nums.size();i++){
            currentMaxSum = max(nums[i], currentMaxSum+nums[i] );
            largestSum = max(largestSum,currentMaxSum);
        }
        return largestSum;
    }
};