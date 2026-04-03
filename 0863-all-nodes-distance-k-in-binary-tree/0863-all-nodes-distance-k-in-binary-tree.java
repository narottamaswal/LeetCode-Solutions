/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private Map<Integer,TreeNode> buildParentChildRel(TreeNode root){
        Map<Integer,TreeNode> pcr = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode ele = q.poll();
                if(ele.left!=null){
                    pcr.put(ele.left.val,ele);
                    q.offer(ele.left);
                }
                if(ele.right!=null){
                    pcr.put(ele.right.val,ele);
                    q.offer(ele.right);
                }
            }
        }
        return pcr;
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans = new ArrayList<>();
        Map<Integer,TreeNode> pcr = buildParentChildRel(root);
        Queue<TreeNode> q = new LinkedList<>();
        int[] visited = new int[5001];
        q.offer(target);
        while(k-- > 0 && !q.isEmpty()){
            int qSize = q.size();
            for(int i=0;i<qSize;i++){
                TreeNode ele = q.poll();
                visited[ele.val]=1;
                if((ele.left!=null && visited[ele.left.val]==0)){
                    q.offer(ele.left);
                }
                if((ele.right!=null && visited[ele.right.val]==0)){
                    q.offer(ele.right);
                }
                if(pcr.containsKey(ele.val)){
                    TreeNode parentOfEle = pcr.get(ele.val);
                    if(visited[parentOfEle.val]==0){
                        q.offer(pcr.get(ele.val));
                    }
                }
            }
        }
        while (!q.isEmpty()) {
            ans.add(q.poll().val);
        }
        return ans;
        // while()

    }
}