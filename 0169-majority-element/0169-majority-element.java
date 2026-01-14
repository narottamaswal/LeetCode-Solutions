class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0, cand=0;
        for(int a:nums){
            if(count==0){
                cand=a;
            }
            if(cand==a){
                count++;
            }else{
                count--;
            }
        }
        return cand;
    }
}