class Solution {
private:
    const vector<vector<int>> directions = { {1, 0}, {0, 1}, {-1, 0}, {0, -1} };
public:
    
    bool safe(int i,int j,int n,int m){
        return i<0 || j<0 || i>=n || j>=m;
    }
    void dfs(vector<vector<char>>& grid, int i,int j,vector<vector<bool>>& vis,int n,int m){
        if(safe(i,j,n,m) || grid[i][j]=='0' || vis[i][j]){
            return;
        }
        vis[i][j]=true;
        for(int a=0;a<4;a++){
            int newX = i+directions[a][0];
            int newY = j+directions[a][1];
            dfs(grid,newX,newY,vis,n,m);
        }
    }
    int numIslands(vector<vector<char>>& grid) {
        int n = grid.size(),m = grid[0].size(),ans=0;
        vector<vector<bool>> vis(n,vector<bool>(m,false));
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    dfs(grid,i,j,vis,n,m);
                    ans++;
                }
            }
        }
        return ans;
    }
};