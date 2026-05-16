class Solution {
public:
    vector<int> eventualSafeNodes(vector<vector<int>>& graph) {
        queue<int> q;
        vector<int> indegree(graph.size(),0);
        vector<int> adj[graph.size()];
        for(int i=0;i<graph.size();i++){
             for(auto &x:graph[i]){
                adj[x].push_back(i);
                indegree[i]++;
            }
            if(indegree[i]==0){
               q.push(i);
           }
        }
        vector<int> ans;
        while(!q.empty()){
            auto it = q.front();
            ans.push_back(it);
            q.pop();
            for(auto j:adj[it]){
                indegree[j]--;
                if(indegree[j]==0){
                    q.push(j);
                }
            }
        }
        sort(ans.begin(),ans.end());
        return ans;
    }
};