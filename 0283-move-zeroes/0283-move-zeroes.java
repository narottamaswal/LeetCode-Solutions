class Solution {
    public void moveZeroes(int[] nums) {
        int z = 0, i=0,j=0,n = nums.length;
        for(int a:nums){
            if(a==0){
                z++;
            }else{
                nums[j++]=a;
            }
        }
        Arrays.fill(nums,n-z,n,0);
    }
}