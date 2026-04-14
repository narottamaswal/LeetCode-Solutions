class Solution {
    private int ans=0;
    private void dfs(int[] nums, int i, int target, int sum){
        if(i==nums.length){
            if(target==sum){
                ans++;
            }
            return;
        }
        dfs(nums,i+1,target,sum+nums[i]);
        dfs(nums,i+1,target,sum-nums[i]);
    }
    public int findTargetSumWays(int[] nums, int target) {
        dfs(nums,0,target,0);
        return ans;
    }
}