class Solution {
    public String largestNumber(int[] nums) {
        String ans = Arrays.stream(nums)
            .boxed()
            .map(String::valueOf)
            .sorted((a, b) -> (b + a).compareTo(a + b))
            .collect(Collectors.joining());
        return ans.startsWith("0") ? "0" : ans;
    }
}