class Solution {
public:
    int totalFruit(vector<int>& fruits) {
        int n = fruits.size(), ans = 0, start = 0 ,end =0;
        unordered_map<int,int> mp;
        while(end<n){
            mp[fruits[end]]++;
            if(mp.size()>2){
                while(mp.size()>2){
                    mp[fruits[start]]--;
                    if(mp[fruits[start]]==0){
                        mp.erase(fruits[start]);
                    }
                    start++;
                }
            }
            end++;
            ans = max(ans,end-start);
        }
        return ans;
    }
};