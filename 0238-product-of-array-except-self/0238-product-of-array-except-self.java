class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int product = 1;
        int isZeroPresent=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                product*=nums[i];
            }else{
                isZeroPresent++;
            }
        }
        if(isZeroPresent>0){
            for(int i=0;i<n;i++){
                ans[i]=nums[i]==0 ? product :0;
            }
            return ans;
        }
        for(int i=0;i<n;i++){
            ans[i]=product/nums[i];
        }
        return ans;
    }
}