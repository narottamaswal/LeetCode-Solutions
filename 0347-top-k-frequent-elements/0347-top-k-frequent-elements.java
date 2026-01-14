class Solution {
     public class Pair implements Comparable<Pair>{
        int num;
        int count;
        public Pair(int count,int num){
            this.num=num;
            this.count=count;
        }
        public int compareTo(Pair o){
            return this.count - o.count;
        }
         
    }
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        Map<Integer,Integer> mp = new TreeMap<>();
        for(int a:nums){
            mp.put(a,mp.getOrDefault(a,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(Map.Entry<Integer,Integer> e:mp.entrySet()){
            pq.offer(new Pair(e.getValue(),e.getKey()));
            if(pq.size()>k){
                pq.poll();
            }
        }
        while(!pq.isEmpty() && k>0){
            ans[--k]=pq.poll().num;
        }
        return ans;
    }
}