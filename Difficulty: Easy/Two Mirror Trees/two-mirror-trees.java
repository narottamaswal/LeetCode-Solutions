// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Solution {
    boolean recur(Node a, Node b){
        if(a==null && b==null){
            return true;
        }else if(a==null || b==null || a.data!=b.data){
            return false;
        }
        return recur(a.left,b.right) && recur(a.right,b.left);
    }
    boolean areMirror(Node a, Node b) {
        return recur(a,b);
    }
}