class Solution {
public:
    bool isPrefixAndSuffix (string s1,string s2){
        if(s1.length()>s2.length())return false;
        return s2.substr(0,s1.length())==s1 && s2.substr(s2.length()-s1.length())==s1;
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