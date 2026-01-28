class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        int n = s.length(),start = 0, end =0, ans=0;
        while(end<n){
            char cc = s.charAt(end);
            mp.put(cc,mp.getOrDefault(cc,0)+1);
            while(mp.getOrDefault(cc,0)>1){
                char sc = s.charAt(start);
                mp.put(sc,mp.getOrDefault(sc,0)-1);
                start++;
            }
            ans = Math.max(ans,end-start+1);
            end++;
        }
        return ans;
    }
}