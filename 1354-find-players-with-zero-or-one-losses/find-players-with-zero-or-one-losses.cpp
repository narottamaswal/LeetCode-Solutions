class Solution {
public:
    vector<vector<int>> findWinners(vector<vector<int>>& matches) {
        map<int,pair<int,int>> mp;
        for(auto it:matches){
            int winner = it[0];
            int looser = it[1];
            mp[winner].first++;
            mp[looser].second++;
        }
        vector<vector<int>> ans(2);
        vector<int> ans0,ans1;
        for(auto it:mp){
            int element = it.first;
            int wins = it.second.first;
            int looses = it.second.second;
            if(looses==0){
                ans[0].push_back(element);
            }else if(looses==1){
                ans[1].push_back(element);
            }
        }
        return ans;
    }
};