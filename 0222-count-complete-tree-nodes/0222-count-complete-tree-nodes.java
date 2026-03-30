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
    public int countNodes(TreeNode ele) {
        if (ele == null) {
            return 0;
        }
        // return 1 + countNodes(ele.left) + countNodes(ele.right);

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(ele);
        int ans=0;
        while(!q.isEmpty()){
            TreeNode r = q.poll();
            ans++;
            if(r.left!=null){
                q.offer(r.left);
            }
            if(r.right!=null){
                q.offer(r.right);                
            }
        }
        return ans;
    }
}