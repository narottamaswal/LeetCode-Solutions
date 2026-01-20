class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Deque<Pair<Integer,Integer>> st = new ArrayDeque<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek().getKey()<=temperatures[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? 0 : st.peek().getValue()-i;
            st.push(new Pair(temperatures[i],i));            
        }
        return ans;
    }
}
// 0 0