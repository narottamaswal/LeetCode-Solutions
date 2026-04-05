class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        // Split by whitespace to get word arrays
        String[] s1 = sentence1.split("\\s+");
        String[] s2 = sentence2.split("\\s+");

        if (s1.length > s2.length) {
            String[] temp = s1;
            s1 = s2;
            s2 = temp;
        }
        int start1 = 0, start2 = 0;
        int end1 = s1.length - 1, end2 = s2.length - 1;

        while (start1 <= end1) {
            if (s1[start1].equals(s2[start2])) {
                start1++;
                start2++;
            }else if (s1[end1].equals(s2[end2])) {
                end1--;
                end2--;
            }else {
                return false;
            }
        }
        return true;
    }
}