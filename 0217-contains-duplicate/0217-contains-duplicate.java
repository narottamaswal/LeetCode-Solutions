class Solution {
    public boolean containsDuplicate(int[] nums) {
        int length = nums.length;
        HashSet<Integer> se = new HashSet<>();
        for(int i=0;i<length;i++){
            se.add(nums[i]);
        }
        return se.size()!=length;
    }
}