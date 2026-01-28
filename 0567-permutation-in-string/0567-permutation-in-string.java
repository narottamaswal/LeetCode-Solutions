class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int n = s1.length(), m = s2.length();
       int[] freq1 = new int[26];
       int[] freq2 = new int[26];
       for(char a:s1.toCharArray()){
            freq1[a-'a']++;
       }
       int start=0,end=0;
       while(end<m){
            freq2[s2.charAt(end)-'a']++;            
            if(end-start+1<n){
                end++;
                continue;  
            }else if(end-start+1==n && Arrays.equals(freq1,freq2)){
                return true;
            }
            if(freq2[s2.charAt(start)-'a']>0) freq2[s2.charAt(start)-'a']--;
            start++;
            end++;
       }
       return false;


    }
}