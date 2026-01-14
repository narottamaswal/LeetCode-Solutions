class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> se = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(se.contains(nums[i])){
                return true;
            }
            se.add(nums[i]);
        }
        return false;
    }
}