class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<List<Integer>> adjMat = new ArrayList<>();
        int[] outDegree = new int[graph.length];
        for(int i=0;i<graph.length;i++){
            adjMat.add(new ArrayList<>());
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            for(int a: graph[i]){
                adjMat.get(a).add(i);
                outDegree[i]++;
            }
            if(outDegree[i]==0){
                q.offer(i);
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            Integer ele = q.poll();
            ans.add(ele);
            for(int a: adjMat.get(ele)){
                outDegree[a]--;
                if(outDegree[a]==0){
                    q.offer(a);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}