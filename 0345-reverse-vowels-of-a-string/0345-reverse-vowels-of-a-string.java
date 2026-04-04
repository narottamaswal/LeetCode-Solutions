class Solution {
    private void swap(char[] word,int start,int end){
        char temp = word[start];
        word[start] = word[end];
        word[end] = temp;
    }
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int n = s.length();
        Predicate<Character> isVowel = c -> "aeiouAEIOU".indexOf(c) != -1;
        int start = 0, end = n-1;
        while(start<end){
            boolean isStartVowel = isVowel.test(word[start]);
            boolean isEndVowel = isVowel.test(word[end]);
            
            if(isStartVowel && isEndVowel){
                swap(word,start,end);
                start++;
                end--;
            }
            if(!isStartVowel){
                start++;
            }
            if(!isEndVowel){
                end--;
            }
        }
        return new String(word);
    }
}