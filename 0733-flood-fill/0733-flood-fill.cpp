class Solution {
public:
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int color) {
        int rows = image.size();
        int cols = image[0].size();
        vector<vector<int>> ans = image;
        auto checkBoundary = [&](int x, int y){
            return x>=0 && y>=0 && x<rows && y<cols;
        };
        ans[sr][sc]=color;
        int currentColor = image[sr][sc];
        int coordX[4]={0,1,0,-1};
        int coordY[4]={1,0,-1,0};
        queue<pair<int,int>> pq;
        pq.push({sr,sc});
        while(!pq.empty()){
            int curX = pq.front().first;
            int curY = pq.front().second;
            pq.pop();
            for(int i=0;i<4;i++){
                int newX = curX+coordX[i];
                int newY = curY+coordY[i];
                if(checkBoundary(newX,newY)  && image[newX][newY]==currentColor
                && ans[newX][newY]!=color)
                {
                    ans[newX][newY]=color;
                    pq.push({newX,newY});
                }
            }
        }
        return ans;
    }
};