class Solution {
public:
    void fun(vector<vector<int>> &ans,vector<int> temp,vector<bool> &vis,vector<int>& nums){
        if(temp.size()==nums.size()){
            ans.push_back(temp);
            return;
        }
        for(int i=0;i<nums.size();i++){
           
            if(!vis[i]){
                vis[i]=true;
                temp.push_back(nums[i]);
                fun(ans,temp,vis,nums);
                temp.pop_back();
                vis[i]=false;
                while(i+1<nums.size() && nums[i]==nums[i+1]){
                    i++;
                }
            }
        }
    }
    vector<vector<int>> permuteUnique(vector<int>& nums) {
        vector<bool> vis(nums.size(),false);
        sort(nums.begin(),nums.end());
        vector<vector<int>> ans;
        vector<int> temp;
        fun(ans,temp,vis,nums);
        return ans;
    }
};