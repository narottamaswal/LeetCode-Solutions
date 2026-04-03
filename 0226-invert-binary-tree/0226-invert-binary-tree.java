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
    private TreeNode invert(TreeNode node){
        if(node==null) return node;

        TreeNode l = invert(node.left), r = invert(node.right);
        node.left=r;
        node.right=l;
        return node;
    }
    public TreeNode invertTree(TreeNode root) {
        return invert(root);
    }
}