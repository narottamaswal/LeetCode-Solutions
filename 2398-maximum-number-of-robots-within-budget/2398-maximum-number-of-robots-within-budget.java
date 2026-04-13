record Pair(int chargeTime,int index){};
class Solution {
    public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
        int n = chargeTimes.length;
        int ans=0;
        int start = 0, end =0;
        int[] prefixCost = new int[n];
        prefixCost[0]=runningCosts[0];
        for(int i=1;i<n;i++){
            prefixCost[i]=prefixCost[i-1]+runningCosts[i];
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            return Integer.compare(b[0], a[0]);
        });
        while(end<n){
            pq.offer(new int[]{chargeTimes[end],end});
            int window = end-start+1;
            int cost = pq.peek()[0]+(window * prefixCost[end]);
            if(cost<=budget){
                ans = Math.max(ans,window);
            }else{
                while(!pq.isEmpty() && start>pq.peek()[1]){
                    pq.remove(nums[start]);
                    window = end-start+1;
                    cost = pq.peek()[0]+(window * (prefixCost[end]-prefix[start]));
                    if(cost<=budget){
                        ans = Math.max(ans,window);
                    }
                    start++;
                }
            }
            end++;
        }
        return ans;
    }
}