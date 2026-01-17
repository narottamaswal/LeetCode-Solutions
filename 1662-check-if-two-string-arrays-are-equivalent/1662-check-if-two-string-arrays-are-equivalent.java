class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n = word1.length, m=word2.length, i=0,j=0,x=0,y=0;
        while(i<n && j<m){
            if(word1[i].charAt(x++)!=word2[j].charAt(y++)){
                return false;
            }
            if(x==word1[i].length()){
                i++;
                x=0;
            }
            if(y==word2[j].length()){
                j++;
                y=0;
            } 
        }
        return i==n && j==m;
    }
}