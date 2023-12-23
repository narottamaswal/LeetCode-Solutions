class Solution {
public:
    vector<int> findOrder(int numCourses, vector<vector<int>>& prerequisites) {
        vector<int> indegree(numCourses,0);
        queue<int> q;
        vector<int> adj[numCourses];
        for(int i=0;i<prerequisites.size();i++){
            int first = prerequisites[i][0];
            int second = prerequisites[i][1];
            adj[second].push_back(first);
            indegree[first]++;
        }
        for(int i=0;i<numCourses;i++){
           if(indegree[i]==0){
               q.push(i);
           }
        }
        vector<int> ans;
        while(!q.empty()){
            int size = q.size();
            while(size--){
                auto it = q.front();
                q.pop();
                ans.push_back(it);
                for(auto j:adj[it]){
                    indegree[j]--;
                    if(indegree[j]==0){
                        q.push(j);
                    }
                }
            }
        }
        vector<int> arr;
        return ans.size()==numCourses?ans:arr;
    }
};