class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n =nums.length;
        int l =0, r=n-1;
        int[] ans = new int[n];
        for(int i=0,j=n-1;i<n;i++,j-- ){
            if(nums[i]<pivot){
                ans[l++]=nums[i];
            }
            if(nums[j]>pivot){
                ans[r--]=nums[j];
            }
        }
        while(l<=r){
            ans[l++]=pivot;
        }
        return ans;
    }
}