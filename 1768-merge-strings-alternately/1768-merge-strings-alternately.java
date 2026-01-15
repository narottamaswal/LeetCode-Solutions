class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n = word1.length(), m = word2.length(),i=0,j=0;
        while(i<n && j<m){
            sb.append(word1.charAt(i++)).append(word2.charAt(j++));
        }
        return sb.append(n>m ? word1.substring(i) :word2.substring(j)).toString();
    }
}