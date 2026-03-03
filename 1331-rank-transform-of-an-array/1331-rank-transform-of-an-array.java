class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int length = arr.length;
        int[] ans = new int[length];
        Queue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<length;i++){
            pq.offer(new int[]{arr[i],i});
        }
        int i=1,previousNum=Integer.MIN_VALUE,pt=0;
        while(!pq.isEmpty()){
            int[] t= pq.poll();
            if(t[0]!=previousNum){
                ans[t[1]]=i;
                pt=i;
                previousNum=t[0];
                i++;
            }else if(t[0]==previousNum){
                ans[t[1]]=pt;
            }
        }
        return ans;
    }
}