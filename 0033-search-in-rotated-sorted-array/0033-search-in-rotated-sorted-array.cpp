class Solution {
public:
    int search(vector<int>& nums, int target) {
        int n = nums.size();
        if(n==1){
            return nums[0]==target ? 0 : -1;
        }else if(nums[0]==target){
            return 0;
        }else if(nums[n-1]==target){
            return n-1;
        }
        int start=0,end=n-1,mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if((nums[mid]>target && nums[start]<nums[mid] && nums[mid]<nums[end]) || (nums[mid]>target && nums[start]>nums[mid] && nums[mid]<nums[end])){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
};
// 4 5 6 7 0 1 2

// 7 8 0 1 2 3 4 5 6
// 0