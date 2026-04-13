class Solution {
public:
    bool isValidDivisor(vector<int>& nums, int threshold,int mid){
        int current_division=0;
        for(auto it:nums){
            current_division=current_division+(it/mid);
            if(it%mid!=0){
                current_division++;
            }
            if(current_division>threshold)return false;
        }
        return true;
    }
    int smallestDivisor(vector<int>& nums, int threshold) {
        int start = 1;
        int end = *max_element(nums.begin(),nums.end());;
        int mid=0;
        int ans=INT_MAX;
        while(start<=end){
            mid = start+(end-start)/2;
            if(isValidDivisor(nums,threshold,mid)){
                ans=min(ans,mid);
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
};