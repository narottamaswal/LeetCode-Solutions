class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> st = new ArrayDeque<>();
        Map<Integer,Integer> mp = new HashMap<>();
        int[] ans = new int[nums1.length];
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                st.pop();
            }
            mp.put(nums2[i],st.isEmpty() ? -1 : st.peek());
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=mp.getOrDefault(nums1[i],0);
        }
        return ans;
        
    }
}