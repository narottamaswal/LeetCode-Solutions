class Solution {
public:
    vector<vector<int>> findMatrix(vector<int>& nums) {
        unordered_map<int,int> mp;
        vector<vector<int>> ans;
        int size=INT_MIN;
        for(int num:nums){
            mp[num]++;
            int freq=mp[num];
            if(freq>size){
                size=freq;
                ans.resize(freq);
            }
            ans[freq-1].push_back(num);
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