class Solution {
public:
    // basic setup
    int delX[4]={0,1,0,-1};
    int delY[4]={1,0,-1,0};
    bool safe(int i,int j,int n,int m){
        return i>=0 && i<n && j>=0 && j<m;
    }
    vector<vector<int>> highestPeak(vector<vector<int>>& isWater) {
        int n = isWater.size();
        int m = isWater[0].size();
        queue<pair<int,int>> q;
        vector<vector<int>> vis(n,vector<int>(m,-1));
        vector<vector<int>> ans(n,vector<int>(m,-1));
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isWater[i][j]==1){
                    // insert the parent also where the node is coming from during bfs in all directions during the traversal
                    // for initial 1 (water) we'll add -1;
                    q.push({i,j});
                    vis[i][j]=-1;
                    ans[i][j]=0;
                }
            }
        }
        while(!q.empty()){
            auto it = q.front();
            int x = it.first;
            int y = it.second;
            q.pop();
            for(int i=0;i<4;i++){
                int newX = x+delX[i];
                int newY = y+delY[i];
                if(safe(newX,newY,n,m) && isWater[newX][newY]==0){
                    // if new element is -1 that means its not yet visitied any number of times so we'll insert this in queue
                    // with parent as 0 and vis as 0 and increment the distance by newpoint = current point value +1

                    // if an element is coming for the second time in traversal then we see if its already covered.
                    if(vis[newX][newY]==-1){
                        q.push({newX,newY});
                        vis[newX][newY]=0;
                        ans[newX][newY]=ans[x][y]+1;
                    }
                }                
            }
        }
        return ans;
    }
};