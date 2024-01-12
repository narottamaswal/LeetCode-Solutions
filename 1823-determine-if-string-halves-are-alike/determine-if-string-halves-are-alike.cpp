class Solution {
public:
    bool halvesAreAlike(string s) {
        auto isVowel=[](char currentChar){
            currentChar=tolower(currentChar);
            return currentChar=='a' || currentChar=='e' || currentChar=='i' || currentChar=='o' || currentChar=='u';
        };
        int length = s.length();
        int f=0,b=0;
        for(int i=0;i<length/2;i++){
            if(isVowel(s[i]))f++;
            if(isVowel(s[length-i-1]))b++;
        }
        return f==b;
    }
};