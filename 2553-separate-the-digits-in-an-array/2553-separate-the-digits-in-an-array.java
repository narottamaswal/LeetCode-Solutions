class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for(int a:nums) sb.append(a);

        int[] ans = new int[sb.length()];
        for(int i=0;i<sb.length();i++){
            ans[i]=sb.charAt(i)-'0';
        }
        return ans;
    }
}