class Solution {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int n = quiet.length;
        List<List<Integer>> adjMat = new ArrayList<>();
        for(int i=0;i<n;i++){
            adjMat.add(new ArrayList<>());
        }
        int[] ans = new int[n];
        int[] indegree = new int[n];
        for(int[] rich: richer){
            adjMat.get(rich[0]).add(rich[1]);
            indegree[rich[1]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            ans[i]=i;
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int node = q.poll();
            for(int i:adjMat.get(node)){
                if(quiet[ans[node]]<quiet[ans[i]]){
                    ans[i]=ans[node];
                }
                indegree[i]--;
                if(indegree[i]==0){
                    q.offer(i);
                }
            }
        }
        return ans;

    }
}