class Solution {
    public String reverseWords(String s) {
        List<String> r = Arrays.stream(s.trim().split("\\s+")).collect(Collectors.toList());
        Collections.reverse(r);
        return r.stream()
                    .collect(Collectors.joining(" "));
    }
}