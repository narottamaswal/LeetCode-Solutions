class Solution {
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>>& grid) {
        vector<int> ans;
        int n=grid.size();
        int duplicate=0;
        int xx=0;
        unordered_map<int,int> mp;
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid[i].size();j++){
                if(mp[grid[i][j]]){
                    duplicate=grid[i][j];
                }else{
                    mp[grid[i][j]]++;
                }
            }
        }
        for(int i=1;i<=n*n;i++){
            if(!mp[i]){
                xx=i;
            }
        }
        ans.push_back(duplicate);
        ans.push_back(xx);
        return ans;
    }
};