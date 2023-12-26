class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        set<int> ans;
        int n =nums.size();
        int b = n/3;
        unordered_map<int,int> mp;
        for(auto it:nums){
            mp[it]++;
            if(mp[it]>b){
                ans.insert(it);
            }
        }
        vector<int> an1(ans.begin(),ans.end());
        return an1;
    }
};