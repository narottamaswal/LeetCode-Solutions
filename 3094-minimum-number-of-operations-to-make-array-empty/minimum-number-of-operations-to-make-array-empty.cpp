class Solution {
public:
    int minOperations(vector<int>& nums) {
        unordered_map<int,int> mp;
        int ans=0;
        for(int num:nums){
            mp[num]++;
        }
        for(auto it:mp){
            if(it.second==1){
                return -1;
            }
            if(it.second%3==0){
                ans=ans+(it.second/3);
            }else{
                ans=ans+(it.second/3)+1;
            }
        }
        return ans;
    }
};
