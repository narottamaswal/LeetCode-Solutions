class Solution {
public:
    bool validPath(int n, vector<vector<int>>& edges, int source, int destination) {
        if(n==1) return true;
        queue<int> q;
        unordered_map<int,vector<int>> edgeList;
        for(vector<int> it:edges){
            edgeList[it[0]].push_back(it[1]);
            edgeList[it[1]].push_back(it[0]);
        }
        vector<bool> visited(n,0);        
        q.push(source);
        visited[source]=1;
        while(!q.empty()){
            int frontEle = q.front();
            if(frontEle==destination){
                return true;
            }
            q.pop();
            for(auto it:edgeList[frontEle]){
                if(!visited[it]){
                    visited[it]=1;
                    q.push(it);
                }
            }
        }
        return false;
    }
};