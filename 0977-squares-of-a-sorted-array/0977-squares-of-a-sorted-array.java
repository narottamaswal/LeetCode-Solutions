class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length,l=0, r=n-1,p=r;
        int[] ans = new int[n];
        while(l<=r){
            int dp = nums[l]*nums[l];
            int dd = nums[r]*nums[r];
            if(dp>=dd){  
                ans[p]=dp;
                l++;
            }else{
                ans[p]=dd;
                r--;
            }
            p--;
        }
        return ans;
    }
}
// 16 1 0 9 100

// -5 - 4 - 3 -2
// 