class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int a:stones) pq.offer(a);

        while(!pq.isEmpty() && pq.size()>=2){
            int stone1 = pq.poll(), stone2 = pq.poll();
            if(stone1!=stone2){
                pq.offer(Math.abs(stone1-stone2));
            }
        }
        return !pq.isEmpty() ? pq.peek() : 0;
    }
}