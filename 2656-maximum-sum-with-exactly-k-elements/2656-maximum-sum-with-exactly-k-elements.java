class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        int ans = 0;
        int i=nums.length-1;
        while(k-- > 0 ){
            int element = max;
            ans+=element;
            max++;
        }
        return ans;
    }
}