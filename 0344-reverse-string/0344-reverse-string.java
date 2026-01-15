class Solution {
    public void reverseString(char[] s) {
        int n = s.length,mid = (n/2)-1;
        for(int i=0;i<=mid;i++){
            char t = s[i];
            s[i]=s[n-1-i];
            s[n-1-i]=t;
        }        
    }
}