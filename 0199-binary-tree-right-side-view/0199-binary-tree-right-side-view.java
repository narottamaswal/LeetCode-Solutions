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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        Map<Integer,Integer> level = new HashMap<>();
        Queue<Pair<Integer,TreeNode>> q = new LinkedList<>();
        int h = 0;
        q.offer(new Pair<>(h,root));
        while(!q.isEmpty()){
            int qsize = q.size();
            for(int i=0;i<qsize;i++){
                Pair<Integer,TreeNode> ele = q.poll();
                Integer key = (Integer )ele.getKey();
                TreeNode v = (TreeNode )ele.getValue();
                level.putIfAbsent(key,v.val);
                if(v.right!=null){
                    q.offer(new Pair<>(key+1,v.right));
                }
                if(v.left!=null){
                    q.offer(new Pair<>(key+1,v.left));
                }
            }
            h++;
        }
        return new ArrayList<>(level.values());
    }
}