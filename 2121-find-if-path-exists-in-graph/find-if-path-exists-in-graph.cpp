class Solution {
public:
    bool validPath(int n, vector<vector<int>>& edges, int source, int destination) {
        vector<bool> vis(n+1,false);
        unordered_map<int,vector<int>> mp;
        for(auto it:edges){
            mp[it[0]].push_back(it[1]);
            mp[it[1]].push_back(it[0]);
        }
        vis[source]=true;
        queue<int> q;
        q.push(source);
        while(!q.empty()){
            int front = q.front();
            q.pop();
            if(front==destination){
                return true;
            }
            for(auto it:mp[front]){
                if(!vis[it]){
                    vis[it]=true;
                    q.push(it);
                }
            }
        }
        return false;
    }
};