class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int> mp;
        for(auto num: nums){
            mp[num]++;
        }
        priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> pq;
        for (auto it : mp){
            pq.push({it.second,it.first});
            if(pq.size()>k){
                pq.pop();
            }
        }
        vector<int> ans(k);
        int i=k-1;
        while(!pq.empty() && i>=0){
            ans[i]=pq.top().second;
            pq.pop();
            i--;
        }
        return ans;
    }
};