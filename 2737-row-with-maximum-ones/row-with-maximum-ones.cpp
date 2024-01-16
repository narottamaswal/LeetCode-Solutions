class Solution {
public:
    vector<int> rowAndMaximumOnes(vector<vector<int>>& mat) {
        vector<int> ans(2,0);
        int ans_index=0,ans_ones=0;
        for(int i=0;i<mat.size();i++){
            int current=0;
            for(int j=0;j<mat[i].size();j++){
                if(mat[i][j]==1){
                    current++;
                }
            }
            if(current>=ans_ones){
                if(current==ans_ones){
                    ans_index=min(ans_index,i);
                }else{
                    ans_ones=current;
                    ans_index=i;
                }
            }
        }
        ans[0]=ans_index;
        ans[1]=ans_ones;
        return ans;
    }
};