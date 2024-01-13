class Solution {
public:
    int minSteps(string s, string t) {
        unordered_map<int,int> mp1,mp2;
        for(auto it:s){
            mp1[it]++;
        }
        for(auto it:t){
            mp2[it]++;
        }
        int ans=0;
        for(auto it:mp1){
            char element = it.first;
            int frequency = it.second;
            int a = frequency-mp2[element];
            if(a<0){
                a=0;
            }
            ans=ans+a;
        }
        return ans;
    }
};
// 