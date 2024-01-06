class Solution {
public:
    vector<int> leftRightDifference(vector<int>& nums) {
        vector<int> ans(nums.size(),0),left(nums.size(),0),right(nums.size(),0);
        int leftV=0,rightV=0;
        for(int i=0;i<nums.size();i++){
             leftV += nums[i];
             rightV+=nums[nums.size()-i-1];
             left[i]=leftV;
             right[nums.size()-i-1]=rightV;
        }
        for(int i=0;i<nums.size();i++){
            ans[i]=abs(right[i]-left[i]);
        }
        return ans;
    }
};