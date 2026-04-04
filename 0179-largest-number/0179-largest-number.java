import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String largestNumber(int[] nums) {
        // 1. Guard Clauses: Always validate inputs first to prevent unnecessary processing
        if (nums == null || nums.length == 0) {
            return "";
        }

        // 2. Functional Purity: Transform, sort, and collect without external side-effects
        String ans = Arrays.stream(nums)
            .boxed()
            .map(String::valueOf) // Map to String early for Single Responsibility
            .sorted((a, b) -> (b + a).compareTo(a + b)) // Inline Lambda
            .collect(Collectors.joining()); // Thread-safe terminal operation

        // 3. Edge Case Handling: Clean O(1) check for the zero-array scenario
        if (ans.startsWith("0")) {
            return "0";
        }

        return ans;
    }
}