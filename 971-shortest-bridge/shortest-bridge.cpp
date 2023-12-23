class Solution {
public:
    int coordX[4] = {1, -1, 0, 0};
    int coordY[4] = {0, 0, 1, -1};

    bool notSafe(int i, int j, int n, int m) {
        return i < 0 || j < 0 || i >= n || j >= m;
    }
    bool isSafe(int i, int j, int n, int m) {
        return i >= 0 && j >= 0 && i < n && j < m;
    }
    void dfs(vector<vector<int>>& grid, vector<vector<bool>>& vis, int i, int j,
             queue<pair<int, int>>& q) {
        if (notSafe(i, j, grid.size(), grid.size()) || vis[i][j] ||
            grid[i][j] == 0) {
            return;
        }
        vis[i][j] = true;
        q.push({i, j});
        for (int k = 0; k < 4; k++) {
            int newX = i + coordX[k];
            int newY = j + coordY[k];
            dfs(grid, vis, newX, newY, q);
        }
    }
    int shortestBridge(vector<vector<int>>& grid) {
        int n = grid.size();
        int m = grid[0].size();
        vector<vector<bool>> vis(n, vector<bool>(m, false));

        queue<pair<int, int>> q;
        bool found = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, vis, i, j, q);
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }
        int steps = 0;
        while (!q.empty()) {
            int size = q.size();
            while (size--) {
                auto it = q.front();
                int x = it.first;
                int y = it.second;

                q.pop();
                for (int i = 0; i < 4; i++) {
                    int newX = x + coordX[i];
                    int newY = y + coordY[i];
                    if (isSafe(newX, newY, n, m) && !vis[newX][newY]) {
                        if (grid[newX][newY] == 1) {
                            return steps;
                        }
                        q.push({newX, newY});
                        vis[newX][newY] = true;
                    }
                }
            }

            steps++;
        }
        return -1;
    }
};