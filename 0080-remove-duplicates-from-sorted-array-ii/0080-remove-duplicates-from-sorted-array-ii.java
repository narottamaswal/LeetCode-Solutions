class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length, j=1;
        if(n<3) return n;
        for(int i=1; i<n-1; i++){
            if(!(nums[i] == nums[i-1] && nums[i]==nums[i+1])){                
                nums[j] = nums[i];
                j++;
            }
        }
        nums[j] = nums[n-1];
        return j+1;
    }
}