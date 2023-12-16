class Solution {
public:
    bool safe(int i,int j,int n,int m){
        return i>=0 && i<n && j>=0 && j<m;
    }
    int maxDistance(vector<vector<int>>& grid) {
        int n = grid.size(),ans=0;
        vector< vector<int> > dist(n,vector<int>(n,-1));
        queue<pair<int,int>> q;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    q.push({i,j});
                    dist[i][j]=0;
                }
            }
        }
        if(q.empty() || q.size()==n*n){
            return -1;
        }
        int delX[]={0,1,0,-1};
        int delY[]={1,0,-1,0};
        while(!q.empty()){
            auto currentPoints=q.front();
            int x = currentPoints.first;
            int y = currentPoints.second;
            q.pop();
            if(grid[x][y]==0){
                ans=max(ans,dist[x][y]);
            }
            for(int i=0;i<4;i++){
                int newX = x+delX[i];
                int newY = y+delY[i];
                if(safe(newX,newY,n,n) && -1==dist[newX][newY]){
                    q.push({newX,newY});
                    dist[newX][newY]=dist[x][y]+1;
                }
            }
        }
        return ans;
    }
};