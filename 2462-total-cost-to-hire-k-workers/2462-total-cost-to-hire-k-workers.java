class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int i=0, j = costs.length-1;
        Queue<Integer> pq1 = new PriorityQueue<>();
        Queue<Integer> pq2 = new PriorityQueue<>();
        long cost = 0;
        while(k-- >0){
            while(pq1.size() < candidates && i<=j){
                pq1.offer(costs[i++]);
            }
            while(pq2.size() < candidates && i<=j){
                pq2.offer(costs[j--]);
            }
            int first = !pq1.isEmpty() ? pq1.peek() : Integer.MAX_VALUE;
            int second = !pq2.isEmpty() ? pq2.peek() : Integer.MAX_VALUE;
            if(first<=second){
                cost+=first;
                pq1.poll();
            }else{
                cost+=second;
                pq2.poll();
            }
        }
        return cost;
    }
}