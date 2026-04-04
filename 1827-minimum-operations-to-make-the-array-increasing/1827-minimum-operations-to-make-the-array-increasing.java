class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ans =0,lastVal=0;

        // 5 4 3 1
        for(int i=0;i<n-1;i++){
            if(nums[i]>=nums[i+1]){
                int temp = nums[i+1];
                nums[i+1]=nums[i]+1;
                ans= ans + (nums[i+1]-temp);
            }
        }
        return ans;
    }
}
// 4+4+3+7