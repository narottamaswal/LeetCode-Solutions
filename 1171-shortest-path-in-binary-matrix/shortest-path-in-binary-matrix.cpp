class Solution {
public:
    bool isValidCoord(int i,int j,int n,int m){
        return i>=0 && j>=0 && i<n && j<m;
    }
    int shortestPathBinaryMatrix(vector<vector<int>>& grid) {
        int n = grid.size();
        int m =grid[0].size();
        if(grid[0][0]==1 || grid[n-1][m-1]==1)return -1;
        vector<vector<bool>> vis(n,vector<bool>(m,false));
        queue<pair<int,int>> q;
        q.push({0,0});
        vis[0][0]=true;
        int coordX[]={0,0,1,-1,1,-1,-1,1};
        int coordY[]={1,-1,0,0,-1,1,-1,1};
        int steps=0;
        while(!q.empty()){
            int size = q.size();
            while(size--){
                auto it=q.front();
                q.pop();
                int x = it.first;
                int y= it.second;
                if(x==n-1 && y==m-1){
                    return steps+1;
                }
                for(int j=0;j<8;j++){
                    int newX = x+coordX[j];
                    int newY = y+coordY[j];
                    if(isValidCoord(newX,newY,n,m) && grid[newX][newY]==0 && !vis[newX][newY]){
                        vis[newX][newY]=true;
                        q.push({newX,newY});
                    }
                }
            }
            steps++;
        }
        return -1;
    }
};