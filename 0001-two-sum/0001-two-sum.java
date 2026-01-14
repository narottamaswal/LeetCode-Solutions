class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            mp.putIfAbsent(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int k = Math.abs(nums[i]-target);
            if(mp.containsKey(k) && mp.get(k)!=i){
                ans[0]=mp.get(k);
                ans[1]=i;
                return ans;
            }
        }
        return ans;
    }
}