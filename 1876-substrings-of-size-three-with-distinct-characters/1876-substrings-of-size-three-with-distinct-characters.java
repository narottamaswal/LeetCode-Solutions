class Solution {
    public int countGoodSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length()-2;i++){
            if(ok(s.charAt(i),s.charAt(i+1),s.charAt(i+2))){
                c++;
            }
        }
        return c;
    }
    public boolean ok(char a, char b , char c){
        return (a!=b && b!=c && c!=a);
    }
}