class Solution {
    
public:
    int rows,cols, dp[105][105];
    vector<pair<int,int>> coords={{0,1},{0,-1},{1,0},{-1,0}};
    bool isValidCoords(int x,int y){
        return x>=0 && y>=0 && x<rows && y<cols;
    }

    int minCost(vector<vector<int>>& grid) {
        rows = grid.size();
        cols = grid[0].size();
        memset(dp,1000000,sizeof(dp));
        dp[0][0]=0;
        queue<pair<int,int>> q;
        q.push({0,0});
        int currentX=0,currentY=0,newX=0,newY=0;
        while(!q.empty()){
            auto it = q.front();
            currentX = it.first;
            currentY = it.second;
            q.pop();
            for(int i=0;i<4;i++){
                newX = currentX+coords[i].first;
                newY = currentY+coords[i].second;
                if(isValidCoords(newX,newY)){
                    if(i+1==grid[currentX][currentY] && dp[newX][newY]>dp[currentX][currentY]){
                        dp[newX][newY] = dp[currentX][currentY];
                        q.push({newX,newY});
                    }else if(dp[currentX][currentY]+1<dp[newX][newY]){
                        dp[newX][newY] = dp[currentX][currentY]+1;
                        q.push({newX,newY});
                    }
                }
            }
        }
        return dp[rows-1][cols-1];
    }
};