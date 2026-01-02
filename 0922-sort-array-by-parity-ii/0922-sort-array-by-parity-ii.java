class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int length = nums.length;
        int e=0, o=1, c=0;
        int[] ans= new int[length];
        while(c<length){
            if(nums[c]%2==0){
                ans[e]=nums[c];
                e+=2;
            }else{
                ans[o]=nums[c];
                o+=2;
            }
            c++;
        }
        return ans;
    }
}