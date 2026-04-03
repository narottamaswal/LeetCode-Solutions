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
    private void path(TreeNode root,int targetSum,List<List<Integer>> ans,List<Integer> a){
        if(root==null){
            return;
        }
        a.add(root.val);
        targetSum-=root.val;
        if(root.left==null && root.right==null && targetSum==0){
            ans.add(new ArrayList<>(a));
        }
        path(root.left,targetSum,ans,a);
        path(root.right,targetSum,ans,a);
        a.remove(a.size() - 1); // backtrack
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        path(root,targetSum,ans,new ArrayList<>());
        return ans;
    }
}