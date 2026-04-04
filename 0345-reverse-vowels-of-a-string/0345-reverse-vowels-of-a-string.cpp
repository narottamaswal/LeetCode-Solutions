class Solution {
public:
    string reverseVowels(string s) {
        int n = s.length();
        auto isVowel = [](char ch) {
            ch = tolower(ch);
            return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
        };
        int start = 0, end = n-1;
        while(start<end){
            if(isVowel(s[start]) && isVowel(s[end])){
                swap(s[start],s[end]);
                start++;
                end--;
            }
            if(!isVowel(s[start])){
                start++;
            }
            if(!isVowel(s[end])){
                end--;
            }
        }
        return s;
    }
};

// A E A E I O Z Z I O T T

// A E A E I O I O
// O I O I E A E A
