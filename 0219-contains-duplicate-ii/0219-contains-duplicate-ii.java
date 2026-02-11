class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // sliding window
        int n = nums.length;
        int start = 0, end=0;
        Map<Integer,Integer> mp = new HashMap<>();
        while(end<n){
            mp.put(nums[end],mp.getOrDefault(nums[end],0)+1);
            if(mp.getOrDefault(nums[end],0)>1){
                return true;
            }
            if(end-start>=k){
                mp.put(nums[start],mp.getOrDefault(nums[start],0)-1);
                start++;
            }
            end++;
        }
        return false;
    }
}