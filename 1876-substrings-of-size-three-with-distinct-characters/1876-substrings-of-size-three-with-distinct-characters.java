class Solution {
    public int countGoodSubstrings(String s) {
        int start = 0, end = 0, n =s.length(),ans = 0;
        Map<Character,Integer> mp = new HashMap<>();
        while(end<n){
            mp.put(s.charAt(end),mp.getOrDefault(s.charAt(end),0)+1);
            if(end-start+1<3){
                end++;
                continue;
            }else if(end-start+1==3 && mp.size()==3){
                ans++;
            }
            mp.put(s.charAt(start),mp.getOrDefault(s.charAt(start),0)-1);
            if(mp.getOrDefault(s.charAt(start),0)==0){
                mp.remove(s.charAt(start));
            }
            start++;
            end++;
        }
        return ans;
    }
}