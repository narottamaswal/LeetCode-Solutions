class Solution {
public:
    void fun(vector<int> &temp,vector<vector<int>> &ans,int index){
        if(index==temp.size()){
            ans.push_back(temp);
            return;
        }
        for(int i=index;i<temp.size();i++){
               swap(temp[i],temp[index]);
               fun(temp,ans,index+1);
               swap(temp[i],temp[index]);
        }
    }
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> ans;
        vector<int> temp=nums;
        fun(temp,ans,0);
        return ans;
    }
};