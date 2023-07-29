class Solution {
public:
  
    vector<int> frequencySort(vector<int>& nums) {
        unordered_map<int,int> mp;
        for(auto it:nums){
            mp[it]++;
        }
        priority_queue<pair<int, int>> pq;
        for(auto it:mp){
            pq.push({-it.second,it.first});
        }
        vector<int> ans;
        while(!pq.empty()){
            for(int i=0;i<-pq.top().first;i++){
                ans.emplace_back(pq.top().second);
            }
            pq.pop();
        }
        //sort(ans.begin(),ans.end());
        return ans;
    }
};