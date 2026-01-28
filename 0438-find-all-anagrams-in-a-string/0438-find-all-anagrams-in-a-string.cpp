class Solution {
public:
    vector<int> findAnagrams(string s, string p) {
        unordered_map<char,int> mp,mp1;
        for(auto it:p) mp[it]++;

        int start=0, end=0, n=s.length(), pL = p.length();
        vector<int> ans;
        while(end<n){
            mp1[s[end]]++;
            if(end-start+1<pL){
                end++;
                continue;
            }else if(end-start+1==pL && mp1==mp){
                ans.push_back(start);
            }
            mp1[s[start]]--;
            if(mp1[s[start]]==0){
                mp1.erase(s[start]);
            }
            start++;
            end++;
        }
        return ans;
    }
};