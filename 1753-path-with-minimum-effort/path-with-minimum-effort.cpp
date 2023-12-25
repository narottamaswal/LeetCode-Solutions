class Solution {

public:
    bool safe(int i,int j,int n,int m){
        return i>=0 && j>=0 && i<n && j<m;
    }
    int minimumEffortPath(vector<vector<int>>& heights) {
        int n = heights.size(),m= heights[0].size();
        int coordX[]={0,1,0,-1};
        int coordY[]={1,0,-1,0};
        priority_queue<pair<int,pair<int,int>>> pq;
        pq.push({0,{0,0}});
        vector<vector<int>> ans(n,vector<int>(m,INT_MAX));
        ans[0][0]=0;
        while(!pq.empty()){
            auto it = pq.top();
            pq.pop();
            int currentCost = -it.first;
            int currentX = it.second.first;
            int currentY = it.second.second;
            if(currentCost>ans[currentX][currentY]){
                continue;
            }
            if(currentX==n-1 && currentY==m-1){
                return currentCost;
            }
            for(int i=0;i<4;i++){
                int newX = currentX+coordX[i];
                int newY = currentY+coordY[i];
                if(safe(newX,newY,n,m)){
                    int newEffort = max(ans[currentX][currentY],abs(heights[newX][newY]-heights[currentX][currentY]));
                    if(newEffort<ans[newX][newY]){
                        ans[newX][newY]=newEffort;
                        pq.push({-newEffort,{newX,newY}});
                    }
                }
            }
        }
        return ans[n-1][m-1];
    }
};