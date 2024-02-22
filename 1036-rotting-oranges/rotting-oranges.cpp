class Solution {
public:
    int orangesRotting(vector<vector<int>>& grid) {
        int rows = grid.size();
        int cols = grid[0].size();
        auto isValidIndex=[&](int row,int column){
            return row>=0 && column>=0 && row<rows && column<cols;
        };
        int xCoords[4]={0,1,0,-1};
        int yCoords[4]={1,0,-1,0};
        vector<vector<bool>> visited(rows,vector<bool>(cols,false));
        queue<pair<int,int>> q;
        int fresh=0;
        for(int rowIndex=0; rowIndex < rows; rowIndex++){
            for(int colIndex=0; colIndex < cols; colIndex++){
                if(grid[rowIndex][colIndex]==2){
                    q.push({rowIndex,colIndex});
                }else if(grid[rowIndex][colIndex]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0) return 0;
        int ans=-1;
        while(!q.empty()){
            int size = q.size();
            while(size--){
                auto [currentRow,currentColumn] = q.front();
                q.pop();
                for(int i=0;i<4;i++){
                    int newRow = currentRow+xCoords[i];
                    int newCol = currentColumn+yCoords[i];
                    if(isValidIndex(newRow,newCol) && !visited[newRow][newCol] && grid[newRow][newCol]==1){
                        visited[newRow][newCol]=true;
                        q.push({newRow,newCol});
                    }
                }

            }
            ans++;
        }
        for(int rowIndex=0; rowIndex < rows; rowIndex++){
            for(int colIndex=0; colIndex < cols; colIndex++){
                if(grid[rowIndex][colIndex]==1 && !visited[rowIndex][colIndex]){
                    return -1;
                }
            }
        }
        return ans;
    }
};