class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n = word1.length, m=word2.length;
        int i=0,j=0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while(i<n || j<m){
            if(i<n){
                sb1.append(word1[i++]);
            }
            if(j<m){
                sb2.append(word2[j++]);
            }
        }
        return sb1.toString().equals(sb2.toString());
    }
}