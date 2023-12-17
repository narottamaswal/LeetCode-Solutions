class Solution {
public:
    int coordX[4]={0,1,0,-1};
    int coordY[4]={1,0,-1,0};
    
    bool safe(int i,int j,int n,int m){
        return i<0 || j<0 || i>=n || j>=m;
    }
    void dfs(vector<vector<char>>& grid, int i,int j){
        if(safe(i,j,grid.size(),grid[0].size()) || grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        for(int a=0;a<4;a++){
            int newX = i+coordX[a];
            int newY = j+coordY[a];
            dfs(grid,newX,newY);
        }
    }
    int numIslands(vector<vector<char>>& grid) {
        int n = grid.size(),m = grid[0].size(),ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    ans++;
                }
            }
        }
        return ans;
    }
};