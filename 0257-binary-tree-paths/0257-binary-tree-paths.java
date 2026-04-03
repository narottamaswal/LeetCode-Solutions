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
    private void path(TreeNode node, String path,List<String> ans){
        if(node==null){
            return;
        }
        path+=node.val;
        if(node.left==null && node.right==null){
            ans.add(path.toString());
            return;
        }
        path(node.left,path+"->",ans);
        path(node.right,path+"->",ans);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        path(root,"",ans);
        return ans;
    }
}