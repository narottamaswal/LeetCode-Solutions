class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length,start=0,end=0;
        double sum=0.0,avg=-Double.MAX_VALUE;
        while(end<n){
            sum+=nums[end];
            if(n==1) return sum;
            if(end-start+1==k){
                avg = Math.max(avg,(sum/k));
                sum-=nums[start];
                start++;
            }
            end++;
        }
        return avg;
    }
}