class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> anagrams = new ArrayList<>();
        int n = s.length(), k = p.length();
        Map<Character,Integer> mp1 = new HashMap<>();
        Map<Character,Integer> mp2 = new HashMap<>();
        for(char a:p.toCharArray()){
            mp1.put(a,mp1.getOrDefault(a,0)+1);
        }
        int start=0,end=0;
        while(end<n){
            char cc = s.charAt(end);
            mp2.put(cc,mp2.getOrDefault(cc,0)+1);
            if(end-start+1<k){
                end++;
                continue;
            }else if(end-start+1==k && mp1.equals(mp2)){
                anagrams.add(start);
            }
            char sc = s.charAt(start);
            mp2.put(sc,mp2.getOrDefault(sc,0)-1);
            if(mp2.getOrDefault(sc,0)<=0){
                mp2.remove(sc);
            }
            start++;
            end++;
        }
        return anagrams;
    }
}