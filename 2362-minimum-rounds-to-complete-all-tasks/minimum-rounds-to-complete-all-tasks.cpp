class Solution {
public:
    int minimumRounds(vector<int>& tasks) {
        unordered_map<int,int> mp;
        int ans=0;
        for(auto it:tasks){
            mp[it]++;
        }
        for(auto it:mp){
            int x = it.second;
            if(x == 1){
                return -1;
            }
            // if x is a multiple of 3 then x/3 will define how many times we need to do that task
            if(x%3 == 0){
                ans += x/3;
            }// if not a multiple of 3 eg. 7 then it can be proved that a non multiple of 3 can be done with 
            // a combination of 2 and 3 like eg. 7 can be done in 3+2+2 i.e 3 ways
            // to get 3 we can divide x/3+1 formula is used
            else{
                ans += x/3+1;
            }
        }
        return ans;
    }
};