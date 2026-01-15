class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String d = "";
        for(int i=0;i<arr.length;i++){
            arr[i]=new StringBuilder(arr[i]).reverse().toString();
            d+=arr[i];
            if(i<arr.length-1){
                d+=" ";
            }
        }
        return d;
        // StringBuilder sb1 = new StringBuilder();
        // StringBuilder sb2 = new StringBuilder();
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)==' '){
        //         sb2.append(sb1.reverse().append(' ').toString());
        //         sb1.setLength(0);
        //     }else{
        //         sb1.append(s.charAt(i));
        //     }
        // }
        // sb2.append(sb1.reverse().toString());
        // return sb2.toString();
    }
}