class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans  = new ArrayList<>();
        // -4 -1 -1 0 1 2
        for(int i=0;i<n-2;i++){
            
            // As we have sorted the arra If the smallest element is > 0, 
            // no triplet can ever sum to 0.
            if (nums[i] > 0) break;

            // skip duplicate element
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int start = i+1, end =n-1;

            while(start<end){
                int sum = nums[i]+nums[start]+nums[end];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[start],nums[end]));                
                    start++;
                    end--;
                    // Skip duplicate elements
                    while(start<end && nums[start]==nums[start-1]){
                        start++;
                    }
                    while (start < end && nums[end] == nums[end + 1]){
                        end--;
                    }
                }else if(sum<0){
                    start++;
                }else{
                    end--;
                }
            }
        }
        return ans;
    }
}