class Solution {
public:
    bool isPrefixAndSuffix (string s1,string s2){
        if(s1.length()>s2.length())return false;
        for(int i=0;i<s1.length();i++){
            if(s1[i]!=s2[i] || s1[s1.length()-i-1]!=s2[s2.length()-i-1]){
                return false;
            }
        }
        return true;
    }
    int countPrefixSuffixPairs(vector<string>& words) {
        int ans=0;
        for(int i=0;i<words.size()-1;i++){
            for(int j=i+1;j<words.size();j++){
                if(isPrefixAndSuffix(words[i],words[j])){
                    ans++;
                }
            }
        }
        return ans;
    }
};