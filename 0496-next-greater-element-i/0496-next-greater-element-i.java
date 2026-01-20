class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];
        Map<Integer,Integer> mp = new HashMap<>();
        Deque<Integer> st = new ArrayDeque<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                st.pop();
            }
            mp.put(nums2[i],st.isEmpty() ? -1 : st.peek());
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=mp.getOrDefault(nums1[i],-1);
        }
        return ans;
    }
}