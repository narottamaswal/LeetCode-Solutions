class Solution {
public:
    bool isAnagram(string s, string t) {
        unordered_map<char,int> mp;
        if(s.length()!=s.length())return false;
        for (auto ch: s)mp[ch]++;

        for (auto ch: t){
            mp[ch]--;
            if (mp[ch]==0)
            mp.erase(ch);
        }
        return mp.empty();        
    }
};