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
record Pair(TreeNode node,int currentDepth){}
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,1));
        int ans=0;
        while(!q.isEmpty()){
            Pair p = q.poll();
            ans = Math.max(ans,p.currentDepth());
            TreeNode t = p.node();
            if(t.left!=null){
                q.offer(new Pair(t.left,p.currentDepth()+1));
            }
            if(t.right!=null){
                q.offer(new Pair(t.right,p.currentDepth()+1));
            }
        }
        return ans;
    }
}