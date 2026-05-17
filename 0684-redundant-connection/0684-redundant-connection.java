class Solution {
    int[] parent;
    int[] rank;
    public int find(int node){
        if(parent[node]==node){
            return node;
        }
        int nodeParent = find(parent[node]);
        parent[node]=nodeParent;
        return parent[node];
    }
    public void union(int x,int y){
        int x_parent = find(x);
        int y_parent = find(y);
        if(rank[x_parent] > rank[y_parent]) {
            parent[y_parent] = x_parent;
        } else if(rank[x_parent] < rank[y_parent]) {
            parent[x_parent] = y_parent;
        } else {
            parent[x_parent] = y_parent;
            rank[y_parent]++;
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n+1];
        rank = new int[n+1];
        for(int i=1;i<=n;i++){
            parent[i]=i;
            rank[i]=0;
        }
        int[] ans=new int[2];
        for(int[] edge: edges){
            int parentU = find(edge[0]);
            int parentV = find(edge[1]);
            if(parentU==parentV){
                ans=edge;
            }else{
                union(parentU,parentV);
            }
        }
        return ans;
    }
}