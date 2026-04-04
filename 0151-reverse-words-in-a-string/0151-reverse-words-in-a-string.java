class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        int start=s.length()-1,end=s.length()-1;

        while(end >=0){
            if(s.charAt(end)==' '){
                if(sb.length()>0){
                    temp.append(sb.toString()+" ");
                    sb.setLength(0);
                }
            }else{
                sb.insert(0,s.charAt(end));
            }
            end--;
        }
        temp.append(sb.toString());
        return temp.toString().trim();
    }
}