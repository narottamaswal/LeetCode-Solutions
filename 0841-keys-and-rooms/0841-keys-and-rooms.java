class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        vis[0]=true;
        q.offer(0);
        int count=0;
        while(!q.isEmpty()){
            int curKey = q.poll();
            count++;
            for(int nextKey: rooms.get(curKey)){
                if(!vis[nextKey]){
                    vis[nextKey]=true;
                    q.offer(nextKey);
                }
            }
        }
        return count==n;

    }
}
// 0 1 0 1
// 1 1 0 1 
// 0 0 0 0
// 0 0 0 0