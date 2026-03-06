
class Pair{
    int v; // the other node
    boolean oppositeEdge = false; // is the edge fake or not
    Pair(){
        
    }
    Pair(int v, boolean oppositeEdge){
        this.v = v;
        this.oppositeEdge = oppositeEdge;
    }
}
class Solution {
    public int minReorder(int n, int[][] connections) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i = 0 ;i<n; i++){
            adj.add(new ArrayList<Pair>());
        }
        for(int ar[] : connections){
            adj.get(ar[0]).add(new Pair(ar[1], false)); 
            adj.get(ar[1]).add(new Pair(ar[0], true));
        }
        boolean visited[] = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        q.add(0);
        while(!q.isEmpty()){
            int temp = q.remove();
            visited[temp] = true;
            for(Pair p : adj.get(temp)){
                if(!visited[p.v]){
                   // if the edge going away from zero/ nodes connected to 0 and is not fake then count ++
                    if(p.oppositeEdge == false) count++; 
                    q.add(p.v);
                }
            }
        }
        return count;
    }
}

