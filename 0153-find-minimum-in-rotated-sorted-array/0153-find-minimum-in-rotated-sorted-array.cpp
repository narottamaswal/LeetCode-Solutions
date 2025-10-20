class Solution {
public:
    int findMin(vector<int>& nums) {
        int start=0;
        int n=nums.size();
        int end=n-1;
        int mid;
        if(n==1){return nums[0];}
        while(start<=end){
            mid=start+(end-start)/2;
            int next=(mid+1)%n;
            int prev = (mid+n-1)%n;
            if(nums[mid]<nums[prev] && nums[mid]<nums[next]){
                return nums[mid];
            }else if((nums[mid]>nums[start] && nums[mid]<nums[end]) || (nums[mid]<nums[start] && nums[mid]<nums[end])){
                end=mid-1;
            }else{
                start=mid+1;  
            }
        }
        return -1;
    }
};