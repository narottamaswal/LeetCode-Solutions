class Solution {
public:
    vector<vector<int>> findMatrix(vector<int>& nums) {
        unordered_map<int,int> mp;
        vector<vector<int>> ans(nums.size());
        for(int num:nums){
            mp[num]++;
            int freq=mp[num];
            ans[freq-1].push_back(num);
        }
        for (int i = 0; i < ans.size(); ) {
            if (ans[i].size() == 0) {
                ans.erase(ans.begin() + i);
            } else {
                ++i;
            }
        }
        return ans;
    }
};

// 1- 3
// 3- 2
// 2-1
// 4-1
// 1-2
// 3-1