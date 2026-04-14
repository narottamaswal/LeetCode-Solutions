class Solution {
    int maxScore = 0;
	public int score(int[] a, int[] b){
		int count = 0;
		for(int i = 0; i < b.length; i++)
			if(a[i] == b[i]) count += 1;
		return count;
	}
    private void dfs(int[][] students,int[][] mentors, boolean[] vis, int index,int curr){
        if(index>=students.length){
            maxScore = Math.max(maxScore,curr);
            return;
        }
        for(int i=0;i<mentors.length;i++){
            if(!vis[i]){
                vis[i]=true;
                int sum1 = score(students[index],mentors[i]);
                dfs(students,mentors,vis,index+1,sum1+curr);
                vis[i]=false;
            }
        }
    }

    public int maxCompatibilitySum(int[][] students, int[][] mentors) {
        boolean[] visited = new boolean[students.length];
		dfs(students, mentors,visited, 0, 0);
		return maxScore;
    }
}