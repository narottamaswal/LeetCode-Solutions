class Solution {
public:
    int countPartitions(vector<int>& nums) {
        vector<int> numSum;
        int sum=0,ans=0,n=nums.size();
        for(auto it:nums){
            sum+=it;
            numSum.push_back(sum);
        }
        for(int index=0;index<n-1;index++){
            if((numSum[index]-(numSum[n-1]-numSum[index]))%2==0){
                ans++;
            }
        }
        return ans;
    }
};
//  1 3 5
//  1 9-1 = 1 8