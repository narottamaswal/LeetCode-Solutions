class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int []edge: prerequisites){
            int course = edge[0], prereq = edge[1];
            adj.get(prereq).add(course);
            indegree[course]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int[] order = new int[numCourses];
        int index = 0;
        while(!q.isEmpty()){
            int cur = q.poll();
            order[index++] = cur;
            for(int a:adj.get(cur)){
                indegree[a]--;
                if(indegree[a]==0){
                    q.offer(a);
                }
            }
        }
        return index==numCourses ? order : new int[0];
    }
}