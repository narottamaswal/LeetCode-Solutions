class Solution {
public:
    int distributeCandies(vector<int>& candyType) {
        map<int,int> mp;
        for(auto it:candyType){
            mp[it]++;
        }
        int ans=candyType.size()/2;
        if(mp.size()<ans){
            return mp.size();
        }
        return ans;
    }
};