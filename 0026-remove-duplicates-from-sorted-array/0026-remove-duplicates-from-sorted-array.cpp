class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.size()==1) return 1;
        // int totalUniqueElements = nums.size();
        // int duplicateValue=-101;
        // int lastValue=nums[0];
        // for(int i=1;i<nums.size();i++){
        //     if(nums[i]==lastValue){
        //         lastValue=nums[i];
        //         nums[i]=duplicateValue;
        //         totalUniqueElements--;
        //     }else{
        //         lastValue=nums[i];
        //     }
        // }
        // int j=0;
        // for(int i=0;i<nums.size();i++){
        //     if(nums[i]!=-101){
        //         nums[j]=nums[i];
        //         j++;
        //     }
        // }
        // return totalUniqueElements;

        int j=0;
        for(int i=1;i<nums.size();i++){
            if(nums[i-1]!=nums[i]){
                nums[j]=nums[i-1];
                j++;
            }
        }
        
        if(j>0 && nums[j-1]!=nums[nums.size()-1]){
            nums[j]=nums[nums.size()-1];
        }
        return j+1;
    }
};