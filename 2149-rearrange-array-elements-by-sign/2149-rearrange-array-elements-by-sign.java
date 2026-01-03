class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l = nums.length, even = 0, odd = 1, i =0;
        int[] ans = new int[l];
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