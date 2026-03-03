class Solution {
    public int fillCups(int[] amount) {
        int minAmount = 0;
        Queue<Integer> cupQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for(int a:amount){
            if(a>0){
                cupQueue.offer(a);
            }
        }
        while(cupQueue.size()>1){
            int f = cupQueue.poll()-1;
            int s = cupQueue.poll()-1;
            if(f>0){
                cupQueue.offer(f);
            }
            if(s>0){
                cupQueue.offer(s);
            }
            minAmount++;
        }
        if(!cupQueue.isEmpty()){
            minAmount+=cupQueue.peek();
        }
        return minAmount;
    }
}