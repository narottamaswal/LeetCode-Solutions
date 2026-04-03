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
record Pair(TreeNode node,TreeNode parent){}
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        int depth=0,xdepth=0,ydepth=0;
        TreeNode xParent=new TreeNode(0),yParent = new TreeNode(0);
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,root));
        while(!q.isEmpty()){
            int qSize = q.size();
            for(int i=0;i<qSize;i++){
                Pair p = q.poll();
                TreeNode ele = p.node(), parent = p.parent(); 
                if(ele.val==x){
                    xParent = ele;
                    xdepth = depth;
                }else if(ele.val==y){
                    yParent=ele;
                    ydepth = depth;
                }
                if(ele.left!=null){
                    q.offer(new Pair(ele.left,ele));
                }
                if(ele.right!=null){
                    q.offer(new Pair(ele.right,ele));
                }
            }
            depth++;
        }
        return xdepth>1 && ydepth>1 && xdepth==ydepth && xParent.val!=yParent.val;
    }
}