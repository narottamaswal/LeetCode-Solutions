//https://www.lintcode.com/problem/663/
//walls and gates
class Solution {
public:
    /**
     * @param rooms: m x n 2D grid
     * @return: nothing
     */
    bool safe(int i,int j,int n,int m){
        return i>=0 && j>=0 && i<n && j<m;
    }
    bool isInf(long long int a){
        return a!=0 && a!=-1;
    }
    void wallsAndGates(vector<vector<int>> &rooms) {
        // write your code here
        int n = rooms.size();
        int m = rooms[0].size();
        int coordX[]={0,1,0,-1};
        int coordY[]={1,0,-1,0};
        vector<vector<int>> vis(n,vector<int>(m,-1));
        queue<pair<int,int>> q;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(rooms[i][j]==0){
                    q.push({i,j});
                    vis[i][j]=-1;
                }
            }
        }
        while(!q.empty()){
            auto points = q.front();
            int x = points.first;
            int y = points.second;
            q.pop();
            for(int i=0;i<4;i++){
                int newX= x+coordX[i];
                int newY= y+coordY[i];
                if(safe(newX,newY,n,m) && isInf(rooms[newX][newY])){
                    if(vis[newX][newY]==-1){
                        vis[newX][newY]=0;
                        q.push({newX,newY});
                        rooms[newX][newY]=rooms[x][y]+1;
                    }
                }
            }
        }
    }
};