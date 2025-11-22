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
    int get(TreeNode root,int d){
        if(root==null){
            return 0;
        }
        int lef=1+get(root.left,d);
        int rig=1+get(root.right,d);
        return Math.max(lef,rig);
    }
    public int maxDepth(TreeNode root) {
        int d=0;
        return get(root,d);
    }
}