class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> mp =new HashMap<>();
        for(Integer num:nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> ele:mp.entrySet()){
            if(Math.floor(nums.length/2) < ele.getValue()){
                return ele.getKey();
            }
        }
        return 0;
    }
}