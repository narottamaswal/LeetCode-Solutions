class Solution {
public:
    vector<int> getConcatenation(vector<int>& nums) {
        vector<int> ans(nums);
        ans.insert(ans.begin(),nums.begin(), nums.end());
//        copy(nums.begin(), nums.end(), back_inserter(ans));
        return ans; 
    }
};