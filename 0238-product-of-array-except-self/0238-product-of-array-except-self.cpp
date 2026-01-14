class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int product=1;
        int i=0;
        vector<int> ans(0,nums.size());
        int containsZero=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==0){
                containsZero++;
            }else{
                 product=product*nums[i];
            }
        }
     
        if(containsZero>0){
            for(int i=0;i<nums.size();i++){
                if(nums[i]==0 && containsZero==1){
                    ans.push_back(product);
                }else{
                    ans.push_back(0);
                }
            }
        }else{
            for(int i=0;i<nums.size();i++){
                 ans.push_back(product/nums[i]);
            }
        }
        return ans;
    }
};