class Solution {
    public int countBinarySubstrings(String s) {
        int n = s.length();
        int prev = 0, curr = 1, ans = 0;
        int start =1;
        while(start<n){
            if (s.charAt(start) == s.charAt(start - 1)) {
                curr++;
            } else {
                prev = curr;
                curr = 1;
            }
            if (prev >= curr) ans++;

            start++;
        }
        
        return ans;
    }
}