class Solution {
private:
    bool isVowel(char x){
        if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
            return true;
        }
        return false;
    }
public:
    int beautifulSubstrings(string s, int k) {
        int start=0,end=0,v=0,c=0,ans=0;
        while(end<s.length()){
            int v=0,c=0;
            int end2=end;
            while(end2<s.length()){
                if(isVowel(s[end2])){
                    v++;
                }else{
                    c++;
                }
                if(v==c && (v*c)%k==0){
                    ans++;
                }
                end2++;
            }
            end++;
        }
        return ans;
    }
};