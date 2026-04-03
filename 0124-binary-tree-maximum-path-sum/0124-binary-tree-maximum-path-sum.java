/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Integer ans = Integer.MIN_VALUE;
    private int maxSum(TreeNode node){
        if(node==null) return 0;

        int l = Math.max(0,maxSum(node.left));
        int r = Math.max(0,maxSum(node.right));
        ans= Math.max(ans, node.val+l+r);
        return node.val + Math.max(l,r);
    }
    public int maxPathSum(TreeNode root) {
        maxSum(root);
        return ans;
    }
}