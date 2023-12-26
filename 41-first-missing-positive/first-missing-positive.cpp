class Solution {
public:
    int firstMissingPositive(vector<int>& nums) {
        int c=1;
        sort(nums.begin(),nums.end());
        for(auto it:nums){
            if(it==c){
                c++;
            }
        }
        return c;
    }
};