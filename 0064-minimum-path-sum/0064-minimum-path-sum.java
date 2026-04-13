//  int rows = image.size();
//         int cols = image[0].size();
//         vector<vector<int>> ans = image;
//         auto checkBoundary = [&](int x, int y){
//             return x>=0 && y>=0 && x<rows && y<cols;
//         };
//         ans[sr][sc]=color;
//         int currentColor = image[sr][sc];
//         int coordX[4]={0,1,0,-1};
//         int coordY[4]={1,0,-1,0};
//         queue<pair<int,int>> pq;
//         pq.push({sr,sc});
//         while(!pq.empty()){
//             int curX = pq.front().first;
//             int curY = pq.front().second;
//             pq.pop();
//             for(int i=0;i<4;i++){
//                 int newX = curX+coordX[i];
//                 int newY = curY+coordY[i];
//                 if(checkBoundary(newX,newY)  && image[newX][newY]==currentColor
//                 && ans[newX][newY]!=color)
//                 {
//                     ans[newX][newY]=color;
//                     pq.push({newX,newY});
//                 }
//             }
//         }
//         return ans;
class Solution {
    private boolean safe(int x,int y,int rows,int cols){
        return x>=0 && y>=0 && x<rows && y<cols;
    }
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int coordX[]=new int[]{0,1};
        int coordY[]=new int[]{1,0};
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0,grid[0][0]});
        int[][] sol = new int[rows][cols];

        for(int[] ele:sol) Arrays.fill(ele,Integer.MAX_VALUE);
        sol[0][0] = grid[0][0];
        while(!q.isEmpty()){
            int[] ele = q.poll();
            int x = ele[0], y = ele[1], currentSum=ele[2];
            for(int i=0;i<2;i++){
                int newX = coordX[i]+x, newY = coordY[i]+y;
                if(safe(newX,newY,rows,cols)){
                    int newSum = currentSum+grid[newX][newY];
                    if(sol[newX][newY]>newSum){
                        sol[newX][newY]=newSum;
                        q.offer(new int[]{newX,newY,newSum});
                    }
                }
            }
        }
        return sol[rows-1][cols-1];
    }
}