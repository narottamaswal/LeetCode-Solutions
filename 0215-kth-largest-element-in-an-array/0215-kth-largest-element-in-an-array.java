class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Using minheap
        Queue<Integer> pq = new PriorityQueue<>();
        for(int a:nums) pq.add(a);
        while(!pq.isEmpty() && pq.size() > k){
            pq.poll();
        }
        return pq.peek();
    }
}