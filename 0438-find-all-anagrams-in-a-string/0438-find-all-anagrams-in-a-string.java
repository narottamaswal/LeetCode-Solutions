class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> anagrams = new ArrayList<>();
        int n = s.length(), k = p.length();
        int[] mp1 = new int[26];
        int[] mp2 = new int[26];
        for(char a:p.toCharArray()){
            mp1[a-'a']++;
        }
        int start=0,end=0;
        while(end<n){
            mp2[s.charAt(end)-'a']++;
            if(end-start+1<k){
                end++;
                continue;
            }else if(end-start+1==k && Arrays.equals(mp1,mp2)){
                anagrams.add(start);
            }
            mp2[s.charAt(start)-'a']--;
            start++;
            end++;
        }
        return anagrams;
    }
}