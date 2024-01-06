class Solution {
public:
    int minCostClimbingStairs(vector<int>& cost) {
        int n=cost.size();
        if(n<=2)return min(cost[0],cost[1]);
        vector<int> stair_cost(cost.begin(),cost.end());
        for(int i=2;i<stair_cost.size();i++){
            stair_cost[i] = stair_cost[i]+min(stair_cost[i-1],stair_cost[i-2]);
        }
        return min(stair_cost[n-1],stair_cost[n-2]);
    }
};