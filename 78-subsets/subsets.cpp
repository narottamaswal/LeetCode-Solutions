class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        int n = nums.size();
        int no_of_subsets = 1 << n;
        vector<vector<int>> subsets_vector(no_of_subsets);
        for(int i=0;i<no_of_subsets;i++){
            for(int j=0;j<n;j++){
                if((i>>j) & 1){
                    subsets_vector[i].push_back(nums[j]);
                }
            }
        }
        return subsets_vector;
    }
};