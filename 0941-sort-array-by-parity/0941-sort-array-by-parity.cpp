class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        vector<int> ans(nums.size(),0);
        int totalEven=0, i=0;
        for(auto it:nums){
            if(it%2==0) totalEven++;
        }
        int j=0;
        while(j<nums.size()){
            int num = nums[j];
            if(num%2==0){
                ans[i]=num;
                i++;
            }else{
                ans[totalEven]=num;
                totalEven++;
            }
            j++;
        }
        return ans;
    }
};
// 0 3 2 5 6 12 1 1
// 1 1 3 5 0 2 6 12
