class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        int provinces = 0;
        boolean bfs = true;
        for (int i = 0; i < isConnected.length; i++) {
            if(vis[i]) continue;

            if(bfs){
                Queue<Integer> q = new LinkedList<>();
                q.offer(i);
                vis[i]=true;
                while(!q.isEmpty()){
                    int city = q.poll();
                    for(int j=0;j<isConnected[city].length;j++){
                        if(isConnected[city][j]==1 && !vis[j]){
                            q.offer(j);
                            vis[j]=true;
                        }
                    }
                }
            }else{
                dfs(i, isConnected, vis);
            }
            provinces++;
        }
        return provinces;        
    }
    private void bfs(int t, int[][] isConnected, boolean[] vis) {
        
    }

    private void dfs(int city, int[][] isConnected, boolean[] vis) {
        vis[city]=true;
        for (int cur = 0; cur < isConnected[city].length; cur++) {
            if (isConnected[city][cur] == 1 && !vis[cur]) {
                dfs(cur, isConnected, vis);
            }
        }
    }    
}