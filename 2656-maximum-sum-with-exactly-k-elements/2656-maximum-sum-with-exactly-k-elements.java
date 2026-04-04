class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;
        int i=nums.length-1;
        while(k-- > 0 ){
            int element = nums[i];
            ans+=element;
            nums[i]=element+1;
        }
        return ans;
    }
}