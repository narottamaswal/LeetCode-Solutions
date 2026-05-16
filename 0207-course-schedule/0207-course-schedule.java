class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjMat = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adjMat.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];
        for(int[] arr:prerequisites){
            int first = arr[0], second=arr[1];
            adjMat.get(second).add(first);
            indegree[first]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            Integer currentCourse = q.poll();
            count++;
            for(int a:adjMat.get(currentCourse)){
                indegree[a]--;
                if(indegree[a]==0){
                    q.offer(a);
                }
            }
        }
        return count==numCourses;
    }
}