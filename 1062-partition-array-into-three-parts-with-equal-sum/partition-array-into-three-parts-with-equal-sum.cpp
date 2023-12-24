class Solution {
public:
    bool canThreePartsEqualSum(vector<int>& arr) {
        int prefixsum=0;
        //calculate prefix sum
        for(auto it:arr){
            prefixsum+=it;
        }
        // if total sum is not divisible by 3 then 
        // we cannot make 3 combinations out of it 
        // so return false
        if(prefixsum%3) return false;  

        // we'll split the array based on sum      
        int onepairsum = prefixsum/3;
        int currentSum=0,ans=0;
        for(int i=0;i<arr.size();i++){
            currentSum+=arr[i];
            // if current sum is equal to one pair sum 
            // then increment the ans and reset the sum to 0
            if(currentSum==onepairsum){
                currentSum=0;
                ans++;
            }
        }
        // there can be more than 3 combinations as well and that is valid thats why ans>=3
        return ans>=3;
    }
};