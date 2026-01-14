class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length*2];
        int i=0,j=length;
        while(i<length && j<length*2){
            ans[i]=nums[i];
            ans[j]=nums[i];
            i++;
            j++;
        }
        return ans;
    }
}