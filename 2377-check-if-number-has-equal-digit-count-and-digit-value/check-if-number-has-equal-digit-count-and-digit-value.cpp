class Solution {
public:
    bool digitCount(string num) {
        unordered_map<char,int> mp;
        int current_char;
        for(auto it:num){
            mp[it-'0']++;
        }
        for(int i=0;i<num.length();i++){
            current_char = num[i]-'0';
            if(mp[i]!=current_char){
                return false;
            }
        }
        return true;
    }
};