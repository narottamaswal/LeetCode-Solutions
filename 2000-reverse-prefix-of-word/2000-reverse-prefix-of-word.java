class Solution {
    public String reversePrefix(String word, char ch) {
        int id = word.indexOf(ch);
        if(id==-1) return word;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=id;i++){
            sb.insert(0,word.charAt(i));
        }
        for(int i=id+1;i<word.length();i++){
            sb.append(word.charAt(i));
        }
        return sb.toString();

        // return new StringBuilder(
        //     word.substring(0,i+1)
        // )
        // .reverse()
        // .append(word.substring(i+1))
        // .toString();
    }
}