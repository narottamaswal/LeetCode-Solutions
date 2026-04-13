class Solution {
    // 5 8
    private boolean isPossible(int[] candies,long k,int curr){
        long c=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>=curr){
                c = c+candies[i]/curr;
            }
        }
        return c>=k;
    }
    public int maximumCandies(int[] candies, long k) {
        int start = 1;
        int end = Arrays.stream(candies).max().getAsInt();
        int mid = 0,ans=0;
        while(start<=end){
            mid = start+(end-start)/2;
            System.out.println(mid);
            if(isPossible(candies,k,mid)){
                ans = mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
}
// 8 8 8 