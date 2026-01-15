class Solution {
    public String reverseWords(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                sb2.append(sb1.reverse().append(' ').toString());
                sb1.setLength(0);
            }else{
                sb1.append(s.charAt(i));
            }
        }
        sb2.append(sb1.reverse().toString());
        return sb2.toString();
    }
}