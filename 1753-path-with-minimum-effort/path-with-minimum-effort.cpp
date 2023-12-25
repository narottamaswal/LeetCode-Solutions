class Solution {
public:
    bool safe(int i, int j, int n, int m) {
        return i >= 0 && j >= 0 && i < n && j < m;
    }
    int minimumEffortPath(vector<vector<int>>& heights) {
        int n = heights.size(), m = heights[0].size();
        queue<pair<int, int>> q;
        int coordX[] = {1,0,-1,0};
        int coordY[] = {0,1,0,-1};
        q.push({0, 0});
        vector<vector<int>> ans(n, vector<int>(m, INT_MAX));
        ans[0][0]=0;
        while (!q.empty()) {
            auto it = q.front();
            q.pop();
            int currentX = it.first;
            int currentY = it.second;
            int currentCost = ans[currentX][currentY];
            int currentHeight = heights[currentX][currentY];
            for (int i = 0; i < 4; i++) {
                int newX = currentX + coordX[i];
                int newY = currentY + coordY[i];
                if (safe(newX, newY, n, m)){
                    int newHeight = heights[newX][newY];
                    int newCost = max(currentCost,abs(currentHeight-newHeight));
                    if(newCost<ans[newX][newY]){
                        ans[newX][newY]=newCost;
                        q.push({newX,newY});
                    }
                }
            }
        }
        return ans[n - 1][m - 1];
    }
};