class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> adjMat = new ArrayList<>(), ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            adjMat.add(new ArrayList<>());
        }
        int[] indegree = new int[n];
        for(int[] edge: edges){
            adjMat.get(edge[0]).add(edge[1]);
            indegree[edge[1]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        List<Integer> topo = new ArrayList<>();
        while(!q.isEmpty()){
            Integer node = q.poll();
            System.out.println(node);
            topo.add(node);
            for(int ne: adjMat.get(node)){
                indegree[ne]--;
                if(indegree[ne]==0){
                    q.offer(ne);
                }
            }
        }
        List<List<Integer>> ancestorsList = new ArrayList<>();
        List<Set<Integer>> ancestorsSetList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ancestorsList.add(new ArrayList<>());
            ancestorsSetList.add(new HashSet<>());
        }

        // Fill the set list with ancestors using the topological order
        for (int node : topo) {
            for (int neighbor : adjMat.get(node)) {
                // Add immediate parent, and other ancestors.
                ancestorsSetList.get(neighbor).add(node);
                ancestorsSetList
                    .get(neighbor)
                    .addAll(ancestorsSetList.get(node));
            }
        }

        // Convert sets to lists
        for (int i = 0; i < n; i++) {
            for (int node = 0; node < n; node++) {
                if (node == i) continue;
                if (ancestorsSetList.get(i).contains(node)) {
                    ancestorsList.get(i).add(node);
                }
            }
        }

        return ancestorsList;

    }
}