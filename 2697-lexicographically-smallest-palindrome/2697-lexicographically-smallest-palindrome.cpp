class Solution {
public:
    string makeSmallestPalindrome(string s) {
        int n=s.length();
        int start=0, end =n-1;
        string ans(n,'-');
        while(start<n){
            if(s[start]==s[end]){
                ans[start]=ans[end]=s[start];
            }else{
                if(s[start]>s[end]){
                    ans[start]=s[end];
                    ans[end]=s[end];
                }else{
                    ans[end]=s[start];
                    ans[start]=s[start];
                }
            }
            start++;
            end--;
        }
        return ans;
    }
};
// e g c s[start] e
// a a b a