class Solution {
    public int mirrorDistance(int n) {
        String a = new StringBuilder(""+n).reverse().toString();
        return Math.abs(n-Integer.parseInt(a));
    }
}