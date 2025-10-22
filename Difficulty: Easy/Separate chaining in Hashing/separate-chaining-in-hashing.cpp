class Solution {
  public:
    vector<vector<int>> separateChaining(int hashSize, vector<int>& arr) {
        // code here
        vector<vector<int>> ans(hashSize);
        for(auto it:arr){
            int d = it%hashSize;
            ans[d].push_back(it);
        }
        return ans;
    }
};