class Solution {
public:
    bool safe(int i,int j,int n,int m){
        return i>=0 && j>=0 && i<n && j<m;
    }
    int shortestPath(vector<vector<int>>& grid, int k) {
        int n = grid.size();
        int m = grid[0].size();
        int coordX[]={0,1,0,-1};
        int coordY[]={1,0,-1,0};
        vector<vector<vector<bool>>> vis(n, vector<vector<bool>>(m, vector<bool>(k + 1)));
        queue<pair<pair<int,int>,int>> q;
        int ans=INT_MAX,currentSteps=0;
        q.push({{0,0},k});
        bool flag=false;
        while(!q.empty()){
            int size=q.size();
            while(size--){
                auto points = q.front().first;
            int x = points.first;
            int y = points.second;
            int currentK = q.front().second;
            q.pop();
            if(x==n-1 && y==m-1){
                return currentSteps;
            }
            for(int i=0;i<4;i++){
                int newX= x+coordX[i];
                int newY= y+coordY[i];
                if(safe(newX,newY,n,m)){
                    if(grid[newX][newY]==0  && !vis[newX][newY][currentK]){
                        vis[newX][newY][currentK]=true;
                        q.push({{newX,newY},currentK});
                    }else if(grid[newX][newY]==1 && currentK>0 && !vis[newX][newY][currentK-1]) {
                        q.push({{newX,newY},currentK-1});
                        vis[newX][newY][currentK-1]=true;
                    }
                }
            }
           
            }
             ++currentSteps;
        }
        return flag?ans:-1;
    }
};