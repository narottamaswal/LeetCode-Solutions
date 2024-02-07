class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> grouped_anagrams;
        unordered_map<string,vector<string>> mp;
        for(auto it:strs){
            string c = it;
            sort(c.begin(),c.end());
            mp[c].push_back(it);
        }
        for(auto it:mp){
            grouped_anagrams.push_back(it.second);
        }
        return grouped_anagrams;
    }
};