class Solution {
    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    
    public int longestIncreasingPath(int[][] matrix) {
        int row = matrix.length,col = matrix[0].length;
        int max = 0;
        int[][] memo = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (memo[i][j] == 0) {
                    max = Math.max(max, dfs(row,col,matrix, memo, i, j));
                }
            }
        }
        return max;
    }
    private boolean isValid(int rows,int cols,int x,int y){
        return x>=0 && y>=0 && x<rows && y<cols;
    }
    public int dfs(int row,int col,int[][] matrix, int[][] memo, int x, int y) {
        if (memo[x][y] > 0) {
            return memo[x][y];
        }
        int ans = 1;
        for (int[] dir : dirs) {
            int nextX = x + dir[0];
            int nextY = y + dir[1];
            if (!isValid(row,col,nextX,nextY)) {
                continue;
            }
            if (matrix[nextX][nextY] <= matrix[x][y]) {
                continue;
            }
            ans = Math.max(ans, dfs(row,col,matrix, memo, nextX, nextY) + 1);
        }
        memo[x][y] = ans;
        return ans;
    }
}