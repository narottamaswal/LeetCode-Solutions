class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        int[] ans = new int[n];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });
        for(int i=0;i<n;i++){
            pq.offer(new int[]{nums[i],i});
        }
        while(k>0){
            int[] top = pq.poll();
            top[0] = top[0]*multiplier;
            pq.offer(top);
            k--;
        }
        while(!pq.isEmpty()){
            int[] ele = pq.poll();
            ans[ele[1]] = ele[0];
            System.out.println(ele[0]+" "+ele[1]);
        }
        return ans;
    }
}