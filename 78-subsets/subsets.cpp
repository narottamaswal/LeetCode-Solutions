class Solution {
public:
    void insert(int i,int num,vector<int>& nums,vector<vector<int>> &subsets_vector){
        int count=0;
        while(num!=0){
            int res = num & 1;
            if(res>0){
                subsets_vector[i].push_back(nums[count]);
            }
            count++;
            num =num>>1;
        }
    }
    vector<vector<int>> subsets(vector<int>& nums) {
        int n = nums.size();
        int subset_length = 1<<n;
        vector<vector<int>> subsets_vector(subset_length);
        for(int i=0;i<subset_length;i++){
            insert(i,i,nums,subsets_vector);
        }
        return subsets_vector;
    }
};