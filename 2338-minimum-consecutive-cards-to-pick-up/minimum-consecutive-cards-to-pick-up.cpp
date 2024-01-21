class Solution {
public:
    int minimumCardPickup(vector<int>& cards) {
        unordered_map<int,int> mp;
        int ans=INT_MAX;
        for(int i=0;i<cards.size();i++){
            if(mp.find(cards[i])!=mp.end()){
                int ans1 = i-mp[cards[i]]+1;
                ans = min(ans,ans1);
            }
            mp[cards[i]]=i;
        }
        return ans!=INT_MAX?ans:-1;
    }
};