class Solution {
    public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
        int ans=0,start = 0, end =0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            return Integer.compare(b[0], a[0]);
        });
        long cost = 0;
        while(end<chargeTimes.length){
            cost+=runningCosts[end];
            pq.offer(new int[]{chargeTimes[end],end});
            if(pq.peek()[0]+((end-start+1) * cost)<=budget){
                ans = Math.max(ans,end-start+1);
            }else{
                while(!pq.isEmpty() && pq.peek()[0]+((end-start+1) * cost)>budget){
                    cost-=runningCosts[start];
                    while(!pq.isEmpty() && pq.peek()[1]<=start){
                        pq.poll();
                    }
                    start++;
                }
                if(!pq.isEmpty() && pq.peek()[0]+((end-start+1) * cost) <=budget){
                    ans = Math.max(ans,end-start+1);
                }
            }
            end++;
        }
        return ans;
    }
}