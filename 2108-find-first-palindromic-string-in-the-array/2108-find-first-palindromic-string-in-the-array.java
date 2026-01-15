class Solution {
    public String firstPalindrome(String[] words) {
        for(String a:words){
            String sb = new StringBuilder(a).reverse().toString();
            if(a.equalsIgnoreCase(sb)){
                return a;
            }
        }
        return "";
    }
}