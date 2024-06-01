class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char,int> mp;
        int ans = 0;
        int start = 0, end =0, n= s.length();
        while(end<n){
            mp[s[end]]++;
            while(mp[s[end]]>1){
                mp[s[start]]--;
                start++;
            }
            ans = max(ans,end-start+1);
            end++;
        }
        return ans;
    }
};