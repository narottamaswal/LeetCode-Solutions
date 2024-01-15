class Solution {
public:
    bool checkAlmostEquivalent(string word1, string word2) {
        vector<int> word1_freq(26,0),word2_freq(26,0);
        for(int i=0;i<word1.length();i++){
            word1_freq[word1[i]-'a']++;
            word2_freq[word2[i]-'a']++;
        }
        for(int i=0;i<26;i++){
            int a = word1_freq[i];
            int b = word2_freq[i];
            if(abs(a-b)>3){
                return false;
            }
        }
        return true;
    }
};