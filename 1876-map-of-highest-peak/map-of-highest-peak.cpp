class Solution {
public:
   
    bool safe(int i,int j,int n,int m){
        return i>=0 && i<n && j>=0 && j<m;
    }
    vector<vector<int>> highestPeak(vector<vector<int>>& isWater) {
        int n = isWater.size();
        int m = isWater[0].size();
        int delX[]={0,1,0,-1};
        int delY[]={1,0,-1,0};
        queue<pair<pair<int,int>,int>> q;
        vector<vector<int>> vis(n,vector<int>(m,-1));
        vector<vector<int>> ans(n,vector<int>(m,-1));
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isWater[i][j]==1){
                    q.push({{i,j},-1});
                    vis[i][j]=-1;
                    ans[i][j]=0;
                }
            }
        }
        while(!q.empty()){
            auto it = q.front();
            int x = it.first.first;
            int y = it.first.second;
            int parent = it.second;
            q.pop();
            for(int i=0;i<4;i++){
                int newX = x+delX[i];
                int newY = y+delY[i];
                if(safe(newX,newY,n,m) && isWater[newX][newY]==0){
                    if(vis[newX][newY]==-1){
                        q.push({{newX,newY},0});
                        vis[newX][newY]=0;
                        ans[newX][newY]=ans[x][y]+1;
                    }
                }                
            }
        }
        return ans;
    }
};