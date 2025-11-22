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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigzagOrder = new ArrayList<>();
        if(root==null){
            return zigzagOrder;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> ans = new ArrayList<>();
            int qd = q.size();
            for(int i=0;i<qd;i++){
                TreeNode temp = q.poll();
                ans.add(temp.val);
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            if(zigzagOrder.size()%2==1){
                Collections.reverse(ans);
            }
            zigzagOrder.add(ans);
        }
        return zigzagOrder;
    }
}