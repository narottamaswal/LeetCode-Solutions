class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        vector<int> ans;
        int endingIndex=0;
        int currentMaxSum=nums[0], largestSum=nums[0];
        for(int i=1;i<nums.size();i++){
            currentMaxSum = max(nums[i], currentMaxSum+nums[i] );
            ans.push_back(nums[i]);
            if(currentMaxSum>largestSum){
                largestSum =currentMaxSum;
                endingIndex=i;
            }
        }
        // to get the array as well 
        currentMaxSum=largestSum;
        int startIndex=endingIndex;
        while(startIndex>=0){
            currentMaxSum-=nums[startIndex];
            if(currentMaxSum==0){
                break;
            }
            startIndex--; 
        }
        cout<<startIndex<<" "<<endingIndex<<endl;
        return largestSum;
    }
};