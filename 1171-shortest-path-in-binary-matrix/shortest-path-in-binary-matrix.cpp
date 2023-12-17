class Solution {
public:
    int shortestPathBinaryMatrix(vector<vector<int>>& grid) {
        int n=grid.size();
        int m =grid.size();
        auto safe=[&](int i,int j){
            return i>=0 && j>=0 && i<n && j<m;
        };
        if(grid[0][0]==1 || grid[n-1][m-1]==1)return -1;
        vector<vector<bool>> vis(n,vector<bool>(m,false));
        queue<pair<pair<int,int>,int>> q;
        q.push({{0,0},1});
        int coordX[]={0,0,1,-1,1,-1,-1,1};
        int coordY[]={1,-1,0,0,-1,1,-1,1};
        vis[0][0]=true;
        bool flag=false;
        int ans=INT_MAX;
        while(!q.empty()){
            int x = q.front().first.first;
            int y = q.front().first.second;
            int dis = q.front().second;
            if(x==n-1 && y==m-1){
                flag=true;
                ans=min(ans,dis);
            }
            q.pop();
            for(int i=0;i<8;i++){
                int newX= x+coordX[i];
                int newY= y+coordY[i];
                if(safe(newX,newY) && !grid[newX][newY] && !vis[newX][newY]){
                    vis[newX][newY]=true;
                    q.push({{newX,newY},dis+1});
                }
            }
        }
        return flag?ans:-1;
    }
};