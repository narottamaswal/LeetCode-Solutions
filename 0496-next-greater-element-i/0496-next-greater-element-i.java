class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> st = new ArrayDeque<>();
        int[] ans = new int[nums1.length];
        int[] freq = new int[10001];
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                st.pop();
            }
            freq[nums2[i]] =st.isEmpty() ? -1 : st.peek(); 
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=freq[nums1[i]];
        }
        return ans;
        
    }
}