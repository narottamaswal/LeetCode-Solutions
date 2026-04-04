class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        // Define boundaries for both arrays
        int start1 = 0, end1 = nums1.length - 1;
        int start2 = 0, end2 = nums2.length - 1;
        while (start1 <= end1 && start2 <= end2) {
            int val1 = nums1[start1];
            int val2 = nums2[start2];
            // Target found
            if (val1 == val2) {
                return val1;
            }

            // If nums1's current value is smaller, leapfrog start1 forward
            if (val1 < val2) {
                int left = start1 + 1;
                int right = end1;
                
                while (left <= right) {
                    int mid1 = left + (right - left) / 2;
                    
                    if (nums1[mid1] < val2) {
                        left = mid1 + 1;
                    } else {
                        right = mid1 - 1;
                    }
                }
                // Update start1 to the first element >= val2
                start1 = left; 
            } 
            // If nums2's current value is smaller, leapfrog start2 forward
            else {
                int left = start2 + 1;
                int right = end2;
                
                while (left <= right) {
                    int mid2 = left + (right - left) / 2;
                    
                    if (nums2[mid2] < val1) {
                        left = mid2 + 1;
                    } else {
                        right = mid2 - 1;
                    }
                }
                // Update start2 to the first element >= val1
                start2 = left; 
            }
        }

        // No common element found
        return -1;
    }
}