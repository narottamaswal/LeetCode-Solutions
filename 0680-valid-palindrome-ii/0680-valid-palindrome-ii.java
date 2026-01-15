class Solution {
    private boolean isPalindrome(String s,int l, int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int n = s.length();
        int start = 0, end = n-1;
        int diff=0;
        while(start<end){
            char a = s.charAt(start), b = s.charAt(end);
            if(a!=b){
                return isPalindrome(s,start,end-1) || isPalindrome(s,start+1,end);
            }
            start++;
            end--;
        
        }
        return true;
    }
}