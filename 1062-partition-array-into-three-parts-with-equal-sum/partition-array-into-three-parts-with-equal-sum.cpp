class Solution {
public:
    bool canThreePartsEqualSum(vector<int>& arr) {
        int prefixsum=0;
        for(auto it:arr){
            prefixsum+=it;
        }
        if(prefixsum%3) return false;        
        int onepairsum = prefixsum/3;

        int currentSum=0;
        int ans=0;
        for(int i=0;i<arr.size();i++){
            currentSum+=arr[i];
            if(currentSum==onepairsum){
                currentSum=0;
                ans++;
            }
        }
        return ans>=3;
    }
};