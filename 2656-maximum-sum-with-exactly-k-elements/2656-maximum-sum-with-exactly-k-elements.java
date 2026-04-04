class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt(), ans = 0;
        while(k-- > 0 ){
            int element = max;
            ans+=element;
            max++;
        }
        return ans;
    }
}