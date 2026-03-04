class Solution {
public:
    int findJudge(int N, vector<vector<int>>& trust) {
        vector<int> inDegree(N+1, 0);
        vector<int> outDegree(N+1, 0);
        for (int i = 0; i < trust.size(); i++) {
            int a = trust[i][0];
            int b = trust[i][1];
            inDegree[b]++;
            outDegree[a]++;
        }
        for (int i = 1; i <= N; i++) {
            if (inDegree[i] == N-1 && outDegree[i] == 0) {
               return i;
            }
        }
        return -1;
    }
};


