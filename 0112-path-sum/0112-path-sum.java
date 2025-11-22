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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        Queue<Pair<TreeNode,Integer>> q = new LinkedList<>();
        q.offer(new Pair<>(root,0));
        while(!q.isEmpty()){
            int qSize = q.size();
            for(int i=0;i<qSize;i++){
                Pair<TreeNode,Integer> element = q.poll();
                TreeNode node = (TreeNode) element.getKey();
                Integer va = (Integer) element.getValue();
                if(node.left==null && node.right==null){
                    if(va+node.val==targetSum) return true;
                }
                if(node.left!=null){
                    q.offer(new Pair<>(node.left,va+node.val));
                }
                if(node.right!=null){
                    q.offer(new Pair<>(node.right,va+node.val));
                }
            }
        }
        return false;
    }
}