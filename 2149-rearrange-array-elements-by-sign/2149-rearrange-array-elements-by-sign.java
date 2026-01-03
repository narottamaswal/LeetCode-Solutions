class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l = nums.length;
        int even = 0, odd = 1;
        int[] ans = new int[l];
        int i=0;
        while(i<l){
            if(nums[i]>0){
                ans[even]=nums[i];
                even+=2;
            }else{
                ans[odd]=nums[i];
                odd+=2;
            }
            i++;
        }
        return ans;
    }
}