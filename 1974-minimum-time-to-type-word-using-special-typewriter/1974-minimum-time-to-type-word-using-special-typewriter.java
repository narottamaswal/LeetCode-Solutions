class Solution {
    public int minTimeToType(String word) {
        int ans =0;
        char a='a';
        for(int i=0;i<word.length();i++){
            char cc = word.charAt(i);
            int diff = Math.abs(cc-a);
            ans = ans + Math.min(diff,26-diff);
            a=cc;
            ans++;
        }
        return ans;
    }
}