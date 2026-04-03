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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        //try to apply backtracking 
        StringBuilder str = new StringBuilder();
        findAllPaths(root,result,str);
        return result;
    }
    
    public void findAllPaths(TreeNode root,List<String> result,StringBuilder str ){
        //inorder traversal of tree, until encounter null
        if(root ==null){
            return;
        }
        int len = str.length();
        str.append(root.val);
        if(root.left == null && root.right ==null){
            result.add(str.toString());
        }else{
            str.append("->");
            findAllPaths(root.left,result,str);
            findAllPaths(root.right,result,str);
        }
        str.setLength(len);
        
    }
}