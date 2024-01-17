class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        unordered_map<int,int> mp;
        for(auto it:arr){
            mp[it]++;
        }
        vector<int> vis(1001,-1);
        for(auto it:mp){
            if(vis[it.second]==1){
                return false;
            }else{
                vis[it.second]=1;
            }
        }
        return true;
    }
};