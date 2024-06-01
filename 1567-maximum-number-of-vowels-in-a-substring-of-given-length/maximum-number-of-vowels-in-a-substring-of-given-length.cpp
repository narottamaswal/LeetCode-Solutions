class Solution {
public:
    int maxVowels(string s, int k) {
        auto isVowel = [&](char a){
            return a=='a' || a=='e' || a=='i' || a=='o' || a=='u';
        };
        int currentVowelCount = 0;
        int ans = 0, start = 0, end= 0, n= s.length();
        ans = max(ans,currentVowelCount);
        while(end<n){
            bool isEndVowel = isVowel(s[end]);
            if(end-start+1<=k){
                if(isEndVowel){
                    currentVowelCount++;
                }
                ans = max(ans,currentVowelCount);
                end++;
            }else{
                bool isStartVowel = isVowel(s[start]);
                if(isStartVowel){
                    currentVowelCount--;
                    if(currentVowelCount<0){
                        currentVowelCount=0;
                    }
                }
                if(isEndVowel){
                    currentVowelCount++;
                }
                ans = max(ans,currentVowelCount);
                start++;            
                end++;
            }
        }
        return ans;
    }
};