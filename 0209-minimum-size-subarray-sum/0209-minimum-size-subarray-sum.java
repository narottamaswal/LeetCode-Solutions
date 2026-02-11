class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int start = 0 ,end=0;
        int sum=0;
        while(end<n){
            sum+=nums[end];
            while(sum>=target){
                sum-=nums[start];
                ans = Math.min(ans,end-start+1);
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}