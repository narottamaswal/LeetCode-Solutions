class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        if (n < 4) return ans;

        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            // 1. Skip duplicates for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // 2. Optimization: Smallest possible sum from here
            // If the 4 smallest numbers are > target, no need to check further
            long minSumI = (long) nums[i] + nums[i+1] + nums[i+2] + nums[i+3];
            if (minSumI > target) break;

            // 3. Optimization: Largest possible sum from here
            // If nums[i] + 3 largest numbers < target, this 'i' is too small
            long maxSumI = (long) nums[i] + nums[n-3] + nums[n-2] + nums[n-1];
            if (maxSumI < target) continue;

            for (int j = i + 1; j < n - 2; j++) {
                // 4. Skip duplicates for j
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                // 5. Optimization: Same logic for the second fixed pointer 'j'
                long minSumJ = (long) nums[i] + nums[j] + nums[j+1] + nums[j+2];
                if (minSumJ > target) break;
                
                long maxSumJ = (long) nums[i] + nums[j] + nums[n-2] + nums[n-1];
                if (maxSumJ < target) continue;

                int start = j + 1, end = n - 1;
                while (start < end) {
                    // Use long to prevent overflow during sum calculation
                    long sum = (long) nums[i] + nums[j] + nums[start] + nums[end];

                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        start++;
                        end--;
                        while (start < end && nums[start] == nums[start - 1]) start++;
                        while (start < end && nums[end] == nums[end + 1]) end--;
                    } else if (sum < target) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return ans;
    }
}