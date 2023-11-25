class Solution {
public:
    int maxAreaOfIsland(vector<vector<int>>& grid) {
        int n = grid.size();
        int m = grid[0].size();
        int ans=0,current=0;
        int delRow[4]={0,0,1,-1};
        int delCol[4]={1,-1,0,0};
        vector<vector<bool>> visited(n,vector(m,false));
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0 || visited[i][j]){
                    continue;
                }
                visited[i][j]=true;
                current=0;
                queue<pair<int,int>> queue;
                queue.push({i,j});
                while(!queue.empty()){
                    auto ele = queue.front();
                    queue.pop();
                    current++;
                    int cRow = ele.first;
                    int cCol = ele.second;
                    for(int k=0;k<4;k++){
                        int newRow =cRow+delRow[k];
                        int newCol =cCol+delCol[k];
                        if(newRow>=0 && newRow<n && newCol>=0 && newCol<m
                        && !visited[newRow][newCol] && grid[newRow][newCol]==1){
                            queue.push({newRow,newCol});
                            visited[newRow][newCol]=true;
                            
                        }
                    }
                }
                ans=max(ans,current);
            }
        }
        return ans;
    }
};