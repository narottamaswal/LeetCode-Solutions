class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int a:gifts) pq.offer(a);
        while(k-- > 0){
            pq.add((int)Math.sqrt(pq.poll()));
        }
        int sum = 0;
        while(!pq.isEmpty()){
            sum = sum+pq.poll();
        }
        return sum;
    }
}
// 25 64 9 4 100

// 25 64 9 4 10
// 25 8 9 4 10
// 5 8 9 4 10
// 5 8 9 4 3