class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n = word1.length(), m = word2.length(),i=0,j=0;
        while(i<n && j<m){
            sb.append(word1.charAt(i++)).append(word2.charAt(j++));
        }
        if(n>m){
            sb.append(word1.substring(i));
        }else{
            sb.append(word2.substring(j));
        }
        return sb.toString();
    }
}