#define pairOfPair pair<int,pair<int,int>> 
class Solution {
public:
    int findCheapestPrice(int n, vector<vector<int>>& flights, int src, int dst, int k) {
        vector<pair<int,int>> flightList[n+1];
        for(auto flight:flights){
            flightList[flight[0]].push_back({flight[1],flight[2]});
        }
        queue<pairOfPair> pq;
        pq.push({0,{src,0}});
        vector<int> cost(n+1,1e9);
        cost[src]=0;
        while(!pq.empty()){
            auto current = pq.front();
            int currentK = current.first;
            int currentNode = current.second.first;
            int currentCost = current.second.second;
            pq.pop();
            if(currentK>k) continue;
            for(auto it:flightList[currentNode]){
                int newNode = it.first;
                int newCost = it.second;
                if(newCost+currentCost<cost[newNode] && currentK<=k){
                    cost[newNode] = currentCost+newCost;
                    pq.push({currentK+1,{newNode,cost[newNode]}});

                }
            }
        }
        return cost[dst]==1e9?-1:cost[dst];
    }
};