class Solution {
public:
    bool canSplit(vector<int>& nums, int k,int expectedMaxSum){
        int currentK=1, currentSum=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]+currentSum<=expectedMaxSum){
                currentSum+=nums[i];
            }else{
                currentK++;
                if(currentK>k || nums[i]>expectedMaxSum){
                    return false;
                }
                currentSum = nums[i];
            }
        }
        return true;
    }
    int splitArray(vector<int>& nums, int k) {
        int nums_size = nums.size();
        int sum = accumulate(nums.begin(),nums.end(),0);
        int start=0,end=sum,mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(canSplit(nums,k,mid)){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return end+1;
    }
};

// 1 3 6 10 15