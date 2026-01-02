class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int i=0,j=nums.length-1;
        int p=0;
        while(p<nums.length){
            if(nums[p]%2==0){
                ans[i]=nums[p];
                i++;
            }else{
                ans[j]=nums[p];
                j--;
            }
            p++;
        }
        return ans;
    }
}